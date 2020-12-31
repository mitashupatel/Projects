<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Create Blog</title>
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
            <h1>Add Blog</h1>
          </div>
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="dashboard.jsp">Home</a></li>
              <li class="breadcrumb-item active">Blog</li>
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
                <h3 class="card-title">Add Blog</h3>
              </div>
              <!-- /.card-header -->
              <!-- form start -->
              <form:form action="/eximoo/admin/addBlog"  method="post" role="form" 
                      modelAttribute="blog" enctype="multipart/form-data">
               <form:hidden path="blogId" id="blogId" name="blogId" />
                <div class="card-body">
                	<div class="row">
                		<div class="col-md-6 col-sm-12">
			          		<div class="form-group">
			          	        <label>Language</label>
			          	         <form:select class="form-control select2bs4" path="blogLanguage" >
                                   <c:forEach items="${languageList}" var="lang">
                                    <form:option value="${lang.languageId}">${lang.language}</form:option>
                                    </c:forEach>
                                 </form:select>
			            	      
			            	     <%--  <form:select class="form-control select2bs4" name="blogLanguage" id="blogLanguage" path="blogLanguage" style="width: 100%;">
			                	    <form:option value="JAVA" selected="selected">JAVA</form:option>
			                    	<form:option value="PYTHON">PYTHON</form:option>
			                    	<form:option value="PHP">PHP</form:option>
			                    	<form:option value="JAVASCRIPT">JAVASCRIPT</form:option>
			                    	<form:option value="HTML">HTML</form:option>
			                    	<form:option value="JQUERY">JQUERY</form:option>
			                    
			                    	
			                  	  </form:select> --%>
			            	      
			            	      
			                </div>
                		</div>
                		<div class="col-md-6 col-sm-12">
                            <div class="form-group">
                   				 <label for="exampleInputEmail1">Title</label>
                   				 
                   				 <form:input class="form-control" path="title" id="title" type="text" name="title" placeholder="Enter Title Name"/>
                 			</div>
                		</div>
                	</div>
                	<div class="row ">
                	<form:textarea class="ckeditor" name="blogContent" path="blogContent" id="blogContent"/>
                	
					</div>
                  	<div class="row">
                		<div class="col-sm-6">
						      <div class="form-group">
			                    <label for="exampleInputFile">Image 1</label>
			                    <div class="input-group">
			                      <div class="custom-file">
			                        <input type="file" class="custom-file-input" id="exampleInputFile" name="photo1">
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
			                    <label for="exampleInputFile">Image 2</label>
			                    <div class="input-group">
			                      <div class="custom-file">
			                        <input type="file" class="custom-file-input" id="exampleInputFile" name="photo2">
			                        <label class="custom-file-label" for="exampleInputFile">Choose file</label>
			                      </div>
			                      <div class="input-group-append">
			                        <span class="input-group-text" id="">Upload</span>
			                      </div>
			                    </div>
			                  </div>
                		</div>
                	</div>
                  </div>
                  
          
                <div class="card-footer">
                  <button type="submit" name="submit" value="submit" class="btn btn-primary">Submit</button>
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
<script src="//cdn.ckeditor.com/4.14.1/full/ckeditor.js"></script>


<script type="text/javascript">
$(document).ready(function () {
  bsCustomFileInput.init();
});
</script>

</body>
</html>