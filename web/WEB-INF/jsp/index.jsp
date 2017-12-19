<%-- 
    Document   : index1
    Created on : 23-Sep-2017, 11:45:17 AM
    Author     : fetnat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>PreOwned</title>
   <link rel="icon" type="image/x-icon"
              href="<c:url value="/images/shop.png"/>" />
    <meta charset="utf-8">
  
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
    /* Remove the navbar's default rounded borders and increase the bottom margin */ 
    .navbar {
      margin-bottom: 50px;
      border-radius: 0;
    }
    
    /* Remove the jumbotron's default bottom margin */ 
     .jumbotron {
      margin-bottom: 0;
        background-image: url("<c:url value="/images/purple.jpg"/>");
    }
   
    /* Add a gray background color and some padding to the footer */
    footer {
      background-color: #f2f2f2;
      padding: 25px;
    }
 
  </style>
</head>
<body>

<div class="jumbotron">
  <div class="container text-center">
    <h1>PreOwned.com</h1>      
    
  </div>
</div>
<marquee behavior="slide" loop="5" direction="left">
<img src="<c:url value="/images/books.jpg"/>" width="125" height="82">
<img src="<c:url value="/images/furniture.jpg"/>" width="125" height="82">
<img src="<c:url value="/images/toys.jpg"/>" width="125" height="82" >
<img src="<c:url value="/images/sunglasses.jpg"/>" width="125" height="82" >
<img src="<c:url value="/images/electronics.jpg"/>" width="125" height="82" >
<img src="<c:url value="/images/watches.jpg"/>" width="125" height="82" >
</marquee>


<div class="container">    
  <div class="row">
    <div class="col-sm-4">
      <div class="panel panel-primary">
        <div class="panel-heading">LOGIN</div>
        <div class="panel-body"> <a href="<c:url value="/loginpage"/>"><img src="<c:url value="/images/login.jpg"/>" class="img-responsive" style="width:100%" alt="Image"></a></div>
        
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-danger">
        <div class="panel-heading">Register Now!!</div>
        <div class="panel-body">  <a href="<c:url value="/RegistrationForm"/>"><img src="<c:url value="/images/register.jpg"/>" class="img-responsive" style="width:100%" alt="Image"></a></div>
        
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-success">
        <div class="panel-heading">Admin LOGIN</div>
        <div class="panel-body"><a href="<c:url value="/adminmng"/>"><img src="<c:url value="/images/admin.jpg"/>" class="img-responsive" style="width:100%" alt="Image"></a></div>
        
      </div>
    </div>
  </div>
</div><br><br>




</body>
</html>
