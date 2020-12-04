<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ru">
  <head>
  <%@ include file="head.jsp" %>
  </head>
 <body class="container">
 	 <%@ include file="header.jsp" %>
 	 <content class="content" id="account">
 	 	<form id="registration" class="article" method="POST">
        	<h4 class="smalltitle">Регистрация</h4>
        	<div>
          		<span class="plaintext">Имя:</span>
          		<input type="text" class="input" name="userName" required/>
        	</div>
        	<div>
          		<span class="plaintext">Фамилия:</span>
          		<input type="text" class="input" name="userSurname" />
        	</div>
        	<div>
          		<span class="plaintext">Логин:</span>
          		<input type="text" class="input" name="login" required/>
        	</div>
        	<div>
          		<span class="plaintext">Пароль:</span>
          		<input type="password" class="input" name="password" required/>
        	</div>
        	<div>
          		<input type="submit" class="button"  name="buttonRegister" value="Зарегистрироваться"/>
        	</div>
      	</form>
     </content>
 	 <%@ include file="footer.jsp"%>
 </body>
 