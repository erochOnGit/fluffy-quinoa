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
    			<legend>Changement mot de passe</legend>
    			<label for="oldPwd">Ancien mot de passe : </label>
    			<input type="text" name="oldPwd" id="oldPwd"><br>
    			<label for="newPwd">Nouveau mot de passe : </label>
    			<input type="text" name="newPwd" id="newPwd"><br>
    			<label for="confirmPwd">Confirmation nouveau mot de passe : </label>
    			<input type="text" name="confirmPwd" id="confirmPwd"><br>
    			<a href="profil.jsp">Enregistrer</a>		
  		</fieldset>
	</form>

</body>
</html>