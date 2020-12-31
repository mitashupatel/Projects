<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
  <link rel="stylesheet" href="/ivote/resources/vendors/iconic-fonts/flat-icons/flaticon.css">
    <link href="/ivote/resources/vendors/iconic-fonts/font-awesome/css/all.min.css" rel="stylesheet">
  <!-- Bootstrap core CSS -->
  <link href="/ivote/resources/assets/css/bootstrap.min.css" rel="stylesheet">
  <!-- jQuery UI -->
  <link href="/ivote/resources/assets/css/jquery-ui.min.css" rel="stylesheet">
  <!-- Costic styles -->
  <!-- Favicon -->
  <link rel="icon" type="image/png" sizes="32x32" href="/ivote/resources/favicon.ico">
</head>
<style type="text/css">
.style1 {
	width: 80%;
	border-style: double;
	border-color: Blue;
}

.design {
	color: White;
	font-size: 20px;
	text-decoration: none;
	border-radius: 20pt;
}

.style2 {
	height: 250px;
}

.container {
	width: 100%;
	height: 350px;
	background-image: url("images/bg-01.jpg");
	background-size: cover;
	background-repeat: no-repeat;
	background-position: 20% 20%;
}

.div1 {
	border: 2px solid #C0E6F3;
	border-radius: 12px;
	background-color: #C0E6F3;
	height: 50px;
	margin-left: 2em;
	margin-right: 2em;
}

.div2 {
	margin-left: 3em;
	margin-right: 3em;
	color: White;
	font-size: 25px;
	margin-top: 10px;
}

a:link, a:visited { //
	background-color: #f44336;
	padding-right: 25px;
	text-align: center;
	text-decoration: none; //
	display: inline-block;
}

.divside1 {
	border: 2px solid #C0E6F3;
	border-radius: 12px;
	background-color: #C0E6F3;
	height: 35px;
	width: 70%;
	margin-left: 2em;
	margin-top: 1.5em;
}

.divside2 {
	color: White;
	font-size: 25px;
	text-align:center;
}

table, th, td, tr {
  font-size: 22px;
}

.th1
{
 font-size:18px;
}

.sidemenu
{
  height:400px;
  width:400px;
 
}
.table2
{
  margin-top: 60px;
  margin-left: 110px;
  margin-bottom:50px;
 
  
}
input[type=submit]
{
  border: 2px solid #C0E6F3;
	border-radius: 8px;
	background-color: #C0E6F3;
	height:35px;
	width: 130px;
	font-size: 19px;
	text-align:center;
	cursor: pointer;
}

input[type=text],[type=phone],[type=password],[type=email]
{
	height:28px;
	width:250px;
}
input[type=button]
{
 	border: 2px solid #C0E6F3;
	border-radius: 8px;
	background-color: #C0E6F3;
	height:25px;
	width: 100px;
	font-size: 12px;
	text-align:center;
	cursor: pointer;
}
</style>
<body>

	<div>
		<table cellpadding="3" class="style1" align="center" >
			<tr>
				<td colspan="3" class="style2">
					<div class="container"></div>
				</td>
			</tr>

			<tr>
				<td colspan="3"><marquee direction="left">
						<span> Wel-Come To Online Voting System! </span>
					</marquee></td>
			</tr>

			<tr>
				<td colspan="3">

					<div class="div1">
						<div class="div2">
							<a href="home.jsp">Home</a> <a
								href="voterregistration.jsp">Register To Vote</a>
								 <a
								href="voterlogin.jsp">Login</a> 
								<a href = "votingpage.jsp"> Candidates</a>
								<a
								href="contactus.jsp">Contact Us</a>
						</div>

					</div>
				</td>
			</tr>
			<tr>
				<td rowspan = "2" class="sidemenu">
					<div class="divside1">
						<div class="divside2">
							<a href="home.jsp">Home</a>
						</div>
					</div>
			
					<div class="divside1">
						<div class="divside2">
							<a href="voterregistration.jsp">Register To Vote</a>
						</div>
					</div>
					
					<div class="divside1">
						<div class="divside2">
							<a href="voterlogin.jsp">Login</a>
						</div>
					</div>
					
					<div class="divside1">
						<div class="divside2">
							<a href="votingpage.jsp">Candidates</a>
						</div>
					</div>
					
					<div class="divside1">
						<div class="divside2">
							<a href="contactus.jsp.jsp">Contact Us</a>
						</div>
					</div>
					</td>
					<td rowspan="2">
					<form:form action="/ivote/user/userLoggingIn"
							modelAttribute="admin" method="post">
					<% if(request.getParameter("errorMsg") != null){ %>
              			<div style="color: red;"><%=request.getParameter("errorMsg") %></div>
              		<%} %>
					<table class="table2" cellpadding = "7" cellspacing = "7"> 
					<tr>
					<th colspan= "2">Login </th>
					</tr>
					<tr>
					<td> NI Number: </td>
					<td><input type="text" name="niNumber" id="niNumber" placeholder="NI number" required=""><div id="valNI" style="color: red;"></div></td>
					</tr>
					<tr> 
					<td> Email: 
					</td>
					<td> <input type="email" name="email" id="email" placeholder="Email Address" required=""><div id="valEmail" style="color: red;"></div>
                  </td>
					</tr>
					<tr> 
					<td> Password:  </td>
					<td> <input type="password" name="password" id="password" placeholder="Password" required=""><div id="valPass" style="color: red;"></div></td></tr>
					<tr> 
<td align = "right"> <input type="submit" value="Send OTP" name="otp1"> </td>
<td class = "th1">Don't have account?<input type = "button" value = "Register"> </td>
					</tr>
		</table></form:form></td>
	</div>
	
</body>
<script type="text/javascript">
	
	$( "form" ).submit(function( event ) {
		let i = 0;
		var ni = $("#niNumber").val();
		var email = $("#email").val();
		var password = $("#password").val();

		if(email == "")
		{
			$("#valEmail").text("required email");
			i++;
		}
		else{
			$("#valEmail").text("");
		}
		if(ni == "")
		{
			$("#valNI").text("required NI number");
			i++;
		}
		else{
			$("#valNI").text("");
		}
		if(password == "")
		{
			$("#valPass").text("required Password");
			i++;
		}
		else{
			$("#valPass").text("");
		}
		if(i>0)
		{
			return false; 
		}
	});
	
</script>
<script src="/ivote/resources/assets/js/jquery-3.3.1.min.js"></script>
<script src="/ivote/resources/assets/js/jquery-ui.min.js"> </script>
</html>