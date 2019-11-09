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
	Payment executed successfully
	<br> Details:
	<br>programCode - ${newEnrollment.programCode}
	<br> amountPaid - ${newEnrollment.amountPaid}
	<br> startDate - ${newEnrollment.startDate}
	<br> status - ${newEnrollment.status}
	<br>
	<form action="index.html">
		<button type="submit" class="btn btn-primary">Back to
			Programs List</button>
	</form>
</body>
</html>