<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="qs2" uri="/quix-strut2-tags" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
  	<head>
  	  	<jsp:include page="_head.jsp"></jsp:include>
 		<script type="text/javascript" src="<%=request.getContextPath() %>/scripts/controller/qxOggettiController.js?_<jsp:include page='_version.jsp' />"></script>
 		<script type="text/javascript" src="<%=request.getContextPath() %>/scripts/controller/qxPrestitiController.js?_<jsp:include page='_version.jsp' />"></script>
 		<script type="text/javascript" src="<%=request.getContextPath() %>/scripts/controller/qxSoggettiController.js?_<jsp:include page='_version.jsp' />"></script>
  		<script type="text/javascript">
	var module = angular.module('qborrow');
	module.constant('labelService', {
	  	'swalWarnDeleteTitle':'<s:property value="getText('label.swalWarnDeleteTitle')" escapeJavaScript="true" escapeHtml="false"/>',
		'swalWarnDeleteMessage':'<s:property value="getText('label.swalWarnDeleteMessage')" escapeJavaScript="true" escapeHtml="false"/>',
		'swalWarnDeleteButton':'<s:property value="getText('label.swalWarnDeleteButton')" escapeJavaScript="true" escapeHtml="false"/>',
		'swalSuccDeleteTitle':'<s:property value="getText('label.swalSuccDeleteTitle')" escapeJavaScript="true" escapeHtml="false"/>',
		'swalSuccDeleteMessage':'<s:property value="getText('label.swalSuccDeleteMessage')" escapeJavaScript="true" escapeHtml="false"/>'
	});
		</script>
		
  	</head>
  	
  	<body  ng-app="qborrow">
  	  		<div class="qcontainer-fluid"> <!-- m -->
  			<jsp:include page="_header.jsp" />
  				<div class="frameworkMainCell" >	
				<form name="forms.userEditForm" ng-controller="qxSoggettiController" ng-init="editUser();">
							<div class="box box-framework" >
								<div class="box-header with-border">
									<h3 class="qh3 box-title">My Page</h3>
								</div>
								<div class="box-body">
								<div class="qcol-md-4">
									<div class="qrow">		
										<div class="qcol-md-6 qcol-sm-6 qcol-xs-12" ng-class="{'qhas-error': forms.userEditForm.email.$invalid}" >
											<label for="mail"><s:text name="soggetti.edit.email"/>*</label>
											<input 
												type="text" 
												ng-model="scopeController.selectedRow.mail" 
												id="email" 
												name="email"
												class="qform-control"/>
											<div class="errorMessage" ng-if="forms.userEditForm.email.$invalid">E-Mail non valida!</div> 
										</div>	
									</div>
									
								<div class="qrow">
										<div class="qcol-md-6 qcol-sm-6 qcol-xs-12" ng-class="{'qhas-error': forms.userEditForm.ragioneSociale.$invalid}">
											<label for="ragioneSociale"><s:text name="soggetti.edit.ragioneSociale"/></label>
											<input type="text" 
												ng-model="scopeController.selectedRow.ragioneSociale" 
												id="ragioneSociale" 
												name="ragioneSociale"
												class="qform-control" />
										</div>
								</div>
									
								<div class="qrow">		
										<div class="qcol-md-6 qcol-sm-6 qcol-xs-12" ng-class="{'qhas-error': forms.userEditForm.nome.$invalid}">
											<label for="nome"><s:text name="soggetti.edit.nome"/></label>
											<input type="text" 
												ng-model="scopeController.selectedRow.nome" 
												id="nome" 
												name="nome"
												class="qform-control" />
										</div>		
								</div>
										
								<div class="qrow">
										<div class="qcol-md-6 qcol-sm-6 qcol-xs-12" ng-class="{'qhas-error': forms.userEditForm.cognome.$invalid}">
											<label for="cognome"><s:text name="soggetti.edit.cognome"/></label>
											<input type="text" 
												ng-model="scopeController.selectedRow.cognome" 
												id="cognome" 
												name="cognome"
												class="qform-control" />
										</div>
								</div>
								
								<div class="qrow">	
										<div class="qcol-md-6 qcol-sm-6 qcol-xs-12" ng-class="{'qhas-error': forms.userEditForm.dataCompleanno.$invalid}">
											<label for="dataCompleanno"><s:text name="soggetti.edit.dataCompleanno"/>*</label>
												<div class="qdropdown">
													<a class="qdropdown-toggle" id="dropdown2" role="qbutton" data-toggle="qdropdown" data-target="#" href="#">
														<div class="qinput-group">
												    		<input type="text" name="dataCompleanno" id="dataCompleanno" class="qform-control box-input-calendar" data-ng-model="scopeController.selectedRow.dataCompleanno" presetDate="true" dateformat="DD/MM/YYYY" required>
												    		<div class="errorMessage" ng-if="forms.userEditForm.dataCompleanno.$invalid">Data di compleanno non valida!</div>
												    		<span class="qinput-group-addon"><i class="fa fa-calendar"></i></span>
												    	</div>
												  	</a>
												  	<ul class="qdropdown-menu" role="qmenu" aria-labelledby="dLabel">
												    	<datetimepicker data-ng-model="scopeController.selectedRow.dataCompleanno" data-datetimepicker-config="{ minView:'day', modelType: 'Date' }"/>
												  	</ul>
												</div>
										</div>
								</div>
								
									<div class="qrow">		
											<div class="qcol-md-6 qcol-sm-6 qcol-xs-12" ng-class="{'qhas-error': forms.userEditForm.immagine.$invalid}">
												<label for="immagine"><s:text name="soggetti.edit.immagine"/></label>
												<input type="text" 
													ng-model="scopeController.selectedRow.immagine" 
													id="immagine" 
													name="immagine"
													class="qform-control" 
													/>
											</div>		
									</div>	
									
								<div class="qrow">
									<div class="box-footer qtext-center">
										<button ng-click="saveUser()" class="qbtn btn-framework-color"><i class="fa fa-floppy-o"></i>&nbsp;<s:text name="button.save"/></button>
										<button ng-click="back()" class="qbtn btn-framework-color"><i class="fa fa-arrow-circle-left"></i>&nbsp;<s:text name="button.back"/></button>
									</div>
							</div>
						</div>
					
							<div class="qcol-md-4">
									<div class="qrow">		
												<img class="imgMioProfilo" ng-src="{{scopeController.selectedRow.immagine}}" width="300" length="300"/>
									</div>	
							</div>	
							
						</div>			
					</div>
				</form>
			</div>
	</div>					
						
  		 	<jsp:include page="_footer.jsp" />
  	</body>
</html>