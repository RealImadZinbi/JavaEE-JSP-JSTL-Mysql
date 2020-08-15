<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Acceuil</title>
	<link rel="stylesheet" href="stil.css">
</head>
<body>
	<header>
		<div class="container">
			<nav>
				<h1 class="brand"><a href="Menu.jsp">Deconnexion</a></h1>
				<ul>
					<li><a href="<%= request.getContextPath()%>/commandes">Mes commandes</a></li>
					<li><a href="<%=request.getContextPath()%>/Ajoutercommande.jsp">Ajouter une commande</a></li>
					<li><a href="">Modifier mon mot de passe</a></li>
					
				</ul>
			</nav>

		</div>
	</header>
</body>		
  
</html>>