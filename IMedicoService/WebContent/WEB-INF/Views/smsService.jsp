<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.twilio.sdk.*,com.twilio.sdk.resource.factory.*, com.twilio.sdk.resource.instance.*, org.apache.http.*, java.util.*, org.apache.http.message.*" %>
<%@page import="com.ims.models.Booking" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%
// Find your Account Sid and Token at twilio.com/console
final String ACCOUNT_SID = "AC0cc3baa22d174228c009b19df42d0b1b";
final String AUTH_TOKEN = "33b148c6e6c552e6bb780b46b2391d9e";
System.out.println("start of sms service");
TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID,AUTH_TOKEN);

//Ims.2016
String toMobile="+1"+session.getAttribute("phoneNo").toString();
String subject = "Interactive Medical Services =========================";
String content= session.getAttribute("SMScontent").toString();


System.out.println("Build a filter for the MessageList");
// Build a filter for the MessageList
List<NameValuePair> params = new ArrayList<NameValuePair>();
//params.add(new BasicNameValuePair("Subject",subject ));		
params.add(new BasicNameValuePair("Body",subject+content ));
params.add(new BasicNameValuePair("To", toMobile));
params.add(new BasicNameValuePair("From", "+14695182616"));

MessageFactory messageFactory = client.getAccount().getMessageFactory();
try {

  Message message = messageFactory.create(params);
  System.out.println(message.getSid());
} catch (TwilioRestException e) {
  System.out.println(e.getErrorMessage());
}

System.out.println("End of sms service");

	response.sendRedirect("ViewAppoitment");
	session.setAttribute("Message", "Text SMS has sent to your mobile No : "+toMobile+".<br>Please check it out.");
%>

</body>
</html>