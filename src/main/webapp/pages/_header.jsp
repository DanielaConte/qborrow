<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="qs2" uri="/quix-strut2-tags" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="qs2" uri="/quix-strut2-tags" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<s:url id="homeUrl" namespace="/" action="home" escapeAmp="false" includeParams="none">
</s:url>
<s:url id="logoutUrl" action="logout" includeParams="none" escapeAmp="false">
</s:url>
<s:url id="homeUrl" namespace="/" action="home" escapeAmp="false" includeParams="none">
	<s:param name="version">2</s:param>
</s:url>
<s:url id="oggettiUrl" namespace="/" action="oggetti" escapeAmp="false" includeParams="none">
	<s:param name="task">mainPage</s:param>
</s:url>
<s:url id="mieiOggettiUrl" namespace="/" action="oggetti" escapeAmp="false" includeParams="none">
	<s:param name="task">mieiOggetti</s:param>
</s:url>
<s:url id="prestitiUrl" namespace="/" action="prestiti" escapeAmp="false" includeParams="none">
	<s:param name="task">mainPage</s:param>
</s:url>
<s:url id="soggettiUrl" namespace="/" action="soggetti" escapeAmp="false" includeParams="none">
	<s:param name="task">mainPage</s:param>
</s:url>
<s:url id="userUrl" namespace="/" action="soggetti" escapeAmp="false" includeParams="none">
	<s:param name="task">mioProfilo</s:param>
</s:url>


<!-- Bootstrap navbar (hamburger) m -->
<div class="qrow">
	<!-- menu che prende tutta la riga -->
	<nav class="qnavbar qnavbar-default" role="navigation">


		<div class="qnavbar-header">
			<button type="button" class="qnavbar-toggle" data-toggle="collapse"
				data-target="#bs-example-navbar-collapse-1">
				<span class="qsr-only">Toggle navigation</span> <span
					class="qicon-bar"></span> <span class="qicon-bar"></span> <span
					class="qicon-bar"></span>
			</button>
			<a class="qnavbar-brand" href="#"><img
				onclick="document.location.href='<s:property value="#homeUrl"/>';"
				src="<qs2:imagesPath nome="/logo-qfrmk.png" version="2"/>"></a>
		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="qcollapse qnavbar-collapse" id="bs-example-navbar-collapse-1">
			<ul class="qnav qnavbar-nav">

				<li class="framework-sidebar-menu-element qtext-left <% if("Home".equals(request.getParameter("menuActive"))) { %>framework-sidebar-menu-element-active<% } %>">
					<a class="framework-sidebar-menu-element-link" href="<s:property value="#homeUrl" escape="false" />">
					 <s:text name="menu.home" />
					</a>
				</li>
				<li class="framework-sidebar-menu-element qtext-left <% if("oggetti".equals(request.getParameter("menuActive"))) { %>framework-sidebar-menu-element-active<% } %>">
					<a class="framework-sidebar-menu-element-link" href="<s:property value="#oggettiUrl" escape="false" />">
					 oggetti
					</a>
				<li class="framework-sidebar-menu-element qtext-left <% if("oggetti".equals(request.getParameter("menuActive"))) { %>framework-sidebar-menu-element-active<% } %>">
					<a class="framework-sidebar-menu-element-link" href="<s:property value="#mieiOggettiUrl" escape="false" />">
					 miei Oggetti
					</a>
				</li>
				<li class="framework-sidebar-menu-element qtext-left <% if("prestiti".equals(request.getParameter("menuActive"))) { %>framework-sidebar-menu-element-active<% } %>">
					<a class="framework-sidebar-menu-element-link" href="<s:property value="#prestitiUrl" escape="false" />">
					 prestiti
					</a>
				</li>
				<li class="framework-sidebar-menu-element qtext-left <% if("soggetti".equals(request.getParameter("menuActive"))) { %>framework-sidebar-menu-element-active<% } %>">
					<a class="framework-sidebar-menu-element-link" href="<s:property value="#soggettiUrl" escape="false" />">
					  soggetti
					</a>
				</li>

			</ul>

			<!-- pulsante del menu utente (quello da cui fare log out) -->
			<ul class="qnav qnavbar-nav qnavbar-right">
				<li><div class="frameworkHeaderRightCellUserDiv pull-right">
						<a href="#" class="qdropdown-toggle user-menu-link"
							data-toggle="qdropdown">
							<div style="display:inline-block; padding-left: 30px; padding-top: 10px;">
							<!-- fa-user è il nome dell'icona utente presa da font-awsome -->
								<i class="fa fa-user" aria-hidden="true"></i>&nbsp;<span class="qhidden-xs"><s:property value="userContext.getUserText()" /></span>
							</div>
						</a>
						<ul class="qdropdown-menu user-dropdown-menu">
							<li class="user-header"><img
								src="<qs2:imagesPath nome="/user.jpg" version="2"/>"
								class="qimg-circle" alt="<s:text name="header.userimage"/>" />
								<p class="user-header-p">
									<br>
									<s:property value="userContext.getUserText()" />
									-
									<s:if test="userContext.isUserInRole('framework-admin')">
										<s:text name="header.adminRole" />
									</s:if>
									<s:else>
										<s:text name="header.userRole" />
									</s:else>
									<BR> <small><s:text name="header.membersince" />
										<s:property
											value="userContext.getUserCreateDate(getText('format.date'))" /></small>
								</p></li>
							<li class="user-footer">
								<div class="qpull-left">
									<a href="<s:property value="#userUrl" escape="false" />"
										class="qbtn qbtn-default qbtn-flat"><s:text
											name="header.profile" /></a>
								</div>
								<div class="qpull-right">
									<a href="<s:property value="#logoutUrl" escape="false" />"
										class="qbtn qbtn-default qbtn-flat"><s:text
											name="header.signout" /></a>
								</div>
							</li>
						</ul>
					</div>
				</li>
			</ul>

		</div>
	</nav>
</div>
<!-- </div> -->
<!-- End bootstrap navbar -->	

	 