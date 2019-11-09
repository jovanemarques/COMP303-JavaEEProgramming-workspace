<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<title>Student Enrollment System - Program</title>
</head>
<body>
	<div class="container">
		<div class="row justify-content-md-center">
			<div class="col-8">
				<jsp:include page="page-header.jsp" />
				<form action="checkout.html" method="post">
					<table>
						<tr>
							<td>Which program are you applying for?</td>
							<td><c:forEach var="program" items="${programs}">
									<input type="radio" name="rdProg"
										value="${program.programCode}" /> ${program.programName}<br />
								</c:forEach></td>
						</tr>
						<tr>
							<td>How would you like to pay?</td>
							<td><input type="radio" name="payment" value="mastercard">
								Mastercard<br /> <input type="radio" name="payment"
								value="visa"> Visa<br /> <input type="radio"
								name="payment" value="americanexp"> American Express<br /></td>
						</tr>
					</table>
					<button type="submit" class="btn btn-primary">Check Out</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>