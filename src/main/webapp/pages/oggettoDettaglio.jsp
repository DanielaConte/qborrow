<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="qs2" uri="/quix-strut2-tags" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<form name="forms.oggettiEditForm">
	<div class="qcontainer" >
		<div class="box-header with-border">
			<h3 class="qh3 box-title"><s:text name="oggetti.edit.title"/></h3>
		</div>
		<div class="box-body">
			<div class="qrow">		
				<div class="qcol-md-4" ng-class="{'qhas-error': forms.oggettiEditForm.titolo.$invalid}">
					<label for="titolo"><s:text name="oggetti.edit.titolo"/></label>
					<input type="text" 
						ng-model="scopeController.selectedRow.titolo" 
						id="titolo" 
						name="titolo"
						class="qform-control" />
					<div ng-messages="forms.oggettiEditForm.titolo.$error" role="alert">
					  	<div ng-message="notNull"><s:text name="error.notNull"/></div>
					  	<div ng-message="invalidAK"><s:text name="error.invalidAK"/></div>
					  	<div ng-message="notValid"><s:text name="error.notValid"/></div>
					  	<div ng-message="lenght"><s:text name="error.lenght"/></div>
					  	<div ng-message="dateToBeforeDateFrom"><s:text name="error.dateToBeforeDateFrom"/></div>
					  	<div ng-message="fieldToBeforeFieldFrom"><s:text name="error.fieldToBeforeFieldFrom"/></div>
					  	<div ng-message="notUnique"><s:text name="error.notUnique"/></div>
					  	<div ng-message="min"><s:text name="error.min"/></div>
					  	<div ng-message="max"><s:text name="error.max"/></div>
					  	<div ng-message="ognl"><s:text name="error.ognl"/></div>
					  	<div ng-message="pattern"><s:text name="error.pattern"/></div>
					  	<div ng-message="notBlank"><s:text name="error.notBlank"/></div>
					  	<div ng-message="qvpattern.message"><s:text name="error.qvpattern.message"/></div>
					  	<div ng-message="string.length"><s:text name="error.string.length"/></div>
					</div>
				</div>
			</div>
			<div class="qrow">		
				<div class="qcol-md-4" ng-class="{'qhas-error': forms.oggettiEditForm.descrizione.$invalid}">
					<label for="descrizione"><s:text name="oggetti.edit.descrizione"/></label>
					<input type="text" 
						ng-model="scopeController.selectedRow.descrizione" 
						id="descrizione" 
						name="descrizione"
						class="qform-control" />
					<div ng-messages="forms.oggettiEditForm.descrizione.$error" role="alert">
					  	<div ng-message="notNull"><s:text name="error.notNull"/></div>
					  	<div ng-message="invalidAK"><s:text name="error.invalidAK"/></div>
					  	<div ng-message="notValid"><s:text name="error.notValid"/></div>
					  	<div ng-message="lenght"><s:text name="error.lenght"/></div>
					  	<div ng-message="dateToBeforeDateFrom"><s:text name="error.dateToBeforeDateFrom"/></div>
					  	<div ng-message="fieldToBeforeFieldFrom"><s:text name="error.fieldToBeforeFieldFrom"/></div>
					  	<div ng-message="notUnique"><s:text name="error.notUnique"/></div>
					  	<div ng-message="min"><s:text name="error.min"/></div>
					  	<div ng-message="max"><s:text name="error.max"/></div>
					  	<div ng-message="ognl"><s:text name="error.ognl"/></div>
					  	<div ng-message="pattern"><s:text name="error.pattern"/></div>
					  	<div ng-message="notBlank"><s:text name="error.notBlank"/></div>
					  	<div ng-message="qvpattern.message"><s:text name="error.qvpattern.message"/></div>
					  	<div ng-message="string.length"><s:text name="error.string.length"/></div>
					</div>
				</div>	
			</div>	
			<div class="qrow">		
				<div class="qcol-md-4" ng-class="{'qhas-error': forms.oggettiEditForm.categoria.$invalid}">
					<label for="categoria"><s:text name="oggetti.edit.categoria"/></label>
					<input type="text" 
						ng-model="scopeController.selectedRow.categoria" 
						id="descrizione" 
						name="descrizione"
						class="qform-control" />
					<div ng-messages="forms.oggettiEditForm.categoria.$error" role="alert">
					  	<div ng-message="notNull"><s:text name="error.notNull"/></div>
					  	<div ng-message="invalidAK"><s:text name="error.invalidAK"/></div>
					  	<div ng-message="notValid"><s:text name="error.notValid"/></div>
					  	<div ng-message="lenght"><s:text name="error.lenght"/></div>
					  	<div ng-message="dateToBeforeDateFrom"><s:text name="error.dateToBeforeDateFrom"/></div>
					  	<div ng-message="fieldToBeforeFieldFrom"><s:text name="error.fieldToBeforeFieldFrom"/></div>
					  	<div ng-message="notUnique"><s:text name="error.notUnique"/></div>
					  	<div ng-message="min"><s:text name="error.min"/></div>
					  	<div ng-message="max"><s:text name="error.max"/></div>
					  	<div ng-message="ognl"><s:text name="error.ognl"/></div>
					  	<div ng-message="pattern"><s:text name="error.pattern"/></div>
					  	<div ng-message="notBlank"><s:text name="error.notBlank"/></div>
					  	<div ng-message="qvpattern.message"><s:text name="error.qvpattern.message"/></div>
					  	<div ng-message="string.length"><s:text name="error.string.length"/></div>
					</div>
				</div>	
			</div>
			<div class="qrow">	
				<div class="qcol-md-4" ng-class="{'qhas-error': forms.oggettiEditForm.immagine.$invalid}">
					<label for="immagine"><s:text name="oggetti.edit.immagine"/></label>
					<input type="text" 
						ng-model="scopeController.selectedRow.immagine" 
						id="immagine" 
						name="immagine"
						class="qform-control" />
					<div ng-messages="forms.oggettiEditForm.immagine.$error" role="alert">
					  	<div ng-message="notNull"><s:text name="error.notNull"/></div>
					  	<div ng-message="invalidAK"><s:text name="error.invalidAK"/></div>
					  	<div ng-message="notValid"><s:text name="error.notValid"/></div>
					  	<div ng-message="lenght"><s:text name="error.lenght"/></div>
					  	<div ng-message="dateToBeforeDateFrom"><s:text name="error.dateToBeforeDateFrom"/></div>
					  	<div ng-message="fieldToBeforeFieldFrom"><s:text name="error.fieldToBeforeFieldFrom"/></div>
					  	<div ng-message="notUnique"><s:text name="error.notUnique"/></div>
					  	<div ng-message="min"><s:text name="error.min"/></div>
					  	<div ng-message="max"><s:text name="error.max"/></div>
					  	<div ng-message="ognl"><s:text name="error.ognl"/></div>
					  	<div ng-message="pattern"><s:text name="error.pattern"/></div>
					  	<div ng-message="notBlank"><s:text name="error.notBlank"/></div>
					  	<div ng-message="qvpattern.message"><s:text name="error.qvpattern.message"/></div>
					  	<div ng-message="string.length"><s:text name="error.string.length"/></div>
					</div>
				</div>
			</div>	
	</div>
