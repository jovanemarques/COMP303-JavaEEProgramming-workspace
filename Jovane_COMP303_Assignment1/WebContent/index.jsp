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
	<form action="placeOrder.html" method="post">
		<div class="container" style="background-color: #009246">
			<div class="form-group">
				&nbsp;
			</div>
			<div class="form-group">
				<h1 style="color: #ce2b37;">Online Pizza Delivery</h1>
			</div>
			<div class="form-row">
				<div class="form-group col-md-6">
					<input type="text" class="form-control" name="firstName"
						placeholder="First Name">
				</div>
				<div class="form-group col-md-6">
					<input type="text" class="form-control" name="lastName"
						placeholder="Last Name">
				</div>
			</div>
			<div class="form-group">
				<input type="text" class="form-control" name="streetAddress"
					placeholder="Street Address">
			</div>
			<div class="form-group">
				<input type="text" class="form-control" name="streetAddressLine2"
					placeholder="Street Address Line 2">
			</div>
			<div class="form-group">
				<input type="text" class="form-control" name="postalCode"
					placeholder="Postal Code">
			</div>
			<div class="form-group">
				<input type="email" class="form-control" name="email"
					placeholder="Email">
			</div>
			<div class="form-group">
				<button type="submit" class="btn btn-danger btn-lg btn-block">Order</button>
			</div>
			<div class="form-group">
				&nbsp;
			</div>
			<!--table>
			<tr>
				<td>First Name:</td>
				<td><input type="text" name="firstName" /></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><input type="text" name="lastName" /></td>
			</tr>
			<tr>
				<td>Street Address:</td>
				<td><input type="text" /></td>
			</tr>
			<tr>
				<td>Province:</td>
				<td><select>
						<option>Ontario</option>
				</select></td>
			</tr>
			<tr>
				<td>Postal Code:</td>
				<td><input type="text" /></td>
			</tr>
			<tr>
				<td>Phone Number:</td>
				<td><input type="text" /><input type="text" /><input
					type="text" /></td>
			</tr>
			<tr>
				<td>Your Email:</td>
				<td><input type="text" /></td>
			</tr>
			<tr>
				<td>Which toppings would you like?</td>
				<td><table>
						<tr>
							<td>1.</td>
							<td><input type="checkbox" />Pepperoni</td>
						</tr>
						<tr>
							<td>2.</td>
							<td><input type="checkbox" />Vegetarian</td>
						</tr>
						<tr>
							<td>3.</td>
							<td><input type="checkbox" />Cheese</td>
						</tr>
					</table></td>
			</tr>
			<tr>
				<td>How would you like to pay?</td>
				<td><table>
						<tr>
							<td>1.</td>
							<td><input type="checkbox" />Master Card</td>
						</tr>
						<tr>
							<td>2.</td>
							<td><input type="checkbox" />Visa</td>
						</tr>
						<tr>
							<td>3.</td>
							<td><input type="checkbox" />American Express</td>
						</tr>
					</table></td>
			</tr>
			<tr>
				<td><input type="submit" value="Order" /></td>
			</tr>
		</table-->
		</div>
	</form>
</body>
</html>