<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value='<%=request.getSession().getAttribute("lang")%>'/>
<fmt:setBundle basename="resources.lang" var="loc"/>
<fmt:message bundle="${loc}" key="lang.label.review" var="review"/>
<fmt:message bundle="${loc}" key="lang.label.reviewtext" var="reviewtext"/>
<fmt:message bundle="${loc}" key="lang.label.login" var="login"/>
<fmt:message bundle="${loc}" key="lang.label.password" var="password"/>
<fmt:message bundle="${loc}" key="lang.label.registration" var="registration"/>
<!DOCTYPE html>
<html lang="ru">
  <head>
  <%@ include file="head.jsp" %>
  </head>
 <body class="container">
 	 <%@ include file="header.jsp" %>
 	 <content class="content" id="account">
 	 	<form id="registration" class="article" method="POST">
        	<h4 class="smalltitle">${review}</h4>
        	<div>
          		<span class="plaintext">${reviewtext}:</span>
          		<input type="text" class="input" name="reviewtext" required/>
        	</div>
        	<div>
          		<span class="plaintext">${surname}:</span>
          		<input type="text" class="input" name="usersurname" />
        	</div>
        	<div>
          		<input type="submit" class="button"  name="buttonReview" value=${sendreview}/>
        	</div>
      	</form>
     </content>
 	 <%@ include file="footer.jsp"%>
 </body>