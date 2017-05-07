<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.io.*,java.util.*,javax.mail.*"%>
<%@ page import="javax.mail.internet.*,javax.activation.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@page import="com.ims.models.Booking" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
String toAddress = session.getAttribute("mailid").toString();
System.out.println(toAddress);
String subject = "Interactive Medical Service - Appointment Information";
Booking bi=(Booking)session.getAttribute("appinfo");
//String content=session.getAttribute("apptinfo").toString();

//System.out.println("content: "+content);
//String message = request.getParameter(content);
String content="Congractulations. Your appointment is confirmed<br/><br/>Appointment Information <hr/><br/><h4 bgcolor='pink'><br/>Token ID:"+
bi.getId()+"<br/><br/>DoctorName :"+bi.getDoctorName()+"<br/><br/>AppointmentDate:"+bi.getAppointmentDate()+
"<br/><br/>Appointment Time:"+bi.getAppointmentTime()+"<br/><br/>Reason for visit:"+bi.getReason()+"</h4>"+
"Click <a href=\"http://localhost:8080/IMedicoService/ViewAppoitment/"+bi.getId()+"/"+bi.getUsername()+"\">here to view Appointment Info</a><br/>"+
"Than you for choosing IMS Service.<br/><br/>for any other information please mail us :ims2016service@gmail.com";
System.out.println("content: "+content);
//reads SMTP server setting from web.xml file
ServletContext context = getServletContext();
String host = context.getInitParameter("host");
String port = context.getInitParameter("port");
final String userName = context.getInitParameter("user");
final String password = context.getInitParameter("pass");
String resultMessage = "";


Properties mailServerProperties;
Session getMailSession;
MimeMessage generateMailMessage;
try{


		mailServerProperties = System.getProperties();
		mailServerProperties.put("mail.smtp.port", port);
		mailServerProperties.put("mail.smtp.auth", "true");
		mailServerProperties.put("mail.smtp.starttls.enable", "true");
		System.out.println("Mail Server Properties have been setup successfully..");

		getMailSession = Session.getDefaultInstance(mailServerProperties, null);
		generateMailMessage = new MimeMessage(getMailSession);
		generateMailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(toAddress));
		generateMailMessage.setSubject(subject);
		
		generateMailMessage.setContent(content, "text/html");
		System.out.println("Mail Session has been created successfully..");

		
		Transport transport = getMailSession.getTransport("smtp");

		// Enter your correct gmail UserID and Password
		// if you have 2FA enabled then provide App Specific Password
		transport.connect("smtp.gmail.com",userName , password);
		transport.sendMessage(generateMailMessage, generateMailMessage.getAllRecipients());
		transport.close();

}catch(Exception ex)
{ ex.printStackTrace();
	}

response.sendRedirect("ViewAppoitment");
%>
</body>
</html>