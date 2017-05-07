<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
      <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
      <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
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

</style>
</head>
<body>

<sf:errors path="r1.*" />
    <div id="head" style="width:100%;height:150px" >
	   <jsp:include page="UserLoggedHeading.jsp"/>
	</div>
	<div id="navig">
	
	</div>
	<div class="form"> 
   <h3>${errormessage}</h3>
        <h2>Update User Details</h2><hr/>
	  <sf:form  action="registerUpdate" method="POST" commandName="registerUpdate">
	  
	      
		
	 
	     <table style ="width:50%">
	       <tr>
	             <td><input type="hidden" name="userid" value= "${users.userid}" /></td>
		         
	       </tr>
	     
	       <tr> 
	        
	           	           
		      <td> <input type="hidden" name="username"  value= "${users.username}" /> </td>
		        
		       
	       </tr> 
	      <tr>
	      
	          <td><FONT color="red"><sf:errors path="password" /></FONT></td>
		      <td style="color: #000000 ">Password *:<sf:input path="password" type="password" value="${users.password}" /></td>
		      
	      </tr>
	      <tr>
	         <td><FONT color="red"><sf:errors path="firstname" /></FONT> </td>
	         
	         <td style="color: #000000 ">First name *: <sf:input  path="firstname" value="${users.firstname}" /></td>
	         
	      </tr>
	      <tr>
	          <td><FONT color="red"><sf:errors path="lastname" /></FONT> </td>
	          
	         <td style="color: #000000 ">Last name *:<sf:input   path="lastname" value="${users.lastname}"/> </td>
	        
	      </tr>
	      <tr>
	          <td><FONT color="red"><sf:errors path="dob" /> </FONT></td>
	          
	         <td style="color: #000000 ">Date of Birth *:<sf:input path="dob" type="date" placeholder="mm-dd-yy" value="${users.dob }"/></td>
	        
	      </tr>
	      <tr>
	         <td><FONT color="red"><sf:errors 
	                  path="email" /></FONT> </td>
	         
	         <td style="color: #000000 ">Email *:<sf:input path="email" value="${users.email}"/> </td>
	         
	        
	      </tr>
	      <tr>
				<td style="color: #000000 ">Gender :<FONT color="red"><sf:errors path="gender" /></FONT></td>
			
				<td><sf:radiobutton path="gender" value="M" label="Male" checked="true" />
					<sf:radiobutton path="gender" value="F" label="Female" /> <sf:radiobutton
						path="gender" value="O" label="Other" /></td>
			</tr>

			<tr>
				<td style="color: #000000 ">Telephone No:<FONT color="red"><sf:errors
							path="phone" /></FONT></td>
			
				<td><sf:input path="phone" value="${users.phone}" /></td>
				
				 <td> <FONT color="red">${ExistingMobile} </FONT></td>
				
			</tr>
			<tr>
				<td >Allergies<FONT color="red"><sf:errors
							path="Allergies" /></FONT></td>
			
				<td><sf:textarea path="Allergies" placeholder="please write down items that you are allergic to"/></td>
					 
				
			</tr>
			<tr>
				<td style="color: #000000 ">Address :<FONT color="red"><sf:errors
							path="address" /></FONT></td>
			
				<td><sf:textarea path="address" value="${users.address}"/></td>
			</tr>
        
			
		
			<tr>
				<td style="color: #000000 ">Zip code:<FONT color="red"><sf:errors
							path="zipcode" /></FONT></td>
			
				<td><sf:input path="zipcode" value="${users.zipcode}" /></td>
			</tr>
	  
	       	    
	    </table>
		
		      <input type="submit" value="submit"  class="button" style="float:left; position:relative; left:355px;">
	           
	           <input type="reset" value="reset" class="button" style="float:left;position:relative; left:385px;"> 
	  
        </sf:form>
        </div>
  
</body>
</html>