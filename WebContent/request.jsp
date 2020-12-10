<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value='<%=request.getSession().getAttribute("lang")%>'/>
<fmt:setBundle basename="resources.lang" var="loc"/>
<fmt:message bundle="${loc}" key="lang.label.request" var="request"/>
<fmt:message bundle="${loc}" key="lang.label.roomnumber" var="roomnumber"/>
<fmt:message bundle="${loc}" key="lang.label.checkin" var="checkin"/>
<fmt:message bundle="${loc}" key="lang.label.checkout" var="password"/>
<fmt:message bundle="${loc}" key="lang.label.requestapprove" var="requestapprove"/>
<!DOCTYPE html>
<html lang="ru">
  <head>
  <%@ include file="head.jsp" %>
  </head>
 <body class="container">
 	 <%@ include file="header.jsp" %>
 	 <content class="content">
 	 	<form id="request" class="article" method="POST">
        	<h4 class="smalltitle">${request}</h4>
        	<div>
          		<span class="plaintext">${roomnumber}:</span>
          		<input type="text" class="input" name="roomnumber" required/>
        	</div>
        	<div>
          		<span class="plaintext">${sum}:</span>
          		<input type="text" class="input" name="sum" readonly/>
        	</div>
        	<div>
          		<span class="plaintext">${checkin}:</span>
          		<input type="datetime" class="input" name="checkInDate" readonly/>
         		 <br />
        	</div>
        	<div>
          		<span class="plaintext">${checkout}:</span>
          		<input type="datetime" class="input" name="checkOutDate" readonly/>
          		<br />
        	</div>
        	<div>
          		<input type="submit" class="button"  name="buttonRequest" value=${requestapprove}/>
        	</div>
      	</form>
     </content>
 	 <%@ include file="footer.jsp"%>
 </body>