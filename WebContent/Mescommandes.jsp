<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
    <%@ page import="java.util.*" %>
<%@ page import="com.prj.beans.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %><!DOCTYPE html>
<html>
    <head>
        <title>Mes commandes</title>
        <meta charset="utf-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
        <link href='http://fonts.googleapis.com/css?family=Holtwood+One+SC' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="styles.css">
    </head>
    
    <body>
     	<form method ="post" action="<%= request.getContextPath() %>/update">
     	
		<ul class="nav nav-pills" style="margin-right:20px;margin-left:30px; margin-top:126px;">
        </ul>
		<div class="container admin">
            <div class="row">
				<ul class="nav nav-pills" style="margin-right:30px;margin-left:1000px; margin-top:-100px;">
				<a href="<%= request.getContextPath() %>/Menu.jsp" class="btn btn-success">Se deconnecter</a></h1>
                </ul>
				<h1><strong>Mes commandes   </strong><a href="<%= request.getContextPath() %>/Ajoutercommande.jsp" class="btn btn-order"><span class="glyphicon glyphicon-plus"></span> Nouvelle commande</a></h1>
				
                <table class="table table ">
                  <thead>
                    <tr>
                      <th>Nom du produit</th>
                      <th>Catégorie</th>
                      <th>Quantité</th>
                      <th>Date de la commande</th>
                      <th>Etat de la commande</th>
                      <th>Voir ma commande</th>
                      <th>Modifier</th>
                      <th>Supprimer</th>
                      <th>Commande reçu</th>
                    </tr>
          	
        <% 
    ArrayList <Commande> list = new ArrayList <Commande> ();
     list =(ArrayList <Commande>)request.getAttribute("commandes");
     for(int i=0;i<list.size();i++) {

    		%>
    					<tr>
    					<th>
    		    		<%=list.get(list.size()-1-i).getNomProduit() %> </th>
    		    		<th><%=list.get(list.size()-1-i).getCategorie() %></th>
    		    		<th><%=list.get(list.size()-1-i).getQuantite() %></th>
    		    		<th><%=list.get(list.size()-1-i).getDate() %></th>
    		    		<th><%=list.get(list.size()-1-i).getEtat() %></th>	
    		   	 	<th><a href="<%= request.getContextPath()%>/Consulter?id=<%=list.get(list.size()-1-i).getId() %>"><button type="button" class="btn btn-success">Consulter</button></a></th>
    		    		<th><div class="btn-group btn-group-lg">
  <a href="<%= request.getContextPath()%>/update?id=<%=list.get(list.size()-1-i).getId() %>"><button type="button" class="btn btn-warning"><span class="glyphicon glyphicon-pencil	
  "></span>Modifier</button></a>
</div></th>
  					<th>		<div class="btn-group btn-group-lg">
  <a href="<%= request.getContextPath()%>/delete?id=<%=list.get(list.size()-1-i).getId() %>"><button type="button" class="btn btn-danger"><span class="glyphicon glyphicon-remove	
  "></span>Supprimer</button></a>
  </div>
  						
  </th>
  	<th><a href="<%= request.getContextPath()%>/CommandeRecuServlet?id=<%=list.get(list.size()-1-i).getId() %>&quantite=<%=list.get(list.size()-1-i).getQuantite() %>&nomProduit=<%=list.get(list.size()-1-i).getNomProduit() %>"><button type="button" class="btn btn-success">J'ai reçu ma commande</button>
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