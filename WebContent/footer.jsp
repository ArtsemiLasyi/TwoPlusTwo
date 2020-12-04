<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value='<%=request.getSession().getAttribute("lang")%>'/>
<fmt:setBundle basename="resources.lang" var="loc"/>
<fmt:message bundle="${loc}" key="lang.label.title" var="title"/>
<footer class="footer">
	<p>2020 ${title}</p>
</footer>