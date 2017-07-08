<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags"  prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<title><spring:message code="harrastus.create.title" /></title>
<link rel="stylesheet" type="text/css" href="../resources/styles/common.css">
<link rel="stylesheet" type="text/css" href="../resources/styles/form.css">
</head>
<body>

<div id="langsel">
		<a href="?lang=en">en</a> | <a href="?lang=fi">fi</a>
	</div>


<div id="keskelle">
<h1> <spring:message code="harrastus.create.heading" /> </h1>

<form:form modelAttribute="harrastus" method="post">
		  	<fieldset>		
				<legend><spring:message code="harrastus.create.legend" /></legend>
			
				<spring:hasBindErrors name="harrastus">
					<p class="Virheotsikko"><spring:message code="harrastus.create.errors" />:</p>
					<div class="Virheblokki"><form:errors path="*"/></div>
				</spring:hasBindErrors>
				
				<p>	
					<form:label path="nimi"><spring:message code="harrastus.create.hobby" /></form:label><br/>
					<form:input path="nimi" cssErrorClass="VirheellinenKentta"/> <form:errors path="nimi" cssClass="Virheteksti"/>
				</p>
				<p>
					<form:label	path="kuvaus"><spring:message code="harrastus.create.description" /></form:label><br/>
					<form:input path="kuvaus" cssErrorClass="VirheellinenKentta"/> <form:errors path="kuvaus" cssClass="Virheteksti"/>	
				</p>
				<p>	
					<form:label path="pvm"><spring:message code="harrastus.create.date" /></form:label><br/>
					<form:input path="pvm" cssErrorClass="VirheellinenKentta"/> <form:errors path="pvm" cssClass="Virheteksti"/>
				</p>
				<p>	
					<form:label path="aika"><spring:message code="harrastus.create.time" /></form:label><br/>
					<form:input path="aika" cssErrorClass="VirheellinenKentta"/> <form:errors path="aika" cssClass="Virheteksti"/>
				</p>
				<p>	
					<button type="submit"><spring:message code="harrastus.create.add" /></button>
				</p>
				
			</fieldset>
		</form:form>
		</div>
	
			
</html>