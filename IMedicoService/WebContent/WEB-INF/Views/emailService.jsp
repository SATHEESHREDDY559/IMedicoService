<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link href="${mainCss}" rel="stylesheet" />
<jsp:include page="UserLoggedHeading.jsp"/>
<spring:url value="/resources/Home.css" var="MCss" />
<style>
.error {
	color: red;
	font-weight: bold;
}
 div.form {
	text-align: right width:300px;
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
    div.form  {
    
    background-color: lightgrey;
}
</style>
<title>Email Appointment Info</title>
</head>
<body>
	
	  	<div class="rightdiv">
			     <center> <div class="form"> 
				<form:form method="Post" action="emailService"		commandName="BookingApp">

					<h1 class="error"><c:out value="${Message}" /></h1>
					
					<input type="submit" value="Email Appointment Info" style="height:50px;"/>
					
					
					<h2>Before mailing Confirmation about the appointment. Check below details</h2>
							TokenID:<c:out value="${appinfo.id}" />	<br>
							Doctor Name: <c:out value="${appinfo.doctorName}" /><br>							
							Appointment Time : <c:out value="${appinfo.appointmentTime}" /><br>
							Appointment Date : <c:out value="${appinfo.appointmentDate}" /><br> 
							Reason for Visit : <c:out value="${appinfo.reason}" />
					</form:form>
					</div></center>
					<br/>
				</div>
				
		
		
		<br /> 
	<div id="footer">
       <jsp:include page="footer.jsp"/>
   </div> 
	
</body>
</html>