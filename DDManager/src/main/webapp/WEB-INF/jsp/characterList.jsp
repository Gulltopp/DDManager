<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/WEB-INF/jsp/include.jsp"%>
<html>
<head>
<title>Welcome to DD Character Manager</title>
</head>
<body>
	<h1>Ici on mettra la liste des persos</h1>
	<h2>Les persos (on fera du fmt plus tard)</h2>
	<c:forEach items="${myModel.characters}" var="currentChar">
		<div>${currentChar.name}</div>
		<div><a href="<c:url  value="/characterView.html"/>?characterName=${currentChar.name}">Voir</a></div>
	</c:forEach>
</body>
</html>