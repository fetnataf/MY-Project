<%-- 
    Document   : navbar
    Created on : 26-Aug-2017, 8:42:48 PM
    Author     : fetnat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import = "model.categoryMenu" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
   
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="<c:url value="/css/Basic-Header.css"/>">
</head>

<body>
    <div>
        <nav class="navbar navbar-default navigation-clean-button">
            <div class="container">
                <div class="navbar-header"><img src="<c:url value="/images/shop.png"/>" class="navbar-brand" >
                    <button class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navcol-1"><span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button>
                </div>
                <div class="collapse navbar-collapse" id="navcol-1">
                    <ul class="nav navbar-nav">
                        <li class="active" role="presentation"><a href="<c:url value="/MainPage"/>">Home</a></li>
                        <li role="presentation"><a href="<c:url value="/Cart/${login.username}"/>">Cart</a></li>
                        <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false" href="#">Products<span class="caret"></span></a>
                            <ul class="dropdown-menu" role="menu">
                                <li role="presentation"><a href="<c:url value="/Products/1"/>">Furniture</a></li>
                                <li role="presentation"><a href="<c:url value="/Products/2"/>">Sunglasses</a></li>
                                <li role="presentation"><a href="<c:url value="/Products/4"/>">Electronics</a></li>
                                <li role="presentation"><a href="<c:url value="/Products/6"/>">Watches & Jewels</a>
                                <li role="presentation"><a href="<c:url value="/Products/5"/>">Toys</a></li>
                            </ul>
                        </li>
                    </ul>

                                <p class="navbar-text navbar-right actions">  Welcome <c:out value="${login.username}"/><a class="btn btn-default action-button" role="button" href="<c:url value="/logout"/>">logout</a>
                               
                </div>
            </div>
        </nav>
    </div>
    
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>

</html>
