<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value='<%=request.getSession().getAttribute("lang")%>'/>
<fmt:setBundle basename="resources.lang" var="loc"/>
<fmt:message bundle="${loc}" key="lang.label.rooms" var="rooms"/>
<fmt:message bundle="${loc}" key="lang.label.book" var="book"/>
<!DOCTYPE html>
<html lang="ru">
  <head>
  <%@ include file="head.jsp" %>
  </head>
 <body class="container">
 	 <%@ include file="header.jsp" %>
 	 <content class="content" id="rooms">
 	 	<div class="article">
            <tabel>
             	<c:forEach var="room" items="${rooms}">
                    	<th>
                        	<h3>${enr_plan}: ${rooms.getNumber()}</h3>
                            <form method="POST">
                            	<input type="hidden" name="link_button" value="${room}" />
                                <input type="submit" class="button" value="{$book}"/>
                             </form>
                        </th>
                    </c:forEach>
            </tabel>
     </content>
 	 <%@ include file="footer.jsp"%>
 </body>
 