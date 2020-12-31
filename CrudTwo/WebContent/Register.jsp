<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="UserController" method="post">
<% if(request.getAttribute("emp") != null){ %>
	<input type="hidden" name="id" value="${emp.id}">
	Name :<input type="text" value="${emp.name}" name="name"><br/>
	Address :<input type="text" value="${emp.address}" name="address">
	
<input type="submit" name="action" value="update">
<%}else{ %>
	Name :<input type="text" name="name"><br/>
	Address :<input type="text" name="address">
	
<input type="submit" name="action" value="add">

<%} %>
</form>
</body>
</html>