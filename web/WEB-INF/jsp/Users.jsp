<%-- 
    Document   : Users
    Created on : 21-Sep-2017, 1:42:26 AM
    Author     : fetnat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false"%>
<%@taglib prefix="my" uri="http://usefulTags.com" %>
<!-- 	navigation Bar -->
<%@ include file="navbar.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>List Of Users</title>
        <link rel="icon" type="image/x-icon"
              href="<c:url value="/images/shop.png"/>" />
        <link rel="stylesheet"
              href="<c:url value="/css/bootstrap.min.css"/>">
        <script src="<c:url value="/js/jquery.js"/>"></script>
        <script src="<c:url value="/css/bootstrap.min.js"/>"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
      
        <link rel="stylesheet" type="text/css"
              href="<c:url value="/css/productList.css"/>">
        <style>
            footer {
                background-color: #c2a1e2;
            }

            input[type=submit] {
                padding:5px 15px; 
                background:#ccc; 
                border:0 none;
                cursor:pointer;
                -webkit-border-radius: 5px;
                border-radius: 5px; 
            }

            input[type=number]::-webkit-inner-spin-button {
                opacity: 1;
            }

            .dropdown {
                position: relative;
                display: inline-block;
            }

            .dropdown-content {
                display: none;
                position: absolute;
                background-color: #f9f9f9;
                min-width: 160px;
                box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
                z-index: 1;
            }

            .dropdown:hover .dropdown-content {
                display: block;
            }

            .desc {
                padding: 15px;
                text-align: center;
            }
        </style>

    </head>
    <body>
        <div class="container" id="productTable"
             style="width: 1145px; margin-bottom: 180px;">
            <h2>List Of Users</h2>
            <p>The List of all Users </p>
       
           
                <table class="table table-hover" id="productList">
                    <tr>

                        <th>User name</th> 
                         <th>First name</th> 
                        <th>Last name</th> 

                        <th>Address</th>

                        <th>E-mail</th>

                        <th>Phone</th>

                    </tr>

                    <c:forEach var="cust" items="${customer}" >

                        <tr>
                            <td>${cust.uname}</td>
                            <td>${cust.fname}</td>
                            <td>${cust.lname}</td> 
                            <td>${cust.address}</td>
                            <td>${cust.email}</td>
                            <td>${cust.phone}</td>
                            <td><a href="<c:url value="/delete/user/${cust.uname}"/>"><input type="submit" value="Delete User"/></a>
                                                                               </td>
                       
                               
                                

                        </tr>
                    </c:forEach>
                      
                </table>
        </div>
        <footer class="container-fluid text-center">
            <%@ include file="footer.jsp"%>
        </footer>
    </body>

</html>