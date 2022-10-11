<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Courier Booking</title>
</head>
<body>

<form action="CourierBooking" method="post">
	<center>
	<font color="black">
		<h1>Courier Booking</h1><br><br>
		
		<div class="credentials">
		
		Customer Name : &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="cname" required="required" ><br><br>
		
		Mobile : &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; <input type="tel" name="mobile" required="required"><br><br>
		Packet Wt in gms : &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;<input type="number" name="wt"required="required" ><br><br><br><br>
		Courier Pickup Area : 
		<select name="fromaddr" required>
			<option value="" >Select pick area</option>
			<option value="nimhans">Nimhans </option>
			<option value="koramangala" >Koramangala </option>
			<option value="silkboard" >SilkBoard </option>
			<option value="hsrlayout">HSR Layout </option>
			<option value="electroniccity">Electronic City </option>
			<option value="attibele">Attibele </option>
			
		</select><br><br>
		Courier Delivery Area : 
			<select name="toaddr" required>
			<option value="" >Select delivery area</option>
			<option value="nimhans">Nimhans </option>
			<option value="koramangala" >Koramangala </option>
			<option value="silkboard" >SilkBoard </option>
			<option value="hsrlayout">HSR Layout </option>
			<option value="electroniccity">Electronic City </option>
			<option value="attibele">Attibele </option>
			
		</select><br><br>
		<input type="submit" value ="Submit"><br><br>
		<span class="back">Already a Customer ?<a href = "track.jsp"> Track here </a><br><br></span>
	</center>
</form>

</body>
</html>