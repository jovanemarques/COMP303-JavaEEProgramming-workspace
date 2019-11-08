<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Program</title>
</head>
<body>
	<jsp:include page="page-header.jsp">
		<jsp:param name="username" value="${username}" />
	</jsp:include>
	<form action="" method="post">
		<table>
			<tr>
				<td>Which program are you applying for?</td>
				<td><c:forEach var="program" items="${programs}">
						<input type="radio" name="rdProg" value="${program.programCode}" />${program.programName}<br />
					</c:forEach></td>
			</tr>
			<tr>
				<td>How would you like to pay?</td>
				<td><input type="radio" name="payment" value="mastercard">Mastercard<br />
					<input type="radio" name="payment" value="visa">Visa<br />
					<input type="radio" name="payment" value="americanexp">
					American Express<br /></td>
			</tr>
		</table>
		<input type="submit" value="Pay" />
	</form>
</body>
</html>