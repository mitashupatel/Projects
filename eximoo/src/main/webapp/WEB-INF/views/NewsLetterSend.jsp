<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Send NewsLetter</title>
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
            <h1>Send NewsLetter</h1>
          </div>
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="dashboard.jsp">Home</a></li>
              <li class="breadcrumb-item active">Send NewsLetter</li>
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
                <h3 class="card-title">Send NewsLetter</h3>
              </div>
              <!-- /.card-header -->
              <!-- form start -->
              <form:form action="/eximoo/admin/sendLetter"  method="post" role="form" modelAttribute="letter" >
               <form:hidden path="letterId" id="letterId" name="letterId" />
                <div class="card-body">
                	
                  		<div class="row">
                  		<div class="form-group">
                   				 <label for="exampleInputEmail1">NewsLetter</label>
                   				 <form:textarea class="ckeditor" name="mailmessage" path="mailmessage" id="mailmessage"/>
                 			</div>
                			
						</div>
						<div class="row">
                		<div class="col-sm-6">
			                <div class="form-group">
			                  <label>Date Of Send</label>
			                 
			                    <div class="input-group date" id="reservationdate" data-target-input="nearest">
			                     
	                    		<form:input class="form-control datepicker" data-target="#reservationdate" path="date" id="date" type="date" name="date" /><br/>
			                        
			                        <div class="input-group-append" data-target="#reservationdate" data-toggle="datepicker">
			                            
			                        </div>
			                    </div>
			                </div>
                		</div>
                		<div class="col-md-6 col-sm-12">
                            <div class="form-group">
			          	        <label>Send By</label>
			            	      <form:select class="form-control select2bs4" name="sender" id="sender" path="sender" style="width: 100%;">
			                	    <form:option value="0" selected="selected">Click To Select</form:option>
			                    	<form:option value="hariom">Hariom</form:option>
			                    	<form:option value="jainee">Jainee</form:option>
			                    	<form:option value="mitashu">Mitashu</form:option>
			                    
			                    	
			                  	  </form:select>
			                </div>
                		</div>
                	</div>
                </div>
                  
          
                <div class="card-footer">
                  <button type="submit" class="btn btn-primary">Submit</button>
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
<script src="//cdn.ckeditor.com/4.14.1/full/ckeditor.js"></script>
<script>
CKEDITOR.replace( 'mailmessage' );

</script>

<script type="text/javascript">
$(document).ready(function () {
  bsCustomFileInput.init();
});
</script>

</body>
</html>