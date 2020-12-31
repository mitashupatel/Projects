<%@ page  language="java" contentType="text/html; charset=ISO-8859-1"
      pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <center>   	
        <h1>Employee Management</h1>
        <h2>
            <a href="Register.jsp">Add New Employee</a>
            &nbsp;&nbsp;&nbsp;
			
        </h2>
    </center>
    <% if(request.getAttribute("msg") != null){ %>
    	<%= request.getAttribute("msg") %>
    <%} %>
    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of Employees</h2></caption>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Address</th>
                <th>Actions</th>
            </tr>
            <c:forEach var="emp" items="${data}">
                <tr>
                    <td><c:out value="${emp.id}" /></td>
                    <td><c:out value="${emp.name}" /></td>
                    <td><c:out value="${emp.address}" /></td>
                    <td>
                        <a href="Controller?action=edit&id=<c:out value='${emp.id}' />">Edit</a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="Controller?action=delete&id=<c:out value='${emp.id}' />">Delete</a>                     
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>   
</body>
</html>