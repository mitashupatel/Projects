<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p align = "center"> To successfully login please enter the OTP you have received on your email </p>
<table align = "center">
<% if(request.getParameter("errorMsg") != null){ %>
              			<div style="color: red;"><%=request.getParameter("errorMsg") %></div>
              		<%} %>
<form:form action="/ivote/user/valOTP"
							modelAttribute="voter" method="post">
<!-- <td> <input type = "hidden" name = "voterId" value="" width ="400px"> 
 -->							
<th> Enter OTP </th>
<tr > 
<td> <input type = "text" name = "otp" width ="400px"> 
</tr>
<tr> 
<td align = "center"> <input type ="submit" name="submit" align = "right">
<input type ="submit" name = "resend" value = "resend" align = "left"> </td>
</tr>
</form:form>
</table>
</body>
</html>