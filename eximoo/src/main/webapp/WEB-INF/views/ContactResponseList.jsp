<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contacts List</title>
  <!-- DataTables -->
  <link rel="stylesheet" href="/eximoo/resources/plugins/datatables-bs4/css/dataTables.bootstrap4.min.css">
  <link rel="stylesheet" href="/eximoo/resources/plugins/datatables-responsive/css/responsive.bootstrap4.min.css">
  <!-- Theme style -->

<link rel="icon" href="/eximoo/resources/dist/img/favicon.ico" type="image/x-icon"/>
<link rel="stylesheet" href="/eximoo/resources/dist/css/style.css">
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
            <h1>Contacts</h1>
          </div>
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="dashboard.jsp">Home</a></li>
              <li class="breadcrumb-item active">Contacts List</li>
            </ol>
          </div>
        </div>
      </div><!-- /.container-fluid -->
    </section>

    <!-- Main content -->
    <section class="content">
      <div class="container-fluid">
        <div class="row">
          <div class="col-sm-12">
            <div class="card">
              <div class="card-header">
                <h3 class="card-title">Data</h3>
              </div>
              <!-- /.card-header -->
              <div class="card-body">
                <table  id="datatable" class="table table-bordered table-hover">
           
            <thead class="tabledata">
                  <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Message</th>
                   </tr>
                  </thead>
            <tbody>
                  
                  <c:forEach var="contact" items="${contactList}">
                <tr>
                    <td><c:out value="${contact.contactId}" /></td>
                    <td><c:out value="${contact.name}" /></td>
                    <td><c:out value="${contact.email}" /></td>
                    <td><c:out value="${contact.message}" /></td>
                   
                </tr>
            </c:forEach>
                  </tbody>
        </table>
              </div>
              <!-- /.card-body -->
            </div>
            <!-- /.card -->

            
          </div>
          <!-- /.col -->
        </div>
        <!-- /.row -->
      </div>
      <!-- /.container-fluid -->
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