</div>
	<div class="qcontainer" >
		<div class="box-header with-border">
		</div>
		<div class="box-body">
			<div class="qrow">	
				<div class="qcol-md-4" ng-class="{'qhas-error': forms.oggettiEditForm.beneficiario.$invalid}">
					<label for="beneficiario"><s:text name="oggetti.edit.soggetti"/></label>
					<input type="text" 
						ng-model="scopeController.selectedRow.prestito.soggetti.username" 
						id="beneficiario" 
						name="beneficiario"
						class="qform-control" />
					<div ng-messages="forms.oggettiEditForm.immagine.$error" role="alert">
					  	<div ng-message="notNull"><s:text name="error.notNull"/></div>
					  	<div ng-message="invalidAK"><s:text name="error.invalidAK"/></div>
					  	<div ng-message="notValid"><s:text name="error.notValid"/></div>
					  	<div ng-message="lenght"><s:text name="error.lenght"/></div>
					  	<div ng-message="dateToBeforeDateFrom"><s:text name="error.dateToBeforeDateFrom"/></div>
					  	<div ng-message="fieldToBeforeFieldFrom"><s:text name="error.fieldToBeforeFieldFrom"/></div>
					  	<div ng-message="notUnique"><s:text name="error.notUnique"/></div>
					  	<div ng-message="min"><s:text name="error.min"/></div>
					  	<div ng-message="max"><s:text name="error.max"/></div>
					  	<div ng-message="ognl"><s:text name="error.ognl"/></div>
					  	<div ng-message="pattern"><s:text name="error.pattern"/></div>
					  	<div ng-message="notBlank"><s:text name="error.notBlank"/></div>
					  	<div ng-message="qvpattern.message"><s:text name="error.qvpattern.message"/></div>
					  	<div ng-message="string.length"><s:text name="error.string.length"/></div>
					</div>
				</div>
			</div>	
		<div class="qrow">	
			<div class="qcol-md-4" ng-class="{'qhas-error': forms.oggettiEditForm.dataPrestito.$invalid}">
				<label for="dataPrestito"><s:text name="prestiti.edit.dataPrestito"/>*</label>
					<div class="qdropdown">
						<a class="qdropdown-toggle" id="dropdown2" role="qbutton" data-toggle="qdropdown" data-target="#" href="#">
							<div class="qinput-group">
								<input type="text" name="dataPrestito" id="dataPrestito" class="qform-control box-input-calendar" data-ng-model="scopeController.selectedRow.prestito.dataPrestito" presetDate="true" dateformat="DD/MM/YYYY">
									<div class="errorMessage" ng-if="forms.userEditForm.dataPrestito.$invalid">Data prestito non valida!</div>
									    <span class="qinput-group-addon"><i class="fa fa-calendar"></i></span>
							</div>
						</a>
					<ul class="qdropdown-menu" role="qmenu" aria-labelledby="dLabel">
						<datetimepicker data-ng-model="scopeController.selectedRow.prestito.dataPrestito" data-datetimepicker-config="{ minView:'day', modelType: 'Date' }"/>
					</ul>
					</div>
			</div>
		</div>
		<div class="qrow">	
			<div class="qcol-md-4" ng-class="{'qhas-error': forms.oggetiEditForm.scadenzaPrestito.$invalid}">
				<label for="scadenzaPrestito"><s:text name="prestiti.edit.scadenzaPrestito"/>*</label>
					<div class="qdropdown">
						<a class="qdropdown-toggle" id="dropdown2" role="qbutton" data-toggle="qdropdown" data-target="#" href="#">
							<div class="qinput-group">
								<input type="text" name="scadenzaPrestito" id="scadenzaPrestito" class="qform-control box-input-calendar" data-ng-model="scopeController.selectedRow.prestito.scadenzaPrestito" presetDate="true" dateformat="DD/MM/YYYY">
									<div class="errorMessage" ng-if="forms.userEditForm.scadenzaPrestito.$invalid">Data scadenza prestito non valida!</div>
									    <span class="qinput-group-addon"><i class="fa fa-calendar"></i></span>
							</div>
						</a>
					<ul class="qdropdown-menu" role="qmenu" aria-labelledby="dLabel">
						<datetimepicker data-ng-model="scopeController.selectedRow.prestito.scadenzaPrestito" data-datetimepicker-config="{ minView:'day', modelType: 'Date' }"/>
					</ul>
					</div>
			</div>
		</div>

		<div class="box-footer qtext-center">
			<button ng-click="saveUser()" class="qbtn btn-framework-color"><i class="fa fa-floppy-o"></i>&nbsp;<s:text name="button.save"/></button>
			<button ng-click="back()" class="qbtn btn-framework-color"><i class="fa fa-arrow-circle-left"></i>&nbsp;<s:text name="button.back"/></button>
		</div>
	</div>
</div>
</form>