<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<link href="<c:url value="/assets/css/main.css" />" rel="stylesheet">
<%// or <link href="${pageContext.request.contextPath}/assets/css/main.css" rel="stylesheet"> %>
<link href="${pageContext.request.contextPath}/assets/css/main.css" rel="stylesheet" >
<title>Jovane_COMP303_Assignment1 - show_details.jsp</title>
</head>
<body>
	<script type="text/javascript" src="webjars/jquery/3.3.1/jquery.min.js"></script>
	<script type="text/javascript"
		src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
	<div class="container">
		<div class="form-group">
			<h1>Pizza Delivery: Your order</h1>
		</div>
		<div class="form-row">
			<div class="form-group col-md-1 form-result-left-col">
				<!--div class="form-group col-md-1"-->
				Full Name:
			</div>
			<div class="form-group col-md-11">${pizzaB.firstName}
				${pizzaB.lastName}</div>
		</div>
	</div>
	<!--table>
		<tr>
			<td>First Name:</td>
			<td>${pizzaB.firstName}</td>
		</tr>
		<tr>
			<td>Last Name:</td>
			<td>${pizzaB.lastName}</td>
		</tr>
		<tr>
			<td>Street:</td>
			<td>${pizzaB.streetAddress}</td>
		</tr>
	</table-->
</body>
</html>