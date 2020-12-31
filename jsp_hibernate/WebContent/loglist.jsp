<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LogList</title>
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/dt/dt-1.10.21/datatables.min.css"/>
 


</head>
<body>

 <center>
        <h1>Log In Management</h1>
        <h2>
            <a href="login.jsp">Add New user</a>
            &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;
            
			<a href="LogController?action=list" target="_blank">Refresh The List</a>
        </h2>
    </center>
    
    <div align="center">
        <table border="2" cellpadding="5" id="datatable">
            <caption><h2>List of users</h2></caption>
            <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Address</th>
                <th>Email</th>
                <th>Gender</th>
                <th>Number</th>
                <th>Message</th>
                <th>Password</th>
                <th>ckeditor</th>
                <th>Actions</th>
            </tr>
            </thead>
            <tbody>
             <c:forEach var="lgl" items="${lgls}">
                <tr>
                    <td><c:out value="${lgl.id}" /></td>
                    <td><c:out value="${lgl.uname}" /></td>
                    <td><c:out value="${lgl.address}" /></td>
                    <td><c:out value="${lgl.email}" /></td>
                    <td><c:out value="${lgl.gender}" /></td>
                    <td><c:out value="${lgl.num}" /></td>
 					<td><c:out value="${lgl.mes}" /></td>
 					<td><c:out value="${lgl.pass}" /></td>
 					<td><c:out value="${lgl.editor}" /></td>
 					
                    <td>
                        <a href="LogController?action=edit&id=<c:out value='${lgl.id}' />">Edit</a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="LogController?action=delete&id=<c:out value='${lgl.id}' />">Delete</a>                     
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
<script src="https://unpkg.com/jquery@3.3.1/dist/jquery.min.js" ></script>
<script type="text/javascript" src="https://cdn.datatables.net/v/dt/dt-1.10.21/datatables.min.js"></script>

<script>
	$(document).ready(function(){
	$("#datatable").DataTable({
		
		});
		})
</script>

</body>
</html>