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
<title>Jovane_COMP303_Assignment1 - index.jsp</title>
</head>
<body>
	<script type="text/javascript" src="webjars/jquery/3.3.1/jquery.min.js"></script>
	<script type="text/javascript"
		src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
		<!-- form configuration pointing to the controller -->
	<form action="placeOrder.html" method="post">
		<div class="container" style="background-color: #009246">
			<div class="form-group">&nbsp;</div>
			<div class="form-group">
				<h1 style="color: #ce2b37;">Online Pizza Delivery</h1>
			</div>
			<div class="form-row">
				<div class="form-group col-md-6">
					<input type="text" class="form-control" name="firstName"
						placeholder="First Name" required>
				</div>
				<div class="form-group col-md-6">
					<input type="text" class="form-control" name="lastName"
						placeholder="Last Name" required>
				</div>
			</div>
			<div class="form-group">
				<input type="text" class="form-control" name="streetAddress"
					placeholder="Street Address" required>
			</div>
			<div class="form-group">
				<input type="text" class="form-control" name="streetAddressLine2"
					placeholder="Street Address Line 2">
			</div>
			<div class="form-row">
				<div class="form-group col-md-6">
					<input type="text" class="form-control" name="province"
						placeholder="Province" required>
				</div>
				<div class="form-group col-md-6">
					<input type="text" class="form-control" name="postalCode"
						placeholder="Postal Code" required>
				</div>
			</div>
			<div class="form-row" style="color: white;">
				<div class="form-group col-md-9">
					<!-- phone with validation -->
					<input type="tel" class="form-control" name="phoneNumber" pattern="[0-9]{3}-[0-9]{3}-[0-9]{4}"
						placeholder="Phone Number" required>
				</div>
				<div class="form-group col-md-3">
					Format: 123-456-6789
				</div>
			</div>
			<div class="form-group">
				<input type="email" class="form-control" name="email"
					placeholder="Email">
			</div>
			<div class="form-group" style="color: white;">Which toppings
				would you like?</div>
			<div class="form-row" style="color: white;">
				<div class="form-group col-md-4">
					<div class="custom-control custom-switch">
						<input type="checkbox" class="custom-control-input"
							id="customSwitch0" name="toppings" value="Pepperoni"> <label class="custom-control-label"
							for="customSwitch0">1. Pepperoni</label>
					</div>
				</div>
				<div class="form-group col-md-4">
					<div class="custom-control custom-switch">
						<input type="checkbox" class="custom-control-input"
							id="customSwitch1" name="toppings" value="Vegetarian"> <label class="custom-control-label"
							for="customSwitch1">2. Vegetarian</label>
					</div>
				</div>
				<div class="form-group col-md-4">
					<div class="custom-control custom-switch">
						<input type="checkbox" class="custom-control-input"
							id="customSwitch2" name="toppings" value="Cheese"> <label class="custom-control-label"
							for="customSwitch2">3. Cheese</label>
					</div>
				</div>
			</div>
			<div class="form-group" style="color: white;">How would you
				like to pay?</div>
			<div class="form-row" style="color: white;">
				<div class="form-group col-md-4">
					<div class="custom-control custom-radio">
						<input type="radio" class="custom-control-input"
							id="customControlValidation0" name="payments" value="Master Card" required>
						<label class="custom-control-label" for="customControlValidation0">Master
							Card</label>
					</div>
				</div>
				<div class="form-group col-md-4">
					<div class="custom-control custom-radio">
						<input type="radio" class="custom-control-input"
							id="customControlValidation1" name="payments" value="Visa" required>
						<label class="custom-control-label" for="customControlValidation1">Visa</label>
					</div>
				</div>
				<div class="form-group col-md-4">
					<div class="custom-control custom-radio">
						<input type="radio" class="custom-control-input"
							id="customControlValidation2" name="payments" value="America Express" required>
						<label class="custom-control-label" for="customControlValidation2">America
							Express</label>
					</div>
				</div>
			</div>
			<div class="form-group">
				<button type="submit" class="btn btn-danger btn-lg btn-block">Order</button>
			</div>
			<div class="form-group">&nbsp;</div>
		</div>
	</form>
</body>
</html>