<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Account Profile</title>
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
            <h1>Profile</h1>
          </div>
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="dashboard.jsp">Home</a></li>
              <li class="breadcrumb-item active">Profile</li>
            </ol>
          </div>
        </div>
      </div><!-- /.container-fluid -->
    </section>

    <!-- Main content -->
    <section class="content">
      <div class="container-fluid">
        <div class="row">
          <div class="col-md-12">

            <!-- Profile Image -->
            <div class="card card-primary card-outline">
              <div class="card-body box-profile">
                <div class="text-center">
                  <img class="profile-user-img img-fluid img-circle"
                       src="dist/img/mj.jpg"
                       alt="User profile picture">
                </div>

                <h3 class="profile-username text-center">Mitashu Patel</h3>

                <p class="text-muted text-center">CEO At EXIMOO</p>

                <div class="card-body">
                <div class="row">
                	<div class="col-sm-6">
                	<strong><i class="fas fa-book mr-1"></i> Name</strong>

                <p class="text-muted">
                  Mitashu Patel
                </p>
                	
                	</div>
                	<div class="col-sm-6">
                	 <strong><i class="fas fa-map-marker-alt mr-1"></i> Address</strong>

                <p class="text-muted">Arjanvav, Bayad</p>
                	</div>
                </div>
                <hr>
                <div class="row">
                	<div class="col-sm-6">
                	<strong><i class="fas fa-envelope-square mr-1"></i> Email</strong>

                <p class="text-muted">mitashujpatel@gmail.com</p>
                	</div>
                	<div class="col-sm-6">
                	<strong><i class="fas fa-phone-square-alt mr-1"></i> Phone</strong>

                <p class="text-muted">9409153856</p>
                	</div>
                </div>
              

                <hr>
				<div class="row">
                	<div class="col-sm-6">
                	<strong><i class="fas fa-clock mr-1"></i> Birth Date</strong>

                <p class="text-muted">17/07/1999</p>
                	</div>
                	<div class="col-sm-6">
                	<strong><i class="fas fa-user-circle mr-1"></i> Account Type</strong>

                <p class="text-muted">Admin</p>
                	</div>
                </div>
               
				<hr>
                
                <div class="row">
                   
                      <div class="col-sm-5">
                      	
                      	
                   	  </div>
                 	  <div class="col-sm-2">
                     	 <button type="button" class="btn btn-block btn-primary">Update</button>
                     </div>
                     <div class="col-sm-5">
                     	 
                     </div>
                    
                    
                  </div>
                
                
                
                
              </div>
              <!-- /.card-body -->
                
                
                
                
                
              </div>
              <!-- /.card-body -->
            </div>
            <!-- /.card -->

          </div>
          <!-- /.col -->
          
        </div>
        <!-- /.row -->
      </div><!-- /.container-fluid -->
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->



</body>
</html>