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
<title>Profile</title>
</head>
<body>
<script type="text/javascript" src="webjars/jquery/3.3.1/jquery.min.js"></script>
	<script type="text/javascript"
		src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
 <form action="stu_edit" method="post">  
	 <div class="container">
			<div class="form-group">
			<h2>Profile</h2>
			</div>
			<div class="form-group">
			<label for="studentId">Student Id</label> <input type="text"
					class="form-control" id="studentId" name="studentId"
					placeholder="Student Id">
		    </div>
		    <div>
		    <label for="address">Address</label> <input type="text"
		           class="form-control" id="address" name="address" 
		           placeholder="Address"> 
		    </div>
      		 <div>
		    <label for="city">City</label> <input type="text"
		           class="form-control" id="city" name="city" 
		           placeholder="City"> 
		    </div>
   			<div>
		    <label for="postalCode">Postal Code</label> <input type="text"
		           class="form-control" id="postalCode" name="postalCode" 
		           placeholder="Type Postal Code"> 
		    </div>
     		 <div class="form-group">
				<button type="submit" class="btn btn-primary">Save</button>
			</div>
    </div>
    </form> 
</body>
</html>