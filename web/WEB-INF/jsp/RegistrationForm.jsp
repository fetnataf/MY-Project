<%-- 
    Document   : RegistrationForm
    Created on : 23-Sep-2017, 11:04:25 AM
    Author     : fetnat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
         <link rel="icon" type="image/x-icon"
              href="<c:url value="/images/shop.png"/>" />
         <link rel="stylesheet" type="text/css"
              href="<c:url value="/css/register.css"/>">
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
  <style>
      
 @import "font-awesome.min.css";
@import "font-awesome-ie7.min.css";
/* Space out content a bit */
body {
  padding-top: 20px;
  padding-bottom: 20px;
   background-image:url("<c:url value="/images/purple.jpg"/>");
}

/* Everything but the jumbotron gets side spacing for mobile first views */
.header,
.marketing,
.footer {
  padding-right: 15px;
  padding-left: 15px;
}

/* Custom page header */
.header {
  border-bottom: 1px solid #e5e5e5;
}
/* Make the masthead heading the same height as the navigation */
.header h3 {
  padding-bottom: 19px;
  margin-top: 0;
  margin-bottom: 0;
  line-height: 40px;
}

/* Custom page footer */
.footer {
  padding-top: 19px;
  color: #777;
  border-top: 1px solid #e5e5e5;
}

/* Customize container */
@media (min-width: 768px) {
  .container {
    max-width: 730px;
  }
}
.container-narrow > hr {
  margin: 30px 0;
}

/* Main marketing message and sign up button */
.jumbotron {
  text-align: center;
  border-bottom: 1px solid #e5e5e5;
}
.jumbotron .btn {
  padding: 14px 24px;
  font-size: 21px;
}

/* Supporting marketing content */
.marketing {
  margin: 40px 0;
}
.marketing p + h4 {
  margin-top: 28px;
}

/* Responsive: Portrait tablets and up */
@media screen and (min-width: 768px) {
  /* Remove the padding we set earlier */
  .header,
  .marketing,
  .footer {
    padding-right: 0;
    padding-left: 0;
  }
  /* Space out the masthead */
  .header {
    margin-bottom: 30px;
  }
  /* Remove the bottom border on the jumbotron for visual effect */
  .jumbotron {
    border-bottom: 0;
  }
}
      
      
      
      
  </style>
    </head>
    <body>
       <div class="container">
    <h1 class="well">Registration Form</h1>
	<div class="col-lg-12 well">
	<div class="row">
				<form:form method="POST" action="registerProcess" modelAttribute="customer">
					<div class="col-sm-12">
						<div class="row">
							<div class="col-sm-6 form-group">
								<label>First Name</label>
								<form:input type="text" path="fname" placeholder="Enter First Name Here.." class="form-control"/>
							</div>
							<div class="col-sm-6 form-group">
								<label>Last Name</label>
								<form:input type="text" path="lname" placeholder="Enter Last Name Here.." class="form-control"/>
							</div>
						</div>					
						<div class="form-group">
							<label>Address</label>
							<form:textarea path="address" placeholder="Enter Address Here.." rows="3" class="form-control"></form:textarea>
						</div>	
						<div class="row">
							<div class="col-sm-4 form-group">
								<label>User Name</label>
								<form:input type="text" path="uname" placeholder="Enter User Name Here.." class="form-control"/>
							</div>	
									<div class="col-sm-4 form-group">
								<label>Password</label>
								<form:input type="password" path="pass" placeholder="Enter Password Here.." class="form-control"/>
							</div>	
						</div>
												
					<div class="form-group">
						<label>Phone Number</label>
						<form:input type="text" path="phone" placeholder="Enter Phone Number Here.." class="form-control"/>
					</div>		
					<div class="form-group">
						<label>Email Address</label>
						<form:input type="email" path="email" placeholder="Enter Email Address Here.." class="form-control"/>
					</div>
					<button type="submit" value="submit" class="btn btn-lg btn-info">Submit</button>					
					</div>
				</form:form> 
            
           
    </body>
</html>
