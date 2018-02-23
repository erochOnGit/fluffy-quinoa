<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="UserSrv" method="post">
  		<fieldset>
    			<legend>Profil</legend>
    			<label for="name">Nom : </label>
    			<input type="text" name="name" id="name" value="john"><br>
    			<label for="lastName">Prénom : </label>
    			<input type="text" name="lastName" id="lastName" value="doe"><br>
    			<label for="mail">Mail : </label>
    			<input type="text" name="mail" id="mail" value="johndoe@live.fr"><br>
    			<label for="tel">Tel : </label>
    			<input type="text" name="tel" id="tel" value="0608562415"><br>
    			<a href="mdp.jsp">Changez le mot de passe</a><br>
    			<input type="submit" value="Enregistrer">		
  		</fieldset>
	</form>

</body>
</html>