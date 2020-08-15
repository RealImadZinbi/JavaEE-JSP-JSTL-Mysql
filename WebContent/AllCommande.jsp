<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
    <%@ page import="java.util.*" %>
<%@ page import="com.prj.beans.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %><!DOCTYPE html>
<html>
    <head>
        <title>Commandes des clients</title>
        <meta charset="utf-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
        <link href='http://fonts.googleapis.com/css?family=Holtwood+One+SC' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="styles.css">
    </head>
    
    <body>
    	 	
		<ul class="nav nav-pills" style="margin-right:20px;margin-left:30px; margin-top:126px;">
        </ul>
		<div class="container admin">
            <div class="row">
				<ul class="nav nav-pills" style="margin-right:600px;margin-left:450px; margin-top:-120px;">
				<a href="<%= request.getContextPath() %>/Menu.jsp" class="btn btn-success"><h4>Quitter l'espace administrateur</h4></a></h1>
                </ul>
				<h1><strong>Commandes des clients  </strong></h1>
				
                <table class="table table ">
                  <thead>
                    <tr>
                      <th>Nom du produit</th>
                      <th>Catégorie</th>
                      <th>Quantité</th>
                      <th>Date de la commande</th>
                      <th>Consulter la commande ou l'affecter à un fournisseur</th>
                      <th>Modifier</th>
                      <th>Supprimer</th>
                    </tr>
          	
        <% 
    ArrayList <Commande> list = new ArrayList <Commande> ();
        ArrayList<Fournisseur> liste=new ArrayList <Fournisseur>();
     list =(ArrayList <Commande>)request.getAttribute("allcommandes");
     for(int i=0;i<list.size();i++) {

    		%>	
    					<tr>
    					<th>
    		    		<%=list.get(list.size()-1-i).getNomProduit() %> </th>
    		    		<th><%=list.get(list.size()-1-i).getCategorie() %></th>
    		    		<th><%=list.get(list.size()-1-i).getQuantite() %></th>
    		    		<th><%=list.get(list.size()-1-i).getDate() %></th>
 

    		    		<th><a href="<%= request.getContextPath()%>/ConsulterCommande?id=<%=list.get(list.size()-1-i).getId() %>"><button type="button" class="btn btn-primary"><span class="glyphicon glyphicon-eye-open	
    		    		"></span> Plus de details sur la commande</button></a></th>
    		    		<th><div class="btn-group btn-group-lg">
  <a href="<%= request.getContextPath()%>/UpdateServletAdmin?id=<%=list.get(list.size()-1-i).getId() %>"><button type="button" class="btn btn-warning"><span class="glyphicon glyphicon-pencil	
  "></span> Modifier</button></a>
</div></th>
  					<th>		<div class="btn-group btn-group-lg">
  <a href="<%= request.getContextPath()%>/DeleteCommande?id=<%=list.get(list.size()-1-i).getId() %>"><button type="button" class="btn btn-danger"><span class="glyphicon glyphicon-remove-sign	
  ">  Supprimer</button></a>
  </div>
  						
  </th>
    			</tr>
    		<% } %>
    		
                  </thead> 
                  <tbody>
                  </tbody>
                  </table>
                  </div>
                  </div>
                  </body>
                  </form>
                  </html>