<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ page import="java.sql.*" %>
    <%@ page import="java.util.*" %>
<%@ page import="com.prj.beans.*" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Commande du clients</title>
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
        ArrayList<Fournisseur> liste=new ArrayList <Fournisseur>();

     list =(ArrayList <Commande>)request.getAttribute("description");
     liste=(ArrayList <Fournisseur>)request.getAttribute("UsernameList");
     for(int i=0;i<list.size();i++) {
    	 %>
     }
         <div class="container admin">
            <div class="row">
               <div class="col-sm-6">
                    <h1><strong>Commande du client</strong></h1>
                    <br>
                    <div class="form-group">

                        <label>Commande éfféctuée au nom de l'entreprise:</label> <%=list.get(list.size()-1-i).getNom() %>
                      </div>
                      <div class="form-group">

                      		               
                        <label>Username du client:</label> <%=list.get(list.size()-1-i).getUsername() %>
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
                      		
                      </div>
                    <br>
                    <div class="form-actions">
                      <a class="btn btn-primary" href="<%= request.getContextPath()%>/AllCommandeServlet"><span class="glyphicon glyphicon-arrow-left"></span> Retour</a>  
                    
                </div> 
              
                      </div>
                </div>
              
              <center>  <button type="button" class="btn btn-primary"  data-toggle="modal" data-target="#Modals" ><span class="glyphicon glyphicon-user	
              "></span> Affecter à un fournisseur</button> </li></center>
                
                    <div class="modal fade" id="Modals" tabindex="-1" role="dialog" aria-labelledby="Modals" aria-hidden="true">
                           
  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content">
                                <div class="modal-body">
                                                      		                               <form method ="POST" action="<%= request.getContextPath() %>/AffecterCommande">
                                
                <label for="username">Affecter à un fournisseur:</label>
                
                <select name="username" id="username">
    	<% for(int j=0;j<liste.size();j++)  { %>
    	
    <option value="<%=liste.get(liste.size()-1-j).getUsername() %>"><%=liste.get(liste.size()-1-j).getUsername() %></option>
   <% } %>
           </select>  
             <input id="id" name="id" type="hidden" value="<%=list.get(list.size()-1-i).getId() %>">
<input id="nom" name="nom" type="hidden" value="<%=list.get(list.size()-1-i).getNom() %>">
<input id="adresse" name="adresse" type="hidden" value="<%=list.get(list.size()-1-i).getAdresse() %>">
<input id="ville" name="ville" type="hidden" value="<%=list.get(list.size()-1-i).getVille() %>">
<input id="numero" name="numero" type="hidden" value="<%=list.get(list.size()-1-i).getNumero() %>">
<input id="nomp" name="nomp" type="hidden" value="<%=list.get(list.size()-1-i).getNomProduit() %>">
<input id="categorie" name="categorie" type="hidden" value="<%=list.get(list.size()-1-i).getCategorie() %>">
<input id="quantite" name="quantite" type="hidden" value="<%=list.get(list.size()-1-i).getQuantite() %>">
<input id="date" name="jour" type="hidden" value="<%=list.get(list.size()-1-i).getDate() %>">
<input id="description" name="description" type="hidden" value="<%=list.get(list.size()-1-i).getDescription() %>">
<% } %>
<button type="submit"  class="btn btn-success">Confirmer</button></th>
</form>
</div>
</div>
</div>
</div>
</div>

    </body>
             
    </body>
</html>
