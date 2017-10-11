package it.quix.academy.qborrow.core.search.generated;

import it.quix.framework.core.model.AbstractSearchModel;
import it.quix.framework.core.codegen.annotation.OrderByTypeEnum;
import java.util.Date;
import it.quix.academy.qborrow.core.model.Oggetti;
import it.quix.academy.qborrow.core.model.Soggetti;
import java.math.BigInteger;
import it.quix.academy.qborrow.core.search.PrestitiSearch;

import it.quix.framework.core.converter.annotation.QcDateType;

/**
 * @author Quix CodeGenerator version 03.03.00-SNAPSHOT
 */
public class PrestitiAbstractSearch extends AbstractSearchModel {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private Soggetti soggetti;

    private String soggetti_username;

    @QcDateType()
    private Date dataPrestitoFrom;

    @QcDateType()
    private Date dataPrestitoTo;

    @QcDateType()
    private Date scadenzaPrestitoFrom;

    @QcDateType()
    private Date scadenzaPrestitoTo;

    private Oggetti oggetti;

    private Integer oggetti_id;

    public void clearFilter() {
        soggetti = null;
        soggetti_username = null;
        dataPrestitoFrom = null;
        dataPrestitoTo = null;
        scadenzaPrestitoFrom = null;
        scadenzaPrestitoTo = null;
        oggetti = null;
        oggetti_id = null;
    }

