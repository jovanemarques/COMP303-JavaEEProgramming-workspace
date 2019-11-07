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
<title>Student Enrollment System - Login</title>
</head>
<body>
	<c:if test="${newStudent != null}">
		<div class="alert alert-primary alert-dismissible fade show"
			role="alert">
			Student <strong>${newStudent.username}</strong> registered!
			<button type="button" class="close" data-dismiss="alert"
				aria-label="Close">
				<span aria-hidden="true">&times;</span>
			</button>
		</div>
	</c:if>

	<script type="text/javascript" src="webjars/jquery/3.3.1/jquery.min.js"></script>
	<script type="text/javascript"
		src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
	<form action="signin.html" method="post">
		<div class="container">
			<div class="form-group">
				<h2>Login</h2>
			</div>
			<div class="form-group">
				<label for="username">Username</label> <input type="text"
					class="form-control" id="username" name="username"
					placeholder="Enter Username">
			</div>
			<div class="form-group">
				<label for="password">Password</label> <input type="password"
					class="form-control" id="password" name="password"
					placeholder="Password">
			</div>
			<div class="form-group">
				<button type="submit" class="btn btn-primary">Sign In</button>
				<a href="signup.html">Sign Up</a>
			</div>
		</div>
	</form>
</body>
</html>