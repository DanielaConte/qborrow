package it.quix.academy.qborrow.web.action;

import java.util.Date;
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
import it.quix.academy.qborrow.core.model.Soggetti;
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

    public String saveOggettiUser() {
        if (getOggetti() == null) {
            // New Oggetti and all fields are empty. Create a new empty Soggetti to avoid NPE on validators.
            setOggetti(new Oggetti());
        }
        try {
            getOggetti().setSoggetti_username(userContext.getRealUserDn());

            Date data = new Date();
            getOggetti().setDataUltimaModifica(data);
            getQborrowManager().saveOggettiWithUser(getOggetti());
            return manageOkMessage();
        } catch (ValidationException e) {
            return manageValidationError(e.getInvalidConstraints(), "save");
        } catch (Exception e) {
            return manageException("Error on save Soggetti", e);
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
            getOggettiSearch().setSoggetti_username(getUserContext().getRealUserDn());

            // Validate the search model
            getQborrowManager().validateOggettiSearch(getOggettiSearch());
            // Perform count of record that satisfy search filters
            long total = getQborrowManager().countMieiOggetti(getOggettiSearch());
            // If there are results ...
            List<Oggetti> oggettiList = null;
            if (total > 0) {
                // Search the results to display
                do {
                    oggettiList = getQborrowManager().getMieiOggettiList(getOggettiSearch());
                    if (oggettiList.isEmpty() && getOggettiSearch().getPage() > 0) {
                        if (log.isInfoEnabled()) {
                            log.info("The request page " + getOggettiSearch().getPage() + " was empty."
                                + ((getOggettiSearch().getPage() > 1) ? " Try with page " + (getOggettiSearch().getPage() - 1) + "." : ""));
                        }
                        getOggettiSearch().setPage(getOggettiSearch().getPage() - 1);
                    }
                } while (0 < getOggettiSearch().getPage() && oggettiList.isEmpty());
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

}
