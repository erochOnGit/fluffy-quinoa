<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Inscription</title>
<link href="css/subscription.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<form action="SubSrv" method="post">
  		<fieldset>
    			<legend>Inscription</legend>
    			<p>Formulaire d'inscription, les champs (<span class="requis">*</span>) sont requis :</p>
    			<label for="firstName">Nom : <span class="requis">*</span></label>
    			<input type="text" name="firstName" id="firstName"><br>
    			<label for="lastName">Prénom : <span class="requis">*</span></label>
    			<input type="text" name="lastName" id="lastName"><br>
    			<label for="email">Adresse email <span class="requis">*</span></label>
    			<input type="email" name="email" id="email"><br>
    			<label for="pwd">Mot de passe <span class="requis">*</span></label>
    			<input type="password" name="pwd" id="pwd"><br>
    			<label for="pwdConfirm">Confirmation du mot de passe <span class="requis">*</span></label>
    			<input type="password" name="pwdConfirm" id="pwdConfirm"><br>
    			<input type="submit" class="sansLabel" value="Enregistrement">		
  		</fieldset>
	</form>
</body>
</html>