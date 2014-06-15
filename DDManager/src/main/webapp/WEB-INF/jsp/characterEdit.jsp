<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/WEB-INF/jsp/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
	<head>
		<title>Welcome to DD Character Manager</title>
	</head>
	<body>
	
		<form:form method="post" commandName="characterUpdate">
			<form:input path="name"/>
			<form:input path="playerName"/>
			<form:input path="race"/>
			<form:input path="level"/>
			<form:input path="strength"/>
			<form:input path="constitution"/>
			<form:input path="dexterity"/>
			<form:input path="intelligence"/>
			<form:input path="wisdom"/>
			<form:input path="charisma"/>
			<form:input path="speed"/>
			<form:input path="maxHp"/>
			<form:input path="bloodiedValue"/>
			<form:input path="surgesPerDay"/>
			<form:input path="surgeValue"/>
			<input type="submit" align="center" value="Execute">
		</form:form>
		<a href="<c:url value="/characters.html"/>">Retour à la liste</a>
	</body>
</html>
