package com.prj.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.prj.beans.Commande;
import com.prj.beans.Fournisseur;

public class ConsulterCommandeFournisseurDao {

	
	 public ArrayList<Commande> getDescription(int id) throws ClassNotFoundException {
		 	
		 String SELECT_COMMANDE_SQL = "SELECT * FROM CommandeFournisseur where id= ?"; 

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
	        	  commande.setNumero(rs.getString("numero"));
	        	  commande.setQuantite(rs.getString("quantite"));
	        	  commande.setVille(rs.getString("ville"));
	        	  commande.setDate(rs.getString("date"));
	        	  commande.setCategorie(rs.getString("categorie"));
	        	  commande.setNomProduit(rs.getString("nomProduit"));
	        	  commande.setId(rs.getInt("id"));
	        	  commande.setDescription(rs.getString("decription"));
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
	 public void etatCommande(int id) throws ClassNotFoundException {
			
			String ACCEPTER_COMMANDE_SQL= "update COMMANDE set etat = ?   where id = ?;" ;
			Class.forName("com.mysql.cj.jdbc.Driver");

		       try { Connection connection = DriverManager
			            .getConnection("jdbc:mysql://localhost:3306/prj?useUnicode=true&useJDBCComplian	tTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
	           PreparedStatement st = connection.prepareStatement(ACCEPTER_COMMANDE_SQL); {
	        	   st.setString(1, "vrai");
	        	   st.setInt(2, id);
					st.executeUpdate();		//Pour les INSERT !!

		           
		}
		       }
		       catch (Exception e)
		       {
		         System.err.println("Got an exception! ");
		         System.err.println(e.getMessage());
		       }
		    }

	    
	 
}
