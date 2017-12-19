<%-- 
    Document   : listpro
    Created on : 11-Sep-2017, 2:30:22 PM
    Author     : fetnat
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<%@taglib prefix="my" uri="http://usefulTags.com" %>
<!-- 	navigation Bar -->
<%@ include file="navbar.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>List Of Products</title>
        <link rel="icon" type="image/x-icon"
              href="<c:url value="/images/shop.png"/>" />
        <link rel="stylesheet"
              href="<c:url value="/css/bootstrap.min.css"/>">
        <script src="<c:url value="/js/jquery.js"/>"></script>
        <script src="<c:url value="/css/bootstrap.min.js"/>"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
        <script src="<c:url value="/js/productController.js"/>"></script>
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
        </style>
        
    </head>
    <body ng-app="myapp">
        <div class="container" id="productTable"
             style="width: 1145px; margin-bottom: 180px;">
            <h2>List Of Products</h2>
            <p>The List of all Products </p>

            <table class="table table-hover" id="productList">
                <tr>

                    <th>Name</th> 

                    <th>price</th> 

                    <th>weight</th>

                    <th>image</th>

                    <th>stock</th>

                </tr>

                <c:forEach var="pro" items="${product}" >

                    <tr>
                        <td>${pro.pname}</td>
                        <td>${pro.pprice}</td> 
                        <td>${pro.pweight}</td>
                        <td style="width: 171px"><img 
                                src="<c:url value="/images/${pro.proID}.jpg"/>" 
                                style="width: 100px; height: 90px;"></td>
                        <td>${pro.pstock}</td>
                        <td>
                            <form method="post" action="cart/add/${login.username}" >
                                    Qty.:<input type="number" name="quantity" value="1" min="1" max="5" style="width:40px;" />
                                    <input type="hidden" value="${pro.proID}" name="productCode"  title="productCode" style="width:40px;" />
                                    <input type="hidden" value="${pro.pprice}" name="pprice"  style="width:40px;" />
                                    <input type="submit" <c:if test="quantity=0">disabled="disabled" </c:if> value="Add to Cart"/>
                            </form>
                            </td>
                            
                            
                            
                            
                            
                            <!--a href="<c:url value="cart/add/${login.username}"/>">
                                <input type="submit" value="Add to Cart"/></a><img src="<c:url value="/images/shop.png"/>"
                               class="navbar-brand"></td-->

                    </tr>
                </c:forEach>

            </table>

        </div>
        <footer class="container-fluid text-center">
            <%@ include file="footer.jsp"%>
        </footer>
    </body>

</html>