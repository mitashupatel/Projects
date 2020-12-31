<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Ads List</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href="/eximoo/resources/dist/img/favicon.ico" type="image/x-icon"/>
  <!-- Font Awesome -->
  <link rel="stylesheet" href="/eximoo/resources/plugins/fontawesome-free/css/all.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
  <!-- overlayScrollbars -->
  <link rel="stylesheet" href="/eximoo/resources/dist/css/adminlte.min.css">
  <link rel="stylesheet" href="/eximoo/resources/dist/css/style.css">
    <!-- DataTables -->
  <link rel="stylesheet" href="/eximoo/resources/plugins/datatables-bs4/css/dataTables.bootstrap4.min.css">
  <link rel="stylesheet" href="/eximoo/resources/plugins/datatables-responsive/css/responsive.bootstrap4.min.css">
  <!-- Theme style -->

<link rel="icon" href="/eximoo/resources/dist/img/favicon.ico" type="image/x-icon"/>
<link rel="stylesheet" href="/eximoo/resources/dist/css/style.css">
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
                  
                  
                  <table  id="datatable" class="table table-bordered table-hover">
           
            <thead class="tabledata">
                  <tr>
                    <th>Id</th>
                    <th>Title</th>
                    <th>Adphoto</th>
                    <th>Img Alt</th>
                    <th>url</th>
                    <th>Date</th>
                    <th>Update</th>
                    
                  </tr>
                  </thead>
            <tbody>
                  
                  <c:forEach var="admin" items="${advertisementList}">
                <tr>
                    <td><c:out value="${admin.advertisementId}" /></td>
                    <td><c:out value="${admin.title}" /></td>
                    <td> <a href="http://${admin.url}" target="_blank"><img class="adphoto" src="/eximoo/resources/images/advertisement/${admin.adphoto}" width="240px" height="160px" alt="people"> </a></td>
                    <td><c:out value="${admin.imgalt}" /></td>
                    <td><c:out value="${admin.url}" /></td>
                    <td><c:out value="${admin.date}" /></td>
                   
                    <td>
                        <a href="/eximoo/admin/editAdvertisement/${admin.advertisementId}"><i class="fas fa-pen-square"></i></a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="/eximoo/admin/deleteAdvertisement/${admin.advertisementId}"><i class="fas fa-trash"></i></a>                     
                    </td>
                </tr>
            </c:forEach>
                  </tbody>
        </table>
                  
                  
                  
                  
                  
                </div>
                
              </div>
            </div>


    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->

<script src="/eximoo/resources/plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="/eximoo/resources/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- DataTables -->
<script src="/eximoo/resources/plugins/datatables/jquery.dataTables.min.js"></script>
<script src="/eximoo/resources/plugins/datatables-bs4/js/dataTables.bootstrap4.min.js"></script>
<script src="/eximoo/resources/plugins/datatables-responsive/js/dataTables.responsive.min.js"></script>
<script src="/eximoo/resources/plugins/datatables-responsive/js/responsive.bootstrap4.min.js"></script>

<script>
  $(function () {
      $('#datatable').DataTable({
      "paging": true,
      "lengthChange": true,
      "searching": true,
      "ordering": true,
      "info": true,
      "autoWidth": false,
      "responsive": true,
    });
  });
</script>



</body>
</html>