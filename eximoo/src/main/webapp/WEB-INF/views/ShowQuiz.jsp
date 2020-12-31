<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="icon" href="/eximoo/resources/dist/img/favicon.ico" type="image/x-icon"/>
<title>Eximoos's Quiz</title>
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
            <h1>Quiz List</h1>
          </div>
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="dashboard.jsp">Home</a></li>
              <li class="breadcrumb-item active">Show Quiz</li>
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
                <h3 class="card-title">Quiz List</h3>
              </div>
              <!-- /.card-header -->
              <div class="card-body">
                <form role="form">
                  <div class="row">
                   
                      <div class="col-sm-6">
                      	<div class="form-group">
		                        <label>Level</label>
		                        <input type="text" class="form-control" placeholder="Beginer" disabled >
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
                   
                      <div class="col-sm-6">
                      	<div class="form-group">
		                        <label>Date Of Post</label>
		                        <input type="text" class="form-control" placeholder="29/06/2020 03:17" disabled >
                      	</div>
                   	  </div>
                 	  <div class="col-sm-6">
                     	 <div class="form-group">
                       		 <label>Posted By</label>
                       		 <input type="text" class="form-control" placeholder="Mitashu" disabled>
                      	 </div>
                     </div>
                    
                  </div>
				  
				  <div class="row">
                  		<div class="col-md-12 col-sm-12">
                            <div class="form-group">
                   				 <label for="exampleInputEmail1">Question</label>
                   				 <input type="text" class="form-control" id="blogtitle" placeholder="Who Invented Java?"disabled>
                 			</div>
                		
                		</div>
                		
                	</div>
                    
                    <div class="row">
                  		<div class="col-md-6 col-sm-12">
                            <div class="form-group">
                   				 <label for="exampleInputEmail1">Option A: </label>
                   				 <input type="text" class="form-control" id="blogtitle" placeholder="Bill Gates"disabled>
                 			</div>
                		</div>
                		<div class="col-md-6 col-sm-12">
			          		<div class="form-group">
                   				 <label for="exampleInputEmail1">Option B: </label>
                   				 <input type="text" class="form-control" id="blogtitle" placeholder="James Gosling"disabled>
                 			</div>
                		</div>
                		
                	</div>
                    <div class="row">
                  		<div class="col-md-6 col-sm-12">
                            <div class="form-group">
                   				 <label for="exampleInputEmail1">Option C: </label>
                   				 <input type="text" class="form-control" id="blogtitle" placeholder="Steve Jobs"disabled>
                 			</div>
                		</div>
                		<div class="col-md-6 col-sm-12">
			          		<div class="form-group">
                   				 <label for="exampleInputEmail1">Option D: </label>
                   				 <input type="text" class="form-control" id="blogtitle" placeholder="Mark Zukerberg"disabled>
                 			</div>
                		</div>
                		
                	</div>
				  <div class="row">
                  		<div class="col-md-6 col-sm-12">
                            <div class="form-group">
                   				 <label for="exampleInputEmail1">Right Answer: </label>
                   				 <input type="text" class="form-control" id="blogtitle" placeholder="James Gosling"disabled>
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

<script type="text/javascript">
$(document).ready(function () {
  bsCustomFileInput.init();
});
</script>
</body>
</html>
