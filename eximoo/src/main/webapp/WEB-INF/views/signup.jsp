<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>  
<head>  
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Sign Up | Eximoo Admin</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Font Awesome -->
  <link rel="stylesheet" href="/eximoo/resources/plugins/fontawesome-free/css/all.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
  <!-- icheck bootstrap -->
  <link rel="stylesheet" href="/eximoo/resources/plugins/icheck-bootstrap/icheck-bootstrap.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="/eximoo/resources/dist/css/adminlte.min.css">
  <!-- Google Font: Source Sans Pro -->
  <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
	<!-- Font Awesome -->
  <link rel="stylesheet" href="/eximoo/resources/plugins/fontawesome-free/css/all.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
  <!-- Tempusdominus Bbootstrap 4 -->
  <link rel="stylesheet" href="/eximoo/resources/plugins/tempusdominus-bootstrap-4/css/tempusdominus-bootstrap-4.min.css">
  <!-- iCheck -->
  <link rel="stylesheet" href="/eximoo/resources/plugins/icheck-bootstrap/icheck-bootstrap.min.css">
  <!-- JQVMap -->
  <link rel="stylesheet" href="/eximoo/resources/plugins/jqvmap/jqvmap.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="/eximoo/resources/dist/css/adminlte.min.css">
  <!-- overlayScrollbars -->
  <link rel="stylesheet" href="/eximoo/resources/plugins/overlayScrollbars/css/OverlayScrollbars.min.css">
  <!-- Daterange picker -->
  <link rel="stylesheet" href="/eximoo/resources/plugins/daterangepicker/daterangepicker.css">
  <!-- summernote -->
  <link rel="stylesheet" href="/eximoo/resources/plugins/summernote/summernote-bs4.css">
  <link rel="icon" href="/eximoo/resources/dist/img/favicon.ico" type="image/x-icon"/>
  <!-- Google Font: Source Sans Pro -->
  <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
</head> 
<body class="hold-transition register-page">
<div class="">
  <div class="register-logo">
    <a href="index2.html"><b>Eximoo</b>Admin</a>
  </div>
        
  <div class="card">
    <div class="card-body register-card-body">
      <p class="login-box-msg">Register Yourself</p>

     <!-- form start -->
              <form:form action="/eximoo/admin/addAdmin"  method="post" role="form" modelAttribute="admin">
               <form:hidden path="id" id="id" name="id" />
                <div class="card-body">
                	<div class="row">
                		
                		
          		<div class="col-sm-6">
                	<div class="form-group">
                    	<label for="">Name</label>
                   				
                   		<form:input class="form-control" path="name" id="name" type="text" name="name" placeholder="First Name+ last Name"/><br/>
                  	</div>
                </div>
              	<div class="col-sm-6">
                      <div class="form-group">
                   		 <label>Email address</label>
                   		 
                   		 <form:input class="form-control" path="email" id="email" type="email" name="email" placeholder="Enter Your Email"/><br/>
                  			
                 	  </div>
                </div>
                		
                	</div>
                	
                	<div class="row">
                		<div class="col-sm-6">
                             <div class="form-group">
                   				 <label >Password</label>
                   				 
                   				 <form:input class="form-control" path="password" id="password" type="password" name="password" placeholder="Password"/><br/>
                   				 
                  			 </div>
                		</div>
                		<div class="col-sm-6">
                			<div class="form-group">
				                  <label>Phone:</label>
				
				                  	<div class="input-group">
				                   		 <div class="input-group-prepend">
				                   			   <span class="input-group-text"><i class="fas fa-phone"></i></span>
				                   		 </div>
				                    	<form:input class="form-control" path="phone" id="phone" type="number" name="phone" data-inputmask="&quot;mask&quot;: &quot;(999) 999-9999&quot;" data-mask="" im-insert="true" /><br/>
				                    	
				                  	</div>
				                  <!-- /.input group -->
				                  </div>
                		</div>
                	</div>
                	
                	<div class="row">
                		<div class="col-sm-6">
               				 <div class="form-group">
                   				 <label for="">Address</label>
                        		<form:input class="form-control" path="ads" id="ads" type="text" name="ads" placeholder="Enter Address"/><br/>
                   				 
                  			 </div>
                		</div>
                		<div class="col-sm-6">
			                <div class="form-group">
			                  <label>Birth Date</label>
			                 
			                    <div class="input-group date" id="reservationdate" data-target-input="nearest">
			                     
	                    		<form:input class="form-control datepicker" data-target="#reservationdate" path="birthdate" id="birthdate" type="date" name="birthdate" /><br/>
			                        
			                        <div class="input-group-append" data-target="#reservationdate" data-toggle="datepicker">
			                            
			                        </div>
			                    </div>
			                </div>
                		</div>
                	</div>
                	
                	<!--  <div class="col-sm-6 form-group">
                    <label for="validationCustom12">Menu Image</label>
                    <div class="custom-file">
                      <input type="file" class="custom-file-input" id="photo" name="menuImage">
                      <label class="custom-file-label" for="photo">Upload Images...</label>
                      <div class="invalid-feedback">Example invalid custom file feedback</div>
                    </div>
                  </div> -->
                  <div class="col-sm-6 form-group">
                  <div class="form-check">
                    <input type="checkbox" class="form-check-input" id="exampleCheck1">
                    <label class="form-check-label" for="exampleCheck1">Agree Terms & Conditions</label>
                  </div>
                </div>
                </div>
                <!-- /.card-body -->

                <div class="card-footer">
                <input type="submit" class="btn btn-primary" name="submit" value="submit">
                  </div>
              </form:form>

