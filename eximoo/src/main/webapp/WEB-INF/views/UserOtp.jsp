<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>OTP Verification</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="/eximoo/resources/assets/images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="/eximoo/resources/assets/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="/eximoo/resources/assets/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="/eximoo/resources/assets/fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="/eximoo/resources/assets/vendor/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="/eximoo/resources/assets/vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="/eximoo/resources/assets/vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="/eximoo/resources/assets/vendor/select2/select2.min.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="/eximoo/resources/assets/vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="/eximoo/resources/assets/css/util.css">
	<link rel="stylesheet" type="text/css" href="/eximoo/resources/assets/css/main.css">
<!--===============================================================================================-->
</head>
<body>
	
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100">
				<div class="login100-form-title" style="background-image: url(/eximoo/resources/assets/images/bg-01.jpg);">
					<span class="login100-form-title-1">
						OTP Verification
					</span>
				</div>
				<form:form class="login100-form validate-form" action="/eximoo/user/varifyOtp"
							modelAttribute="otp" method="post">
							<Center><h3>OTP Verification</h3>
              <p>Please enter OTP which you received on your Email</p></Center>
              
              <% if(request.getParameter("errorMsg") == "Wrong OTP"){ %>
              	<div style="color: red;">Wrong OTP Enter Again!</div>
              <%} %>
              
            <form:hidden path="otpId" id="otpId" name="otpId" />
               
				
				
					<div class="wrap-input100 validate-input m-b-26" data-validate="OTP is required">
						<span class="label-input100">OTP</span>
						<input class="input100" type="number" name="otp" placeholder="Enter Code">
						<span class="focus-input100"></span>
					</div>


					<div class="flex-sb-m w-full p-b-30">
						<div class="contact100-form-checkbox">
							
						</div>

						<div>
							<a href="/eximoo/user/userlogin" class="txt1">
								Login Page
							</a>
						</div>
					</div>
					
					<div class="container-login100-form-btn">
						<button type="submit" class="login100-form-btn">
							Submit
						</button>
					</div>
				</form:form>
			</div>
		</div>
	</div>
	
<!--===============================================================================================-->
	<script src="/eximoo/resources/assets/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="/eximoo/resources/assets/vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="/eximoo/resources/assets/vendor/bootstrap/js/popper.js"></script>
	<script src="/eximoo/resources/assets/vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="/eximoo/resources/assets/vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="/eximoo/resources/assets/vendor/daterangepicker/moment.min.js"></script>
	<script src="/eximoo/resources/assets/vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="/eximoo/resources/assets/vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="/eximoo/resources/assets/js/main.js"></script>


</body>
</html>