<%-- 
    Document   : MainPage
    Created on : 27-Aug-2017, 10:54:47 PM
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
         background-image: url("<c:url value="/images/purple.jpg"/>");
         margin-bottom: 0;
    }
   
    /* Add a gray background color and some padding to the footer */
    footer {
      background-color: #c2a1e2;
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
<nav class="navbar navbar-inverse">
  <div  class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
        <img src="<c:url value="/images/shop.png"/>" class="navbar-brand" >
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Home</a></li>
        <li><a href="<c:url value="/listpro"/>">Products</a></li>
        <li><a href="#">Deals</a></li>
        <li><a href="#">Stores</a></li>
        
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="<c:url value="/contactinfo/${login.username}"/>"><span class="glyphicon glyphicon-user"></span>Welcome <c:out value="${login.username}"/></a></li>
        <li><a href="<c:url value="/Cart/${login.username}"/>"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
      </ul>
    </div>
  </div>
</nav>

<div id=pro> </div>
  <div class="row">
    <div class="col-sm-4">
      <div class="panel panel-success">
        <div class="panel-heading">Electronics</div>
        <div class="panel-body"><a href="<c:url value="/Products/4"/>"> <img src="<c:url value="/images/electronics.jpg"/>" class="img-responsive" style="width: 280px; height: 300px;" alt="Image"></a></div>
        <div class="panel-footer">TV's,Mobiles,PC's and more..</div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-success">
        <div class="panel-heading">Books</div>
        <div class="panel-body"><img  src="<c:url value="/images/books.jpg"/>" class="img-responsive" style="width: 280px; height: 300px;" alt="Image"></div>
        <div class="panel-footer">Novels,History,Science and more..</div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-success">
        <div class="panel-heading">Furniture</div>
        <div class="panel-body"><a href="<c:url value="/Products/1"/>"><img src="<c:url value="/images/furniture.jpg"/>" class="img-responsive" style="width: 280px; height: 300px;" alt="Image"></a></div>
        <div class="panel-footer">Beds, Sofas,Dining sets and more .. </div>
      </div>
    </div>
  </div>
<br>

<div class="container">    
  <div class="row">
    <div class="col-sm-4">
      <div class="panel panel-success">
        <div class="panel-heading">Sunglasses</div>
        <div class="panel-body"><a href="<c:url value="/Products/2"/>"><img src="<c:url value="/images/sunglasses.jpg"/>" class="img-responsive" style="width: 280px; height: 300px;" alt="Image"></a></div>
        <div class="panel-footer">Gucci, Guess, Emporio Armani and more ..</div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-success">
        <div class="panel-heading">Kids toys</div>
        <div class="panel-body"><a href="<c:url value="/Products/5"/>"><img src="<c:url value="/images/toys.jpg"/>" class="img-responsive" style="width: 280px; height: 300px;" alt="Image"></a></div>
        <div class="panel-footer">outdoors, indoors play sets and more ..</div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-success">
        <div class="panel-heading">watches & Jewelery</div>
        <div class="panel-body"><a href="<c:url value="/Products/6"/>"><img src="<c:url value="/images/watches.jpg"/>" class="img-responsive" style="width: 280px; height: 300px;" alt="Image"></a></div>
        <div class="panel-footer">Buy 50 mobiles and get a gift card</div>
      </div>
    </div>
  </div>
</div><br><br>

<footer class="container-fluid text-center">
  <%@ include file="footer.jsp"%>
</footer>

</body>
</html>

