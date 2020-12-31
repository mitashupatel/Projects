<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="EmployeeController" method="get">
<% if(request.getAttribute("emp") != null){ %>
	<input type="hidden" name="id" value="${emp.id}">
	First Name :<input type="text" value="${emp.fname}" name="fname"><br/>
	Lalt Name :<input type="text" value="${emp.lname}" name="lname">
	
<input type="submit" name="action" value="update">
<%}else{ %>
	First Name :<input type="text" name="fname"><br/>
	Last Name :<input type="text" name="lname">
	
<input type="submit" name="action" value="add">

<%} %>
</form>
</body>
</html>