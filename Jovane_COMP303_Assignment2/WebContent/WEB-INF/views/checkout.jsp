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
<title>Student Enrollment System - Checkout</title>
</head>
<body>
	<jsp:include page="page-header.jsp" />
	<div class="container">
		<div class="row">
			<h2>Payment executed successfully</h2>
		</div>
		<div class="row">
			<b>Program:</b> ${newEnrollment.programCode}
		</div>
		<div class="row">
			<b>Amount Paid:</b> ${newEnrollment.amountPaid}
		</div>
		<div class="row">
			<b>Start Date:</b> ${newEnrollment.startDate}
		</div>
		<div class="row">
			<b>Status:</b> ${newEnrollment.status}
		</div>
		<div class="row">
			<form action="index.html">
				<button type="submit" class="btn btn-primary">Back to
					Programs List</button>
			</form>
		</div>
	</div>
	</div>
</body>
</html>