<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value='<%=request.getSession().getAttribute("lang")%>'/>
<fmt:setBundle basename="resources.lang" var="loc"/>
<fmt:message bundle="${loc}" key="lang.label.requests" var="requests"/>
<fmt:message bundle="${loc}" key="lang.label.approverequest" var="approverequest"/>
<!DOCTYPE html>
<html lang="ru">
  <head>
  <%@ include file="head.jsp" %>
  </head>
 <body class="container">
 	 <%@ include file="header.jsp" %>
 	 <content class="content" id="requests">
 	 	<div class="article">
            <tabel>
             	<c:forEach var="request" items="${requests}">
                    	<th>
                        	<h3>${enr_plan}: ${request.getPrice()}</h3>
                            <form method="POST">
                            	<input type="hidden" name="link_button" value="${request}" />
                                <input type="submit" class="button" value="{$approverequest}"/>
                             </form>
                        </th>
                    </c:forEach>
            </tabel>
     </content>
 	 <%@ include file="footer.jsp"%>
 </body>