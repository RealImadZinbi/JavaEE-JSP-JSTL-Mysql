<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.prj.beans.*" %>
<%@ page import="com.prj.dao.*" %>
<%@ page import="com.prj.servlet.*" %>

<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  
    	
        <% 
    ArrayList <Commande> list = new ArrayList <Commande> ();
     list =(ArrayList <Commande>)request.getAttribute("commandes");

    		%>
    		<h1><%=list.get(1).getAdresse()%> </h1>
      
    
</body>
</html>