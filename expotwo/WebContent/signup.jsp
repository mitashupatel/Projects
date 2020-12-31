<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
	<form action="UserController" method="post">
		<table>
		<tr>
		
		<td>Enter Name: </td><td><input type="text" name="fname" ></td>

		</tr>
		<tr>
		
		<td>Enter Age: </td><td><input type="text" name="age"></td>
		</tr>
		<tr><td><input type="submit" name="action" value="add"></td></tr>
	</form>
	
</table>
</center>
</body>
</html>