<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contact</title>
</head>
<body>
<%@ include file="header.jsp" %>

<div class="page-wrapper">
<section class="contact-info-one">
            <div class="container">
                <div class="row">
                    <div class="col-lg-4">
                        <div class="contact-info-one__single wow fadeInDown" data-wow-duration="1500ms">
                            <div class="contact-info-one__icon"><i class="kipso-icon-manager"></i><!-- /.kipso-icon-manager -->
                            </div><!-- /.contact-info-one__icon -->
                            <h2 class="contact-info-one__title">About Us </h2><!-- /.contact-info-one__title -->
                            <p class="contact-info-one__text">We Are Team Eximoo <br> 
                            A Building With Four Walls and Tomorrow Inside.
                                <br>
                                </p><!-- /.contact-info-one__text -->
                        </div><!-- /.contact-info-one__single -->
                    </div><!-- /.col-lg-4 -->
                    <div class="col-lg-4">
                        <div class="contact-info-one__single wow fadeInUp" data-wow-duration="1500ms">
                            <div class="contact-info-one__icon"><i class="kipso-icon-placeholder"></i>
                                <!-- /.kipso-icon-manager -->
                            </div><!-- /.contact-info-one__icon -->
                            <h2 class="contact-info-one__title">Our Address</h2><!-- /.contact-info-one__title -->
                            <p class="contact-info-one__text">In Dreamers Park, SHIVA's Yoga Area ,  <br>
                                Near C & C Explorer<br> Made in &#65039  India</p><!-- /.contact-info-one__text -->
                        </div><!-- /.contact-info-one__single -->
                    </div><!-- /.col-lg-4 -->
                    <div class="col-lg-4">
                        <div class="contact-info-one__single wow fadeInDown" data-wow-duration="1500ms">
                            <div class="contact-info-one__icon"><i class="kipso-icon-contact"></i><!-- /.kipso-icon-manager -->
                            </div><!-- /.contact-info-one__icon -->
                            <h2 class="contact-info-one__title">Contact Info</h2><!-- /.contact-info-one__title -->
                            <p class="contact-info-one__text">contact@eximoo.com<br>
                                000 000 000 <br> &nbsp; </p><!-- /.contact-info-one__text -->
                        </div><!-- /.contact-info-one__single -->
                    </div><!-- /.col-lg-4 -->
                </div><!-- /.row -->
            </div><!-- /.container -->
        </section><!-- /.contact-info-one -->
        <section class="contact-one">
            <div class="container">
                <h2 class="contact-one__title text-center">Get in touch <br>
                    with us</h2><!-- /.contact-one__title -->
                <form:form action="/eximoo/user/contact"  method="post" role="form" 
                      modelAttribute="contact" class="contact-one__form">
                
                    <div class="row low-gutters">
                        <div class="col-lg-6">
                        <form:input class="form-control" path="name" id="name" type="text" name="name" placeholder="Enter Your Name"/>
                       
                        </div><!-- /.col-lg-6 -->
                        <div class="col-lg-6">
                           <form:input class="form-control" path="email" id="email" type="email" name="email" placeholder="Enter Your Email"/>
                        </div><!-- /.col-lg-6 -->
                        <div class="col-lg-12">
                            <form:textarea name="message" path="message" id="message"/>
                            <div class="text-center">
                                <button type="submit" class="contact-one__btn thm-btn">Submit Comment</button>
                            </div><!-- /.text-center -->
                        </div><!-- /.col-lg-12 -->
                    </div><!-- /.row -->
                </form:form><!-- /.contact-one__form -->
            </div><!-- /.container -->
        </section><!-- /.contact-one -->
        <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d4562.753041141002!2d-118.80123790098536!3d34.152323469614075!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x80e82469c2162619%3A0xba03efb7998eef6d!2sCostco+Wholesale!5e0!3m2!1sbn!2sbd!4v1562518641290!5m2!1sbn!2sbd" class="google-map__contact" allowfullscreen></iframe>
</div>
<%@ include file="user-footer.jsp" %>
</body>
</html>