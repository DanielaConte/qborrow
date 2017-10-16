package it.quix.academy.qborrow;

import it.quix.academy.qborrow.core.dao.SoggettiDAO;
import it.quix.academy.qborrow.core.mail.MailServiceCustom;
import it.quix.academy.qborrow.core.model.QborrowUserContext;
import it.quix.academy.qborrow.core.model.Soggetti;
import it.quix.academy.qborrow.core.search.SoggettiSearch;
import it.quix.framework.core.exception.DAOCreateException;
import it.quix.framework.core.exception.DAOFinderException;
import it.quix.framework.core.exception.DAOStoreException;
import it.quix.framework.core.manager.ManagerHolder;
import it.quix.framework.util.FrameworkStringUtils;
import it.quix.framework.util.exceptions.SystemException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import junit.framework.Assert;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DAOTest {

    private static Log log = LogFactory.getLog(DAOTest.class);

    protected static ApplicationContext applicationContext;

    @BeforeClass
    public static void setUpClass() throws Exception {

        try {
            String[] contextFileNames = { "qborrow-test-spring.xml" };
            log.debug("loading application contexts=" + Arrays.toString(contextFileNames));
            applicationContext = new ClassPathXmlApplicationContext(contextFileNames);

            QborrowUserContext uc = new QborrowUserContext();
            it.quix.framework.core.manager.UserContextHolder.setUserContext(uc);

            ManagerHolder.setManagerOnThreadLocal("qborrowManager", applicationContext.getBean("qborrowManager"));

        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            Assert.assertNull(ex);
        }
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        applicationContext = null;
    }

    @Test
    public void createSoggetto() {
        Soggetti soggetto = new Soggetti();

        soggetto.setCognome("cognome1");
        soggetto.setEmail("email1@gmail.com");
        soggetto.setNome("nome1");
        soggetto.setUsername("username1");
        soggetto.setRagioneSociale("azienda1");
        soggetto.setImmagine("path");
        soggetto.setDataUltimaModifica(new Date());

        SoggettiDAO sogDAO = applicationContext.getBean(SoggettiDAO.class);

        try {
            sogDAO.create(soggetto);
        } catch (DAOCreateException e) {
            log.error("Errore nella creazione del soggetto", e);
        }
    }

    @Test
    public void search() {
        List<Soggetti> list = new ArrayList<Soggetti>();
        SoggettiDAO sogDAO = applicationContext.getBean(SoggettiDAO.class);
        SoggettiSearch sog = new SoggettiSearch();
        list = sogDAO.getList(sog);

        for (Soggetti soggetti : list) {
            log.debug(soggetti.toString());
        }
    }

    @Test
    public void update() {
        Soggetti soggetto = new Soggetti();
        SoggettiDAO sogDAO = applicationContext.getBean(SoggettiDAO.class);

        try {
            soggetto = sogDAO.get("utente07");
        } catch (DAOFinderException e1) {
            log.error("Errore nella ricerca del soggetto", e1);
        }

        soggetto.setEmail("utente07@gmail.com");

        try {
            sogDAO.update(soggetto);
        } catch (DAOStoreException e) {
            log.debug("Errore nell'aggiornamento del soggetto", e);
        }
    }

    @Test
    public void searchUpdate() {
        List<Soggetti> list = new ArrayList<Soggetti>();
        SoggettiDAO sogDAO = applicationContext.getBean(SoggettiDAO.class);
        SoggettiSearch sog = new SoggettiSearch();
        list = sogDAO.getList(sog);

        if (list != null && !list.isEmpty()) {
            Soggetti sog2 = list.get(0);
            sog2.setEmail("utente07@gmail.com");
            try {
                sogDAO.update(sog2);
            } catch (DAOStoreException e) {
                log.debug("Errore nell'aggiornamento del soggetto", e);
            }
        }
    }

}
