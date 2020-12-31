<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-compatible" content="IE-edge">
	<meta name="viewport" content="width-device-width, initial-scale=1">
	<title>MITASHU J PATEL</title>
 
	
	<link href="https://fonts.googleapis.com/css?family=Satisfy&display=swap" rel="stylesheet">
	<link rel="stylesheet" href="/portfolio/resources/img/about.css"/>
	<link rel="stylesheet" href="/portfolio/resources/css/mystyle.css"/>
	<link rel="stylesheet" href="/portfolio/resources/css/bootstrap.css"/>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css"/>



</head>
<body>





<div class="container-fluid top_bar">
			<div class="container" >
				<div class="row">
					<div class="col-sm-3">
					
						<a href="#" class="social_icons"><i class="fa fa-facebook" style="font-size:20px; color:#fff;"></i> </a>
						<a href="#" class="social_icons"><i class="fa fa-twitter" style="font-size:20px; color:#fff;"></i> </a>
						<a href="#" class="social_icons"><i class="fa fa-youtube" style="font-size:20px; color:#fff;"></i> </a>
						<a href="#" class="social_icons"><i class="fa fa-linkedin" style="font-size:20px; color:#fff;"></i> </a>
						<a href="#" class="social_icons"><i class="fa fa-instagram" style="font-size:20px; color:#fff;"></i> </a>
					</div>
										<div class="col-sm-2"></div>
										<div class="col-sm-7 my_menu">
											
											<nav class="navbar navbar-default">
		<div class="navbar-header">
		<button type="button"  class="navbar-toggle" data-toggle="collapse" data-target="#mynavbar">
		<span class="icon-bar"></span>
		<span class="icon-bar"></span>
		<span class="icon-bar"></span>
		</button>
		</div>
		
										<div class="collapse navbar-collapse" id="mynavbar">
										
										<ul class="nav navbar-nav pull-right ">
												<li class="active"><a href="#">Home</a></li>
												<li ><a href="/portfolio/user/galleryPage">Gallery</a></li>
												
												<li ><a href="">Contact</a></li>
											</ul>
											</div>
										</nav>	
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		
		<br><br><br><br>
		
		<div class="container-fluid">
				<div class="row">
					<div class="col-sm-2">
					</div>
					
					<div class="col-sm-3">
						<img class="img-responsive " src="/portfolio/resources/img/120.jpeg" >
					</div>
					
					<div class="col-sm-6">
					<p class="hi1"> &nbsp &nbsp &nbsp  &nbsp &nbsp Hi!</p>
					<p> I Am Mitashu J Patel</p>
					<p> Web Designer,</p>
					<p>Graphic Designer, </p>
					<p>Photographer,  </p>
					<p> Gamer and the</p> 
					<p>CEO & Co-Founder Of C & C Explorer. </p> 
					 </div>
				</div>
			</div>
		
		
			<br><br><br><br>
<br><br><br><br><br><br><br><br><br><br>
		
		
			<div class="container-fluid">
	

	<div class="row hey">
		<div class="col-sm-6"></div>
			
       
       <div class="col-sm-6">
	   <h1 class="h1style">Contact form</h1>
	<hr>
	<div class="contact-form">
       	<form:form action="/portfolio/user/addUser" method="post" modelAttribute="user">
         <div class="form-group">
         	<label>Name</label>
         	
         	<form:input path="name" id="name" type="text" name="name" placeholder="Enter Your Name:" class="form-control"/>
         </div>

         <div class="form-group">
         	<label>Email</label>
         	
         	<form:input path="email" id="email" type="text" name="email" placeholder="Enter Your Email:" class="form-control"/>
         </div>

         <div class="form-group">
         	<label>Massage</label>
         
         	<form:input path="message" id="message" type="text" name="message" placeholder="Enter Your Message:" class="form-control"/>
         </div>

         <div class="form-group">
         	<input type="submit" value="Submit" class="submit" id="submit" name="submit" class="btn btn-primary btn-block" />
         	
         </div>
		</form:form>
       </div>

   	 </div>

	</div>
		
		</div>

		
		<div class="container-fluid footer"> 
		<div class="container">
		<div class="col-sm-2"></div>
		<div class="col-sm-8 text-center"> <h4>&copy;2019 Mitashu Patel Photography. Images may be subject to copyright </h4></div>
		<div class="col-sm-2"></div>
		</div>
		</div>
				
	<script type="text/javascript" src="/portfolio/resources/js/jquery.js"></script>
	<script type="text/javascript" src="/portfolio/resources/js/bootstrap.js"></script>
</body>
</html>