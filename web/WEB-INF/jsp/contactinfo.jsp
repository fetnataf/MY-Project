<%-- 
    Document   : contactinfo
    Created on : 20-Sep-2017, 12:38:53 PM
    Author     : fetnat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
   <%@ include file="navbar.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Contact Information</title>

        <link rel="icon" type="image/x-icon"
              href="<c:url value="/images/shop.png"/>" />
        <link rel="stylesheet"
              href="<c:url value="/css/bootstrap.min.css"/>">
        <script src="<c:url value="/js/jquery.js"/>"></script>
        <script src="<c:url value="/css/bootstrap.min.js"/>"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
</head>
<body>
    <h2>Welcome ${login.username}</h2>
    <a href="<c:url value="/BillingAddForm"/>">Add billing Address</a><br>
    <a href="<c:url value="/ShipAddress"/>">Add shipping Address</a>

            <p>This is your Registered Information </p>
    <table class="table table-hover" >
		<tr>
		<th>UserName</th><td>${customer.uname}</td>
                <tr><th>First Name</th><td>${customer.fname}</td>
                <tr><th>Last name</th><td>${customer.lname}</td>
                <tr><th>Email</th><td>${customer.email}</td>
                <tr><th>Address</th><td>${customer.address}</td>
	
		</tr>
	</table>
                 
</body>
</html>