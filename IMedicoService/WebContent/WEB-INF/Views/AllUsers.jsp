<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
      <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
      <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<jsp:include page="adminHeading.jsp"/>
<spring:url value="/resources/Home.css" var="MCss" />
<link href="${MCss}" rel="stylesheet" />
</head>
<body>
<center><h1>Please select the record the you would like to delete it</h1><hr/><br/><br/><br/>

    <div id="head" style="width:100%;height:150px" >

	</div>
	<div id="navig">
	
	</div>
    <div class="form">
    <table bgcolor="white">

	 
    <tr
     style="text-align: center;color:blue;"
     height="40px">
     
     <td>User Id </td>
     <td>User Name</td>
     <td>Password</td>
     <td>Full Name</td>
     <td>E-Mail ID</td>
     <td>DOB</td>
       <td>Gender</td>
         <td>Phone</td>
           <td>Address</td>
             <td>ZipCode</td>
             <td>Delete Record</td>
             
    </tr>
    <c:forEach items="${users}" var="user">
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
      <td><a href="deletePatient/${user.userid}">delete</a>
      </td>
     </tr>
    </c:forEach>
   </table><br><br/><hr/></center>
   </div>
  <%--  <jsp:include page="footer.jsp"/> --%>
</body>
</html>