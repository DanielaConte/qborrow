package it.quix.academy.qborrow.core.search.generated;

import it.quix.framework.core.model.AbstractSearchModel;
import it.quix.framework.core.codegen.annotation.OrderByTypeEnum;
import it.quix.academy.qborrow.core.search.SoggettiSearch;
import java.util.Date;
import it.quix.academy.qborrow.core.model.Oggetti;
import it.quix.academy.qborrow.core.model.Prestiti;
import java.math.BigInteger;

import it.quix.framework.core.converter.annotation.QcDateType;

/**
 * @author Quix CodeGenerator version 03.03.00-SNAPSHOT
 */
public class SoggettiAbstractSearch extends AbstractSearchModel {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private String username;

    private String mail;

    private String ragioneSociale;

    private String nome;

    private String cognome;

    private String immagine;

    @QcDateType()
    private Date dataUltimaModificaFrom;

    @QcDateType()
    private Date dataUltimaModificaTo;

    private Oggetti oggetti; // b

    private Prestiti prestiti; // b

    public void clearFilter() {
        username = null;
        mail = null;
        ragioneSociale = null;
        nome = null;
        cognome = null;
        immagine = null;
        dataUltimaModificaFrom = null;
        dataUltimaModificaTo = null;
    }

    public SoggettiSearch cloneFilter() {
        SoggettiSearch search = new SoggettiSearch();

        search.setUsername(username);
        search.setMail(mail);
        search.setRagioneSociale(ragioneSociale);
        search.setNome(nome);
        search.setCognome(cognome);
        search.setImmagine(immagine);
        search.setDataUltimaModificaFrom(dataUltimaModificaFrom);
        search.setDataUltimaModificaTo(dataUltimaModificaTo);
        return search;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * The equals method implements an equivalence relation on non-null object references:
     * <ul>
     * <li>It is reflexive: for any non-null reference value x, x.equals(x) should return true.</li>
     * <li>It is symmetric: for any non-null reference values x and y, x.equals(y) should return true if and only if y.equals(x) returns true.</li>
     * <li>It is transitive: for any non-null reference values x, y, and z, if x.equals(y) returns true and y.equals(z) returns true, then x.equals(z) should
     * return true.</li>
     * <li>It is consistent: for any non-null reference values x and y, multiple invocations of x.equals(y) consistently return true or consistently return
     * false, provided no information used in equals comparisons on the objects is modified.</li>
     * <li>For any non-null reference value x, x.equals(null) should return false.</li>
     * </ul>
     * The equals method for class Object implements the most discriminating possible equivalence relation on objects; that is, for
     * any non-null reference values x and y, this method returns true if and only if x and y refer to the same object (x == y has the value true).
     * Note that it is generally necessary to override the hashCode method whenever this method is overridden, so as to maintain the general contract
     * for the hashCode method, which states that equal objects must have equal hash codes.
     *
     * @param obj the reference object with which to compare.
     * @return rue if this object is the same as the obj argument; false otherwise.
     */
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        SoggettiAbstractSearch other = (SoggettiAbstractSearch) obj;
        if (username == null) {
            if (other.getUsername() != null) {
                return false;
            }
        } else if (!username.equals(other.getUsername())) {
            return false;
        }
        if (mail == null) {
            if (other.getMail() != null) {
                return false;
            }
        } else if (!mail.equals(other.getMail())) {
            return false;
        }
        if (ragioneSociale == null) {
            if (other.getRagioneSociale() != null) {
                return false;
            }
        } else if (!ragioneSociale.equals(other.getRagioneSociale())) {
            return false;
        }
        if (nome == null) {
            if (other.getNome() != null) {
                return false;
            }
        } else if (!nome.equals(other.getNome())) {
            return false;
        }
        if (cognome == null) {
            if (other.getCognome() != null) {
                return false;
            }
        } else if (!cognome.equals(other.getCognome())) {
            return false;
        }
        if (immagine == null) {
            if (other.getImmagine() != null) {
                return false;
            }
        } else if (!immagine.equals(other.getImmagine())) {
            return false;
        }
        if (dataUltimaModificaFrom == null) {
            if (other.getDataUltimaModificaFrom() != null) {
                return false;
            }
        } else if (!dataUltimaModificaFrom.equals(other.getDataUltimaModificaFrom())) {
            return false;
        }
        if (dataUltimaModificaTo == null) {
            if (other.getDataUltimaModificaTo() != null) {
                return false;
            }
        } else if (!dataUltimaModificaTo.equals(other.getDataUltimaModificaTo())) {
            return false;
        }
        return true;
    }

