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
     	
		<ul class="nav nav-pills" style="margin-right:20px;margin-left:30px; margin-top:126px;">
        </ul>
		<div class="container admin">
            <div class="row">
				<ul class="nav nav-pills" style="margin-right:30px;margin-left:1000px; margin-top:-100px;">
				<a href="<%= request.getContextPath() %>/Menu.jsp" class="btn btn-success">Se deconnecter</a></h1>
                </ul>
				<h1><strong>Commande reçus </strong>   </h1>
				
                <table class="table table ">
                  <thead>
                    <tr>
                      <th>Nom du produit</th>
                      <th>Catégorie</th>
                      <th>Quantité</th>
                      <th>Date de la commande</th>
                      <th>Consulter la commande du client</th>
                      <th>Accepter</th>
                      <th>Rejeter</th>
                    </tr>
          	
        <% 
    ArrayList <Commande> list = new ArrayList <Commande> ();
     list =(ArrayList <Commande>)request.getAttribute("commandesFournisseur");
     for(int i=0;i<list.size();i++) {

    		%>
    					<tr>
    					<th>
    		    		<%=list.get(list.size()-1-i).getNomProduit() %> </th>
    		    		<th><%=list.get(list.size()-1-i).getCategorie() %></th>
    		    		<th><%=list.get(list.size()-1-i).getQuantite() %></th>
    		    		<th><%=list.get(list.size()-1-i).getDate() %></th>
    		   	 	<th><a href="<%= request.getContextPath()%>/ConsulterCommandeFournisseur?id=<%=list.get(list.size()-1-i).getId() %>"><button type="button" class="btn btn-primary">Consulter</button></a></th>
    		    		
  						
  						<th><a href="<%= request.getContextPath()%>/AccepterCommandeServlet?id=<%=list.get(list.size()-1-i).getIdentifiant() %>&etat=En cours de traitement&quantite=<%=list.get(list.size()-1-i).getQuantite() %>&username=<%=session.getAttribute("username") %>&nomp=<%=list.get(list.size()-1-i).getNomProduit() %>&identifiant=<%=list.get(list.size()-1-i).getIdentifiant() %> "><button type="button" class="btn btn-success"><span class="glyphicon glyphicon-ok	
  						"></span> Livrer la commande</button>
    		    		<th><a href="<%= request.getContextPath()%>/RefuserCommande?id=<%=list.get(list.size()-1-i).getIdentifiant() %>&etat=Refus de la commande&identifiant=<%=list.get(list.size()-1-i).getIdentifiant() %>"><button type="button" class="btn btn-danger"><span class="glyphicon glyphicon-remove	
    		    		"></span> Rejeter la commande</button>
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