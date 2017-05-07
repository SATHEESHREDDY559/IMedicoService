<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
      <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
      <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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

</style>
</head>
<body>
    <div id="head" style="width:100%;height:150px" >
	   <jsp:include page="adminHeading.jsp"/>
	</div>
	<div id="navig">
	
	</div>
	<div class="form"> 
		<center><h1>Login Information is</h1><hr/><br/><br/><br/>
		<table bgcolor="white" style ="width:70%">
			<tr
			 style="text-align: center;color:blue;"
			 height="40px">
			 <td>Trans Id </td>
			 <td>User Name</td>
			 <td>loginDate</td>
			 <td>logoutDate</td>
			 <td>Attempt Status</td>
			 <td>Delete</td>            
			</tr>
			<c:forEach items="${users}" var="user">
			 <tr
			  style="background-color: white; color: black; text-align: center;"
			  height="30px">
			  
			  <td><c:out value="${user.id}" />
			  </td>
			  <td><c:out value="${user.username}" />
			  </td>
			  <td><c:out value="${user.logintime}" />
			  </td>  
			  <td><c:out value="${user.logouttime}" />
			  </td> 
			  <td><c:out value="${user.attempt}" />
			  </td>  
			  <td><c:out value="${user.userrole}" />
			  </td>  
			  <td><a href="deleteLog/${user.id}">delete</a>
			  </td>
			 </tr>
			</c:forEach>
		   </table><br><br/><hr/></center>
	</div>
   
</body>
</html>