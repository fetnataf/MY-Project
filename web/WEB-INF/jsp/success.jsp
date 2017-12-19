<%-- 
    Document   : success
    Created on : 12-Aug-2017, 10:25:11 PM
    Author     : fetnat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
         <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
    </head>

<body>
    <h2>Successfully Registered !!</h2>
    <table>
        <tr>
            <td>Name:</td>
            <td>${customer.uname}</td>
        </tr>
        <tr>
            <td>email</td>
            <td>${customer.email}</td>
        </tr>
        <tr>
            <td>
            <a href="<%=request.getContextPath() %>/HomePage"  class="btn btn-danger pull-left">Go to home page</a></td>
        </tr>
        
    </table>
        
</body>
</html>