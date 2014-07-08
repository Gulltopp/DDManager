<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/WEB-INF/jsp/include.jsp"%>
<html>
<head>
<title>Welcome to DD Character Manager</title>
</head>
<body>
	<h1>Ici on mettra la liste des persos</h1>
	<h2>Les persos (on fera du fmt plus tard)</h2>


	<c:forEach items="${charakterList}" var="currentChar">
		<div>${currentChar.name}</div><a href="delete/${currentChar.id}">delete</a>
	</c:forEach>


	<h2>Ajouter un perso</h2>

	<form:form method="post" action="add.html" commandName="charakter">
 
name: <form:input path="name" />		<br />
playername: <form:input path="playerName" />		<br />
characterClass: <form:input path="characterClass" />		<br />
Race: <form:input path="race" />
level: <form:input path="level" />		<br />
experience: <form:input path="experience" />		<br />
strength:<form:input path="strength" />		<br />
constitution:<form:input path="constitution" />		<br />
dexterity: <form:input path="dexterity" />		<br />
intelligence:<form:input path="intelligence" />		<br />
wisdom: <form:input path="wisdom" />		<br />
charisma: <form:input path="charisma" />		<br />
speed: <form:input path="speed" />		<br />
maxHp:<form:input path="maxHp" />		<br />
bloodiedValue: <form:input path="bloodiedValue" />		<br />
surgesPerDay: <form:input path="surgesPerDay" />		<br />
surgeValue:<form:input path="surgeValue" />		<br />
<input type="submit" value="Envoyer"/>
	</form:form>


</body>
</html>