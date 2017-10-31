package it.quix.academy.qborrow.web.action;

import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.io.IOException;
import java.io.File;
import java.io.FileOutputStream;
import java.awt.Color;
import java.awt.Font;

import org.zefer.pd4ml.PD4ML;
import org.zefer.pd4ml.PD4PageMark;

import javax.annotation.Resource;

import flexjson.JSONSerializer;
import it.quix.framework.core.model.UserContext;
import it.quix.framework.core.validation.InvalidConstraintImpl;
import it.quix.framework.core.validation.api.InvalidConstraint;
import it.quix.framework.core.validation.exception.ValidationException;
import it.quix.academy.qborrow.core.model.Oggetti;
import it.quix.academy.qborrow.core.search.OggettiSearch;
import it.quix.academy.qborrow.core.manager.QborrowManager;
import it.quix.academy.qborrow.core.manager.QborrowException;
// import it.quix.academy.qborrow.core.handler.OggettiHandler;
import it.quix.academy.qborrow.web.action.generated.OggettiAbstractManagerAction;
import it.quix.framework.web.annotation.QwScope;
import it.quix.framework.web.result.IncludeResultAware;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;

/**
 * Action class for the Oggetti model.
 * 
 * @author Quix CodeGenerator version 03.03.00-SNAPSHOT
 */
public class OggettiManagerAction extends OggettiAbstractManagerAction {

    /**
     * Serial Version UID
     */
    private static final long serialVersionUID = 1L;

    /**
     * Log
     */
    private static Log log = LogFactory.getLog(OggettiManagerAction.class);

    /**
     * Pagine Lista Miei Oggetti
     * 
     * @return
     */
    // questo serve per struts
    public String mieiOggetti() {
        return "mieiOggetti";
    }

    // salvataggio con proprietario che è l'utente loggato
    public String saveUser() {
        if (getOggetti() == null) {
            // New Oggetti and all fields are empty. Create a new empty Oggetti to avoid NPE on validators.
            setOggetti(new Oggetti());
        }
        try {
            Oggetti oggetti = getQborrowManager().saveOggetti(getUserContext().getRealUserDn());
            return manageOkMessage();
        } catch (ValidationException e) {
            return manageValidationError(e.getInvalidConstraints(), "save");
        } catch (Exception e) {
            return manageException("Error on save Oggetti", e);
        }
    }

    /**
     * Metodo di lista che ritorna solo i miei oggetti
     * This method find oggetti that satisfy search filters.
     * 
     * @throws QborrowException if an error occurs
     */
    public String listMieiOggetti() throws QborrowException {
        try {
            log.debug("Il mio username e: " + getUserContext().getRealUserDn());
            oggettiSearch.setSoggetti_username(getUserContext().getRealUserDn());

            // Validate the search model
            getQborrowManager().validateOggettiSearch(oggettiSearch);
            // Perform count of record that satisfy search filters
            long total = getQborrowManager().countMieiOggetti(oggettiSearch);
            // If there are results ...
            List<Oggetti> oggettiList = null;
            if (total > 0) {
                // Search the results to display
                do {
                    oggettiList = getQborrowManager().getMieiOggettiList(oggettiSearch);
                    if (oggettiList.isEmpty() && oggettiSearch.getPage() > 0) {
                        if (log.isInfoEnabled()) {
                            log.info("The request page " + oggettiSearch.getPage() + " was empty."
                                + ((oggettiSearch.getPage() > 1) ? " Try with page " + (oggettiSearch.getPage() - 1) + "." : ""));
                        }
                        oggettiSearch.setPage(oggettiSearch.getPage() - 1);
                    }
                } while (0 < oggettiSearch.getPage() && oggettiList.isEmpty());
            }

            // Compose the response
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("list", oggettiList);
            map.put("count", total);
            return manageSerialize(map, new JSONSerializer().include("list"));
        } catch (ValidationException e) {
            return manageValidationError(e.getInvalidConstraints(), "list");
        } catch (Exception e) {
            return manageException("Error on list Oggetti", e);
        }
    }

    private List<Oggetti> oggettiList = new ArrayList<Oggetti>();

    // metodo per selezionare i soggetti con struts invece che nel modo normale
    public String listMieiOggettiStruts() {

        // if there are result
        oggettiSearch = new OggettiSearch();
        oggettiSearch.setPage(0);
        oggettiSearch.setRowPerPage(10);
        oggettiList = getQborrowManager().getOggettiList(oggettiSearch);
        return "listMieiOggetti";

    }

    public OggettiSearch getOggettiSearch() {
        return oggettiSearch;
    }

    public void setOggettiSearch(OggettiSearch oggettiSearch) {
        this.oggettiSearch = oggettiSearch;
    }

    public List<Oggetti> getOggettiList() {
        return oggettiList;
    }

    public void setOggettiList(List<Oggetti> oggettiList) {
        this.oggettiList = oggettiList;
    }

}
