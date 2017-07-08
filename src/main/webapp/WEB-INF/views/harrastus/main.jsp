<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../resources/styles/common.css">
<link rel="stylesheet" type="text/css" href="../resources/styles/form.css">
<title>Pääsivu</title>
</head>
<body>
<div id="kuka">
<h3>Sisäänkirjautuneena: <sec:authentication property="principal.username"/></h3>
<p><a href="../j_spring_security_logout" > Kirjaudu ulos</a></p>
</div>
<div id="aloitus2">
<h3>Tervetuloa harrastuspäiväkirjaan!</h3>

<h4>Toiminto</h4>

<p>Olet nyt kirjautunut sisään ja voit aloittaa päiväkirjan käytön</p>
</div>

<div id="right">
<h4>Aloita tästä:</h4>

<p> <a href="uusi">Lisää uusi harrastus</a>
 <p> <a href="haku">Hae tietty harrastus</a>
 <sec:authorize access="hasRole('ROLE_ADMIN')">
<p><a href="admin/poista">Poista harrastus</a></p>
</sec:authorize>
</div>

</body>
</html>