    public PrestitiSearch cloneFilter() {
        PrestitiSearch search = new PrestitiSearch();

        search.setSoggetti(soggetti);
        search.setSoggetti_username(soggetti_username);
        search.setDataPrestitoFrom(dataPrestitoFrom);
        search.setDataPrestitoTo(dataPrestitoTo);
        search.setScadenzaPrestitoFrom(scadenzaPrestitoFrom);
        search.setScadenzaPrestitoTo(scadenzaPrestitoTo);
        search.setOggetti(oggetti);
        search.setOggetti_id(oggetti_id);
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
        PrestitiAbstractSearch other = (PrestitiAbstractSearch) obj;
        if (soggetti == null) {
            if (other.getSoggetti() != null) {
                return false;
            }
        } else if (!soggetti.equals(other.getSoggetti())) {
            return false;
        }
        if (soggetti_username == null) {
            if (other.getSoggetti_username() != null) {
                return false;
            }
        } else if (!soggetti_username.equals(other.getSoggetti_username())) {
            return false;
        }
        if (dataPrestitoFrom == null) {
            if (other.getDataPrestitoFrom() != null) {
                return false;
            }
        } else if (!dataPrestitoFrom.equals(other.getDataPrestitoFrom())) {
            return false;
        }
        if (dataPrestitoTo == null) {
            if (other.getDataPrestitoTo() != null) {
                return false;
            }
        } else if (!dataPrestitoTo.equals(other.getDataPrestitoTo())) {
            return false;
        }
        if (scadenzaPrestitoFrom == null) {
            if (other.getScadenzaPrestitoFrom() != null) {
                return false;
            }
        } else if (!scadenzaPrestitoFrom.equals(other.getScadenzaPrestitoFrom())) {
            return false;
        }
        if (scadenzaPrestitoTo == null) {
            if (other.getScadenzaPrestitoTo() != null) {
                return false;
            }
        } else if (!scadenzaPrestitoTo.equals(other.getScadenzaPrestitoTo())) {
            return false;
        }
        if (oggetti == null) {
            if (other.getOggetti() != null) {
                return false;
            }
        } else if (!oggetti.equals(other.getOggetti())) {
            return false;
        }
        if (oggetti_id == null) {
            if (other.getOggetti_id() != null) {
                return false;
            }
        } else if (!oggetti_id.equals(other.getOggetti_id())) {
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

        result = prime * result + ((soggetti == null) ? 0 : soggetti.hashCode());
        result = prime * result + ((dataPrestitoFrom == null) ? 0 : dataPrestitoFrom.hashCode());
        result = prime * result + ((dataPrestitoTo == null) ? 0 : dataPrestitoTo.hashCode());
        result = prime * result + ((scadenzaPrestitoFrom == null) ? 0 : scadenzaPrestitoFrom.hashCode());
        result = prime * result + ((scadenzaPrestitoTo == null) ? 0 : scadenzaPrestitoTo.hashCode());

        result = prime * result + ((soggetti == null) ? 0 : soggetti.hashCode());
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
        sb.append("soggetti=").append(soggetti);
        sb.append(", ").append("dataPrestitoFrom=").append(dataPrestitoFrom);
        sb.append(", ").append("dataPrestitoTo=").append(dataPrestitoTo);
        sb.append(", ").append("scadenzaPrestitoFrom=").append(scadenzaPrestitoFrom);
        sb.append(", ").append("scadenzaPrestitoTo=").append(scadenzaPrestitoTo);
        sb.append(")");
        return sb.toString();
    }

    /**
     * @return the soggetti
     * @see PrestitiSearch#soggetti
     */
    public Soggetti getSoggetti() {
        return soggetti;
    }

    /**
     * @param soggetti the soggetti to set
     * @see PrestitiSearch#soggetti
     */
    public void setSoggetti(Soggetti soggetti) {
        this.soggetti = soggetti;
    }

    public String getSoggetti_username() {
        return soggetti_username;
    }

    public void setSoggetti_username(String soggetti_username) {
        this.soggetti_username = soggetti_username;
    }

    /**
     * @return the dataPrestitoFrom
     * @see PrestitiSearch#dataPrestitoFrom
     */
    public Date getDataPrestitoFrom() {
        return dataPrestitoFrom;
    }

    /**
     * @param dataPrestitoFrom the dataPrestitoFrom to set
     * @see PrestitiSearch#dataPrestitoFrom
     */
    public void setDataPrestitoFrom(Date dataPrestitoFrom) {
        this.dataPrestitoFrom = dataPrestitoFrom;
    }

    /**
     * @return the dataPrestitoTo
     * @see PrestitiSearch#dataPrestitoTo
     */
    public Date getDataPrestitoTo() {
        return dataPrestitoTo;
    }

    /**
     * @param dataPrestitoTo the dataPrestitoTo to set
     * @see PrestitiSearch#dataPrestitoTo
     */
    public void setDataPrestitoTo(Date dataPrestitoTo) {
        this.dataPrestitoTo = dataPrestitoTo;
    }

    /**
     * @return the scadenzaPrestitoFrom
     * @see PrestitiSearch#scadenzaPrestitoFrom
     */
    public Date getScadenzaPrestitoFrom() {
        return scadenzaPrestitoFrom;
    }

    /**
     * @param scadenzaPrestitoFrom the scadenzaPrestitoFrom to set
     * @see PrestitiSearch#scadenzaPrestitoFrom
     */
    public void setScadenzaPrestitoFrom(Date scadenzaPrestitoFrom) {
        this.scadenzaPrestitoFrom = scadenzaPrestitoFrom;
    }

    /**
     * @return the scadenzaPrestitoTo
     * @see PrestitiSearch#scadenzaPrestitoTo
     */
    public Date getScadenzaPrestitoTo() {
        return scadenzaPrestitoTo;
    }

    /**
     * @param scadenzaPrestitoTo the scadenzaPrestitoTo to set
     * @see PrestitiSearch#scadenzaPrestitoTo
     */
    public void setScadenzaPrestitoTo(Date scadenzaPrestitoTo) {
        this.scadenzaPrestitoTo = scadenzaPrestitoTo;
    }

    /**
     * @return the oggetti
     * @see PrestitiSearch#oggetti
     */
    public Oggetti getOggetti() {
        return oggetti;
    }

    /**
     * @param oggetti the oggetti to set
     * @see PrestitiSearch#oggetti
     */
    public void setOggetti(Oggetti oggetti) {
        this.oggetti = oggetti;
    }

    public Integer getOggetti_id() {
        return oggetti_id;
    }

    public void setOggetti_id(Integer oggetti_id) {
        this.oggetti_id = oggetti_id;
    }

    public int orderByManagement(String orderField, OrderByTypeEnum orderType) {
        if (orderField.equals("dataPrestito")) {
            if (OrderByTypeEnum.ASC.equals(orderType)) {
                order = 1;
            } else {
                order = 2;
            }
        }

        return order;
    }

}