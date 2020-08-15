package com.prj.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.prj.beans.Commande;
import com.prj.beans.Fournisseur;

public class ConsulterCommandeDao {
	 public ArrayList<Commande> getDescription(int id) throws ClassNotFoundException {
		 	
		 String SELECT_COMMANDE_SQL = "SELECT * FROM commande where id= ?"; 

	        ArrayList <Commande> list = new ArrayList <Commande> ();
	        

			Class.forName("com.mysql.cj.jdbc.Driver");

	       try { Connection connection = DriverManager
		            .getConnection("jdbc:mysql://localhost:3306/prj?useUnicode=true&useJDBCComplian	tTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
	           PreparedStatement st = connection.prepareStatement(SELECT_COMMANDE_SQL); {
	        	   st.setInt(1, id);
	           System.out.println(st);
	           ResultSet rs = st.executeQuery();

	           while (rs.next())
	           {
	               Commande commande=new Commande();

	        	  commande.setUsername(rs.getString("username"));
	        	  commande.setAdresse(rs.getString("adresse"));
	        	  commande.setNom(rs.getString("nomentreprise"));
	        	  commande.setNumero(rs.getString("numero"));
	        	  commande.setQuantite(rs.getString("quantite"));
	        	  commande.setVille(rs.getString("ville"));
	        	  commande.setDate(rs.getString("date"));
	        	  commande.setCategorie(rs.getString("categorie"));
	        	  commande.setNomProduit(rs.getString("nomProduit"));
	        	  commande.setId(rs.getInt("id"));
	        	  commande.setDescription(rs.getString("Description"));
	        	   list.add(commande);
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
	    
	 	public  ArrayList <Fournisseur> getUsername() throws ClassNotFoundException {   
	 		String SELECT_USERNAME_SQL = "SELECT username FROM Founisseurs ;";
	        ArrayList <Fournisseur> list = new ArrayList <Fournisseur> ();
	    	Class.forName("com.mysql.cj.jdbc.Driver");

		       try { Connection connection = DriverManager
			            .getConnection("jdbc:mysql://localhost:3306/prj?useUnicode=true&useJDBCComplian	tTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
	           PreparedStatement st = connection.prepareStatement(SELECT_USERNAME_SQL); {
		           System.out.println(st);
		           ResultSet rs = st.executeQuery();
		           while (rs.next())
		           {
		        	   Fournisseur fournisseur = new Fournisseur();
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
}
