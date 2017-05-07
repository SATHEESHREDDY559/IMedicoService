<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 70%;
      margin: auto;
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
<jsp:include page="UserLoggedHeading.jsp"/>
 <spring:url value="/resources/" var="mainsrc" />
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
 <spring:url value="/resources/" var="mainsrc" />
</head>
<body>
   <div class="container">
    <div class="alert alert-success fade in">
    <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
    <strong>Thanks user !</strong> Welcome to our website  <%=session.getAttribute("username").toString() %>
  </div>
  </div>
       <div class="row">
	<div class="col-md-12" style="height:300px">
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
      <img src="${mainsrc}/m3.jpg" alt="Cancer">
    </div>

    <div class="item">
      <img src="${mainsrc}/ucm.jpg" alt="UCM">
    </div>
	
    <div class="item">
      <img src="${mainsrc}/sfo.jpg" alt="SFO">
    </div>

    <div class="item">
      <img src="${mainsrc}/m4.jpg" alt="baby">
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
</div>
<div id="footer">
       <jsp:include page="footer.jsp"/>
   </div>  
</body>
</html>