</div>
</div>
</div>

<script type="text/javascript">
$(document).ready(function () {
  bsCustomFileInput.init();
});
</script>
<!-- jQuery -->
<script src="/eximoo/resources/plugins/jquery/jquery.min.js"></script>
<!-- jQuery UI 1.11.4 -->
<script src="/eximoo/resources/plugins/jquery-ui/jquery-ui.min.js"></script>
<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
<script>
  $.widget.bridge('uibutton', $.ui.button)
</script>
<!-- Bootstrap 4 -->
<script src="/eximoo/resources/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- ChartJS -->
<script src="/eximoo/resources/plugins/chart.js/Chart.min.js"></script>
<!-- Sparkline -->
<script src="/eximoo/resources/plugins/sparklines/sparkline.js"></script>
<!-- JQVMap -->
<script src="/eximoo/resources/plugins/jqvmap/jquery.vmap.min.js"></script>
<script src="/eximoo/resources/plugins/jqvmap/maps/jquery.vmap.usa.js"></script>
<!-- jQuery Knob Chart -->
<script src="/eximoo/resources/plugins/jquery-knob/jquery.knob.min.js"></script>
<!-- daterangepicker -->
<script src="/eximoo/resources/plugins/moment/moment.min.js"></script>
<script src="/eximoo/resources/plugins/daterangepicker/daterangepicker.js"></script>
<!-- Tempusdominus Bootstrap 4 -->
<script src="/eximoo/resources/plugins/tempusdominus-bootstrap-4/js/tempusdominus-bootstrap-4.min.js"></script>
<!-- Summernote -->
<script src="/eximoo/resources/plugins/summernote/summernote-bs4.min.js"></script>
<!-- overlayScrollbars -->
<script src="/eximoo/resources/plugins/overlayScrollbars/js/jquery.overlayScrollbars.min.js"></script>
<!-- AdminLTE App -->
<script src="/eximoo/resources/dist/js/adminlte.js"></script>
<!-- AdminLTE dashboard demo (This is only for demo purposes) -->
<script src="/eximoo/resources/dist/js/pages/dashboard.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="/eximoo/resources/dist/js/demo.js"></script>
<!-- bs-custom-file-input -->
<script src="/eximoo/resources/plugins/bs-custom-file-input/bs-custom-file-input.min.js"></script>
</body> 
</html> 