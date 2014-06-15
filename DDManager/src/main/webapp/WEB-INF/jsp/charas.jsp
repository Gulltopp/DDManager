<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/WEB-INF/jsp/include.jsp" %>
<html>
<head>
<title>Welcome to DD Character Manager</title>
</head>
<body>
<h1>Ici on mettra la liste des persos</h1>
il est : ${now}
<c:out value="${model.now}"/>
<h2>Les persos (on fera du fmt plus tard)</h2>
<c:forEach items="${model.characters}" var="char">
	<div>
	<c:out value="${char.name}"/>: lv <c:out value="${char.level}"/>
	</div>
</c:forEach>
</body>
</html>