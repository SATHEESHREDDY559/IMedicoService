<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
      <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
          <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
          <%@ page import="com.ims.models.DateTimeSlots" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="UserLoggedHeading.jsp"/>
<spring:url value="/resources/Home.css" var="MCss" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
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
     <div id="head" style="width:100%;height:80px" >
	  
	</div>
	<div id="navig">
	
	</div>
    <div class="form"> 

   <script>
     
    var app = angular.module('myApp', []);
    app.controller('myCtrl', function($scope) {
    $scope.dateava=false;
    $scope.dates = {
        dateslot1 : {date :"${DateSlots.day1}" , slot1:"${DateSlots.day1Slot1}", slot2:"${DateSlots.day1Slot2}", slot3:"${DateSlots.day1Slot3}",slot4:"${DateSlots.day1Slot4}",slot1Available:"${DateSlots.day1Slot1Status}",slot2Available:"${DateSlots.day1Slot2Status}",slot3Available:"${DateSlots.day1Slot3Status}",slot4Available:"${DateSlots.day1Slot4Status}"},
        dateslot2 : {date :"${DateSlots.day2}",  slot1:"${DateSlots.day2Slot1}", slot2:"${DateSlots.day2Slot2}", slot3:"${DateSlots.day2Slot3}",slot4:"${DateSlots.day2Slot4}",slot1Available:"${DateSlots.day2Slot1Status}",slot2Available:"${DateSlots.day2Slot2Status}",slot3Available:"${DateSlots.day2Slot3Status}",slot4Available:"${DateSlots.day2Slot4Status}"} ,
        dateslot3 : {date :"${DateSlots.day3}", slot1:"${DateSlots.day3Slot1}", slot2:"${DateSlots.day3Slot2}", slot3:"${DateSlots.day3Slot3}",slot4:"${DateSlots.day3Slot4}",slot1Available:"${DateSlots.day3Slot1Status}",slot2Available:"${DateSlots.day3Slot2Status}",slot3Available:"${DateSlots.day3Slot3Status}",slot4Available:"${DateSlots.day3Slot4Status}"} ,
        dateslot4 : {date :"${DateSlots.day4}", slot1:"${DateSlots.day4Slot1}", slot2:"${DateSlots.day4Slot2}", slot3:"${DateSlots.day4Slot3}",slot4:"${DateSlots.day4Slot4}",slot1Available:"${DateSlots.day4Slot1Status}",slot2Available:"${DateSlots.day4Slot2Status}",slot3Available:"${DateSlots.day4Slot3Status}",slot4Available:"${DateSlots.day4Slot4Status}"}  ,
        dateslot5 : {date :"${DateSlots.day5}", slot1:"${DateSlots.day5Slot1}", slot2:"${DateSlots.day5Slot2}", slot3:"${DateSlots.day5Slot3}",slot4:"${DateSlots.day5Slot4}",slot1Available:"${DateSlots.day5Slot1Status}",slot2Available:"${DateSlots.day5Slot2Status}",slot3Available:"${DateSlots.day5Slot3Status}",slot4Available:"${DateSlots.day5Slot4Status}"} ,
        
      }
       });

</script>
   <form:errors path="BookingApp.*"/>
   <h2><font style="color:red">${errormessage}</font></h2>
	<form action="bookappointmentPage" method="POST">
		<input type="hidden" name="username" value="${username}"/> 
		<input	type="hidden" name="doctorName" value="${doctorName}"/>
        <input	type="hidden" name="doctorId" value="${doctorId}"/>
		<h2>Book Appointment by filling following details</h2>
		<hr>
		<h3>Will you use insurance ?</h3>
		<input type="radio" name="hasInsurance" value="yes" checked />Yes<br />
		<input type="radio" name="hasInsurance" value="no" />No <br />
		<br>
		<h3>Have you visited this doctor before ?</h3>
		<input type="radio" name="prevVisit" value="yes" checked />Yes<br />
		<input type="radio" name="prevVisit" value="no"  />No<br /> <br>
		<h3>Reason for your visit?</h3>
		<h3> <input type="text" name="reason"  value="${speciality}"/></h3>
		<h3>Select Appointment Date</h3>
		<div ng-app="myApp" ng-controller="myCtrl">
		 
	    <select ng-model="selectedDate" ng-options="y.date for (x, y) in dates" >
           
        </select> 
        <input type="hidden" name="appointmentDate" value="{{selectedDate.date}}" />{{selectedDate.date}}
        <h3>Select Appointment Time</h3>
		<!--  >h2>{{selectedDate.slot1Available}}</h2-->
		<div ng-if="selectedDate.slot1Available=='Y' ">
		     <input type="radio" name="appointmentTime" value= "{{selectedDate.slot1}}"/>{{selectedDate.slot1}}<br />
		</div>
	    <div ng-if="selectedDate.slot2Available=='Y' ">
		     <input type="radio" name="appointmentTime" value= "{{selectedDate.slot2}}"/>{{selectedDate.slot2}}<br />
		</div>
		<div ng-if="selectedDate.slot3Available=='Y' ">
		     <input type="radio" name="appointmentTime" value= "{{selectedDate.slot3}}"/>{{selectedDate.slot3}}<br />
		</div>
		<div ng-if="selectedDate.slot4Available=='Y' ">
		     <input type="radio" name="appointmentTime" value= "{{selectedDate.slot4}}"/>{{selectedDate.slot4}}<br />
		</div>
	    	
		 </div>
		
		
		
		 
		<input type="submit" value="Confirm appointment" style="width:180px;height:50px;"/><br /> <br /> <br />
		<br /> <br /> <br />
	</form>
	</div>
	<div id="footer">
      <%--  <jsp:include page="footer.jsp"/> --%>
   </div>    
</body>
</html>