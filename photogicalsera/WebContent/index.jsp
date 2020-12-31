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
<h2>Hey Hi Welcome to Mitashu J Patel Gallery </h2>
<fieldset>
<form action="LogIn">
<h1><i><b>Sign Up</b></i></h1>
<table >
	<tr>
			<td>Name: </td>
			<td><input type="text" name="uname" placeholder="Enter Your Name Here."></td>
	</tr>
	<tr>
			<td>Address:</td>
			<td><input type="textarea" name="add" placeholder="Enter Your Address here."></td>
	</tr>
	
	<tr>
			<td>Email:</td>
			<td><input type="email" name="email" placeholder="Enter Your Email Id"></td>
			
	</tr>
	
	<tr>
			<td>Gender:</td>
			<td><input type="radio" name="gender" value="Male" checked>Male
			<input type="radio" name="gender" value="Female">Female</td>
	</tr>
	
	<tr>
			<td>Number: </td>
			<td><input type="text" name="number" placeholder="Enter Your Mobile No."></td> 
	</tr>
	
	<tr>
		<td>Message To Print</td>
		<td><input type="textarea" name="mes" placeholder="Enter Your Message."></td>
	</tr>
	
	<tr>
		<td>Password:</td>
		<td><input type="password" name="pass" Placeholder="Enter Your password."></td>
	</tr>
	
	
	<tr>
			<td colspan="" >
			<input type="submit" name="submit" value="submit">
			</td>
			<td><input type="reset"></td>
	</tr>
</table>
</form>

</fieldset>
</body>
</html>