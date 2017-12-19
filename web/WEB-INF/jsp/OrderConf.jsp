<%-- 
    Document   : OrderConf
    Created on : 1-Oct-2017, 12:21:54 PM
    Author     : fetnat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<jsp:useBean id="now" class="java.util.Date" />

<%@ include file="navbar.jsp"%>
<!DOCTYPE jsp:useBean PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Receipt</title>
<link rel="icon" type="image/x-icon" href="<c:url value="/images/shop.png"/>" />
<link rel="stylesheet"
	href="<c:url value="/css/bootstrap.min.css"/>">
<script src="<c:url value="/js/jquery.js"/>"></script>
<script src="<c:url value="/js/bootstrap.min.js"/>"></script>
<link rel="stylesheet" type="text/css"
	href="<c:url value="/css/register.css"/>">
<style>
    footer {
                background-color: #c2a1e2;
            }
    </style>
	</head>
	<body style="padding: 0px;">
		<div class="container-wrapper">
	<div class="container" style="margin-bottom: 19px">
	 <div class="row" style="margin-top: 20px">
     <form:form commandName="order" class="form-horizontal">
		<div class="well col-xs-10 col-sm-10 col-md-6 col-xs-offset-1 col-sm-offset-1 col-md-offset-3" style="width: 100%; margin-left: 0%">
		<div style="text-align: center;"><h1>Receipt</h1></div>
		<div class="row">
			
			<div class="col-xs-6 col-sm-6 col-md-6 text-right">
				<p>Shipping Date:<fmt:formatDate type="date" value="${now}" /></p>
			</div>
		</div>


		
		<div class="row">
		<div class="container">
			<table class="table table-hover">
				<thead>
    				<tr>
					
					<th class="text-center">Quantity</th>
					<th class="text-center">Price</th>
					
					</tr>
				</thead>
				<tbody>
				
					<tr>
					
                                        <td style="text-align: center"><c:out value="${sessionScope.quantity}"/> </td>
					<td style="text-align: center"><c:out value="${sessionScope.totalprice}"/></td>
					
					</tr>
			
				</tbody>
			</table>
			</div>
				
					
		</div>

				
						 <br /> <br />
					<c:url value="/thankYou/${login.username}" var="url2"></c:url>
                                        <c:url value="/Cart" var="url1"></c:url>
						<!--a href="${url1}" class="btn btn-lg btn-default"
                                                   >Back</a--><br>
                                                   <a href="${url2}" class="btn btn-lg btn-info"
                                                   >Submit Order</a>
						
						
						
						
					</div>
				</form:form>
			</div>
		</div>
	</div>
	<footer class="container-fluid text-center">
            <%@ include file="footer.jsp"%>
        </footer>	
	</body>



</html>