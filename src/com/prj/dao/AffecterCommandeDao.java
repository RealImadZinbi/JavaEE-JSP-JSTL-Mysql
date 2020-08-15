package com.prj.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.prj.beans.Commande;
import com.prj.beans.Fournisseur;

public class AffecterCommandeDao {
	 public ArrayList<Commande> getCommandeFournisseur(int id) throws ClassNotFoundException {
		 	
		 String SELECT_COMMANDE_SQL = "SELECT * FROM commande where id =?"; 

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
	 public void ajouterCommande(Commande commande) throws ClassNotFoundException{
		 String INSERT_USERS_SQL = "INSERT INTO CommandeFournisseur(nom,adresse,ville,numero,categorie,nomProduit,quantite,date,decription,username,identifiant) VALUES(?,?,?,?,?,?,?,?,?,?,?) ;";

		 Class.forName("com.mysql.cj.jdbc.Driver");

			try (Connection connection = DriverManager
		            .getConnection("jdbc:mysql://localhost:3306/prj?useUnicode=true&useJDBCComplian	tTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
					 // Step 2:Create a statement using connection object
		            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
					preparedStatement.setString(1,commande.getNom());
					preparedStatement.setString(2, commande.getAdresse());
					preparedStatement.setString(3, commande.getNumero());
					preparedStatement.setString(4,commande.getVille());
					preparedStatement.setString(5, commande.getCategorie());
					preparedStatement.setString(6, commande.getNomProduit());
					preparedStatement.setString(7, commande.getQuantite());
					preparedStatement.setString(8, commande.getDate());
					preparedStatement.setString(9, commande.getDescription());
					preparedStatement.setString(10, commande.getUsername());
					preparedStatement.setInt(11, commande.getIdentifiant());
					  System.out.println(preparedStatement);
		            // Step 3: Execute the query or update query
					preparedStatement.executeUpdate();		//Pour les INSERT !!
		    
				}catch (SQLException e) {
			        // process sql exception
			        printSQLException(e);
			    }
		}
	 
	

	 		
	 	
				 private void printSQLException(SQLException ex) {
				        for (Throwable e: ex) {
				            if (e instanceof SQLException) {
				                e.printStackTrace(System.err);
				                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				                System.err.println("Message: " + e.getMessage());
				                Throwable t = ex.getCause();
				                while (t != null) {
				                    System.out.println("Cause: " + t);
				                    t = t.getCause();
				                }
				            }
				        }
				    }
				
}
