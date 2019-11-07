<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Program</title>
</head>
<body>
<h3>You are successfully logged in</h3>
<h3>${message}</h3>
         <form action="${pageContext.request.contextPath}/stu_print.html" method="post"> 
         
         		<tr>
					<td>Which program are you applying for?</td>
					<td>
					<input type="radio" name="program" value="2001">2001 Mechanical Engineering<br>
					<input type="radio" name="program" value="2002">2002 Software Engineering  <br>
					<input type="radio" name="program" value="2003">2003 Marine Engineering<br>
					<input type="radio" name="program" value="2004">2004  Robotics Engineering<br>
				</tr>
				<tr>
					<td>How would you like to pay?</td>
					<td>
					<input type="radio" name="payment" value="mastercard">Mastercard<br>
					<input type="radio" name="payment" value="visa"> Visa<br>
					<input type="radio" name="payment" value="americanexp"> American Express<br>
				</tr>
				 <input type="submit" value="Pay"/>  
    
				</form>
</body>
</html>