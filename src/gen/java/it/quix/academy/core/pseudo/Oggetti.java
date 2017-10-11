package it.quix.academy.core.pseudo;

import it.quix.framework.core.codegen.annotation.OrderByTypeEnum;
import it.quix.framework.core.codegen.annotation.QgAttribute;
import it.quix.framework.core.codegen.annotation.QgEditField;
import it.quix.framework.core.codegen.annotation.QgLabel;
import it.quix.framework.core.codegen.annotation.QgListColumnField;
import it.quix.framework.core.codegen.annotation.QgOrderBy;
import it.quix.framework.core.codegen.annotation.QgSearchField;
import it.quix.framework.core.codegen.annotation.QgSortable;
import it.quix.framework.core.codegen.annotation.SearchFieldType;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Table(name= "oggetti")
public class Oggetti {

	@Id	
	@Column(nullable = false)
	@QgLabel(label = "Id", description ="Codice identificativo dell'oggetto")
	@QgListColumnField
	public Integer id;
		
	@ManyToOne
	@JoinColumn(name="propretario")
	@QgSearchField
	@QgEditField(editFieldType = SearchFieldType.POPUP_SEARCH_FIELD)
	@QgLabel(label = "Propretario", description ="Username del propretario dell'oggetto")
	public Soggetti soggetti;
	
	@QgSearchField
	@Column(length = 255)
	@QgLabel(label = "Titolo", description ="Titolo dell'oggetto")
	@QgListColumnField
	@QgOrderBy(type = OrderByTypeEnum.ASC, position = 0)
	@QgSortable
	public String titolo;
	
	@QgSearchField
	@Column(length = 50)
	@QgLabel(label = "Descrizione", description ="Descrzione dell'oggetto")
	@QgListColumnField
	public String descrizione;
	
	
	@Column
	@Lob
	@QgLabel(label = "Immagine", description ="Percorso dell'immagine dell'oggetto")
	@QgListColumnField
	public String immagine;
	
	@QgSearchField
	@Column(length = 255)
	@QgLabel(label = "Categoria", description ="Categoria a cui appartiene l'oggetto")
	@QgListColumnField
	@QgAttribute(type="qbo0001_categoria")
	public String categoria;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_ultima_modifica",length = 50, nullable = false)
	@QgListColumnField
	public Date dataUltimaModifica;
}
