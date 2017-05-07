<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

     <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
     <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
       <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<jsp:include page="UserLoggedHeading.jsp"/>
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
	div.form  {
    
    background-color: lightgrey;
}
</style>
</head>
<body>
	 
      <div class="container">
    <div class="alert alert-success fade in">
    <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
    <strong>Success!</strong> Thanks for the booking your TokenId is ${bookinId}
      </div>
      </div>
    <center> <div class="form"> 
					<c:if test="${bookList!=null}">
							<form method="Post" action="ViewAppoitment">
						
								Select a date to view appointment details:
								<br /><br>
								
								<select name="id" id="id" onchange="this.form.submit()">
									<option value="0">Select Date </option>
									<c:forEach var="bl" items="${bookList}">
											<c:if test="${bl.appointmentDate==user.appointmentDate }">
												<option value='${bl.id}' selected>${bl.appointmentDate} </option>
											</c:if>
											<c:if test="${bl.appointmentDate!=user.appointmentDate }">
												<option value='${bl.id}' >${bl.appointmentDate} </option>
											</c:if>
									</c:forEach>
								</select>
								
								</form>
					</c:if>


					<c:if test="${viewBooking!=null}">	
						
							<table bgcolor="white" width="600px" class="tablecss">
								<tr>
		
									<td>Token Number </td>
									<td><c:out value="${viewBooking.id}" /></td>
								</tr>
								<tr>
									<td>Doctor Name</td>
									<td><c:out value="${viewBooking.doctorName}" /></td>
								</tr>
								<tr>
		
									<td>Appointment Time</td>
									<td><c:out value="${viewBooking.appointmentTime}" /></td>
								</tr>
								<tr>
									<td>Appointment Date</td>
									<td><c:out value="${viewBooking.appointmentDate}" /></td>
								</tr>
								<tr>
		
									<td>Reason for Visit</td>
									<td><c:out value="${viewBooking.reason}" /></td>
								</tr>
								<tr>
		
									<td>Appointment Status</td>
									<td><c:out value="${viewBooking.bookingStatus}" /></td>
								</tr>
							</table>
					</c:if>


				
				
				
					
					<h1 class="error"><c:out value="${Message}" /></h1>
					<c:if test="${user!=null}">	
						
							<table bgcolor="white" width="600px" class="tablecss">
								<tr>
		
									<td>Token Number </td>
									<td><c:out value="${user.id}" /></td>
								</tr>
								<tr>
									<td>Doctor Name</td>
									<td><c:out value="${user.doctorName}" /></td>
								</tr>
								<tr>
		
									<td>Appointment Time</td>
									<td><c:out value="${user.appointmentTime}" /></td>
								</tr>
								<tr>
									<td>Appointment Date</td>
									<td><c:out value="${user.appointmentDate}" /></td>
								</tr>
								<tr>
		
									<td>Reason for Visit</td>
									<td><c:out value="${user.reason}" /></td>
								</tr>
								<tr>
		
									<td>Appointment Status</td>
									<td><c:out value="${user.bookingStatus}" /></td>
								</tr>
							</table>
					</c:if>
					
					</div></center>
</body>
</html>