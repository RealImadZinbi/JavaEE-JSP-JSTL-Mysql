<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.prj.beans.*" %>
<%@ page import="java.util.List" %>
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%  HttpSession session2 = request.getSession();
String username = (String) session.getAttribute("username");
  ArrayList<Commande> commandes = new ArrayList<Commande>();
   commandes = (ArrayList) request.getAttribute("Mescommandes");
   String name = commandes.get(1).getNom();
   System.out.println(name);
%>
</body>
</html>