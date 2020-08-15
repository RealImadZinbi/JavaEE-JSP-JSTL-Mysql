package com.prj.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.prj.beans.Commande;

public class MesCommandeFournisseursDao {
	 public ArrayList<Commande> getCommande(String user) throws ClassNotFoundException {
		 	
		 String INSERT_USERS_SQL = "SELECT * FROM commandeFournisseur where username= ? and etat = '0' "; 

	        ArrayList <Commande> list = new ArrayList <Commande> ();
	        

			Class.forName("com.mysql.cj.jdbc.Driver");

	       try { Connection connection = DriverManager
		            .getConnection("jdbc:mysql://localhost:3306/prj?useUnicode=true&useJDBCComplian	tTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
	           PreparedStatement st = connection.prepareStatement(INSERT_USERS_SQL); {
	        	   st.setString(1,user);
	           System.out.println(st);
	           ResultSet rs = st.executeQuery();

	           while (rs.next())
	           {
	        	   	Commande commande = new Commande();
	        	  commande.setUsername(rs.getString("username"));
	        	  commande.setAdresse(rs.getString("adresse"));
	        	  commande.setNumero(rs.getString("numero"));
	        	  commande.setQuantite(rs.getString("quantite"));
	        	  commande.setVille(rs.getString("ville"));
	        	  commande.setDate(rs.getString("date"));
	        	  commande.setCategorie(rs.getString("categorie"));
	        	  commande.setNomProduit(rs.getString("nomProduit"));
	        	  commande.setId(rs.getInt("id"));
	        	  commande.setDescription(rs.getString("decription"));
	        	  commande.setIdentifiant(rs.getInt("identifiant"));
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
