<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags"  prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


<title>Poista harrastus</title>
<link rel="stylesheet" type="text/css" href="../resources/styles/common.css">
<link rel="stylesheet" type="text/css" href="../resources/styles/form.css">
</head>
<body>

<div id="langsel">
		<a href="?lang=en">en</a> | <a href="?lang=fi">fi</a>
	</div>
<h1></h1>
<div id="haku">
<p>Anna poistettavan harrastuksen id:</p>
<form action="poista" method="post"> 
<input type="text" name="id">
<button type="submit">poista</button>
</form>
</div>


</body>
</html>