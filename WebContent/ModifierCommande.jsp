<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
     <title>Modifier ma commande</title>
     <link rel="stylesheet" type="text/css" href="stile.css">
     <style type="text/css">
    body{
      background-image: url(entrepot.jpg);
      background-size: cover;
      background-attachment: fixed;
    }
  </style>
</head>

<div class="container">
  <h1>Modifier votre commande</h1>
<form method ="post" action="<%= request.getContextPath() %>/update">
    <label for="nom">Nom:</label>
    <input type="text" id="nom" name="nom" placeholder="Nom de l'entreprise">
    <label for="prenom">Adresse de l'entreprise:</label>
    <input type="text" id="prenom" name=adresse placeholder="Adresse de l'entreprise">
     <label for="ville">Ville:</label>
    <input type="text" id="ville" name="ville" placeholder="Ville">
    <label for="numero">Numero de Telephone de l'entreprise:</label>
    <input type="text" id="numero" name="numero" placeholder="Numero">
            <label for="categorie">Catégorie du produit:</label>
    
       <h2><select name="categorie"  id="categorie" style="width: 400px height: 900px";> 
                <option value="" disabled selected hidden>Veuillez choisir une catégorie </option>
                <option value="Electroménager">Electroménager</option>
                <option value="High Tech">High Tech</option>
                <option value="Meubles et accéssoire">Meubles et accéssoires</option>

                </select></h2>
        <label for="nomp">Nom du produit:</label>
    <input type="text" id="nomp" name="nomp" placeholder="Nom du produit">  </tr>       
   <label for="quantite">Quantité:</label>
    <input type="text" id="quantite" name="quantite" placeholder="Quantité">
          <label for="jour">Date de la commande: </label>
   <label for="profil">Description:</label>
    <textarea id="description" name="description" placeholder="Détaillez votre commande" style="height:100px"></textarea>
        
      <input type="datetime" name="jour" placeholder="Date dd/mm/yyyy" min="2019-01-01" max="2019-7-31" style='  border:none;
border-bottom:1px solid #757575' required />


  



   

    <input type="submit" name="depot" value="Modifier" style="width: 400px height: 900px" >
      </div>
    
  </form>
 
</div>
