<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
     <!-- spring:url value="/resources/Home.css" var="mainCss" /-->
       <spring:url value="/resources/" var="mainsrc" />
		<!-- link href="${mainCss}" rel="stylesheet" /-->  
		
<style>

</style>   
</head>
<body>

  <div class="container-fluid" style="background-color:	#E6E6FA;color:black;">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Interactive Medical Services</a>
    </div><br><br><br><br>
    <ul class="nav navbar-nav">
      <li class="active"><a href="Home">Home</a></li>
      <li><a href ="BookAppoitment">Book Appoitment</a> </li>
	  <li><a href="ViewAppoitment" > View Appoitment </a></li>
	  <li><a href="ViewUser" >Edit Details</a></li>
	   <li><a href="editBookingInfo" >Edit Booking Details</a></li>
	   <li><a href="emailService" >Send Booking Details to Email</a></li>
	    
    </ul>
    <ul class="nav navbar-nav navbar-right">
     
      <li><a href= "Logout"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
    </ul>
  </div>

</body>
</html>