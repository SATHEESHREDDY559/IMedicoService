<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <spring:url value="/resources/Home.css" var="MCss" />
   <link href="${MCss}" rel="stylesheet" />
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
		.styled-select {
		   width: 240px;
		   height: 34px;
		   overflow: hidden;
		   background: url(new_arrow.png) no-repeat right #ddd;
		   border: 1px solid #ccc;	
         }

</style>
</head>
<body>
     

      
        
        <div id="head" style="width:100%;height:80px" >
	        <jsp:include page="Heading.jsp"/>
	    </div>
		<div id="navig">
			
		</div>
	   
	   <div class="form"> 
	   <sf:form method="post" commandName="doctorRegistered" action="doctorRegister">
	    <h2>Doctor Registration Form</h2><hr/>
	   <table style="width:60%">
		<tr>
			<td style="color:#000000">User Name:<FONT color="red"><sf:errors path="userName" /></FONT></td>
		</tr>
		<tr>
			<td style="color:#000000"><sf:input path="userName" /></td>
		</tr>

		<tr>
			<td style="color:#000000">Password:<FONT color="red"><sf:errors	path="password" /></FONT></td>
		</tr>
		<tr>
			<td><sf:password path="password" /></td>
		</tr>

		<tr>
			<td style="color:#000000">Full Name:<FONT color="red"><sf:errors	path="fullName" /></FONT></td>
		</tr>
		<tr>
			<td><sf:input path="fullName" /></td>
		</tr>
		<tr>
			<td style="color:#000000">Speciality :<FONT color="red"><sf:errors path="speciality" /></FONT></td>
		</tr>
		<tr>
			<td><sf:select path="speciality"  class="styled-select">
						<sf:option value="Neurology" label="Neurology" />
						<sf:option value="Orthopaedic" label="Orthopaedic" />
						<sf:option value="Allergy and immunology" label="Allergy and immunology" />
						<sf:option value="Cardiology" label="Cardiology" />
						<sf:option value="Obstetrics and gynaecology" label="Obstetrics and gynaecology" />
						<sf:option value="Ophthalmology" label="Ophthalmology" />
						<sf:option value="Paediatrics" label="Paediatrics" />
			</sf:select></td>
					
		</tr>
		<tr>
			<td style="color:#000000">Email:<FONT color="red"><sf:errors path="email" /></FONT></td>
		</tr>
		<tr>
			<td><sf:input path="email" /></td>
		</tr>
		<tr>
			<td style="color:#000000">Telephone No:<FONT color="red"><sf:errors path="phone" /></FONT></td>
		</tr>
		<tr>
			<td><sf:input path="phone" /></td>
		</tr>
		<tr>
			<td style="color:#000000">Address :<FONT color="red"><sf:errors path="address" /></FONT></td>
		</tr>
		<tr>
			<td><sf:textarea path="address" /></td>
		</tr>
		<tr>
			<td style="color:#000000">city :<FONT color="red"><sf:errors path="city" /></FONT></td>
		</tr>
		<tr>
			<td>
			
			
			<sf:select path="city"  class="styled-select">
				<sf:option value="Jefferson City">Jefferson City</sf:option>
				<sf:option value="Lee Summit">Lee Summit</sf:option>
				<sf:option value="OverlandPark">OverlandPark</sf:option>
				<sf:option value="Warrensberg">Warrensberg</sf:option>
				<sf:option value="Branson">Branson</sf:option>
				<sf:option value="St.Louis">St.Louis</sf:option>
				<sf:option value="Springfield">Springfield</sf:option>
			</sf:select>	
			</td>
		</tr>
		<tr>
			<td style="color:#000000">availableTime :<FONT color="red"><sf:errors path="availableTime" /></FONT></td>
		</tr>
		<tr>
			<td>
			
			
			<sf:select path="availableTime"  class="styled-select">
				<sf:option value="9:00">9:00</sf:option>
				<sf:option value="12:00">12:00</sf:option>
				<sf:option value="14:00">14:00</sf:option>
				<sf:option value="16:00">16:00</sf:option>
				
			</sf:select>	
			</td>
		</tr>
		<tr>
			<td style="color:#000000">Zip code:<FONT color="red"><sf:errors path="zipcode" /></FONT></td>
		</tr>
		<tr>
			<td><sf:input path="zipcode" /></td>
		</tr>
		
		</table>
		
		     <input type="submit" value="register"  class="button" style="float:left; position:relative; left:255px;">
	           
	         <input type="reset" value="reset" class="button" style="float:left;position:relative; left:285px;"> 
	           
	   
       </sf:form>
      </div>   
      
   
     
      
</body>
</html>