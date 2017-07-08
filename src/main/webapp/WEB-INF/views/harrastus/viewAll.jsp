<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags"  prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../resources/styles/common.css">
<link rel="stylesheet" type="text/css" href="../resources/styles/form.css">
<title>Insert title here</title>
</head>
<body>

<h1>Harrastuksen tiedot</h1>

<c:forEach items="${harrastus}" var="harrastus">
<div id="nayta">
	<p>Nimi:<c:out value="${harrastus.nimi}" default="-----"/></p>
	<p>Kuvaus:<c:out value="${harrastus.kuvaus}" default="-----"/></p>
	<p>Päiväys:<c:out value="${harrastus.pvm}" default="-----"/></p>
	<p>Aika:<c:out value="${harrastus.aika}" default="-----"/></p>
	</div>
</c:forEach>
<br><br><br><br>
	<a href="haku"><spring:message code="back"/></a>
</body>
</html>