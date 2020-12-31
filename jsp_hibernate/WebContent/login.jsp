<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<script src="//cdn.ckeditor.com/4.14.0/full/ckeditor.js"></script>
<body>
<fieldset>
<form action="LogController" method="post">
<h1><i><b>Log in</b></i></h1>

<% if(request.getAttribute("upl") != null){ %>
	<input type="hidden" name="id" value="${upl.id}">
<table >
	<tr>
			<td>Name: </td>
			<td><input type="text" name="uname" value="${upl.uname}" placeholder="Enter Your Name Here."></td>
	</tr>
	<tr>
			<td>Address:</td>
			<td><input type="textarea" name="address" value="${upl.address}" placeholder="Enter Your Address here."></td>
	</tr>
	
	<tr>
			<td>Email:</td>
			<td><input type="email" name="email" value="${upl.email}" placeholder="Enter Your Email Id"></td>
			
	</tr>
	
	<tr>
			<td>Gender:</td>
			<td><input type="radio" name="gender" value="Male" checked >Male
			<input type="radio" name="gender" value="Female">Female</td>
	</tr>
	
	<tr>
			<td>Number: </td>
			<td><input type="text" name="num" value="${upl.num}" placeholder="Enter Your Mobile No."></td> 
	</tr>
	
	<tr>
		<td>Message To Print</td>
		<td><input type="textarea" name="mes" value="${upl.mes}" placeholder="Enter Your Message."></td>
	</tr>
	
	<tr>
		<td>Password:</td>
		<td><input type="password" name="pass" value="${upl.pass}" Placeholder="Enter Your password."></td>
	</tr>
	<tr>
	<td>Editor</td>
	<td><textarea class="ckeditor" name="editor" value="${upl.editor}" rows="" cols=""></textarea></td>
	</tr>
	<tr>
			<td colspan="" >
			<input type="submit" name="action" value="update">
			</td>
			<td><input type="reset"></td>
	</tr>
	
	
	<%}else{ %>
	<table >
	<tr>
			<td>Name: </td>
			<td><input type="text" name="uname" placeholder="Enter Your Name Here."></td>
	</tr>
	<tr>
			<td>Address:</td>
			<td><input type="textarea" name="address" placeholder="Enter Your Address here."></td>
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
			<td><input type="text" name="num" placeholder="Enter Your Mobile No."></td> 
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
	<td>Editor</td>
	<td><textarea class="ckeditor" name="editor"></textarea></td>
	</tr>
	
	<tr>
			<td colspan="" >
			<input type="submit" name="action" value="add">
			</td>
			<td><input type="reset"></td>
	</tr>
	<%} %>
</table>




</form>

</html>