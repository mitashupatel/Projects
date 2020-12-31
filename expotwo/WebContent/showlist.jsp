<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <center>
        <h1>Log In Management</h1>
        <h2>
            <a href="signup.jsp">Add New user</a>
            &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;
            
			<a href="UserController?action=list" target="_blank">Refresh The List</a>
        </h2>
    </center>
	<div align="center">
        <table border="2" cellpadding="5">
            <caption><h2>List of users</h2></caption>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Age</th>
              
            </tr>
             <c:forEach var="listshow" items="${listshow}">
                <tr>
                    <td><c:out value="${listshow.id}" /></td>
                    <td><c:out value="${listshow.fname}" /></td>
                    <td><c:out value="${listshow.age}" /></td>
                    
                    <td>
                        <a href="UserController?action=edit&id=<c:out value='${listshow.id}' />">Edit</a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="UserController?action=delete&id=<c:out value='${listshow.id}' />">Delete</a>                     
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>


</body>
</html>