
<%
	//@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"
%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel='stylesheet'
	href='webjars/bootstrap/4.3.1/css/bootstrap.min.css'>
<%
	// <link href="${pageContext.request.contextPath}/assets/theme1/css/main.css" rel="stylesheet">
%>
<%
	//<link href="<c:url value="/assets/theme1/css/main.css" />" rel="stylesheet">
%>
<title>Jovane_COMP303_Assignment1 - show_details.jsp</title>
</head>
<body>
	<script type="text/javascript" src="webjars/jquery/3.3.1/jquery.min.js"></script>
	<script type="text/javascript"
		src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
	<div class="container" style="background-color: #009246">
		<div class="form-group">
			<h1 style="color: #ce2b37;">Pizza Delivery: Your order</h1>
		</div>
		<div class="form-row">
			<div class="form-group col-md-3">Full Name:</div>
			<div class="form-group col-md-9" style="color: white;">${pizzaB.firstName}
				${pizzaB.lastName}</div>
		</div>
		<div class="form-row">
			<div class="form-group col-md-3">Full Street Address:</div>
			<div class="form-group col-md-9" style="color: white;">${pizzaB.streetAddress}
				${pizzaB.streetAddressLine2}</div>
		</div>
		<div class="form-row">
			<div class="form-group col-md-3">Postal Code:</div>
			<div class="form-group col-md-9" style="color: white;">${pizzaB.postalCode}</div>
		</div>
		<div class="form-row">
			<div class="form-group col-md-3">Phone Number:</div>
			<div class="form-group col-md-9" style="color: white;">${pizzaB.phoneNumber}</div>
		</div>
		<div class="form-row">
			<div class="form-group col-md-3">Email:</div>
			<div class="form-group col-md-9" style="color: white;">${pizzaB.email}</div>
		</div>
	</div>
</body>
</html>