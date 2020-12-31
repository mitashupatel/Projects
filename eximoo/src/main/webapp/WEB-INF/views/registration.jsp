<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Join Us</title>
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
						Sign In
					</span>
				</div>
				
                  <form:form  class="login100-form validate-form" action="/eximoo/user/addUser"  method="post" role="form" modelAttribute="user" enctype="multipart/form-data">
               <form:hidden path="userid" id="userid" name="userid" />
          	  <div style="color: red;" id="emailCheck" ></div>
				<div class="wrap-input100 validate-input m-b-26" data-validate="name is required">
						<span class="label-input100">name</span>
						<form:input class="input100" path="name" type="text" name="name" placeholder="Enter name"/>
						<span class="focus-input100"></span>
					</div>
					<div class="wrap-input100 validate-input m-b-26" data-validate="Username is required">
						<span class="label-input100">Email</span>
						<form:input class="input100" type="text" name="email" path="email" placeholder="Enter Email"/>
						<span class="focus-input100"></span>
					</div>
                    <div class="wrap-input100 validate-input m-b-18" data-validate = "">
						<span class="label-input100">Phone</span>
						<form:input class="input100" type="text" path="phone" name="phone" placeholder="Enter contact"/>
						<span class="focus-input100"></span>
					</div>
					<div class="wrap-input100 validate-input m-b-18" data-validate = "">
						<span class="label-input100">Address</span>
						<form:input class="input100" type="text" path="address" name="address" placeholder="Enter address"/>
						<span class="focus-input100"></span>
					</div>
					<div class="wrap-input100 validate-input m-b-18" data-validate = "">
						<span class="label-input100 ">Birth Date</span>
						<form:input class="input100 date-picker" type="date" name="birthdate" path="birthdate" placeholder=""/>
						<span class="focus-input100"></span>
					</div>
					<div class="wrap-input100 validate-input m-b-18" data-validate = "">
						<label class="label-input100 custom-file-label" for="exampleInputFile">Profile</label>
						<input class="input100 custom-file-input" id="exampleInputFile" type="file" name="userphoto"  accept=".jpg,.jpeg,.png">
						<label class="custom-file-label" for="exampleInputFile">Choose file</label>
						<span class="focus-input100"></span>
					</div>
					<div class="wrap-input100 validate-input m-b-18" data-validate = "Password is required">
						<span class="label-input100">Password</span>
						<form:input class="input100" type="password" path="password" id="password" name="password" placeholder="Enter password"/>
						<span class="focus-input100"></span>
					</div>

					<div class="flex-sb-m w-full p-b-30">
						<div class="contact100-form-checkbox">
							<input class="input-checkbox100" id="terms" type="checkbox" name="terms">
							<label class="label-checkbox100" for="terms">
								Terms & Conditions
							</label><br>
							<input class="input-checkbox100" id="newsletter" type="checkbox" name="newsletter">
							<label class="label-checkbox100" for="newsletter">
								Eximoo's Newsletter
							</label>
						</div>

						<div>
							<a href="#" class="txt1">
								Forgot Password?
							</a>
						</div>
					</div>

					<div class="container-login100-form-btn">
						<button class="login100-form-btn" id="btnSubmit">
							Login
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

  	<script type="text/javascript">
	$("#email").blur(function() {
	  		var email = $(this).val();
	  		
	  	    $.ajax({
	  	        type: 'GET',
	  	        url: "/eximoo/admin/checkEmail/" + email,
	  	        success: function(data){
	  	        	
	  	            if(data != "")
	  	            {
	  	            	//alert("data : "+data);	
	  	            	$("#emailCheck").text(data);
	  	            	$("#btnSubmit").attr('disabled', 'disabled');
	  	            	return false;
	  	            }
	  	            else {
	  	            	$("#emailCheck").text("");
	  	            	$("#btnSubmit").removeAttr('disabled', 'disabled');
					}
	  	        },
	  	        error:function(){
	  	            alert("error");
	  	          $("#btnSubmit").attr('disabled', 'disabled');
	  	        }
	  	    });
		});

</script>
</body>
</html>