<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
          <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 
 <!-- spring:url value="/resources/Home.css" var="mainCss" />
 <link href="${mainCss}" rel="stylesheet" /-->
 <spring:url value="/resources/" var="mainsrc" />
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
 
  <style type="text/css">
			 h1 { 
				   position: absolute; 
				   top: 300px; 
				   left: 0; 
				   width: 100%; 
				   text-align:center;
				   color: white;
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
<body  >
   
   <div class="col-md-12">
            <jsp:include page="DoctorLoggedHeading.jsp"/>
			<img src="${mainsrc}/bg2.jpg" style="width:100%; height:500px;" />  
			<h1>Its a one point meet of Hospital</h1>
			
   </div>
   <div class="row">
	<div class="col-md-3" style="height:200px">
					<div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
    <li data-target="#myCarousel" data-slide-to="3"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner" role="listbox">
    <div class="item active">
      <img src="${mainsrc}/footer3.jpg" alt="Cancer">
    </div>

    <div class="item">
      <img src="${mainsrc}/ucm.jpg" alt="UCM">
    </div>

    <div class="item">
      <img src="${mainsrc}/sfo.jpg" alt="SFO">
    </div>

    <div class="item">
      <img src="${mainsrc}/babycare.jpg" alt="baby">
    </div>
  </div>

  <!-- Left and right controls -->
  <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>	
	</div>  	   
	<div class="col-md-9">
	             
	</div>
	</div>
	
   	<div id="footer">
      <%--  <jsp:include page="footer.jsp"/> --%>
   </div>    
 
</body>
</html>