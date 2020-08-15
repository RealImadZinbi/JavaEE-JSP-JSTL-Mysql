package com.prj.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BannirFournisseurDao {
	 private static final String BANNIR_FOURNISSEUR_SQL = "update Founisseurs set Statut = 1  where username = ?;";
	    public boolean bannirFournisseur(String username) throws SQLException {
	        boolean rowDeleted;
	        try (Connection connection = DriverManager
		            .getConnection("jdbc:mysql://localhost:3306/prj?useUnicode=true&useJDBCComplian	tTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
	        		PreparedStatement statement = connection.prepareStatement(BANNIR_FOURNISSEUR_SQL);) {
	            statement.setString(1, username);
				  System.out.println(statement);

	            rowDeleted = statement.executeUpdate() > 0;
	        }
	        return rowDeleted;
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
