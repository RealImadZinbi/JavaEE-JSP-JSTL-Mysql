<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
    <%@ page import="java.util.*" %>
<%@ page import="com.prj.beans.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %><!DOCTYPE html>
<html>
    <head>
        <title>Stock de l'entreprise</title>
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
				<h1><center><strong> Stock de l'entreprise </strong></center></h1>
				
                <table class="table table ">
                  <thead>
                    <tr>
                      <th><h2>Nom du Fournisseur</h2></th>
                      <th><h2>Produit</h2></th>
                      <th><h2>Quantité</h2></th>
                      
                    </tr>
                     <% 
    ArrayList <Stock> list = new ArrayList <Stock> ();
     list =(ArrayList <Stock>)request.getAttribute("stock");
     for(int i=0;i<list.size();i++) {

    		%>
    					<tr>
    					<th>
    		    		<%=list.get(list.size()-1-i).getNomFournisseur() %> </th>
    		    		<th><%=list.get(list.size()-1-i).getNomProduit() %></th>
    		    		<th><%=list.get(list.size()-1-i).getQuantité() %></th>
          	
  						
    			</tr>
		           <% } %>
		    		
                  </thead> 
                  <tbody>
                  </tbody>
                  </table>
                  </div>
                  </div>
                  </body>
                  </html>