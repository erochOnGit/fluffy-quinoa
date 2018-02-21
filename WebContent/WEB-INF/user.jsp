<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mes Users</title>
<link type="text/css" rel="stylesheet" href="styles.css" />
</head>
<body>
	<c:import url="/WEB-INF/menu/menu.jsp" />
	<p>Vous êtes connecté(e) avec l'adresse ${sessionScope}
		${sessionScope.users[0].email}, vous avez bien accès à l'espace
		restreint.</p>
	<div>
		<c:forEach items="${sessionScope.users.values()}" var="item">
    ${item}<br>
		</c:forEach>
	</div>
</body>
</html>