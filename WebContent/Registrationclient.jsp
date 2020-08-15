<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inscription en tant que client</title>
</head>
     <link rel="stylesheet" type="text/css" href="st.css">

<body>
  <form action="<%= request.getContextPath() %>/register" method="post">
    <div class="login-box">
  <h1>Inscription</h1>
   <div class="textbox">
    <i class="fa fa-user" aria-hidden="true"></i>

    <input type="text" placeholder="Nom" name="nom" value="">
  </div>
   <div class="textbox">
    <i class="fa fa-user" aria-hidden="true"></i>

    <input type="text" placeholder="Prenom" name="prenom" value="">
  </div>
  <div class="textbox">
    <i class="fa fa-user" aria-hidden="true"></i>

    <input type="text" placeholder="Identifiant" name="username" value="">
  </div>
  <div class="textbox">
    <i class="fa fa-unlock-alt" aria-hidden="true"></i>
    
    <input type="password" placeholder="Mot de passe" name="password" value="">
  </div>
   <div class="textbox">
    <i class="fa fa-unlock-alt" aria-hidden="true"></i>

    <input type="password" placeholder="Confirmez votre mot de passe" name="password2" value="">
   
  </div>
  <div class="textbox">
    <i class="fa fa-envelope" aria-hidden="true"></i>
        <input type="email" placeholder="Adresse email" name="email" value="">
   </div>
   <div class="textbox">
      <i class="fa fa-phone" aria-hidden="true"></i>

      <input type="text" placeholder="Numero de telephone" name="phone" value="">
    </div>
    
    <div class="textbox">
      <i class="fa fa-id-card-o" aria-hidden="true"></i>

      <input type="text" placeholder="Ville" name="ville" value="">
    </div> 
  <button class="btn" type="submit" name="register_btn" >Confirmer</button>

</div>
</body>
</html>