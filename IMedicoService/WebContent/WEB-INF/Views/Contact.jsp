<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <jsp:include page="Heading.jsp"/>
   <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <spring:url value="/resources/" var="mainsrc" />
</head>

<body>
   <div id="container">
     <img class="img-arrangment" src = "${mainsrc}/myimage.jpg" height ="150" width ="150"><h3>IMS TCS Team <br/>TCS Developer<br/>For any assistance<br/><br/> <a href="mailto:KXG85320@UCMO.EDU">Contact</a>
       </h3><br/><br/><br/><br/><br/>
    </div>
    <div class="container">
    <div class="well well-sm quick-contact">
        <div class="row">
            <div class="col-md-12">
                <div class="row">
                    <div class="col-md-4">
                        <h1 class="title-contact">Quick Contact</h1>
                    </div>
                    <div class="col-md-4 contact-email">
                        <h2>ims2016service@gmail.com</h2>
                        <h3>+4695182616</h3>
                    </div>
                    <div class="col-md-4">
                        <div class="row contact row-first">
                            <div class="col-md-6">
                                <a href="Contact" class="skype"><i class="fa fa-skype"></i>skypeuser</a>
                            </div>
                            <div class="col-md-6">
                                <a href="ims2016service@gmail.com" class="google"><i class="fa fa-google-plus"></i>googleplus</a>
                            </div>
                        </div>
                        <div class="row contact">
                            <div class="col-md-6">
                                <a href="www.linkedin.com/in/" class="linkedin"><i class="fa fa-linkedin"></i>linkedin_id</a>
                            </div>
                            <div class="col-md-6">
                                <a href="" class="twitter"><i class="fa fa-twitter"></i>twitter_id</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
    
  <%--   <jsp:include page="footer.jsp"/> --%>
</body>
</html>