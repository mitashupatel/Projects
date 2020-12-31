<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page errorPage="ErrorPage.jsp"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String n1 = request.getParameter("n1");
		String n2 = request.getParameter("n2");

		double a = Integer.parseInt(n1);
		double b = Integer.parseInt(n2);
		double c = a / b;
	%>

	<%=c%>

	<c:set var="i" value="10" scope="application"></c:set>
	<c:out value="${i}"></c:out>

	<c:if test="${i>0}">
Its Possitive</c:if>

	<c:forEach var="j" begin="1" end="10">
		<c:out value="${j}"></c:out>
		<br>
	</c:forEach>
	<%-- <c:url var="myurl" value="https://www.google.com/search">
<c:param name="q" value="Mitashu Patel"></c:param>

</c:url>
<c:out value="${myurl}"></c:out>
<c:redirect url="${myurl}"></c:redirect> --%>
</body>
</html>