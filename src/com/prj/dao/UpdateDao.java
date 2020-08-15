package com.prj.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.prj.beans.Commande;

public class UpdateDao {
	
    private static final String UPDATE_USERS_SQL = "update COMMANDE set nomentreprise = ?, adresse	= ?,ville = ?,numero = ?,categorie = ?,nomProduit = ?,quantite = ? , date = ?,Description = ?   where id = ?;" ;
    
    public boolean updateCommande(int id,Commande commande) throws SQLException {
        boolean rowUpdated;
        try (Connection connection = DriverManager
	            .getConnection("jdbc:mysql://localhost:3306/prj?useUnicode=true&useJDBCComplian	tTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
        		PreparedStatement statement = connection.prepareStatement(UPDATE_USERS_SQL);) {
            statement.setString(1, commande.getNom());
            statement.setString(2, commande.getAdresse());
            statement.setString(3, commande.getVille());
            statement.setString(4, commande.getNumero());
            statement.setString(5, commande.getCategorie());
            statement.setString(6, commande.getNomProduit());
            statement.setString(7,commande.getQuantite());
            statement.setString(8, commande.getDate());
            statement.setInt(10, id);
            statement.setString(9, commande.getDescription());
			  System.out.println(statement);

            rowUpdated = statement.executeUpdate() > 0;
        }
        return rowUpdated;
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
