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
<title>Poistetun harrastuksen tiedot</title>
</head>
<body>


	<div id="langsel">
		<a href="?lang=en">en</a> | <a href="?lang=fi">fi</a>
	</div>
<div id="nayta2">
<h1>Harrastuksen poisto onnistui, palaa takaisin</h1>
	<a href="poista"><spring:message code="back"/></a>
</div>
</body>
</html>