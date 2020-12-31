<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Create Quiz</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href="dist/img/favicon.ico" type="image/x-icon"/>
  <!-- Font Awesome -->
  <link rel="stylesheet" href="../../plugins/fontawesome-free/css/all.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="../../dist/css/adminlte.min.css">
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
            <h1>Create Quiz</h1>
          </div>
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="dashboard.jsp">Home</a></li>
              <li class="breadcrumb-item active">Create Quiz</li>
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
                <h3 class="card-title">Quiz form</h3>
              </div>
              <!-- /.card-header -->
              <!-- form start -->
              <form role="form">
                <div class="card-body">
                 
                 
                 <div class="row">
                		<div class="col-md-6 col-sm-12">
			          		<div class="form-group">
			          	        <label>Level</label>
			            	      <select class="form-control select2bs4" style="width: 100%;">
			                	    <option selected="selected">Select Level</option>
			                    	<option>Beginer</option>
			                    	<option>Mediator</option>
			                    	<option>Expert</option>
			                    	
			                    	
			                  	  </select>
			                </div>
                		</div>
                		<div class="col-md-6 col-sm-12">
                            <div class="form-group">
			          	        <label>Language</label>
			            	      <select class="form-control select2bs4" style="width: 100%;">
			                	    <option selected="selected">Select Level</option>
			                    	<option>Java</option>
			                    	<option>Python</option>
			                    	<option>PHP</option>
			                    	<option>Android</option>
			                  	  </select>
			                </div>
                		</div>
                	</div>
                 	<div class="row">
                  		<div class="col-md-6 col-sm-12">
                            <div class="form-group">
                   				 <label for="exampleInputEmail1">Title</label>
                   				 <input type="text" class="form-control" id="blogtitle" placeholder="Enter title">
                 			</div>
                		</div>
                		<div class="col-md-6 col-sm-12">
			          		<div class="form-group">
			          	        <label>Question Number</label>
			            	      <select class="form-control select2bs4" style="width: 100%;">
			                	    <option selected="selected">Click To Select</option>
			                    	<option>1</option>
			                    	<option>2</option>
			                    	<option>3</option>
			                    	<option>4</option>
			                    	<option>5</option>
			                    	<option>6</option>
			                    	<option>7</option>
			                    	<option>8</option>
			                    	<option>9</option>
			                    	<option>10</option>
			                    	
			                    		
			                  	  </select>
			                </div>
                		</div>
                		
                	</div>
            		<div class="row">
                  		<div class="col-md-6 col-sm-12">
                            
                		</div>
                		<div class="col-md-6 col-sm-12">
			          		
                		</div>
                		</div>
                		
                	</div>
                </div>
                <!-- /.card-body -->

                <div class="card-footer">
                  <div class="card-footer">
                  <input type="button" name="Submit" value="Submit" class="btn btn-primary"  onclick="location.href='AddQuestionQuiz.jsp'" >
                </div>
              </form>
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

<!-- jQuery -->
<script src="../../plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="../../plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- bs-custom-file-input -->
<script src="../../plugins/bs-custom-file-input/bs-custom-file-input.min.js"></script>
<!-- AdminLTE App -->
<script src="../../dist/js/adminlte.min.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="../../dist/js/demo.js"></script>
<script type="text/javascript">
$(document).ready(function () {
  bsCustomFileInput.init();
});
</script>

</body>
</html>