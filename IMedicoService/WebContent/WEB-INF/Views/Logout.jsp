<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<spring:url value="/resources/" var="mainsrc" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <jsp:include page="Heading.jsp"/>
 <spring:url value="/resources/Home.css" var="mainCss" />
 <link href="${mainCss}" rel="stylesheet" />
 <style>
 div.form {
	text-align: center width:300px;
	padding: 10px;
	margin: 0px;
	width:60%;
	align:center;
	margin: auto;
	z-index: 15;
    bottom: 500px;
    height:800px;
	/*background:#B6B6B4;*/
}
</style>
</head>
<body>
    <div id="head" style="width:100%;height:80px" >
	    
	</div>
	<div id="navig">
	
	</div>
	<div id="form">
	    <h2>Thanks for using our service please come back</h2>
	</div>
</body>
</html>