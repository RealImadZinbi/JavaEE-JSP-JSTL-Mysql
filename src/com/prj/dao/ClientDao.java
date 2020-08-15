package com.prj.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import com.prj.beans.*;
public class ClientDao {
	public int registerClient(Client client) throws ClassNotFoundException{
		 String INSERT_USERS_SQL = "INSERT INTO Client (username, password, nom, prenom, email, telephone, ville) VALUES(?, ?, ?, ?, ?,?,?)";
		         
		
		int result	=  0;
		//Chargement du driver jdbc
		Class.forName("com.mysql.cj.jdbc.Driver");
		try (Connection connection = DriverManager
	            .getConnection("jdbc:mysql://localhost:3306/prj?useUnicode=true&useJDBCComplian	tTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");

	            // Step 2:Create a statement using connection object
	            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
	            preparedStatement.setString(1,client.getUsername());
	            preparedStatement.setString(2,client.getPassword());
	            preparedStatement.setString(3, client.getNom());
	            preparedStatement.setString(4,client.getPrenom());
	            preparedStatement.setString(5,client.getEmail());
	            preparedStatement.setString(6,client.getTelephone());
	            preparedStatement.setString(7,client.getVille());
	            
	            
	            System.out.println(preparedStatement);
	            // Step 3: Execute the query or update query
	            result = preparedStatement.executeUpdate();
	         
	} catch (SQLException e) {
        // process sql exception
        printSQLException(e);
    }
	    return result;

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
