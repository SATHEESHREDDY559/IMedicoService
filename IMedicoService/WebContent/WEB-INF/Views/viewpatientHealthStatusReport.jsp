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
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
<script src="http://static.pureexample.com/js/flot/excanvas.min.js"></script>
<script src="http://static.pureexample.com/js/flot/jquery.flot.min.js"></script>
<script src="http://static.pureexample.com/js/flot/jquery.flot.pie.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>View Patient Health Status Report</title>
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
div.form  {
    
    background-color: lightgrey;
}
</style>
</head>
<body>
      <div class="col-md-12">
            <jsp:include page="DoctorLoggedHeading.jsp"/>
	  </div>
	  <div id="navig">
	
	  </div>
	   
	   <div class="form"> 
	<form:form method="Post" action="viewpatientHealthStatusReport"
				commandName="viewpatientHealthStatusReport">
			
			Select a Patient Name:
			<select name="patientUserName">
					<c:forEach var="un" items="${users}">
						<option value="${un.username}">${un.firstname} ${un.lastname}</option>
					</c:forEach>

				</select>
				<br /><br /> 
				<input type="submit" value="Get Patient Report"
					style="height: 50px;" />
			</form:form>
				<table bgcolor="white" class="centertable">
				<tr><th colspan="4">Patient Information<hr/></th></tr>
				
				<tr><td>
						<table bgcolor="white" width=90%>
						
							<tr>
								<td>Full Name</td>
								<td><c:out value="${user.firstname}   ${user.lastname}" /></td>
								<td>DOB</td>
								<td><c:out value="${user.dob}" /></td>
								
							</tr>
													
							<tr>
								<td>User Name</td>
								<td><c:out value="${user.username}" /></td>
								<td>Gender</td>
								<td><c:out value="${user.gender}" /></td>
							</tr>
							<tr>
							<td>Patient Address</td>
							<td></td>
								<td>Phone</td>
								<td><c:out value="${user.phone}" /></td>
							</tr>
							<tr>
								<td></td>
								<td></td>
								<td>E-Mail ID</td>
								<td><c:out value="${user.email}" /></td>
							</tr>
							<tr>
							<td><c:out value="${user.address}" />
								<br/>ZipCode:<c:out value="${user.zipcode}" />
								</td>
							<td></td><td></td><td></td>
							</tr>
						</table>
						</td>
						</tr>
				
			<tr><td colspan="4">
			<%int rNo=1; %>
			<c:forEach var="user" items="${reports}">
			<br /> <br />
				<table width=90% id="patientreporttable" >
				<tr><th colspan="4"><hr/>Patient Health Information Report- No::0<%= rNo++%>.<hr/><br/></th></tr>
					<tr>
						<td colspan="2">Patient User Name:<FONT color="red"><form:errors
									path="patientUserName" /></FONT></td>
									
						<td><c:out value="${user.patientUserName}" /></td>
						
						<td></td>
					</tr>

					<tr>
						<td>Joined Date:<FONT color="red"><form:errors
									path="joinedDate" /></FONT></td><td><c:out value="${user.joinedDate}" /></td>
						<td></td><td></td>
						</tr>

					<tr>
						<td>Discharge Date:<FONT color="red"><form:errors
									path="dischargeDate" /></FONT></td><td>
						<c:out value="${user.dischargeDate}" /></td>
					</tr>
					<tr>
						<td>Age :<FONT color="red"><form:errors path="age" /></FONT></td><td><c:out value="${user.age}" /></td>
					<td></td><td></td>
						</tr>

					<tr>
						<td>Height :<FONT color="red"><form:errors
									path="height" /></FONT></td><td><c:out value="${user.height}" /></td>
					</tr>
					<tr>
					
						<td>Weight:<FONT color="red"><form:errors
									path="weight" /></FONT></td>
						<td><c:out value="${user.weight}" /></td>
					</tr>
						<tr>
							<td colspan="4"></td>
						</tr>

					<tr>
							<td colspan="4">Medication Usage and Effect</td>
						</tr>

					<tr>
						<td>Drugs suggested:<FONT color="red"><form:errors
									path="drugs" /></FONT></td>
						<td><c:out value="${user.drugs}" /></td><td></td><td></td>
					</tr>
					<tr>
						<td>Drug Affect:<FONT color="red"><form:errors
									path="affect" /></FONT></td>
						<td><c:out value="${user.affect}" /></td><td></td><td></td>
					</tr>
					<tr>
						<td>Health problem reasons:<FONT color="red"><form:errors
									path="reasons" /></FONT></td>
						<td><c:out value="${user.reasons}" /></td>
						<td></td><td></td>
					</tr>
					<tr>
							<td colspan="4"></td>
						</tr>
						<tr>
							<td colspan="4">Blood Cell Count: <br/></td>
						</tr>
						
						<tr>
							<td colspan="4">For Normal person: <br/>
							Red blood cell count	----<br/>Male: 4.32-5.72 trillion cells/L*(4.32-5.72 million cells/mcL**)
							<br/>
							<br/>Female: 3.90-5.03 trillion cells/L(3.90-5.03 million cells/mcL)
							<br/>
							<br/>
							White blood cell count -----	3.5-10.5 billion cells/L(3,500 to 10,500 cells/mcL)
							
							<br/>
							<br/>
							L*------ Liters. mcL* ----- Micro liters.
							</td>
						</tr>
						
						
					<tr>
					
						<td>Red Cell Count:<FONT color="red"><form:errors
									path="redCellCount" /></FONT></td><td><c:out value="${user.redCellCount}" /></td>
						<td></td><td></td>
						</tr>
					<tr>
					
						<td>White Cell Count:<FONT color="red"><form:errors
									path="whiteCellCount" /></FONT></td><td><c:out value="${user.whiteCellCount}" /></td>
									<td></td><td></td>
					</tr>
					<tr>
							<td colspan="4">Health Status: <br/></td>
						</tr>
					<tr>
						<td >Previous Health Status:<FONT color="red"><form:errors
									path="prevStatus" /></FONT></td><td><c:out value="${user.prevStatus}" /></td>
					
						<td>Current Health Status:<FONT color="red"><form:errors
									path="currentStatus" /></FONT></td><td><c:out value="${user.currentStatus}" />
						
						
						</td>
					</tr>
					<tr>
						<td colspan="4">
						<center><hr/>
						<h3>Health Status Report</h3><hr/><br/>
						<div id="legendPlaceholder"></div>
						<div id="flotcontainer"></div><hr/>
						</center>
						<script>
							$(function () { 
							    var data = [
							        {label: "Current", data:<c:out value="${user.currentStatus}" />},
							        {label: "Previous", data:<c:out value="${user.prevStatus}" />},
							       
							    ];
						
							    var options = {
							            series: {
							                pie: {show: true}
									    }
							         };
						
							    $.plot($("#flotcontainer"), data, options);  
							});
						</script>
						<br/>
						</td>
						
					</tr>
					<tr><td>BP Levels :<FONT color="red"><form:errors
									path="BPLevels" /></FONT>
						<c:out value="${user.BPLevels}" />/75 mm Hg</td>
							<td colspan="3">
							Blood Pressure Levels for normal person:
							<br/><br/>
							less than 120/80 mm Hg 
							<br/>Systolic mm Hg (upper #):less than 120  AND
							<br/> Diastolic mm Hg (lower #): less than 80 
							<br/>for an adult age 20 or over. 
							<br><br/>*mm Hg -------millimeters of mercury
							</td>
						</tr>
					<tr>
						<td colspan="4"></td>
					</tr>
					<tr>
						<td>Heart Rate :<FONT color="red"><form:errors
									path="heartRate" /></FONT></td>
						<td><c:out value="${user.heartRate}" /></td>
						<td colspan="2"> Heart Rate :<br/>normally between 60 (beats per minute) and<br/> 100 (beats per minute)</td>
					</tr>

					<tr>
						<td>Total Description:<FONT color="red"><form:errors
									path="totalDescription" /></FONT></td>
						<td colspan="3"><c:out value="${user.totalDescription}" /></td>
					</tr>

					<tr>
						<td>Final Health Status:<FONT color="red"><form:errors
									path="finalStatus" /></FONT></td>
						<td colspan="3"><c:out value="${user.finalStatus}" /></td>
					</tr>
					<tr>
					
						<td colspan="4">
						
						<script type="text/javascript">
							$(function () {    
							    var data1 = GenerateSeries(0);
							    
							    function GenerateSeries(added){
							        var data = [];
							       
							
							                
							            data.push([1,4]);
							            data.push([2,1]);
							            data.push([3,<c:out value="${user.finalStatus}" />]);
							
							        return data;
							    }
							
							    var options = {
							            series:{
							                bars:{show: true}
							            },
							            bars:{
							                  barWidth:0.8
							            },            
							            grid:{
							                backgroundColor: { colors: ["#eeeeee", "#2222ff"] }
							            }
							    };
							
							    $.plot($("#flotcontainer2"), [data1], options);  
							    
							});
							</script>
							
							<!-- HTML -->
							<center>
							<h3>Health status compare to normal and severe</h3><hr/><br/>
							<div id="legendPlaceholder"></div>
							<div id="flotcontainer2"></div>
							<h4><pre>Condition:	Normal     	  Severe       Final Status </pre></h4>
							</center>
						</td>
						
					</tr>

				</table>
			</c:forEach>
			</td>
			</tr>
</table>
</div>

</body>
</html>