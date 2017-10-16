package it.quix.academy.core.pseudo;

import it.quix.framework.core.codegen.annotation.OrderByTypeEnum;
import it.quix.framework.core.codegen.annotation.QgEditField;
import it.quix.framework.core.codegen.annotation.QgLabel;
import it.quix.framework.core.codegen.annotation.QgListColumnField;
import it.quix.framework.core.codegen.annotation.QgOrderBy;
import it.quix.framework.core.codegen.annotation.QgSearchField;
import it.quix.framework.core.codegen.annotation.QgSortable;
import it.quix.framework.core.codegen.annotation.SearchFieldType;
import it.quix.framework.core.converter.annotation.QcDateType;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Table(name= "prestiti")
public class Prestiti {
	
	@Id
	@JoinColumn(name="beneficiario")
	@ManyToOne
	@QgSearchField
	@QgEditField(editFieldType = SearchFieldType.COMBO_SEARCH_FIELD)
	public Soggetti soggetti;
	

	@ManyToOne
	@JoinColumn(name="oggetto_prestato")
	@QgSearchField
	@QgEditField(editFieldType = SearchFieldType.COMBO_SEARCH_FIELD)
	public Oggetti oggetti;
	
	@QcDateType
	@QgSearchField
	@Temporal(TemporalType.DATE)
	@Column(name = "data_prestito")
	@QgLabel(label = "Data Inizio Prestito", description ="Data di inizio del prestito")
	@QgListColumnField
	@QgOrderBy(type = OrderByTypeEnum.ASC, position = 0)
	@QgSortable
	public Date dataPrestito;
	
	@QcDateType
	@QgSearchField
	@Temporal(TemporalType.DATE)
	@Column(name = "scadenza_prestito")
	@QgLabel(label = "Data Scadenza Prestito", description ="Data di scadenza del prestito")
	@QgListColumnField
	public Date scadenzaPrestito;
}
