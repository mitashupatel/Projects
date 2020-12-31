<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ include file="header.jsp" %>

				
				<section class="contact-one">
            <div class="container">
                <h2 class="contact-one__title text-center">Give Us Your Valueable Feedback <br>
                    with us</h2><!-- /.contact-one__title -->
                <form:form action="/eximoo/user/feedback"  method="post" role="form" 
                      modelAttribute="feedback" class="contact-one__form">
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
                                <button type="submit" class="contact-one__btn thm-btn">Submit FeedBack</button>
                            </div><!-- /.text-center -->
                        </div><!-- /.col-lg-12 -->
                    </div><!-- /.row -->
                </form:form><!-- /.contact-one__form -->
            </div><!-- /.container -->
        </section><!-- /.contact-one -->

<%@ include file="user-footer.jsp" %>
</body>
</html>