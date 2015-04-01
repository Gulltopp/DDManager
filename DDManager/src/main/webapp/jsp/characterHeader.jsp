<header>
	<h1>Vue du personnage</h1>
	<div>
		<ul >
		<li style="display:inline;"><a href="#">Voir/&eacute;diter les items</a></li>--
		<li style="display:inline;"><a href="#">Voir/&eacute;diter les pouvoirs</a></li>--
		<li style="display:inline;"><a href="#">Voir/&eacute;diter les feats/features</a></li>--
		<li style="display:inline;"><a href="#">Voir/&eacute;diter les skills</a></li>--
		<li style="display:inline;"><a href="#">Pr&eacute;parer la feuille</a></li>
		</ul>
	</div>
	<c:url value="/j_spring_security_logout" var="logoutUrl" />
 
	<form action="${logoutUrl}" method="post" id="logoutForm">
	  <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
	  <input type="submit" value="logout">
	</form>
</header>