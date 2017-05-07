<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
   <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <spring:url value="/resources/Home.css" var="MCss" />
<link href="${MCss}" rel="stylesheet" />
<jsp:include page="UserLoggedHeading.jsp"/>
<style>
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
</style>     
</head>
<body>
  <div id="head" style="width:100%;height:80px" >
	  
	</div>
	<div id="navig">
	
	</div>
    <div class="form">
      <center><h1>Your profile has been updated</h1><hr/><br/><br/><br/>
   <table bgcolor="white" style="width:80%" >
    <tr style="text-align: center;color:blue;"
     height="40px">
     
     <td  >User Id </td>
     <td >User Name</td>
     <td >Password</td>
     <td >Full Name</td>
     <td >E-Mail ID</td>
     <td >DOB</td>
       <td>Gender</td>
         <td>Phone</td>
           <td>Address</td>
             <td>ZipCode</td>
    </tr>
   
     <tr
      style="background-color: white; color: black; text-align: center;"
      height="30px">
      
      <td><c:out value="${user.userid}" />
      </td>
      <td><c:out value="${user.username}" />
      </td>
      <td><c:out value="${user.password}" />
      </td>  
      <td><c:out value="${user.firstname}   ${user.lastname}" />
      </td> 
      <td><c:out value="${user.email}" />
      </td>  
      <td><c:out value="${user.dob}" />
      </td>     
       <td><c:out value="${user.gender}" />
      </td> 
       <td><c:out value="${user.phone}" />
      </td> 
       <td><c:out value="${user.address}" />
      </td> 
       <td><c:out value="${user.zipcode}" />
      </td> 
     </tr>
   
   </table><br><br/><hr/></center>
    </div>
</html>