<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="TrajetsSrv" method="post">
	<fieldset>
		<legend>Propose a trip</legend>
		<label for="departure">Departure <span class="requis">*</span></label>
		<input type="text" name="departure" id="departure"><br>
		<label for="arrival">Arrival <span class="requis">*</span></label>
		<input type="text" name="arrival" id="arrival"><br>
		<label for="dep_date">Departs at <span class="requis">*</span></label>
		<input type="date" name="dep_date" id="dep_date"><br>
		<label for="arr_date">Arrives at <span class="requis">*</span></label>
		<input type="date" name="arr_date" id="arr_date"><br>
		<input type="submit" class="sansLabel" value="Submit">		
	</fieldset>
</form>
</body>
</html>