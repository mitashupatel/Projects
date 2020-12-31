<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Show Custom Quiz</title>
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
            <h1>Custom Quiz List</h1>
          </div>
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="dashboard.jsp">Home</a></li>
              <li class="breadcrumb-item active">Show Custom Quiz</li>
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
                <h3 class="card-title">List Of Custom Quiz</h3>
              </div>
              <!-- /.card-header -->
              <!-- form start -->
              <form role="form">
                <div class="card-body">
                	
                	<div class="row">
                		<div class="col-md-6 col-sm-12">
                            <div class="form-group">
                   				 <label for="exampleInputEmail1">Enter Quiz ID</label>
                   				 <input type="text" class="form-control" id="blogtitle" placeholder="1" disabled >
                 			</div>
                		</div>
                		<div class="col-md-6 col-sm-12">
			          		<div class="form-group">
                   				 <label for="exampleInputEmail1">Level</label>
                   				 <input type="text" class="form-control" id="blogtitle" placeholder="Beginer"disabled>
                 			</div>
                		</div>
                		
                	</div>
                	
                	<div class="row">
                		<div class="col-md-6 col-sm-12">
                            <div class="form-group">
                   				 <label for="exampleInputEmail1">Title</label>
                   				 <input type="text" class="form-control" id="blogtitle" placeholder="Enter title"disabled>
                 			</div>
                		</div>
                		<div class="col-md-6 col-sm-12">
			          		<div class="form-group">
                   				 <label for="exampleInputEmail1">Post By</label>
                   				 <input type="text" class="form-control" id="blogtitle" placeholder="Mitashu"disabled>
                 			</div>
                		</div>
                		
                	</div>
                	
                	<div class="row">
                		<div class="col-md-6 col-sm-12">
			          		<div class="form-group">
                   				 <label for="exampleInputEmail1">Date Of Post</label>
                   				 <input type="text" class="form-control" id="blogtitle" placeholder="29/06/2020 04:11"disabled>
                 			</div>
                		</div>
                		<div class="col-md-6 col-sm-12">
                            <div class="form-group">
                   				 <label for="exampleInputEmail1">Enter Questions Number</label>
                   				 <input type="text" class="form-control" id="blogtitle" placeholder="Enter title"disabled>
                 			</div>
                		</div>
                	</div>
                	<div class="row">
                  		<div class="col-md-12 col-sm-12">
                            <div class="form-group">
                   				 <label for="exampleInputEmail1">Enter Question Here</label>
                   				 <input type="text" class="form-control" id="blogtitle" placeholder="Enter title"disabled>
                 			</div>
                		
                		</div>
                		
                	</div>
                	
                	<div class="row">
                  		<div class="col-md-6 col-sm-12">
                            <div class="form-group">
                   				 <label for="exampleInputEmail1">Enter Option A: </label>
                   				 <input type="text" class="form-control" id="blogtitle" placeholder="Enter title"disabled>
                 			</div>
                		</div>
                		<div class="col-md-6 col-sm-12">
			          		<div class="form-group">
                   				 <label for="exampleInputEmail1">Enter Option B: </label>
                   				 <input type="text" class="form-control" id="blogtitle" placeholder="Enter title"disabled>
                 			</div>
                		</div>
                		
                	</div>
                    <div class="row">
                  		<div class="col-md-6 col-sm-12">
                            <div class="form-group">
                   				 <label for="exampleInputEmail1">Enter Option C: </label>
                   				 <input type="text" class="form-control" id="blogtitle" placeholder="Enter title"disabled>
                 			</div>
                		</div>
                		<div class="col-md-6 col-sm-12">
			          		<div class="form-group">
                   				 <label for="exampleInputEmail1">Enter Option D: </label>
                   				 <input type="text" class="form-control" id="blogtitle" placeholder="Enter title"disabled>
                 			</div>
                		</div>
                		
                	</div>
                    <div class="row">
                  		<div class="col-md-6 col-sm-12">
                            <div class="form-group">
                   				 <label for="exampleInputEmail1">Enter Right Answer: </label>
                   				 <input type="text" class="form-control" id="blogtitle" placeholder="Enter title"disabled>
                 			</div>
                		</div>
                		<div class="col-md-6 col-sm-12">
			          		
                		</div>
                		
                	</div>
                	<div class="row">
                   
                      <div class="col-sm-6">
                      	<button type="button" class="btn btn-block btn-primary">Update</button>
                      	
                   	  </div>
                 	  <div class="col-sm-6">
                     	 <button type="button" class="btn btn-block btn-danger">Delete</button>
                     </div>
                    
                  </div>
                	
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


<script type="text/javascript">
$(document).ready(function () {
  bsCustomFileInput.init();
});
</script>

</body>
</html>