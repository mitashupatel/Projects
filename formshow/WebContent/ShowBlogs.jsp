<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="icon" href="dist/img/favicon.ico" type="image/x-icon"/>
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
            <h1>General Form</h1>
          </div>
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="dashboard.jsp">Home</a></li>
              <li class="breadcrumb-item active">General Form</li>
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
            <!-- general form elements disabled -->
            <div class="card card-warning">
              <div class="card-header">
                <h3 class="card-title">Blogs</h3>
              </div>
              <!-- /.card-header -->
              <div class="card-body">
                <form role="form">
                  <div class="row">
                   
                      <div class="col-sm-6">
                      	<div class="form-group">
		                        <label>Language</label>
		                        <input type="text" class="form-control" placeholder="JAVA" disabled>
                      	</div>
                   	  </div>
                 	  <div class="col-sm-6">
                     	 <div class="form-group">
                       		 <label>Title</label>
                       		 <input type="text" class="form-control" placeholder="Encaptulation" disabled>
                      	 </div>
                     </div>
                    
                  </div>
                  <div class="row">
                  		<div class=col-md-12"">
                			<textarea class="ckeditor" name="editor"></textarea></td>
						</div>
                  </div>
                  <div class="row">
                   
                      <div class="col-sm-6">
                      	<div class="form-group">
		                        <label>Date Of Post</label>
		                        <input type="text" class="form-control" placeholder="JAVA" >
                      	</div>
                   	  </div>
                 	  <div class="col-sm-6">
                     	 <div class="form-group">
                       		 <label>Posted By</label>
                       		 <input type="text" class="form-control" placeholder="Mitashu" >
                      	 </div>
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
              <!-- /.card-body -->
            </div>
            <!-- /.card -->
            
          </div>
          <!--/.col (right) -->
        </div>
        <!-- /.row -->
      </div><!-- /.container-fluid -->
    </section>
    <!-- /.content -->
  </div>
 

<script src="//cdn.ckeditor.com/4.14.1/full/ckeditor.js"></script>
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
