package com.prj.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.prj.beans.Client;
import com.prj.beans.Fournisseur;
import com.prj.beans.Login;

public class LoginFournisseurDao {
	public boolean validate(Login loginbean ) throws ClassNotFoundException	{
		
		boolean status=false;
		Class.forName("com.mysql.cj.jdbc.Driver");
		try (Connection connection = DriverManager
	            .getConnection("jdbc:mysql://localhost:3306/prj?useUnicode=true&useJDBCComplian	tTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
				//Creer une requete
		PreparedStatement preparedStatement =connection.prepareStatement("SELECT username,password FROM Founisseurs where username = ? and password = ?")){
			
				preparedStatement.setString(1,loginbean.getUsername());
				preparedStatement.setString(2,loginbean.getPassword());
				System.out.println(preparedStatement);
				ResultSet rs=preparedStatement.executeQuery(); // Pour les select !!
				status=rs.next();	
		}catch (SQLException e) {
			printSQLException(e);
		}
		return status;
	}
public Fournisseur getStatut(Login loginbean ) throws ClassNotFoundException, SQLException	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		try (Connection connection = DriverManager
	            .getConnection("jdbc:mysql://localhost:3306/prj?useUnicode=true&useJDBCComplian	tTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
				//Creer une requete
		PreparedStatement preparedStatement =connection.prepareStatement("SELECT Statut FROM Founisseurs where username = ? and password = ?")){
				preparedStatement.setString(1,loginbean.getUsername());
				preparedStatement.setString(2,loginbean.getPassword());
				 
				System.out.println(preparedStatement);
				ResultSet rs=preparedStatement.executeQuery(); // Pour les select !!
				 Fournisseur fournisseur = new Fournisseur();
		           while (rs.next())
		           {
				fournisseur.setEtat(rs.getInt("Statut"));
		           }
				return fournisseur;
		
		
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
