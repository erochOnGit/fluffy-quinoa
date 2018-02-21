<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Authentification</title>
</head>
<body>
<form action="formAuth" method="POST">
<legend>Acces Compte User:</legend><br>
<label for="AuthEmail">Email:</label>
<input type="text" id="AuthEmail" name="AuthEmail" /><br>
<label for="AuthPwd">Mot de Pass:</label>
<input type="text" id="AuthPwd" name="AuthPwd" /><br>
<input type="submit" id="connection" class="sansLabel" name="connection" value="Se connecter">
<!--   <input type="reset" id="rafraichir" class="sansLabel" name="rafraichir" value="rafraichir"> -->
</form>
</body>
</html>