<%-- 
    Document   : footer
    Created on : 26-Aug-2017, 6:20:00 PM
    Author     : fetto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="<c:url value="/css/bootstrap.min.css"/>">
<script src="<c:url value="/js/jQuery.js"/>"></script>
<script src="<c:url value="/css/bootstrap.min.js"/>"></script>
<link rel="stylesheet" type="text/css"
	href="<c:url value="/css/Ccss.css"/>">
</head>
<body>
	<footer class="footer-distributed">
	<div class="footer-right">
		<a href="<c:url value="/MainPage"/>"><span
			class="glyphicon glyphicon-home"></span></a>
		
			<a href="<c:url value="/cart/getCartById" />"><span class="glyphicon glyphicon-shopping-cart"></a>
		
		<a href="<c:url value="/login"/>"><span
			class="glyphicon glyphicon-user"></a> <a href="#"><span
			class="glyphicon glyphicon-envelope"></a>
	</div>
	<div class="footer-left">

		<p class="footer-links">
			<a href="<c:url value="/MainPage"/>">Home</a> · <a
				href="<c:url value="/aboutus"/>">About Us</a> · <a href="<c:url value="/listpro" />">Product
				List</a> · <a href="<c:url value="/contactUs"/>">Contact Us</a>
		</p>

		<p>Created by Fetnat El Afiouni &copy; 2017</p>
	</div>
	</footer>
</body>
</html>