<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="qs2" uri="/quix-strut2-tags" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
  	<head>
  		<jsp:include page="_head.jsp"></jsp:include>
  	</head>
  	<body ng-app="qborrow"> 
  		<div class="qcontainer-fluid"> <!-- m per contenere la nav bar -->
  			<jsp:include page="_header.jsp" />
			 <div class="qcontainer"> 		
			  		<div qrow> <!-- m -->
		<!-- 	non ci serve più il menù laterale -->
		<!-- 	  		<div class="frameworkLeftMenuCell"> -->
		<%-- 					<jsp:include page="_left.jsp"> --%>
		<%-- 						<jsp:param name="menuActive" value="Home"/> --%>
		<%-- 					</jsp:include> --%>
		<!-- 				</div> -->
		  				<div class="frameworkMainCell">
							<div class="qpage-header">
								<h1>Benvenuto, <s:property value="userContext.getUserText()" /></h1>
							</div>
							<div class="qrow">
								<div class="qcol-sm-3">
									<div class="buttonOggetti">
										<s:a href="%{#oggettiUrl}">Oggetti</s:a>
										<s:url id="prestitiUrl" action="prestiti" escapeAmp="false" includeParams="none">
											<s:param name="task">mainPage</s:param>
										</s:url>
									</div>
								</div>
								
								<div class="qcol-sm-3">
									<div class="buttonPrestiti">
									    <s:a href="%{#prestitiUrl}">Prestiti</s:a>
										<s:url id="soggettiUrl" action="soggetti" escapeAmp="false" includeParams="none">
											<s:param name="task">mainPage</s:param>
										</s:url>
									</div>
								</div>
								
								<div class="qcol-sm-3">
									<div class="buttonSoggetti">
										<s:a href="%{#soggettiUrl}">Soggetti</s:a>					
										<s:url id="frmkUrl" namespace="/framework" action="admin" escapeAmp="false" includeParams="none">
						  					<s:param name="version">2</s:param>
						  				</s:url>
						  			</div>
								</div>
										
								<div class="qcol-sm-3">
									<div class="buttonFramework">
										<s:a href="%{#frmkUrlUrl}">Amministrazione</s:a>
									</div>
								</div>
							</div>
		  				</div>
		  			</div>
				</div>
		  		 <jsp:include page="_footer.jsp" />
			 </div>	
  	</body>
</html>
