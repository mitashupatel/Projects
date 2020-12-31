<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>SignUp  User</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href="/eximoo/resources/dist/img/favicon.ico" type="image/x-icon"/>
  <!-- Font Awesome -->
  <link rel="stylesheet" href="/eximoo/resources/plugins/fontawesome-free/css/all.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="/eximoo/resources/dist/css/adminlte.min.css">
  <!-- Google Font: Source Sans Pro -->
  <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
</head>
<body>
<%@ include file="lefthead.jsp" %>




<!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h1>Add  User</h1>
          </div>
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="dashboard.jsp">Home</a></li>
              <li class="breadcrumb-item active">User Form</li>
            </ol>
          </div>
        </div>
      </div><!-- /.container-fluid -->
    </section>

    <!-- Main content -->
    <section class="content">
      <div class="container-fluid">
        <div class="row">
          <!-- left column -->
          <div class="col-md-12">
            <!-- general form elements -->
            <div class="card card-primary">
              <div class="card-header">
                <h3 class="card-title">Sign Up</h3>
              </div>
              <!-- /.card-header -->
              <!-- form start -->
              <!-- form start -->
              <form:form action="/eximoo/admin/addUser"  method="post" role="form" modelAttribute="user" enctype="multipart/form-data">
               <form:hidden path="userid" id="userid" name="userid" />
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
				                    	<form:input class="form-control" path="phone" id="phone" type="text" name="phone" data-inputmask="&quot;mask&quot;: &quot;(999) 999-9999&quot;" data-mask="" im-insert="true" /><br/>
				                    	
				                  	</div>
				                  <!-- /.input group -->
				                  </div>
                		</div>
                	</div>
                	
                	<div class="row">
                		<div class="col-sm-6">
               				 <div class="form-group">
                   				 <label for="">Address</label>
                        		<form:input class="form-control" path="address" id="address" type="text" name="address" placeholder="Enter Address"/><br/>
                   				 
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
                	
                	<div class="row">
                		<div class="col-sm-6">
						      <div class="form-group">
			                    <label for="exampleInputFile">Profile Photo</label>
			                    <div class="input-group">
			                      <div class="custom-file">
			                      
			                        <input type="file" class="custom-file-input" id="exampleInputFile" name="userphoto" accept=".jpg,.jpeg,.png">
			                        <label class="custom-file-label" for="exampleInputFile">Choose file</label>
			                      </div>
			                      <div class="input-group-append">
			                        <span class="input-group-text" id="">Upload</span>
			                      </div>
			                    </div>
			                  </div>
                		</div>
                		<div class="col-sm-6">
				                
                		</div>
                	</div>
                  <div class="col-sm-6 form-group">
                  <div class="form-check">
                  	
                  	<form:checkbox path="terms" value="1" class="form-check-input" id="terms" checked="checked"/>  
                    <label class="form-check-label" for="terms">Agree Terms & Conditions</label>&nbsp &nbsp &nbsp &nbsp &nbsp
                  	<form:checkbox path="newsletter" value="1" class="form-check-input" id="newsletter" checked="checked"/>  
                  	<label class="form-check-label" for="newsletter">Eximoo's NewsLetter</label>
                  </div>
                </div>
                </div>
                <!-- /.card-body -->

                <div class="card-footer">
                <input type="submit" class="btn btn-primary" name="submit" value="submit">
                  </div>
              </form:form>
            </div>
            <!-- /.card -->

          </div>
          <!--/.col (left) -->
          <!-- right column -->
          
          <!--/.col (right) -->
        </div>
        <!-- /.row -->
      </div><!-- /.container-fluid -->
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->


<script type="text/javascript">
$(document).ready(function () {
  bsCustomFileInput.init();
});
</script>

</body>
</html>