    /**
     * Returns a hash code value for the object.
     * This method is supported for the benefit of hashtables such as those provided by java.util.Hashtable.
     * The general contract of hashCode is:
     * <ul>
     * <li>Whenever it is invoked on the same object more than once during an execution of a Java application, the hashCode method must consistently return the
     * same integer, provided no information used in equals comparisons on the object is modified. This integer need not remain consistent from one execution of
     * an application to another execution of the same application.</li>
     * <li>If two objects are equal according to the equals(Object) method, then calling the hashCode method on each of the two objects must produce the same
     * integer result.</li>
     * <li>It is not required that if two objects are unequal according to the equals(java.lang.Object) method, then calling the hashCode method on each of the
     * two objects must produce distinct integer results. However, the programmer should be aware that producing distinct integer results for unequal objects
     * may improve the performance of hashtables.</li>
     * </ul>
     * 
     * @return a hash code value for this object
     */
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((username == null) ? 0 : username.hashCode());
        result = prime * result + ((mail == null) ? 0 : mail.hashCode());
        result = prime * result + ((ragioneSociale == null) ? 0 : ragioneSociale.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((cognome == null) ? 0 : cognome.hashCode());
        result = prime * result + ((immagine == null) ? 0 : immagine.hashCode());
        result = prime * result + ((dataUltimaModificaFrom == null) ? 0 : dataUltimaModificaFrom.hashCode());
        result = prime * result + ((dataUltimaModificaTo == null) ? 0 : dataUltimaModificaTo.hashCode());

        result = prime * result + ((username == null) ? 0 : username.hashCode());
        return result;
    }

    /**
     * Returns a string representation of the object. In general, the toString method returns a string that
     * "textually represents" this object. The result should be a concise but informative representation
     * that is easy for a person to read.
     * 
     * @return a string representation of the object.
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getName());
        sb.append("(");
        sb.append("username=").append(username);
        sb.append(", ").append("mail=").append(mail);
        sb.append(", ").append("ragioneSociale=").append(ragioneSociale);
        sb.append(", ").append("nome=").append(nome);
        sb.append(", ").append("cognome=").append(cognome);
        sb.append(", ").append("immagine=").append(immagine);
        sb.append(", ").append("dataUltimaModificaFrom=").append(dataUltimaModificaFrom);
        sb.append(", ").append("dataUltimaModificaTo=").append(dataUltimaModificaTo);
        sb.append(")");
        return sb.toString();
    }

    /**
     * @return the username
     * @see SoggettiSearch#username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     * @see SoggettiSearch#username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the email
     * @see SoggettiSearch#email
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param email the email to set
     * @see SoggettiSearch#email
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * @return the ragioneSociale
     * @see SoggettiSearch#ragioneSociale
     */
    public String getRagioneSociale() {
        return ragioneSociale;
    }

    /**
     * @param ragioneSociale the ragioneSociale to set
     * @see SoggettiSearch#ragioneSociale
     */
    public void setRagioneSociale(String ragioneSociale) {
        this.ragioneSociale = ragioneSociale;
    }

    /**
     * @return the nome
     * @see SoggettiSearch#nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     * @see SoggettiSearch#nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cognome
     * @see SoggettiSearch#cognome
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * @param cognome the cognome to set
     * @see SoggettiSearch#cognome
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     * @return the immagine
     * @see SoggettiSearch#immagine
     */
    public String getImmagine() {
        return immagine;
    }

    /**
     * @param immagine the immagine to set
     * @see SoggettiSearch#immagine
     */
    public void setImmagine(String immagine) {
        this.immagine = immagine;
    }

    /**
     * @return the dataUltimaModificaFrom
     * @see SoggettiSearch#dataUltimaModificaFrom
     */
    public Date getDataUltimaModificaFrom() {
        return dataUltimaModificaFrom;
    }

    /**
     * @param dataUltimaModificaFrom the dataUltimaModificaFrom to set
     * @see SoggettiSearch#dataUltimaModificaFrom
     */
    public void setDataUltimaModificaFrom(Date dataUltimaModificaFrom) {
        this.dataUltimaModificaFrom = dataUltimaModificaFrom;
    }

    /**
     * @return the dataUltimaModificaTo
     * @see SoggettiSearch#dataUltimaModificaTo
     */
    public Date getDataUltimaModificaTo() {
        return dataUltimaModificaTo;
    }

    /**
     * @param dataUltimaModificaTo the dataUltimaModificaTo to set
     * @see SoggettiSearch#dataUltimaModificaTo
     */
    public void setDataUltimaModificaTo(Date dataUltimaModificaTo) {
        this.dataUltimaModificaTo = dataUltimaModificaTo;
    }

    /**
     * @return the oggetti
     * @see SoggettiSearch#oggetti
     */
    public Oggetti getOggetti() {
        return oggetti;
    }

    /**
     * @param oggetti the oggetti to set
     * @see SoggettiSearch#oggetti
     */
    public void setOggetti(Oggetti oggetti) {
        this.oggetti = oggetti;
    }

    /**
     * @return the prestiti
     * @see SoggettiSearch#prestiti
     */
    public Prestiti getPrestiti() {
        return prestiti;
    }

    /**
     * @param prestiti the prestiti to set
     * @see SoggettiSearch#prestiti
     */
    public void setPrestiti(Prestiti prestiti) {
        this.prestiti = prestiti;
    }

    public int orderByManagement(String orderField, OrderByTypeEnum orderType) {
        if (orderField.equals("ragioneSociale")) {
            if (OrderByTypeEnum.ASC.equals(orderType)) {
                order = 1;
            } else {
                order = 2;
            }
        }
        if (orderField.equals("nome")) {
            if (OrderByTypeEnum.ASC.equals(orderType)) {
                order = 3;
            } else {
                order = 4;
            }
        }
        if (orderField.equals("cognome")) {
            if (OrderByTypeEnum.ASC.equals(orderType)) {
                order = 5;
            } else {
                order = 6;
            }
        }

        return order;
    }

}