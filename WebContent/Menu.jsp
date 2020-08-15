<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Acceuil</title>
	<link rel="stylesheet" href="stil.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>
	<header>
		<div class="container">
			<nav> <center>
				<h1 class="brand"><span>ECOMMANDE</span></h1>
				<ul>
		
					<li><button type="button" class="btn btn-danger" data-toggle="modal" data-target="#exampleModalCenter"  > Connexion Client </button>
					
					
					<li><button type="button" class="btn btn-danger"  data-toggle="modal" data-target="#Modals" >Connexion Fournisseur</button> </li>
					<li><button type="button" class="btn btn-danger" data-toggle="modal" data-target="#Moda" >Espace administrateur</button> </li>
					<li><button type="button" class="btn btn-danger" data-toggle="modal" data-target="#Modale" >Inscription Fournisseur</button> 
					<li><button type="button" class="btn btn-danger" data-toggle="modal" data-target="#Modal"  > Inscription Client </button>
					</center>
				</ul>
			</nav>
		</div>
	</header>
	
	<div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content">
      <div class="modal-body">
		<div class="container">
        <div class="row">
			<div class="col-md-5 mx-auto">
			<div id="first">
				<div class="myform form ">
					 <div class="logo mb-3">
						 <div class="col-md-12 text-center">
							<h1>Login</h1>
						 </div>
					</div>
	<form method ="post" action="<%= request.getContextPath() %>/login"/login>
                           <div class="form-group">
                              <label for="exampleInputEmail1"><h2>Nom d'utilisateur</h2></label>
                              <input type="text" name="username"  class="form-control" id="username" aria-describedby="emailHelp" placeholder="Nom d'utilisateur">
                           </div>
                           <div class="form-group">
                              <label for="exampleInputEmail1"><h2>Mot de passe</h2></label>
                              <input type="password" name="password" id="password"  class="form-control" aria-describedby="emailHelp" placeholder="Mot de passe">
                           </div>
                          
                           
                           <div class="col-md-12 text-center ">
                              <button type="submit" class=" btn btn-block mybtn btn-primary tx-tfm">Login</button>
                           </div>
                          <% if(request.getAttribute("error") != null) {%>
    <div class="error"><h3><%=request.getAttribute("error")%></h3></div>
<%}%>
                           </form>
                           </div>
                           </div>
                           </div>
                           </div>
                           </div>
                           </div>
                           </div>
                           </div>
                           </div>
                           
                        
                                                      <div class="modal fade" id="Modal" tabindex="-1" role="dialog" aria-labelledby="Modal" aria-hidden="true">
                           
  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content">
                                <div class="modal-body">
                          <div id="second">
			      <div class="myform form ">
                        <div class="logo mb-3">
                           <div class="col-md-12 text-center">
                              <h1 >Signup</h1>
                           </div>
                        </div>
  <form action="<%= request.getContextPath() %>/register" method="post">
                           <div class="form-group">
                              <label for="exampleInputEmail1">Nom</label>
                              <input type="text"  name="nom" class="form-control" id="nom" aria-describedby="emailHelp" placeholder="Veuillez saisir votre nom">
                           </div>
                           <div class="form-group">
                              <label for="exampleInputEmail1">Prenom</label>
                              <input type="text"  name="prenom" class="form-control" id="prenom" aria-describedby="emailHelp" placeholder="Veuillez saisir votre prenom">
                           </div>
                           <div class="form-group">
                              <label for="exampleInputEmail1">Username</label>
                              <input type="text" name="username"  class="form-control" id="email" aria-describedby="emailHelp" placeholder="Veuillez saisir votre nom d'utilisateur)">
                           </div>
                           <div class="form-group">
                              <label for="exampleInputEmail1">Password</label>
                              <input type="password" name="password" id="password"  class="form-control" aria-describedby="emailHelp" placeholder="Veuillez saisir un mot de passe">
                           </div>
                            <div class="form-group">
                              <label for="exampleInputEmail1">Confirmez votre mot de passe</label>
                              <input type="password" name="password2" id="password2"  class="form-control" aria-describedby="emailHelp" placeholder="Confirmez votre mot de passe">
                           </div>
                            <% if(request.getAttribute("error") != null) {%>
    <div class="error"><h3><%=request.getAttribute("error")%></h3></div>
<%}%>
<div class="form-group">
                              <label for="exampleInputEmail1">Adresse email</label>
                              <input type="email" name="email"  class="form-control" id="email" aria-describedby="emailHelp" placeholder="Saisissez votre email">
                           </div>
                           <div class="form-group">
                              <label for="exampleInputEmail1">Numéro de téléphone</label>
                              <input type="text" name="phone"  class="form-control" id="phone" aria-describedby="emailHelp" placeholder="Entrez votre numero de telephone">
                           </div>
                           <div class="form-group">
                              <label for="exampleInputEmail1">Ville</label>
                              <input type="text" name="ville"  class="form-control" id="phone" aria-describedby="emailHelp" placeholder="Ville">
                           </div>
                           <div class="col-md-12 text-center mb-3">
                              <button type="submit" class=" btn btn-block mybtn btn-primary tx-tfm">S'enregistrer</button>
                           </div>
                           <div class="col-md-12 ">
                              <div class="form-group">
                                 <p class="text-center"><a href="<%= request.getContextPath()%>/Menu.jsp" id="signin">Vous possedez dejà un compte ?</a></p>
                           </div>
                           </div>
                           </form>
                           </div>
                           </div>
                           </div>
                           </div>
                           </div>
                           </div>
                          
                                                      <div class="modal fade" id="Modale" tabindex="-1" role="dialog" aria-labelledby="Modale" aria-hidden="true">
                           
  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content">
                                <div class="modal-body">
                          <div id="second">
			      <div class="myform form ">
                        <div class="logo mb-3">
                           <div class="col-md-12 text-center">
                              <h1 >Signup</h1>
                           </div>
                        </div>
  <form action="<%= request.getContextPath() %>/registerFournisseur" method="post">
                           <div class="form-group">
                              <label for="exampleInputEmail1">Nom du fournisseur</label>
                              <input type="text"  name="nom" class="form-control" id="nom" aria-describedby="emailHelp" placeholder="Veuillez saisir le nom de l'entreprise fournisseur">
                           </div>
                           
                           <div class="form-group">
                              <label for="exampleInputEmail1">Username</label>
                              <input type="text" name="username"  class="form-control" id="email" aria-describedby="emailHelp" placeholder="Veuillez saisir votre nom d'utilisateur">
                           </div>
                           <div class="form-group">
                              <label for="exampleInputEmail1">Password</label>
                              <input type="password" name="password" id="password"  class="form-control" aria-describedby="emailHelp" placeholder="Veuillez saisir un mot de passe">
                           </div>
                            <div class="form-group">
                              <label for="exampleInputEmail1">Confirmez votre mot de passe</label>
                              <input type="password" name="password2" id="password2"  class="form-control" aria-describedby="emailHelp" placeholder="Confirmez votre mot de passe">
                           </div>
                            <% if(request.getAttribute("errore") != null) {%>
    <div class="error"><h3><%=request.getAttribute("errore")%></h3></div>
<%}%>
<div class="form-group">
                              <label for="exampleInputEmail1">Adresse email</label>
                              <input type="email" name="email"  class="form-control" id="email" aria-describedby="emailHelp" placeholder="Saisissez votre email">
                           </div>
                           <div class="form-group">
                              <label for="exampleInputEmail1">Numéro de téléphone</label>
                              <input type="text" name="telephone"  class="form-control" id="phone" aria-describedby="emailHelp" placeholder="Entrez votre numero de telephone">
                           </div>
                           <div class="form-group">
                              <label for="exampleInputEmail1">Ville</label>
                              <input type="text" name="ville"  class="form-control" id="phone" aria-describedby="emailHelp" placeholder="Ville">
                           </div>
                           <div class="col-md-12 text-center mb-3">
                              <button type="submit" class=" btn btn-block mybtn btn-primary tx-tfm">S'enregistrer</button>
                           </div>
                           <div class="col-md-12 ">
                              <div class="form-group">
                                 <p class="text-center"><a href="<%= request.getContextPath()%>/Menu.jsp" id="signin">Vous possedez dejà un compte ?</a></p>
                          </div>
                          </div>
                           
                   </form>
                   </div>
                   </div>
                   </div>
                   </div>
                   </div>
                   </div>
                   
                   <div class="modal fade" id="Modals" tabindex="-1" role="dialog" aria-labelledby="Modals" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content">
      <div class="modal-body">
		<div class="container">
        <div class="row">
			<div class="col-md-5 mx-auto">
			<div id="first">
				<div class="myform form ">
					 <div class="logo mb-3">
						 <div class="col-md-12 text-center">
							<h1>Login</h1>
						 </div>
					</div>
	<form method ="post" action="<%= request.getContextPath() %>/LoginFournisseur">
                           <div class="form-group">
                              <label for="exampleInputEmail1"><h2>Nom d'utilisateur</h2></label>
                              <input type="text" name="username"  class="form-control" id="username" aria-describedby="emailHelp" placeholder="Nom d'utilisateur">
                           </div>
                           <div class="form-group">
                              <label for="exampleInputEmail1"><h2>Mot de passe</h2></label>
                              <input type="password" name="password" id="password"  class="form-control" aria-describedby="emailHelp" placeholder="Mot de passe">
                           </div>
                          
                           
                           <div class="col-md-12 text-center ">
                              <button type="submit" class=" btn btn-block mybtn btn-primary tx-tfm">Login</button>
                           </div>
                   </form>
                   </div>
                   </div>
                   </div>
                   </div>
                   </div>
                   </div>
                   </div>
                   </div>
                   </div>
                   
                   <div class="modal fade" id="Moda" tabindex="-1" role="dialog" aria-labelledby="Moda" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content">
      <div class="modal-body">
		<div class="container">
        <div class="row">
			<div class="col-md-5 mx-auto">
			<div id="first">
				<div class="myform form ">
					 <div class="logo mb-3">
						 <div class="col-md-12 text-center">
							<h1>Login</h1>
						 </div>
					</div>
	<form method ="post" action="<%= request.getContextPath() %>/LoginAdministrateur">
                           <div class="form-group">
                              <label for="exampleInputEmail1"><h2>Nom d'utilisateur</h2></label>
                              <input type="text" name="username"  class="form-control" id="username" aria-describedby="emailHelp" placeholder="Nom d'utilisateur">
                           </div>
                           <div class="form-group">
                              <label for="exampleInputEmail1"><h2>Mot de passe</h2></label>
                              <input type="password" name="password" id="password"  class="form-control" aria-describedby="emailHelp" placeholder="Mot de passe">
                           </div>
                          
                           
                           <div class="col-md-12 text-center ">
                              <button type="submit" class=" btn btn-block mybtn btn-primary tx-tfm">Login</button>
                           </div>
                           </form>
                           </div>
                           </div>
                           </div>
                           </div>
                           </div>
                           </div>
                           </div>
                           </div>
                           </div>
                           
                           </body>
                           </html>
                           