<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="/mavendemo2/admin/addAdmin" method="post" modelAttribute="admin">
	 <form:hidden path="id" id="id" name="id" />
	 UserName :	<form:input path="uname" id="uname" type="text" name="uname"/><br/>
	 Password : <form:input path="pass" id="pass" type="password" name="pass"/><br/>
	 <input type="submit" name="submit" value="submit">
	
	</form:form>
</body>
</html>