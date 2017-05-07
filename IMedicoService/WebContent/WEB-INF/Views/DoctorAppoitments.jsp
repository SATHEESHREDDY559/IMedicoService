<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
      <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
          <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<jsp:include page="DoctorLoggedHeading.jsp"/>
</head>
<body>
   <table border="1" bgcolor="black" width="600px">
			<tr style="background-color: teal; color: white; text-align: center;"
				height="40px">
				<td>TokenNum</td>
				<td>hasInsurance</td>
				<td>prevVisit</td>
				<td>reason</td>
				<td>appointmentDate</td>
				<td>appointmentTime</td>
				<td>username</td>
				<td>doctorName</td>
			</tr>
			   <c:forEach items="${users}" var="user">
				<tr
					style="background-color: white; color: black; text-align: center;"
					height="30px">
					<td><c:out value="${user.id}" /></td>
					<td><c:out value="${user.hasInsurance}" /></td>
					<td><c:out value="${user.prevVisit}" /></td>
					<td><c:out value="${user.reason}" /></td>
					<td><c:out value="${user.appointmentDate}" /></td>
					<td><c:out value="${user.appointmentTime}" /></td>
					<td><c:out value="${user.username}"  /></td>
					<td><c:out value="${user.doctorName}"  /></td>
				</tr>
			   </c:forEach>
		</table>
 
</body>
</html>