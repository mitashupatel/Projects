<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

 <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Sign Up Form by Mitashu</title>

    <!-- Font Icon -->
    <link rel="stylesheet" href="/mavendemo2/resources/fonts1/material-icon/css/material-design-iconic-font.min.css">
    <link rel="stylesheet" href="/mavendemo2/resources/vendor1/nouislider/nouislider.min.css">

    <!-- Main css -->
    <link rel="stylesheet" href="/mavendemo2/resources/css1/style.css">


</head>
<body>

  <div class="main">

        <div class="container">
            <div class="signup-content">
                <div class="signup-img">
                    <img src="/mavendemo2/resources/images1/form-img.jpg" alt="">
                    <div class="signup-img-content">
                        <h2>Register now </h2>
                        <p>while seats are available !</p>
                    </div>
                </div>
                <div class="signup-form">
                   <form:form action="/mavendemo2/admin/addAdmin" method="post" modelAttribute="admin">
                        <div class="form-row">
                            <div class="form-group">
                                <div class="form-input">
                                    <label for="first_name" class="required">First name</label>
                                    	<form:input path="fname" id="fname" type="text" name="fname"/>
                                    
                                </div>
                                <div class="form-input">
                                    <label for="last_name" class="required">Last name</label>
                                    	<form:input path="lname" id="lname" type="text" name="lname"/>
                                </div>
                                <div class="form-input">
                                    <label for="company" class="required">Company</label>
                                    	<form:input path="company" id="company" type="text" name="company"/>
                                </div>
                                <div class="form-input">
                                    <label for="email" class="required">Email</label>
                                    <form:input path="email" id="email" type="text" name="email"/>
                                </div>
                                <div class="form-input">
                                    <label for="phone_number" class="required">Phone number</label>
                                    <form:input path="number" id="number" type="text" name="number"/>
                                </div>
                            </div>
                            
                            
                            <div class="form-group">
                                <div class="form-select">
                                    <div class="label-flex">
                                        <label for="meal_preference">meal preference</label>
                                        
                                    </div>
                                    <div class="select-list">
										
										<form:select path="meal" name="meal" id="meal">
										<form:option value="veg" label="veg"/>
										<form:option value="kosher" label="kosher"/>
										<form:option value="asian veg" label="asian veg"/>
	
										</form:select>
                                    </div>
                                </div>
                            
                            <div class="label-flex">
                                        <label for="payment">Payment Mode</label>
                                        
                                    </div>
                                    <div class="form-radio-group">            
                                        <div class="form-radio-item">
                                            <form:radiobutton path = "mode" value = "cash" label = "cash" />
                                            <span class="check"></span>
                                        </div>
                                        <div class="form-radio-item">
                                          <form:radiobutton path = "mode" value = "cheque" label = "cheque" />
                                            <span class="check"></span>
                                        </div>
                                        <div class="form-radio-item">
                                           <form:radiobutton path = "mode" value = "DD" label = "DD" /> 
										   <span class="check"></span>
                                        </div>
                                    </div>
                                </div>
                            
                            
                            
                            
                            
                            
                                <div class="form-input">
                                    <label for="chequeno">DD / Cheque No.</label>
                                    <form:input path="ddno" id="ddno" type="text" name="ddno"/>
                                    
                                </div>
                                <div class="form-input">
                                    <label for="blank_name">Drawn on ( Bank Name)</label>
                                    <form:input path="bank" id="bank" type="text" name="bank"/>
                                    
                                </div>
                                <div class="form-input">
                                    <label for="payable">Payable at</label>
                                    <form:input path="pay" id="pay" type="text" name="pay"/>
             
                                </div>
                            </div>
                        </div>
                        <div class="donate-us">
                            <label>Donate us</label>
                            <div class="price_slider ui-slider ui-slider-horizontal">
                                <div id="slider-margin"></div>
                                <span class="donate-value" id="value-lower"></span>
                            </div>
                        </div>
                        <div class="form-submit">
                            <input type="submit" value="Submit" class="submit" id="submit" name="submit" />
                            <input type="submit" value="Reset" class="submit" id="reset" name="reset" />
                        </div>
                    </form:form>
                </div>
            </div>
        </div>

    </div>

    <!-- JS -->
    <script src="/mavendemo2/resources/vendor1/jquery/jquery.min.js"></script>
    <script src="/mavendemo2/resources/vendor1/nouislider/nouislider.min.js"></script>
    <script src="/mavendemo2/resources/vendor1/wnumb/wNumb.js"></script>
    <script src="/mavendemo2/resources/vendor1/jquery-validation/dist/jquery.validate.min.js"></script>
    <script src="/mavendemo2/resources/vendor1/jquery-validation/dist/additional-methods.min.js"></script>
    <script src="/mavendemo2/resources/js1/main.js"></script>

</body>
</html>