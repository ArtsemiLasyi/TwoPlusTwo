<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value='<%=request.getSession().getAttribute("lang")%>'/>
<fmt:setBundle basename="resources.lang" var="loc"/>
<fmt:message bundle="${loc}" key="lang.link.entry" var="linkentry"/>
<fmt:message bundle="${loc}" key="lang.link.registration" var="linkregistration"/>
<fmt:message bundle="${loc}" key="lang.link.main" var="linkmain"/>
<fmt:message bundle="${loc}" key="lang.link.findroom" var="linkfindroom"/>
<fmt:message bundle="${loc}" key="lang.link.services" var="linkservices"/>
<fmt:message bundle="${loc}" key="lang.link.abouthotel" var="linkabouthotel"/>
<fmt:message bundle="${loc}" key="lang.link.reviews" var="linkreviews"/>
<fmt:message bundle="${loc}" key="lang.link.contacts" var="linkcontacts"/>
	 <header class="header">
      <div class="logo">
        <img class="logoimg" src="images/biglogo_use.png" />
      </div>
      <div>
      	<form method="post" class="language" action="Main">
        	<input type="hidden" class="language_elem" name="lang" value="ru" />
        	<input type="submit" class="language_elem" value="RU" /></input>
        </form>
        <form method="post" class="language" action="Main">
        	<input type="hidden" class="language_elem" name="lang" value="en" />
            <input type="submit" class="language_elem" value="EN" /></input>
        </form>
      </div>
      <div class="account">
      	<a class="button" id="account_button" name="login" href="Login">${linkentry}</a>
        <a class="button" id="account_button" name="registration" href="Registration">${linkregistration}</a>
      </div>
      <nav class="navigation">
      	<a class="nav_menu" href="Main">${linkmain}</a>
        <a class="nav_menu" href="Main#booking">${linkfindroom}</a>
        <a class="nav_menu" href="Main#services">${linkservices}</a>
        <a class="nav_menu" href="Main#about">${linkabouthotel}</a>
        <a class="nav_menu" href="Main#reviews">${linkreviews}</a>
        <a class="nav_menu" href="Main#contacts">${linkcontacts}</a>
      </nav>
    </header>