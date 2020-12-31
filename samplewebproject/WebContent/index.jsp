<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%= request.getAttribute("msg-") %>

<form action="LoginController" method="get">
Username :<input type="text" name="uname"><br/>
password :<input type="password" name="pass"><
<input type="submit" name="submit" value="submit">
</form>
</body>
</html>