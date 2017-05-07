<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
     <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<jsp:include page="UserLoggedHeading.jsp"/>
<spring:url value="/resources/Home.css" var="MCss" />
<link href="${MCss}" rel="stylesheet" />
<style>
	div.form {
		text-align: center width:300px;
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
	  width:25%;
	 
     }
	.styled-select {
		   width: 240px;
		   height: 34px;
		   overflow: hidden;
		   background: url(new_arrow.png) no-repeat right #ddd;
		   border: 1px solid #ccc;	
		 }
		 footer {
                background-color: #f5f5f5;
             }
        #footer {
		    position : absolute;
		    bottom : 0;
		    height : 70px;
		  
		    width:100%;

</style>
</head>

<body>
    <div id="head" style="width:100%;height:80px" >
	   
	</div>
	<div id="navig">
	
	</div>
    <div id="form">
       <h3><Font style="color:red">${errormessage}</Font></h3>
     <form action="searchDoc"  method="POST">
			     <!-- below is the element which takes the input from search box-->
	      <h2 style="width:50%;text-shadow: 4px 3px 0px #fff, 9px 8px 0px rgba(0,0,0,0.15);">Please select a Specilization</h2><br/>
		  <div class="panel panel-primary">
		 <table style="width:50%" >
		<tr>
		  
      
			<td><select name="speciality"  class="styled-select">
						<option value="Neurology" label="Neurology" />
						<option value="Orthopaedic" label="Orthopaedic" />
						<option value="Allergy and immunology" label="Allergy and immunology" />
						<option value="Cardiology" label="Cardiology" />
						<option value="Obstetrics and gynaecology" label="Obstetrics and gynaecology" />
						<option value="Ophthalmology" label="Ophthalmology" />
						<option value="Paediatrics" label="Paediatrics" />
			</select></td>
					
		</tr>
		<tr>
		  <td><input type="submit" value="Search" style="width:100px;height:40px;"></td>
		</tr>
		</table> 
			 </div>  
	  </form>
	 
	</div>
	<%-- <div id="footer">
       <jsp:include page="footer.jsp"/>
   </div>  --%>   
 
</body>

</html>