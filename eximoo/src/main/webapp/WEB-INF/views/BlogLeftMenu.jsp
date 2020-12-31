<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="/eximoo/resources/assets/css/blogsidebar.css">
      
</head>
<body>
<div class="wrapper">
        <!-- Sidebar -->

        <nav id="sidebar">
            <div class="sidebar-header">
                <h6 class="blogtitle">Blogs List</h6>
            </div>

            <ul class="list-unstyled components">
                
                <li class="active">
                    <a href="#javamenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Java</a>
                    <ul class="collapse list-unstyled" id="javamenu">
                        <li>
                            <a href="#">Oops Concept</a>
                        </li>
                        <li>
                            <a href="#">Encaptulation</a>
                        </li>
                        <li>
                            <a href="#">Inheritance</a>
                        </li>
                        <li>
                            <a href="#">Objects</a>
                        </li>
                    </ul>
                </li>
                <li class="active">
                    <a href="#pythonmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Python</a>
                    <ul class="collapse list-unstyled" id="pythonmenu">
                        <li>
                            <a href="#">Basics Of Python</a>
                        </li>
                        <li>
                            <a href="#">Indenting</a>
                        </li>
                        <li>
                            <a href="#">AI with Python</a>
                        </li>
                        <li>
                            <a href="#">Objects</a>
                        </li>
                    </ul>
                </li>
                <li class="active">
                    <a href="#homeSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Html</a>
                    <ul class="collapse list-unstyled" id="homeSubmenu">
                        <li>
                            <a href="#">HTML tags</a>
                        </li>
                        <li>
                            <a href="#">Advance Tags</a>
                        </li>
                       
                    </ul>
                </li>
                <li class="active">
                    <a href="#homeSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Html</a>
                    <ul class="collapse list-unstyled" id="homeSubmenu">
                        <li>
                            <a href="#">HTML tags</a>
                        </li>
                        <li>
                            <a href="#">Advance Tags</a>
                        </li>
                       
                    </ul>
                </li>
                <li class="active">
                    <a href="#homeSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Html</a>
                    <ul class="collapse list-unstyled" id="homeSubmenu">
                        <li>
                            <a href="#">HTML tags</a>
                        </li>
                        <li>
                            <a href="#">Advance Tags</a>
                        </li>
                       
                    </ul>
                </li>
                <li class="active">
                    <a href="#homeSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Java</a>
                    <ul class="collapse list-unstyled" id="homeSubmenu">
                        <li>
                            <a href="#">Oops Concept</a>
                        </li>
                        <li>
                            <a href="#">Encaptulation</a>
                        </li>
                        <li>
                            <a href="#">Inheritance</a>
                        </li>
                        <li>
                            <a href="#">Objects</a>
                        </li>
                    </ul>
                </li>
                <li class="active">
                    <a href="#homeSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">CSS</a>
                    <ul class="collapse list-unstyled" id="homeSubmenu">
                        <li>
                            <a href="#">Types Of CSS</a>
                        </li>
                        <li>
                            <a href="#">Styling</a>
                        </li>
                        <li>
                            <a href="#">CSS using media Query</a>
                        </li>
                        
                    </ul>
                </li>
                <li>
                    <a href="#pageSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">JavaScript</a>
                    <ul class="collapse list-unstyled" id="pageSubmenu">
                        <li>
                            <a href="#">Basic Of JS</a>
                        </li>
                        <li>
                            <a href="#">AJAX</a>
                        </li>
                        <li>
                            <a href="#">Advanced JS</a>
                        </li>
                    </ul>
                </li>
                
            </ul>
        </nav>
        <div class="wrapper">
            <!-- Sidebar -->
            <div id="content">
                <nav class="navbar navbar-expand-lg navbar">
                    <div class="container-fluid">

                        <button type="button" id="sidebarCollapse" class="btn btn-info">
                            <i class="fas fa-align-left"></i>
                            <span></span>
                        </button>

                    </div>
                </nav>
            </div>
			
    	</div>
   <script>
$(document).ready(function () {

    $('#sidebarCollapse').on('click', function () {
        $('#sidebar').toggleClass('active');
    });

});



if ($(window).width() < 768) {
	jQuery('#sidebar').addClass('active');
} else {
	jQuery('#sidebar').removeClass('active');
}

</script>
   
</body>
</html>