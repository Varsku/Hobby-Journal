<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags"  prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../resources/styles/common.css">
<link rel="stylesheet" type="text/css" href="../resources/styles/form.css">
<title><spring:message code="harrastus.search.title" /></title>
</head>
<body>

<div id="langsel">
		<a href="?lang=en">en</a> | <a href="?lang=fi">fi</a>
	</div>
	
	<div id="haku">
	<div id="keskelle">
<h1> <spring:message code="harrastus.search.heading" /> </h1>

<p><spring:message code="harrastus.search.date" /></p>
<form action="haku" method="post"> 
<input type="text" name="pvm">
<button type="submit"><spring:message code="harrastus.search.add" /></button>
</form>
</div>
</div>

</body>
</html>