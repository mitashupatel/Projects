<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<fieldset>
Hey Hi Welcome <% out.println(request.getAttribute("uname")); %> <br>
	<b><%= request.getAttribute("msg-") %></b>
	<br><br>

<table border="10">
	<tr>
		<td>Your Name:</td>
		<td><% out.println(request.getAttribute("uname")); %></td>
	</tr>
	<tr>
		<td>Your Address: </td>
		<td><% out.println(request.getAttribute("add")); %></td>
	</tr>
	<tr>
		<td>Your Registered Email Id:</td>
		<td><% out.println(request.getAttribute("email")); %></td>
	</tr>
	<tr>
		<td>Your Gender:</td>
		<td><% out.println(request.getAttribute("gender")); %></td>
	</tr>
	<tr>
		<td>Your Mobile Number:</td>
		<td><% out.println(request.getAttribute("number")); %></td>
	</tr>
	
	<tr>
		<td>Your Password:</td>
		<td><% out.println(request.getAttribute("pass")); %></td>
	</tr>

</table>
<br>
<h1><b><% out.println(request.getAttribute("mes")); %><b></h1>
<img src="F:/Mitashu/photography/new/0.jpg"><br>
<a href="index.jsp"> Click Here To Go to Log In Page.</a>
</fieldset>
</body>
</html>