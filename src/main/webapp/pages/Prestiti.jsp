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
  	<body ng-app="qborrow"> 
  		<div class="qcontainer-fluid"> <!-- m barra del menu messa in orizzontale -->
  			<jsp:include page="_header.jsp" />
  				<div class="frameworkMainCell" ng-controller="qxPrestitiController" ng-include="scopeController.selectedPage">
					
  				</div>
  				<script type="text/ng-template" id="list"><jsp:include page="_prestiti.jsp" /></script>
  				<script type="text/ng-template" id="edit"><jsp:include page="_prestitiEdit.jsp" /></script>
				<script type="text/ng-template" id="Oggetti"><jsp:include page="_oggetti.jsp" /></script>
				<script type="text/ng-template" id="Prestiti"><jsp:include page="_prestiti.jsp" /></script>
				<script type="text/ng-template" id="Soggetti"><jsp:include page="_soggetti.jsp" /></script>				

  		 	<jsp:include page="_footer.jsp" />
	  	</div>	
  	</body>
</html>
