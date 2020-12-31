<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>User Details</title>
</head>
<body>
<center>   	
        <h1>User Management</h1>
        <h2>
            <a href="/interviewtask/user/addUserPage">Add New User</a>
            &nbsp;&nbsp;&nbsp;
			
        </h2>
    </center>
  
    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of Users</h2></caption>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Gender</th>
                <th>Email</th>
                <th>Mo No</th>
                <th>Addres Line 1</th>
                <th>Addres Line 2</th>
                <th>State</th>
                <th>City</th>
                <th>ZipCode</th>
                <th>Country</th>
                <th>Actions</th>
                
            </tr>
            <c:forEach var="user" items="${userList}">
                <tr>
                    <td><c:out value="${user.userId}" /></td>
                    <td><c:out value="${user.name}" /></td>
                    <td><c:out value="${user.gender}" /></td>
                    <td><c:out value="${user.email}" /></td>
                    <td><c:out value="${user.mobile}" /></td>
                    <td><c:out value="${user.addresline1}" /></td>
                    <td><c:out value="${user.addressline2}" /></td>
                    <td><c:out value="${user.state}" /></td>
                    <td><c:out value="${user.city}" /></td>
                    <td><c:out value="${user.zipcode}" /></td>
                    <td><c:out value="${user.country}" /></td>
                    <td>
                         <a href="/interviewtask/user/editUser/${user.userId}">Edit</i></a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="/interviewtask/user/deleteUser/${user.userId}">Delete</a>                     
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>  
</body>
</html>