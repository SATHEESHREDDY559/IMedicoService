<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
      <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
          <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="UserLoggedHeading.jsp"/>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<spring:url value="/resources/Home.css" var="MCss" />
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
	#navig{
	  padding: 10px;
	  
	  align:left;
	  float:left;
	  height:500px;
	  width:20%;
	 
	}
	.button {
    background-color: #4CAF50;
    border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
    
   } 
 
div.form  {
    
    background-color: lightgrey;
}
 #footer {
                background-color: #f5f5f5;
             }
        #footer {
		    position : absolute;
		    bottom : 0;
		    height : 70px;
		  
		    width:100%;
        }

</style>  
</head>
<body>
    <div id="head" style="width:100%;height:80px" >
	   
	</div>
	<div id="navig">
	
	</div>
    <div class="form"> 
  
     
   <center><h1> These are the doctors available for the specilization </h1></center><hr><br>
   
   
	<form:form action="viewDoctor" method="post" commandName="viewDoctor">
	
		<table border="1" bgcolor="black" style="width:60%" >
			<tr style="background-color: teal; color: white; text-align: center;"
				height="40px">
				<td>Doctor Name</td>
				<td>E-Mail ID</td>
				<td>Phone</td>
				<td>Street Address</td>
				<td>City</td>
				<td>ZipCode</td>
				<td>Speciality</td>
				<td>Select Doctor</td>
			</tr>
			<c:forEach items="${users}" var="user">
				<tr
					style="background-color: white; color: black; text-align: center;"
					height="30px">
					<td><c:out value="${user.fullName}" /></td>
					<td><c:out value="${user.email}" /></td>
					<td><c:out value="${user.phone}" /></td>
					<td><c:out value="${user.address}" /></td>
					<td><c:out value="${user.city}" /></td>
					<td><c:out value="${user.zipcode}" /></td>
					<td><c:out value="${user.speciality}"  /></td>
					<td><input type="radio" name="selectedDoctor"
							value="${user.fullName}" /></td>
					<td><input type="hidden" name="doctorId" value="${user.userName}" /></td>
				    <td> <input type="hidden"  name="speciality"
							value="${user.speciality}" />	</td>	
				</tr>
				    
			</c:forEach>
		</table>
		
		<br>
		<br />
		<h3 style="color:red;"> 
</h3>
		<input type="submit" value="Confirm Doctor" class="button"/>
	</form:form>
	
	
	</div>
		<div id="footer">
      <%--  <jsp:include page="footer.jsp"/> --%>
   </div>   
</body>
</html>