package com.prj.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.prj.beans.Commande;
import com.prj.beans.Fournisseur;

public class ListeFournisseurDao {
	public ArrayList<Fournisseur> getUsernameFournisseur() throws ClassNotFoundException {
	 	
		 String SELECT_CLIENT_SQL = "SELECT username FROM Founisseurs "; 

	        ArrayList <Fournisseur> list = new ArrayList <Fournisseur> ();
	          

			Class.forName("com.mysql.cj.jdbc.Driver");

	       try { Connection connection = DriverManager
		            .getConnection("jdbc:mysql://localhost:3306/prj?useUnicode=true&useJDBCComplian	tTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
	           PreparedStatement st = connection.prepareStatement(SELECT_CLIENT_SQL); {
	           System.out.println(st);
	           ResultSet rs = st.executeQuery();

	           while (rs.next())
	           {
	               Fournisseur fournisseur =new Fournisseur();

	               fournisseur.setUsername(rs.getString("username"));
	        	   list.add(fournisseur);
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
	
	public ArrayList<Fournisseur> getEtatFournisseur() throws ClassNotFoundException {
	 	
		 String SELECT_Fournisseur_SQL = "SELECT Statut FROM Founisseurs "; 

	        ArrayList <Fournisseur> list = new ArrayList <Fournisseur> ();
	          

			Class.forName("com.mysql.cj.jdbc.Driver");

	       try { Connection connection = DriverManager
		            .getConnection("jdbc:mysql://localhost:3306/prj?useUnicode=true&useJDBCComplian	tTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
	           PreparedStatement st = connection.prepareStatement(SELECT_Fournisseur_SQL); {
	           System.out.println(st);
	           ResultSet rs = st.executeQuery();

	           while (rs.next())
	           {
	               Fournisseur fournisseur =new Fournisseur();

	               fournisseur.setEtat(rs.getInt("Statut"));
	        	   list.add(fournisseur);
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
