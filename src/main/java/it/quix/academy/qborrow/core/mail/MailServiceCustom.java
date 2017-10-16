package it.quix.academy.qborrow.core.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

public class MailServiceCustom {

    private static Log log = LogFactory.getLog(MailServiceCustom.class);

    private String soggetto;

    private String destinatario;

    private String messaggio;

    private String mittente;

    private MailSender mailSenderCustom;

    MailServiceCustom() {

    }

    public void init() {
        log.info("mailServiceCustom initialized");
    }

    public void sendEmail(String destinatario, String soggetto, String messaggio) {

        SimpleMailMessage simpleMail = new SimpleMailMessage();

        simpleMail.setFrom(mittente);
        simpleMail.setTo(destinatario);
        simpleMail.setSubject(soggetto);
        simpleMail.setText(messaggio);

        try {
            mailSenderCustom.send(simpleMail);
        } catch (MailException e) {
            log.error("Problema nell'invio della mail", e);
        }
    }

    public String getSoggetto() {
        return soggetto;
    }

    public void setSoggetto(String soggetto) {
        this.soggetto = soggetto;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getMessaggio() {
        return messaggio;
    }

    public void setMessaggio(String messaggio) {
        this.messaggio = messaggio;
    }

    public String getMittente() {
        return mittente;
    }

    public void setMittente(String mittente) {
        this.mittente = mittente;
    }

    public MailSender getMailSenderCustom() {
        return mailSenderCustom;
    }

    public void setMailSenderCustom(MailSender mailSenderCustom) {
        this.mailSenderCustom = mailSenderCustom;
    }

}
