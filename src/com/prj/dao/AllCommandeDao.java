package com.prj.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.prj.beans.Commande;
import com.prj.beans.Fournisseur;

public class AllCommandeDao {
		
	 public ArrayList<Commande> getCommande() throws ClassNotFoundException {
		 	
		 String INSERT_USERS_SQL = "SELECT * FROM commande "; 

	        ArrayList <Commande> list = new ArrayList <Commande> ();
	        

			Class.forName("com.mysql.cj.jdbc.Driver");

	       try { Connection connection = DriverManager
		            .getConnection("jdbc:mysql://localhost:3306/prj?useUnicode=true&useJDBCComplian	tTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
	           PreparedStatement st = connection.prepareStatement(INSERT_USERS_SQL); {
	           System.out.println(st);
	           ResultSet rs = st.executeQuery();

	           while (rs.next())
	           {
	        	   	Commande commande = new Commande();
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

	 	}

	 

