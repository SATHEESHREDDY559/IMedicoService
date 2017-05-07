<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
   <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<spring:url value="/resources/Home.css" var="MCss" />
<link href="${MCss}" rel="stylesheet" />
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
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

<sf:errors path="r1.*" />
    <div id="head" style="width:100%;height:80px" >
	   <jsp:include page="Heading.jsp"/>
	</div>
	
 <div class="container">
   <div class="jumbotron">
    <h1>Registration Form</h1>
 
   
   <h3>${errormessage}</h3>
	  <sf:form  action="registerValid" method="POST" commandName="registerValid">
	 <div class="form"> 
	  <center><hr/></center>
	     <table  style="width:70%" >
	       <tr> 
	       
	           <td><FONT color="red"><sf:errors path="username" /></FONT> </td>
	           
		       <td style="font-weight:bold">User name *: <sf:input path="username"/></td>
		         
		       <td> <FONT color="red">${ExistingUser}</FONT> </td> 
	       </tr> 
	      <tr>
	      
	          <td><FONT color="red"><sf:errors path="password" /></FONT></td>
		      <td style="font-weight:bold">Password *:<sf:input path="password" type="password" /></td>
		      
	      </tr>
	      <tr>
	         <td><FONT color="red"><sf:errors path="firstname" /></FONT> </td>
	         
	         <td style="font-weight:bold" >First name *: <sf:input  path="firstname" /></td>
	         
	      </tr>
	      <tr>
	          <td><FONT color="red"><sf:errors path="lastname" /></FONT> </td>
	          
	         <td style="font-weight:bold">Last name *:<sf:input   path="lastname"/> </td>
	        
	      </tr>
	      <tr>
	          <td><FONT color="red"><sf:errors path="dob" /> </FONT></td>
	          
	         <td style="font-weight:bold" >Date of Birth *:<sf:input path="dob" type="date" placeholder="mm-dd-yy"/></td>
	        
	      </tr>
	      <tr>
	         <td><FONT color="red"><sf:errors 
	                  path="email" /></FONT> </td>
	         
	         <td style="font-weight:bold" >Email *:<sf:input path="email"/> </td>
	         
	        
	      </tr>
	      <tr>
				<td style="font-weight:bold" >Gender :<FONT color="red"><sf:errors path="gender" /></FONT></td>
			
				<td><sf:radiobutton path="gender" value="M" label="Male" />
					<sf:radiobutton path="gender" value="F" label="Female" /> <sf:radiobutton
						path="gender" value="O" label="Other" /></td>
			</tr>

			<tr>
				<td style="font-weight:bold" >Telephone No:<FONT color="red"><sf:errors
							path="phone" /></FONT></td>
			
				<td><sf:input path="phone" /></td>
				
				 <td> <FONT color="red">${ExistingMobile} </FONT></td>
				
			</tr>
			
			<tr>
				<td >Allergies<FONT color="red"><sf:errors
							path="Allergies" /></FONT></td>
			
				<td><sf:textarea path="Allergies" placeholder="please write down items that you are allergic to"/></td>
				
				 
				
			</tr>
			<tr>
				<td style="font-weight:bold" >Address :<FONT color="red"><sf:errors
							path="address" /></FONT></td>
			
				<td><sf:textarea path="address" /></td>
			</tr>

			<tr>
				<td style="font-weight:bold" >Zip code:<FONT color="red"><sf:errors
							path="zipcode" /></FONT></td>
			
				<td><sf:input path="zipcode" /></td>
			</tr>
	        </table>
	                  
	           <input type="submit" value="submit"  class="button" style="float:left; position:relative; left:255px;">
	           
	           <input type="reset" value="reset" class="button" style="float:left;position:relative; left:285px;"> 
	           
	        
	    
	  
	    </div>
        </sf:form>
       </div>
       </div>
 
</body>
</html>