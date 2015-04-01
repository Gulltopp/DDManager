<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/jsp/include.jsp"%>
<html>
<head>
<title>Welcome to DD Character Manager</title>
</head>
<body>
	<header>
	<h1>Login</h1>
	</header>
	<div>
		<c:if test="${not empty error}">
			<div class="error">${error}</div>
		</c:if>
		<c:if test="${not empty msg}">
			<div class="msg">${msg}</div>
		</c:if>

		<form name='loginForm' action="<c:url value='j_spring_security_check' />" method='POST'>


			<input type='text' name='username' value=''>
			<input type='password' name='password' />
			<input name="submit" type="submit" value="submit" />
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />

		</form>

	</div>
</body>
</html>