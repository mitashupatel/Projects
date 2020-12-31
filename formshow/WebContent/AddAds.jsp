<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Admin SignUp</title>
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
            <h1>Add Advertisement</h1>
          </div>
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="dashboard.jsp">Home</a></li>
              <li class="breadcrumb-item active">Add Ads</li>
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
                <h3 class="card-title">Advertisement form</h3>
              </div>
              <!-- /.card-header -->
              <!-- form start -->
              <form role="form">
                <div class="card-body">
                <div class="row">
                	<div class="col-sm-6">
                		<div class="form-group">
                        <label>Company Id</label>
                        <input type="text" class="form-control" placeholder="01" disabled="">
                  </div>
                	</div>
                	<div class="col-sm-6">
                		<div class="form-group">
                   			 <label for="">Title Name</label>
                    		<input type="text" class="form-control" id="" placeholder="Enter Title Of Ad">
                  		</div>
                	</div>
                </div>
                <div class="row">
                	<div class="col-sm-6">
                		<div class="form-group">
                   			 <label for="exampleInputFile">Ad Photo</label>
                   			 <div class="input-group">
                     		 <div class="custom-file">
                      		  <input type="file" class="custom-file-input" id="exampleInputFile">
                       		 <label class="custom-file-label" for="exampleInputFile">Choose file</label>
                     		 </div>
                      			<div class="input-group-append">
                        		<span class="input-group-text" id="">Upload</span>
                      	</div>
                    </div>
                  </div>
                	</div>
                	<div class="col-sm-6">
                		<div class="form-group">
                    <label for="">Img-Alt</label>
                    <input type="text" class="form-control" id="" placeholder="Enter Img_alt">
                  </div>
                	</div>
                </div>
                <div class="row">
                	<div class="col-sm-6">
                	<div class="form-group">
                    <label for="">URL for Hyperlink</label>
                    <input type="text" class="form-control" id="" placeholder="Enter Url">
                  </div>
                	</div>
                	<div class="col-sm-6">
                	 <div class="form-group">
                  <label>Date To Post Ad</label>
                    <div class="input-group date" id="reservationdate" data-target-input="nearest">
                        <input type="text" class="form-control datetimepicker-input" data-target="#reservationdate">
                        <div class="input-group-append" data-target="#reservationdate" data-toggle="datetimepicker">
                            <div class="input-group-text"><i class="fa fa-calendar"></i></div>
                        </div>
                    </div>
                  </div>
                	</div>
                </div>

                  <div class="form-check">
                    <input type="checkbox" class="form-check-input" id="exampleCheck1">
                    <label class="form-check-label" for="exampleCheck1">Agree Terms & Conditions</label>
                  </div>
                </div>
                <!-- /.card-body -->

                <div class="card-footer">
                  <button type="submit" class="btn btn-primary">Submit</button>
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