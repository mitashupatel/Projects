<%@page import="java.sql.Connection"%>
<%@page import="com.mysql.cj.protocol.Resultset"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee List</title>
<link rel="icon" type="image/png" sizes="32x32" href="favicon.ico">
    
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css" />
</head>
<body>
	<%@include file="Header.jsp"%>

		<h2 class="text-center">Employee Management</h2>
		<h3 class="text-center">
			<a href="Register.jsp" >Add New Employee</a> 

		</h3>

	<%
		if (request.getAttribute("msg") != null) {
	%>
	<%=request.getAttribute("msg")%>
	<%
		}
	%>
	<div class="container">
	<div class="card mx-auto" style="width: 45rem;" >
	 <div class="card-header">
    Add Data
  </div>
  <div class="card-body">
	<form action="UserController" method="post">
  <div class="form-group">
  
  <%
			if (request.getAttribute("emp") != null) {
		%>
		<input type="hidden" name="id" value="${emp.id}">
		<label for="exampleFormControlInput1">Name</label>
		 <input	type="text" class="form-control" id="exampleFormControlInput1" value="${emp.name}" name="name"><br /> 
		 <label for="exampleFormControlInput1">Address</label>
		 <input	type="text" class="form-control" id="exampleFormControlInput1" value="${emp.address}" name="address"><br /> 
		 
		  <button type="submit" class="btn btn-primary" name="action" value="update">Submit</button>
		 
		<%
			} else {
		%>
		<label for="exampleFormControlInput1">Name</label>
		 <input	type="text" class="form-control" id="exampleFormControlInput1"  name="name"><br /> 
		 <label for="exampleFormControlInput1">Address</label>
		 <input	type="text" class="form-control" id="exampleFormControlInput1" name="address"><br /> 
		 
		  <button type="submit" class="btn btn-primary" name="action" value="add">Submit</button>
		<%
			}
		%></form>
		</div>
		</div>
		</div>
	

	<div align="center " class="container">
		<table border="2" class="table table-dark">

			<h3>List of Employees</h3>
			</br>
			<form action="List.jsp" method="get" class="text-align-center">
				<input type="text" name="q" placeholder="Search Here">
				<button name="submit" value="submit">
					<i class="fas fa-search"></i>
				</button>

			</form>
			</br>
			</br>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Address</th>
				<th>Actions</th>
			</tr>
			<%
				String url = "jdbc:mysql://localhost:3306/interview";
				String uname = "root";
				String pass = "root";
				Connection conn = null;
				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				conn = DriverManager.getConnection(url, uname, pass);
				Statement st = null;
				ResultSet rs = null;
				st = conn.createStatement();
				String query = request.getParameter("q");
				if (query != null) {
					String data = null;
					if (query != null) {
						data = "select * from data where id like '%" + query + "%' or name like '%" + query
								+ "%' or address like '%" + query + "%'";
					}
					rs = st.executeQuery(data);
					while (rs.next()) {
			%>

			<tr>
				<td><%=rs.getInt("id")%></td>
				<td><%=rs.getString("name")%></td>
				<td><%=rs.getString("address")%></td>
				<td><a
					href="UserController?action=edit&id=<%=rs.getInt("id")%>"><i
						class="fas fa-edit"></i></a> &nbsp;&nbsp;&nbsp;&nbsp; <a
					href="UserController?action=delete&id=<%=rs.getInt("id")%>"><i
						class="fas fa-trash-alt"></i></a></td>
			</tr>

			<%
				}
			%>
			<%
				} else {
			%>

			<c:forEach var="emp" items="${data}">
				<tr>
					<td><c:out value="${emp.id}" /></td>
					<td><c:out value="${emp.name}" /></td>
					<td><c:out value="${emp.address}" /></td>
					<td><a
						href="UserController?action=edit&id=<c:out value='${emp.id}' />"><i
							class="fas fa-edit"></i></a> &nbsp;&nbsp;&nbsp;&nbsp; <a
						href="UserController?action=delete&id=<c:out value='${emp.id}' />"><i
							class="fas fa-trash-alt"></i></a></td>
				</tr>
			</c:forEach>
			<%
				}
			%>
		</table>
	</div>
	</div>
	<%@include file="footer.jsp"%>
	
</body>
</html>