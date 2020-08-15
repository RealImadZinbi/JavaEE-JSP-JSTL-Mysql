package com.prj.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.prj.beans.Stock;

public class AccepterCommandeDao {
	public void etatCommande(int id,String etat) throws ClassNotFoundException {
		
		String ACCEPTER_COMMANDE_SQL= "update COMMANDE set etat = ?   where id = ?;" ;
		Class.forName("com.mysql.cj.jdbc.Driver");

	       try { Connection connection = DriverManager
		            .getConnection("jdbc:mysql://localhost:3306/prj?useUnicode=true&useJDBCComplian	tTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
           PreparedStatement st = connection.prepareStatement(ACCEPTER_COMMANDE_SQL); {
        	   st.setString(1, etat);
        	   st.setInt(2, id);
        	   System.out.println(st);
				st.executeUpdate();		//Pour les INSERT !!
	          
	           
	}
	       }
	       catch (Exception e)
	       {
	         System.err.println("Got an exception! ");
	         System.err.println(e.getMessage());
	       }
	
	
}
    
	 public void etatCommandeFournisseur(int id,String etat) throws ClassNotFoundException {
			String ETAT_COMMANDE_SQL= "update CommandeFournisseur set etat = ?   where identifiant = ?;" ;
			Class.forName("com.mysql.cj.jdbc.Driver");

		       try { Connection connection = DriverManager
			            .getConnection("jdbc:mysql://localhost:3306/prj?useUnicode=true&useJDBCComplian	tTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
	           PreparedStatement st = connection.prepareStatement(ETAT_COMMANDE_SQL); {
	        	   st.setString(1, etat);
	        	   st.setInt(2, id);
	        	   System.out.println(st);
					st.executeUpdate();		//Pour les INSERT !!
		          
		           
		}
		       }
		       catch (Exception e)
		       {
		         System.err.println("Got an exception! ");
		         System.err.println(e.getMessage());
		       }
		       
	 }
	 public void AjouterAuStock(Stock stock) throws ClassNotFoundException {
		 String AJOUTER_STOCK_SQL= "INSERT INTO Stock(nomFournisseur,nomProduit,quantite,identifiant) VALUES(?,?,?,?);" ;
			Class.forName("com.mysql.cj.jdbc.Driver");

		       try { Connection connection = DriverManager
			            .getConnection("jdbc:mysql://localhost:3306/prj?useUnicode=true&useJDBCComplian	tTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
	           PreparedStatement st = connection.prepareStatement(AJOUTER_STOCK_SQL); {
	        	   st.setString(1, stock.getNomFournisseur());
	        	   st.setInt(3, stock.getQuantité());
	        	   st.setString(2, stock.getNomProduit());
	        	   st.setInt(4, stock.getIdentifiant());
	        	   System.out.println(st);
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
