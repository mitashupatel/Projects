<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add User</title>
</head>
<body>
	<%@include file="Header.jsp"%>		
			<div class="container">
	<div class="card mx-auto" style="width: 45rem;" >
	 <div class="card-header">
    Add Data
  </div>
  <div class="card-body">
	<form:form action="/HiberSpringCombine/user/addUser"  method="post" role="form" 
                      modelAttribute="user" enctype="multipart/form-data">
                      <div class="form-group">
               <form:hidden path="id" id="id" name="id" />

		 <label for="exampleFormControlInput1">Name</label>
		 <form:input class="form-control" path="name" id="name" type="text" name="name" placeholder="Enter Name"/>
		<br/>
		 <label for="exampleFormControlInput1">Address</label>
		 <form:input class="form-control" path="address" id="address" type="text" name="address" placeholder="Enter Address"/><br /> 
		 
		  <button type="submit" class="btn btn-primary" name="submit" value="submit">Submit</button>
		
		</form:form>
		</div>
		</div>
		</div>
		</div>
		<%@include file="footer.jsp"%>
</body>
</html>