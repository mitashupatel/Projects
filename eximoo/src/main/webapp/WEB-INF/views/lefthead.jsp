<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Eximooo | Dashboard</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta name="viewport" content="width=device-width, initial-scale=1">
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
<body class="hold-transition sidebar-mini layout-fixed">
<div class="wrapper">

  <!-- Navbar -->
  <nav class="main-header navbar navbar-expand navbar-white navbar-light">
    <!-- Left navbar links -->
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" data-widget="pushmenu" href="#" role="button"><i class="fas fa-bars"></i></a>
      </li>
      <li class="nav-item d-none d-sm-inline-block">
        <a href="/eximoo/admin/dashboard" class="nav-link">Home</a>
      </li>
      <li class="nav-item d-none d-sm-inline-block">
        <a href="#" class="nav-link">Contact</a>
      </li>
    </ul>

    <!-- SEARCH FORM -->
    <form class="form-inline ml-3">
      <div class="input-group input-group-sm">
        <input class="form-control form-control-navbar" type="search" placeholder="Search" aria-label="Search">
        <div class="input-group-append">
          <button class="btn btn-navbar" type="submit">
            <i class="fas fa-search"></i>
          </button>
        </div>
      </div>
    </form>

    <!-- Right navbar links -->
    <ul class="navbar-nav ml-auto">
      <!-- Messages Dropdown Menu -->
      <li class="nav-item dropdown">
        <a class="nav-link" data-toggle="dropdown" href="#">
          <i class="far fa-comments"></i>
          <span class="badge badge-danger navbar-badge">3</span>
        </a>
        <div class="dropdown-menu dropdown-menu-lg dropdown-menu-right">
          <a href="#" class="dropdown-item">
            <!-- Message Start -->
            <div class="media">
              <img src="/eximoo/resources/dist/img/mj.jpg" alt="User Avatar" class="img-size-50 mr-3 img-circle">
              <div class="media-body">
                <h3 class="dropdown-item-title">
                  Mitashu Patel
                  <span class="float-right text-sm text-danger"><i class="fas fa-star"></i></span>
                </h3>
                <p class="text-sm">Call me whenever you can...</p>
                <p class="text-sm text-muted"><i class="far fa-clock mr-1"></i> 4 Hours Ago</p>
              </div>
            </div>
            <!-- Message End -->
          </a>
          <div class="dropdown-divider"></div>
          <a href="#" class="dropdown-item">
            <!-- Message Start -->
            <div class="media">
              <img src="/eximoo/resources/dist/img/j.jpg" alt="User Avatar" class="img-size-50 img-circle mr-3">
              <div class="media-body">
                <h3 class="dropdown-item-title">
                  Jainee Dave
                  <span class="float-right text-sm text-muted"><i class="fas fa-star"></i></span>
                </h3>
                <p class="text-sm">I got your message bro</p>
                <p class="text-sm text-muted"><i class="far fa-clock mr-1"></i> 4 Hours Ago</p>
              </div>
            </div>
            <!-- Message End -->
          </a>
          <div class="dropdown-divider"></div>
          <a href="#" class="dropdown-item">
            <!-- Message Start -->
            <div class="media">
              <img src="/eximoo/resources/dist/img/h.jpg" alt="User Avatar" class="img-size-50 img-circle mr-3">
              <div class="media-body">
                <h3 class="dropdown-item-title">
                  Hariom Vyas
                  <span class="float-right text-sm text-warning"><i class="fas fa-star"></i></span>
                </h3>
                <p class="text-sm">The subject goes here</p>
                <p class="text-sm text-muted"><i class="far fa-clock mr-1"></i> 4 Hours Ago</p>
              </div>
            </div>
            <!-- Message End -->
          </a>
          <div class="dropdown-divider"></div>
          <a href="#" class="dropdown-item dropdown-footer">See All Messages</a>
        </div>
      </li>
      <!-- Notifications Dropdown Menu -->
      
      <li class="nav-item">
      		<a href="/eximoo/admin/profile" class="nav-link">
              <i style="color:blue;" class="nav-icon fas fa-user-circle"></i>
              
            </a>
      </li>
      
    </ul>
  </nav>
  <!-- /.navbar -->

  <!-- Main Sidebar Container -->
  <aside class="main-sidebar sidebar-dark-primary elevation-4">
    <!-- Brand Logo -->
    <a href="/eximoo/admin/dashboard" class="brand-link">
      <img src="/eximoo/resources/dist/img/1.jpg" alt="AdminLTE Logo" class="brand-image img-circle elevation-3"
           style="opacity: .8">
      <span class="brand-text font-weight-light">Eximooo</span>
    </a>

    <!-- Sidebar -->
    <div class="sidebar">
      <!-- Sidebar user panel (optional) -->
      <div class="user-panel mt-3 pb-3 mb-3 d-flex">
        <div class="image">
          <img src="/eximoo/resources/dist/img/mj.jpg" class="img-circle elevation-2" alt="User Image">
        </div>
        <div class="info">
          <a href="#" class="d-block">Mitashu Patel</a>
          <a href="/eximoo/admin/adminLogout" class="d-block"><i class="fas fa-sign-out-alt"></i></a>
          
          
          
        </div>
      </div>

      <!-- Sidebar Menu -->
      <nav class="mt-2">
        <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
          <!-- Add icons to the links using the .nav-icon class
               with font-awesome or any other icon font library -->
          
           <li class="nav-item">
            <a href="/eximoo/admin/dashboard" class="nav-link">
              <i class="nav-icon fas fa-tachometer-alt"></i>
              <p>
                Dashboard
                
              </p>
            </a>
          </li>
          
          <li class="nav-item has-treeview menu">
            <a href="#" class="nav-link active">
              <i class="nav-icon fas fa-tools" ></i>
              <p>
                 Master
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="/eximoo/admin/showLanguage" class="nav-link active">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Language Master</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="/eximoo/admin/contactList" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Contacts List</p>
                </a>
              </li>
               <li class="nav-item">
                <a href="/eximoo/admin/feedbackList" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>FeedBack List</p>
                </a>
              </li>
            </ul>
          </li>
          
                    
          <li class="nav-item has-treeview menu">
            <a href="#" class="nav-link active">
              <i class="nav-icon fas fa-users-cog"></i>
              <p>
                Admin
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="/eximoo/admin/addAdminpage" class="nav-link active">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Add Admin</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="/eximoo/admin/adminList" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Admin List</p>
                </a>
              </li>
              
            </ul>
          </li>
          <li class="nav-item has-treeview menu">
            <a href="#" class="nav-link active">
              <i class="nav-icon fas fa-users"></i>
              <p>
                User
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="/eximoo/admin/showadduser" class="nav-link active">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Add User</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="/eximoo/admin/userList" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>User List</p>
                </a>
              </li>
              
            </ul>
          </li>
          <li class="nav-item has-treeview menu">
            <a href="#" class="nav-link active">
              <i class="nav-icon fas fa-user-graduate"></i>
              <p>
                Blogs
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="/eximoo/admin/addBlogPage" class="nav-link active">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Add Blog</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="/eximoo/admin/blogList" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Show Added Blogs</p>
                </a>
              </li>
              
            </ul>
          </li>
          
          
          <li class="nav-item has-treeview menu">
            <a href="#" class="nav-link active">
              <i class="nav-icon fas fa-ad"></i>
              <p>
                Advertisement
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="/eximoo/admin/addAdspage" class="nav-link active">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Add ads</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="/eximoo/admin/advertisementList" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Show Ads</p>
                </a>
              </li>
              
            </ul>
          </li>
          <li class="nav-item has-treeview menu">
            <a href="#" class="nav-link active">
              <i class="nav-icon fas fa-university"></i>
              <p>
                Eximoo's Quiz
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="/eximoo/admin/createquiz" class="nav-link active">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Create Quiz</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="/eximoo/admin/showquiz" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Quiz Check</p>
                </a>
              </li>
              
            </ul>
          </li>
          
          <li class="nav-item has-treeview menu">
            <a href="#" class="nav-link active">
              <i class="nav-icon fas fa-building"></i>
              <p>
                Custom Quiz
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="/eximoo/admin/createcustomquiz" class="nav-link active">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Create Quiz</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="/eximoo/admin/showcustomquiz" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Quiz Check</p>
                </a>
              </li>
              
            </ul>
          </li>
          <li class="nav-item has-treeview ">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-people-arrows"></i>
              <p>
                Community 
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              
              <li class="nav-item">
                <a href="/eximoo/admin/communitylist" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Question & Answeres</p>
                </a>
              </li>
              
            </ul>
          </li>
          <li class="nav-item has-treeview ">
            <a href="#" class="nav-link ">
              <i class="nav-icon fas fa-history"></i>
              <p>
                Activity Log
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
             
              <li class="nav-item">
                <a href="/eximoo/admin/loginactivity" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Activity History</p>
                </a>
              </li>
              
            </ul>
          </li>
          <li class="nav-item has-treeview ">
            <a href="#" class="nav-link">
              <i class="nav-icon far fa-newspaper"></i>
              <p>
                News Letter
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              
              <li class="nav-item">
                <a href="/eximoo/admin/newsletterPage" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Show & Add Subscriber</p>
                </a>
              </li>
              
            </ul>
            <ul class="nav nav-treeview">
              
              <li class="nav-item">
                <a href="/eximoo/admin/newslettersend" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Send NewsLetter</p>
                </a>
              </li>
              
            </ul>
          </li>
        </ul>
      </nav>
      <!-- /.sidebar-menu -->
    </div>
    <!-- /.sidebar -->
  </aside>
   <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
    <!-- Control sidebar content goes here -->
  </aside>
  <!-- /.control-sidebar -->
</div>
<!-- ./wrapper -->




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
  