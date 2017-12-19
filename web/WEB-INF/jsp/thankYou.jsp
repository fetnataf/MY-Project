<%-- 
    Document   : thankYou
    Created on : 3-Oct-2017, 11:00:18 AM
    Author     : fetnat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="icon" type="image/x-icon" href="<c:url value="/images/shop.png"/>" />
        <title>Thank You</title>
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <script src="https://bootstrapcreative.com/wp-bc/wp-content/themes/wp-bootstrap/codepen/bootstrapcreative.js?v=1"></script>
  
    </head>
    <body>
<div class="jumbotron">
  <div class="container text-center">
      <h1 >Thank You!</h1>
      <p class="lead"><strong>Thank you for shopping here !</strong> waiting your next visit .</p>
  </div>
  </div>
  <hr>
  <p  style="text-align:center">
    Having trouble? <a href="">Contact us</a>
  </p>
  <p  style="text-align:center" class="lead">
    <a class="btn btn-primary btn-sm" href="<c:url value="/MainPage"/>" role="button">Continue to homepage</a>
  </p>

    </body>
</html>