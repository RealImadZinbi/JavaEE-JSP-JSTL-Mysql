<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ page import="java.sql.*" %>
    <%@ page import="java.util.*" %>
<%@ page import="com.prj.beans.*" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Listes des demandes de stages</title>
        <meta charset="utf-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
        <link href='http://fonts.googleapis.com/css?family=Holtwood+One+SC' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="styles.css">
    </head>
 <body>
        <% 
    ArrayList <Commande> list = new ArrayList <Commande> ();
     list =(ArrayList <Commande>)request.getAttribute("description");
     for(int i=0;i<list.size();i++) {
    	 %>
     }
         <div class="container admin">
            <div class="row">
               <div class="col-sm-6">
                    <h1><strong>Ma commande</strong></h1>
                    <br>
                    <form>
                    <div class="form-group">

                      		               
                        <label>Commande éfféctuée au nom de l'entreprise:</label> <%=list.get(list.size()-1-i).getNom() %>
                      </div>
                      <div class="form-group">

                      		               
                        <label>Nom du produit:</label> <%=list.get(list.size()-1-i).getNomProduit() %>
                      </div>
                      <div class="form-group">
                        <label>Description:</label><%=list.get(list.size()-1-i).getDescription() %>
                      </div>
                      <div class="form-group">
                      </div>
                      <div class="form-group">
                        <label>Ville:</label><%=list.get(list.size()-1-i).getVille() %>
                     </div>
                      <div class="form-group">
                        <label>Date de la commande:</label><%=list.get(list.size()-1-i).getDate() %>
                        

                      </div>
                     
                      <div class="form-group">
                      	<label>Téléphone:</label><%=list.get(list.size()-1-i).getNumero() %>
                      </div>
                      <div class="form-group">
                      	<label>Quantité:</label><%=list.get(list.size()-1-i).getQuantite() %>
                      </div>
                      <div class="form-group">
                      	<label>Catégorie:</label> <%=list.get(list.size()-1-i).getCategorie() %> 
                      		<% } %>
                      </div>
                    </form>
                    <br>
                    <div class="form-actions">
                      <a class="btn btn-primary" href="<%= request.getContextPath()%>/commandes"><span class="glyphicon glyphicon-arrow-left"></span> Retour</a>  
                    
                </div> 
              
                      </div>
                </div>
             
    </body>
</html>
