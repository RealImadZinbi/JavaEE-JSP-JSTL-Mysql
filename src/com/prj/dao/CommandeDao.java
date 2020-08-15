package com.prj.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.prj.beans.Commande;

public class CommandeDao{
	public void ajouterCommande(Commande commande) throws ClassNotFoundException{
	 String INSERT_USERS_SQL = "INSERT INTO Commande (nomentreprise,adresse,ville,numero,categorie,nomProduit,quantite,date,username,Description) VALUES(?,?,?,?,?,?,?,?,?,?)";

	 Class.forName("com.mysql.cj.jdbc.Driver");

		try (Connection connection = DriverManager
	            .getConnection("jdbc:mysql://localhost:3306/prj?useUnicode=true&useJDBCComplian	tTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
				 // Step 2:Create a statement using connection object
	            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
				preparedStatement.setString(1,commande.getNom());
				preparedStatement.setString(2,commande.getAdresse());
				preparedStatement.setString(3,commande.getVille());
				preparedStatement.setString(4,commande.getNumero());
				preparedStatement.setString(5, commande.getCategorie());
				preparedStatement.setString(6,commande.getNomProduit());
				preparedStatement.setString(7, commande.getQuantite());
				preparedStatement.setString(8,commande.getDate());
				preparedStatement.setString(9,commande.getUsername());
				preparedStatement.setString(10, commande.getDescription());
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

