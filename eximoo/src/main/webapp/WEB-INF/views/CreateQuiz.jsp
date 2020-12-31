<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Create Quiz</title>
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
            <h1>Create Quiz</h1>
          </div>
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="dashboard.jsp">Home</a></li>
              <li class="breadcrumb-item active">Create Quiz</li>
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
                <h3 class="card-title">Quiz form</h3>
              </div>
              <!-- /.card-header -->
              <!-- form start -->
              <form:form action="/eximoo/admin/addQuizDetail" role="form" modelAttribute="detail">
               <form:hidden path="quizId" id="quizId" name="quizId" />
                <div class="card-body">
                 
                 
                 <div class="row">
                		<div class="col-md-6 col-sm-12">
			          		<div class="form-group">
			          	        <label>Level</label>
			            	      <form:select class="form-control select2bs4" path="level" id="level" style="width: 100%;">
			                	    <form:option value="101" selected="selected">Beginner</form:option>
			                    	<form:option value="102">Mediator</form:option>
			                    	<form:option value="103">Expert</form:option>
			                    	
			                  	  </form:select>
			                </div>
                		</div>
                		<div class="col-md-6 col-sm-12">
                            <div class="form-group">
			          	        <label>Language</label>
			            	      <form:select class="form-control select2bs4" path="quizLanguageId" >
                                   <c:forEach items="${languageList}" var="lang">
                                    <form:option value="${lang.languageId}">${lang.language}</form:option>
                                    </c:forEach>
                                 </form:select>
			                </div>
                		</div>
                	</div>
                 	<div class="row">
                  		<div class="col-md-6 col-sm-12">
                            <div class="form-group">
                   				 <label for="exampleInputEmail1">Title</label>
                   				 <form:input type="text" path="title" class="form-control" id="title" placeholder="Enter title"/>
                 			</div>
                		</div>
                		<div class="col-md-6 col-sm-12">
			          		<div class="form-group">
			          	        <label>Question Number</label>
			            	      <form:select class="form-control select2bs4" path="questionNumber" style="width: 100%;">
			                	    <form:option value="0" selected="selected">Click To Select</form:option>
			                    	<form:option value="10">10</form:option>
			                    	<form:option value="15">15</form:option>
			                    	<form:option value="20">20</form:option>
			                    	
			                    		
			                  	  </form:select>
			                </div>
                		</div>
                		
                	</div>
            		<div class="row">
                  		<div class="col-md-6 col-sm-12">
                            
                		</div>
                		<div class="col-md-6 col-sm-12">
			          		
                		</div>
                		</div>
                		
                	</div>
                </div>
                <!-- /.card-body -->

                <div class="card-footer">
                  <div class="card-footer">
                  <input type="submit" name="Submit" value="Submit" class="btn btn-primary">
                </div>
              </form:form>
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