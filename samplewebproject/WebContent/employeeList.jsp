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
            <a href="registration.jsp">Add New Employee</a>
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
                <th>FirstName</th>
                <th>LastName</th>
                <th>Actions</th>
            </tr>
            <c:forEach var="emp" items="${emps}">
                <tr>
                    <td><c:out value="${emp.id}" /></td>
                    <td><c:out value="${emp.fname}" /></td>
                    <td><c:out value="${emp.lname}" /></td>
                    <td>
                        <a href="EmployeeController?action=edit&id=<c:out value='${emp.id}' />">Edit</a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="EmployeeController?action=delete&id=<c:out value='${emp.id}' />">Delete</a>                     
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>   
</body>
</html>