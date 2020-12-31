<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.mysql.cj.protocol.Resultset"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee List</title>

    <link rel="icon" type="image/png" sizes="32x32" href="/HiberSpringCombine/resources/favicon.ico">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css" />
</head>
<body>
	<%@include file="Header.jsp"%>

		<h2 class="text-center">Employee Management</h2>
		<h3 class="text-center">
			<a href="Register.jsp" >Add New Employee</a> 

		</h3>
		<div align="center " class="container">
		<table border="2" class="table table-dark">

			<h3>List of Employees</h3>
			</br>
		
			<br/>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Address</th>
				<th>Actions</th>
			</tr>
				<c:forEach var="emp" items="${datalist}">
				<tr>
					<td><c:out value="${emp.id}" /></td>
					<td><c:out value="${emp.name}" /></td>
					<td><c:out value="${emp.address}" /></td>
					<td><a
						href="/HiberSpringCombine/user/editUser/${emp.id}"><i
							class="fas fa-edit"></i></a> &nbsp;&nbsp;&nbsp;&nbsp; <a
						href="/HiberSpringCombine/user/deleteUser/${emp.id}"><i
							class="fas fa-trash-alt"></i></a></td>
				</tr>
			</c:forEach>
		
		</table>
	</div>
	</div>
	<%@include file="footer.jsp"%>
	
</body>
</html>