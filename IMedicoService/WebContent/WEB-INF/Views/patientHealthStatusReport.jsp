<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<title>Patient Health Status Report</title>
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
	 <div id="head" style="width:100%;height:90px" >
	   <jsp:include page="DoctorLoggedHeading.jsp"/>
	</div>
	<div id="navig">
	
	</div>
	 <div class="form"> 
	<form:form method="Post" action="patientHealthStatusReport"		commandName="patientHealthStatusReport">
		<table class="centertable2" style="background-color:white;">
			<tr>
				<td>
				Select a patient:<br/>Patient Allergies:
				<FONT color="red"><form:errors
							path="patientUserName" /></FONT></td>
					<td>
				
				
				
				<div ng-app="myApp" ng-controller="myCtrl">

				
				
				<select ng-model="selectedUser" ng-options="x.fullName for x in cars">
				</select>
				<form:hidden path="patientUserName" value="{{selectedUser.userId}}"/>
				<p> {{selectedUser.symptoms}}</p>
			
				
				</div>
				</td>
			</tr>

			<tr>
				<td>
			
				</td>
					<td>
					<script>
						var app = angular.module('myApp', []);
						app.controller('myCtrl', function($scope) {
						    $scope.cars = [
									<c:forEach var="un" items="${users}">
						        {userId : "${un.username}", fullName : "${un.firstname} ${un.lastname} ", symptoms:"${un.getAllergies()}"},
						        </c:forEach>						      
						    ];
						});
					</script>

				</td>
			</tr>
			
			<tr>
				<td>joinedDate:<FONT color="red"><form:errors
							path="joinedDate" /></FONT></td>
				<td><form:input type="date" path="joinedDate" /></td>
			</tr>

			<tr>
				<td>dischargeDate:<FONT color="red"><form:errors
							path="dischargeDate" /></FONT></td>
				<td><form:input type="date" path="dischargeDate" /></td>
			</tr>
			<tr>
				<td>Age :<FONT color="red"><form:errors
							path="age" /></FONT></td>
				<td><form:input path="age" /></td>
			</tr>
			<tr>
				<td>Height :<FONT color="red"><form:errors path="height" /></FONT></td>

				<td><form:input path="height" /></td>
			</tr>
			<tr>
				<td>Weight:<FONT color="red"><form:errors path="weight" /></FONT></td>
				<td><form:input path="weight" /></td>
			</tr>



<tr>
				<td>Drugs suggested:<FONT color="red"><form:errors path="drugs" /></FONT></td>
				<td><form:input path="drugs" /></td>
			</tr>
<tr>
				<td>Drug Affect:<FONT color="red"><form:errors path="affect" /></FONT></td>
				<td><form:input path="affect" /></td>
			</tr>
<tr>
				<td>Health problem reasons:<FONT color="red"><form:errors path="reasons" /></FONT></td>
				<td><form:input path="reasons" /></td>
			</tr>
<tr>
				<td>RedCell Count:<FONT color="red"><form:errors path="redCellCount" /></FONT></td>
				<td><form:input path="redCellCount" /></td>
			</tr>




<tr>
				<td>White Cell Count:<FONT color="red"><form:errors path="whiteCellCount" /></FONT></td>
				<td><form:input path="whiteCellCount" /></td>
			</tr>
<tr>
				<td>Previous Health Status:<FONT color="red"><form:errors path="prevStatus" /></FONT></td>
				<td>			
				<form:select path="prevStatus">
							<form:option value="1">Severe</form:option>
							<form:option value="2">Bad</form:option>
							<form:option value="3">Okay</form:option>
							<form:option value="4">Normal</form:option>
							<form:option value="5">Good</form:option>
				</form:select> 
						</td>
			</tr>
<tr>
				<td>Current Health Status:<FONT color="red"><form:errors path="currentStatus" /></FONT></td>
				<td><form:select path="currentStatus">
							<form:option value="1">Severe</form:option>
							<form:option value="2">Bad</form:option>
							<form:option value="3">Okay</form:option>
							<form:option value="4">Normal</form:option>
							<form:option value="5">Good</form:option>
				</form:select> </td>
			</tr>

			<tr>
				<td>BP Levels :<FONT color="red"><form:errors	path="BPLevels" /></FONT></td>
				<td><form:input path="BPLevels" /></td>
			</tr>
			<tr>
				<td>Heart Rate :<FONT color="red"><form:errors
							path="heartRate" /></FONT></td>
				<td><form:input path="heartRate" /></td>
			</tr>

			<tr>
				<td>Total Description:<FONT color="red"><form:errors
							path="totalDescription" /></FONT></td>
				<td><form:textarea path="totalDescription" /></td>
			</tr>
			
			<tr>
				<td>Final Health Status:<FONT color="red"><form:errors path="finalStatus" /></FONT></td>
				<td><form:select path="finalStatus">
							<form:option value="1">Severe</form:option>
							<form:option value="2">Bad</form:option>
							<form:option value="3">Okay</form:option>
							<form:option value="4">Normal</form:option>
							<form:option value="5">Good</form:option>
				</form:select></td>
			</tr>
			<tr><td></td><td></td>	</tr>
			<tr>
				<td><input type="submit" value="Submit Report" style="height:50px;"/></td>
				<td>	
				<input type="reset" value="Reset" style="height:50px;"/>
				</td>
			</tr>
		</table>

	</form:form>
	</div>
</body>
</html>