<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
     <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<spring:url value="/resources/Home.css" var="MCss" />
<link href="${MCss}" rel="stylesheet" />

 <style type="text/css">
			 
		 
      
        #footer {
		    position : absolute;
		    bottom : 0;
		    height : 70px;
		    
		    width:100%;
        }
         </style>

</head>
<body>
  <div id="head" style="width:100%;height:100px" >
	   <jsp:include page="Heading.jsp"/>
 </div>
	 <div class="container" style="margin-top: 5%;">
    <div class="col-md-4 col-md-offset-4">
        <div class="panel panel-primary">
            <div >Login</div>
            <div class="panel-body">
             <sf:form action="validatelogin" method="post" commandName="validateLogin">
            
            <!-- Username Field -->
                <div class="row">
                    <div class="form-group col-xs-12">
                    <label for="username"><span class="text-danger" style="margin-right:5px;">*</span>Username:</label>
                        <div class="input-group">
                          <FONT color="#000000"><sf:errors path="username" /> </FONT> 
                           <sf:input path="username"/>
                            <span class="input-group-btn">
                                <label class="btn btn-primary"><span class="glyphicon glyphicon-user" aria-hidden="true"></label>
                            </span>
                            </span>
                        </div>
                    </div>
                </div>
                
                <!-- Content Field -->
                <div class="row">
                    <div class="form-group col-xs-12">
                        <label for="password"><span class="text-danger" style="margin-right:5px;">*</span>Password:</label>
                        <div class="input-group">
                            <FONT color="red"><sf:errors path="password" /></FONT>
	          
		                 <sf:input path="password" type="password" />   
                            <span class="input-group-btn">
                                <label class="btn btn-primary"><span class="glyphicon glyphicon-lock" aria-hidden="true"></label>
                            </span>
                            </span>
                        </div>
                    </div>
                </div>
                
                <!-- Login Button -->
                <div class="row">
                    <div class="form-group col-xs-4">
                        <button class="btn btn-primary" type="submit">Submit</button>
                    </div>
                </div>
                
            </sf:form>
            <!-- End of Login Form -->
            
        </div>
    </div>
</div>
      
  
  <%--  <div id="footer">
    <jsp:include page="footer.jsp"/>
    </div> --%>
</body>
</html>