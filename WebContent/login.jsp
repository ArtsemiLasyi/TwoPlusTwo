<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value='<%=request.getSession().getAttribute("lang")%>'/>
<fmt:setBundle basename="resources.lang" var="loc"/>
<fmt:message bundle="${loc}" key="lang.label.entry" var="entry"/>
<fmt:message bundle="${loc}" key="lang.label.login" var="login"/>
<fmt:message bundle="${loc}" key="lang.label.password" var="password"/>
<fmt:message bundle="${loc}" key="lang.link.entry" var="entry"/>
<!DOCTYPE html>
<html>
  <head>
  <%@ include file="head.jsp" %>
  </head>
 <body class="container">
 	 <%@ include file="header.jsp" %>
 	 <content class="content" id="account">
 	 	<form id="registration" class="article" method="POST">
        	<h4 class="smalltitle">${entry}</h4>
        	<div>
          		<span class="plaintext">${login}:</span>
          		<input type="text" class="input" name="login" required/>
        	</div>
        	<div>
          		<span class="plaintext">${password}:</span>
          		<input type="password" class="input" name="password" required/>
        	</div>
        	<div>
          		<input type="submit" class="button"  name="buttonLogin" value=${entry}/>
        	</div>
      	</form>
     </content>
 	 <%@ include file="footer.jsp"%>
 </body>
 