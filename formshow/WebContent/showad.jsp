<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Ads List</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href="dist/img/favicon.ico" type="image/x-icon"/>
  <!-- Font Awesome -->
  <link rel="stylesheet" href="../../plugins/fontawesome-free/css/all.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
  <!-- overlayScrollbars -->
  <link rel="stylesheet" href="../../dist/css/adminlte.min.css">
  <link rel="stylesheet" href="dist/css/style.css">
  
  <!-- Google Font: Source Sans Pro -->
  <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
<body>
<%@ include file="lefthead.jsp" %>



 <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h1>Registered Ads</h1>
          </div>
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="dashboard.jsp">Home</a></li>
              <li class="breadcrumb-item active">Advertisement</li>
            </ol>
          </div>
        </div>
      </div><!-- /.container-fluid -->
    </section>

    <!-- Main content -->
    <section class="content">

      <!-- Default box -->
      <div class="card card-solid">
        <div class="card-body pb-0">
          <div class="row d-flex ">
            <div class="col-12 col-sm-12 col-md-12 d-flex align-items-stretch">
              <div class="card bg-light cs-card">
                <div class="card-header text-muted border-bottom-0">
                  Your Ads
                </div>
                <div class="card-body pt-0 cs-harsh">
                  <div class="row">
                    <div class="col-7">
                      <h2 class="lead"><b>Shiva's Yoga</b></h2>
                      <p class="text-muted text-sm"><b>Img Alt: </b> Jainee Dave</p>
                      <ul class="ml-4 mb-0 fa-ul text-muted">
                        <li class="small"><span class="fa-li"><i class="fas fa-link"></i></span>https://shivasyoga.com</li>
                        <li class="small"><span class="fa-li"><i class="far fa-clock"></i></span>08/07/2019</li>
                      </ul>
                    </div>
                    <div class="col-5 text-center">
                      <img src="dist/img/shivasyoga.jpg" alt="" class="w-100 img-fluid">
                    
                    </div>
                    <hr>
                  </div>
                  
                </div>
                <div class="card-body pt-0 cs-harsh">
                  <div class="row">
                    <div class="col-7">
                      <h2 class="lead"><b>Mark 42 Gaming</b></h2>
                      <p class="text-muted text-sm"><b>Img Alt: </b> Mitashu Patel</p>
                      <ul class="ml-4 mb-0 fa-ul text-muted">
                        <li class="small"><span class="fa-li"><i class="fas fa-link"></i></span>http://mitashupatel.cu.ma</li>
                        <li class="small"><span class="fa-li"><i class="far fa-clock"></i></span>30/06/2019</li>
                      </ul>
                    </div>
                    <div class="col-5 text-center">
                      <img src="dist/img/mark42.png" alt="" class="w-100 img-fluid">
                    </div>
                  </div>
                  
                </div>
              </div>
            </div>


    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->

<!-- jQuery -->
<script src="../../plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="../../plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- AdminLTE App -->
<script src="../../dist/js/adminlte.min.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="../../dist/js/demo.js"></script>



</body>
</html>