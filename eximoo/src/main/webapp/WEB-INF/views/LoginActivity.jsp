<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Activity Log</title>
  <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/dt/dt-1.10.21/datatables.min.css"/>
 <link rel="icon" href="/eximoo/resources/dist/img/favicon.ico" type="image/x-icon"/>
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
            <h1>Activity Log</h1>
          </div>
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="dashboard.jsp">Home</a></li>
              <li class="breadcrumb-item active">Activity Log</li>
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
                <h3 class="card-title">History</h3>
              </div>
              <!-- /.card-header -->
              <div class="card-body">
                <table  id="datatable" class="table table-bordered table-hover">
           
            <thead>
                  <tr>
                    <th>UserName</th>
                    <th>IP</th>
                    <th>Device</th>
                    <th>Date</th>
                    <th>Time</th>

                  </tr>
                  </thead>
            <tbody>
                  <tr>
                    <td>Mitashu</td>
                    <td>192.168.0.1</td>
                    <td>Lennovo 9QRSN2000</td>
                    <td>29/06/2020</td>
                    <td>06:59</td>

                  </tr>
                  <tr>
                    <td>Mitashu</td>
                    <td>192.168.0.1</td>
                    <td>Samsung Phone</td>
                    <td>29/06/2020</td>
                    <td>07:00</td>

                  </tr>
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


<!-- DataTables -->
<script src="/eximoo/resources/plugins/datatables/jquery.dataTables.min.js"></script>
<script src="/eximoo/resources/plugins/datatables-bs4/js/dataTables.bootstrap4.min.js"></script>
<script src="/eximoo/resources/plugins/datatables-responsive/js/dataTables.responsive.min.js"></script>
<script src="/eximoo/resources/plugins/datatables-responsive/js/responsive.bootstrap4.min.js"></script>

<!-- page script -->
<script src="https://unpkg.com/jquery@3.3.1/dist/jquery.min.js" ></script>
<script type="text/javascript" src="https://cdn.datatables.net/v/dt/dt-1.10.21/datatables.min.js"></script>

<script>
	$(document).ready(function(){
	$("#datatable").DataTable({
	      "responsive": true,
	      "autoWidth": false,
	    });
		})
</script>




</body>
</html>