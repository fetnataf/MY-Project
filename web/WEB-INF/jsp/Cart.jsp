<%-- 
    Document   : Cart
    Created on : 16-Sep-2017, 10:48:48 AM
    Author     : fetnat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<%@ include file="navbar.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Cart</title>
        <link rel="icon" type="image/x-icon" href="<c:url value="/images/shop.png"/>" />
        <link  rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
        <script src="<c:url value="/js/productController.js"/>"></script>

        <style>footer {
                background-color: #c2a1e2;
                padding: 25px;
            }
        </style>
    </head>
    <body>


        <div class="container" style="width: 1145px; margin-top: 20px; margin-bottom: 180px;">
            <c:set var = "tprice"  scope = "session" value="${0}"/>
            <c:set var = "ptprice" scope = "session" value="${0}"/>
            <c:set var = "qty" scope = "session" value="${0}"/>
            <br> List of Products In Your Cart




            <table class="table table-hover" id="productList">
                <thead>
                    <tr>
                        <th>Product Name</th>

                        <th>Price</th>

                    </tr>
                </thead>

                <tbody>
                    <c:forEach var="cart" items="${cart}" >
                    <c:set var="qty" value="${qty + 1}"/>
                        <tr>
                            <c:forEach var="cItem" items="${cart.cartItem}" >
                                <td>${cItem.product.pname}</td>
                                <td>
                                    <table border='1' width='50%'  >

                                        <c:set var="testpro" value="${cItem.product}"/>
                                        <tr>

                                            <td>${cItem.price}</td>
                                            <c:set var="tprice" value="${tprice + cItem.price}"/> 
                                        </tr>
                                        <c:url value="/removeItem/${cItem.cartItemId}/${login.username}" var="url1"></c:url>
                                    </c:forEach>
                                </table>
                            </td>

                            <td>
                                <a href="${url1}" class="btn btn-danger"

                                   style="margin-top: 0px;"> <span	class="glyphicon glyphicon-trash"></span>
                                    remove</a></td></tr></c:forEach>
                    </tbody>
                </table>
            Grand Total Price: <c:out value = "${tprice}"/>
                <div>
                    
                    <c:set var = "totalprice" scope = "session" value="${tprice}"/>
                    <c:set var = "quantity" scope = "session" value="${qty}"/>
                    
                <!--form method="post" action="order">
                <input type="hidden" value="${qty}" name="quantity" />
                <input type="hidden" value="${tprice}" name="totalprice" />
                <input type="hidden" value="${login.username}" name="username" />
                 </form-->
                 <c:url value="/OrderConf" var="url2"></c:url>
                 <a href="${url2}" class="btn btn-danger pull-left">Check Out</a>
                    <c:url value="/listpro" var="url"></c:url>
                <a href="${url}" class="btn btn-default" style="margin-left: 20px">Continue
                    Shopping</a>
            </div>
                    
     

        </div>

    <footer class="container-fluid text-center">
        <%@ include file="footer.jsp"%>
    </footer>
</body>
</html>
