package it.quix.academy.qborrow;

import it.quix.academy.qborrow.core.mail.MailServiceCustom;
import it.quix.academy.qborrow.core.model.QborrowUserContext;
import it.quix.framework.core.manager.ManagerHolder;

import java.util.Arrays;

import junit.framework.Assert;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mailTest {

    private static Log log = LogFactory.getLog(mailTest.class);

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
    public void simpleMail() {
        log.info("SimpleMail -  Start");

        MailServiceCustom mail = applicationContext.getBean(MailServiceCustom.class);
        mail.sendEmail("matteo.renzi@quix.it", "Prova Spring", "Ciao");

        log.info("SimpleMail -  End");
    }
}
