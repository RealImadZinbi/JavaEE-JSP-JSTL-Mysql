package com.prj.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.prj.beans.Client;
import com.prj.beans.Commande;


public class ListeClientDao {
	public ArrayList<Client> getUsernameClient() throws ClassNotFoundException {
	 	
		 String SELECT_CLIENT_SQL = "SELECT username FROM Client "; 

	        ArrayList <Client> list = new ArrayList <Client> ();
	          

			Class.forName("com.mysql.cj.jdbc.Driver");

	       try { Connection connection = DriverManager
		            .getConnection("jdbc:mysql://localhost:3306/prj?useUnicode=true&useJDBCComplian	tTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
	           PreparedStatement st = connection.prepareStatement(SELECT_CLIENT_SQL); {
	           System.out.println(st);
	           ResultSet rs = st.executeQuery();

	           while (rs.next())
	           {
	               Client client =new Client();

	               client.setUsername(rs.getString("username"));
	        	   list.add(client);
	           }
	            st.close();
	       }
	       }
	       catch (Exception e)
	       {
	         System.err.println("Got an exception! ");
	         System.err.println(e.getMessage());
	       }
	       	return list;
}
	public ArrayList<Commande> getNombreCommande(String username) throws ClassNotFoundException {
	 	
		 String SELECT_CLIENT_SQL = "SELECT count(*)  FROM Commande where username =?"; 

	        ArrayList <Commande> list = new ArrayList <Commande> ();
	        

			Class.forName("com.mysql.cj.jdbc.Driver");

	       try { Connection connection = DriverManager
		            .getConnection("jdbc:mysql://localhost:3306/prj?useUnicode=true&useJDBCComplian	tTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
	           PreparedStatement st = connection.prepareStatement(SELECT_CLIENT_SQL); {
	        	   st.setString(1, username);
	           System.out.println(st);
	           ResultSet rs = st.executeQuery();

	          
	            st.close();
	       }
	       }
	       catch (Exception e)
	       {
	         System.err.println("Got an exception! ");
	         System.err.println(e.getMessage());
	       }
	       	return list;
}
	public ArrayList<Client> getEtatClient() throws ClassNotFoundException {
	 	
		 String SELECT_CLIENT_SQL = "SELECT Statut FROM Client "; 

	        ArrayList <Client> list = new ArrayList <Client> ();
	          

			Class.forName("com.mysql.cj.jdbc.Driver");

	       try { Connection connection = DriverManager
		            .getConnection("jdbc:mysql://localhost:3306/prj?useUnicode=true&useJDBCComplian	tTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
	           PreparedStatement st = connection.prepareStatement(SELECT_CLIENT_SQL); {
	           System.out.println(st);
	           ResultSet rs = st.executeQuery();

	           while (rs.next())
	           {
	               Client client =new Client();

	               client.setEtat(rs.getInt("Statut"));
	        	   list.add(client);
	           }
	            st.close();
	       }
	       }
	       catch (Exception e)
	       {
	         System.err.println("Got an exception! ");
	         System.err.println(e.getMessage());
	       }
	       	return list;
}
}
