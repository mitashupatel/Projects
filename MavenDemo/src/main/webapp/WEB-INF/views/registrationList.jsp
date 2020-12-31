<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of Admin</h2></caption>
            <tr>
                <th>ID</th>
                <th>uname</th>
                <th>password</th>
                <th>Actions</th>
            </tr>
            <c:forEach var="admin" items="${adminList}">
                <tr>
                    <td><c:out value="${admin.id}" /></td>
                    <td><c:out value="${admin.uname}" /></td>
                    <td><c:out value="${admin.pass}" /></td>
                    <td>
                        <a href="editAdmin/${admin.id}">Edit</a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="deleteAdmin/${admin.id}">Delete</a>                     
                    </td>
                </tr>
            </c:forEach>
        </table>
</body>
</html>