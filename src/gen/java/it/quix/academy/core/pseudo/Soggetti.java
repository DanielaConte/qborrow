package it.quix.academy.core.pseudo;

import it.quix.framework.core.codegen.annotation.OrderByTypeEnum;
import it.quix.framework.core.codegen.annotation.QgLabel;
import it.quix.framework.core.codegen.annotation.QgListColumnField;
import it.quix.framework.core.codegen.annotation.QgOrderBy;
import it.quix.framework.core.codegen.annotation.QgSearchField;
import it.quix.framework.core.codegen.annotation.QgSortable;
import it.quix.framework.core.converter.annotation.QcDateType;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Table(name= "soggetti")
public class Soggetti {
	
	@Id
	@QgLabel(label = "Username", description ="Username dell'utente")
	@Column(length = 50, nullable = false)
	@QgListColumnField
	public String username;
	
	@QgLabel(label = "Email", description ="Email dell'utente")
	@QgSearchField
	@Column(length = 100, nullable = false)
	@QgListColumnField
	public String email;
	
	@Column(name = "ragione_sociale", length = 255)
	@QgLabel(label = "Ragione Sociale", description ="Ragione Sociale dell'utente")
	@QgSearchField
	@QgOrderBy(type = OrderByTypeEnum.ASC, position = 2)
	@QgSortable
	@QgListColumnField
	public String ragioneSociale;
	
	@QgSearchField
	@Column(length = 50)
	@QgLabel(label = "Nome", description ="Nome")
	@QgOrderBy(type = OrderByTypeEnum.ASC, position = 1)
	@QgSortable
	@QgListColumnField
	public String nome;
	
	@QgSearchField
	@Column(length = 50)
	@QgLabel(label = "Cognome", description ="Cognome")
	@QgOrderBy(type = OrderByTypeEnum.ASC, position = 0)
	@QgSortable
	@QgListColumnField
	public String cognome;
	
	@Lob
	@QgLabel(label = "Immagine", description ="Percorso dell'immagine dell'utente")
	@Column
	@QgListColumnField
	public String immagine;
	
	@QcDateType
	@Temporal(TemporalType.DATE)
	@Column(name = "data_ultima_modifica", length = 50, nullable = false)
	@QgListColumnField
	public Date dataUltimaModifica;
	
	@OneToMany(mappedBy="propretario")
	@QgListColumnField
	public Set<Oggetti> oggetti;
	
	@OneToMany(mappedBy="beneficiario")
	@QgListColumnField
	public Set<Prestiti> prestiti;
}
