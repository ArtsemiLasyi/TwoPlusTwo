<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value='<%=request.getSession().getAttribute("lang")%>'/>
<fmt:setBundle basename="resources.lang" var="loc"/>
<!DOCTYPE html>
<html lang="ru">
  <head>
  <%@ include file="head.jsp" %>
  </head>
 <body class="container">
 	 <%@ include file="header.jsp" %>
 	 <content class="content" id="account">
 	 	<form id="registration" class="article" method="POST">
        	<h4 class="smalltitle">${registration}</h4>
        	<div>
          		<span class="plaintext">${name}:</span>
          		<input type="text" class="input" name="username" required/>
        	</div>
        	<div>
          		<span class="plaintext">${surname}:</span>
          		<input type="text" class="input" name="usersurname" />
        	</div>
        	<div>
          		<span class="plaintext">email:</span>
          		<input type="email" class="input" name="email" required/>
        	</div>
        	<div>
          		<span class="plaintext">${login}:</span>
          		<input type="text" class="input" name="login" required/>
        	</div>
        	<div>
          		<span class="plaintext">${password}:</span>
          		<input type="password" class="input" name="password" required/>
        	</div>
        	<div>
          		<input type="submit" class="button"  name="buttonRegister" value=${registration}/>
        	</div>
      	</form>
     </content>
 	 <%@ include file="footer.jsp"%>
 </body>