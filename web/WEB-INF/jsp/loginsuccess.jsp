<%-- 
    Document   : loginsuccess
    Created on : 18-Sep-2017, 11:35:43 PM
    Author     : fetto
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<h3>Welcome <c:out value="${login.username}"/></h3>
<table>
	<tr>
		<td><a href="MainPage">GoTo Home Page</a></td>
	</tr>
</table>
</body>
</html>