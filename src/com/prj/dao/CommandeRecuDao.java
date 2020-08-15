package com.prj.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CommandeRecuDao {
	public void RetirerStock(int quantite,String nomProduit,int identifiant) throws ClassNotFoundException {
		
		String ACCEPTER_COMMANDE_SQL= "update Stock set quantite = quantite - ?   where nomProduit = ? and identifiant = ? ;" ;
		Class.forName("com.mysql.cj.jdbc.Driver");

	       try { Connection connection = DriverManager
		            .getConnection("jdbc:mysql://localhost:3306/prj?useUnicode=true&useJDBCComplian	tTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
           PreparedStatement st = connection.prepareStatement(ACCEPTER_COMMANDE_SQL); {
        	   st.setInt(1, quantite);
        	   st.setString(2, nomProduit);
        	   st.setInt(3, identifiant);
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
	public void recuCommande(int identifiant) throws ClassNotFoundException {
		String RECU_COMMANDE_SQL= "update COMMANDE set recu = 1   where id = ?;" ;
		Class.forName("com.mysql.cj.jdbc.Driver");

	       try { Connection connection = DriverManager
		            .getConnection("jdbc:mysql://localhost:3306/prj?useUnicode=true&useJDBCComplian	tTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
           PreparedStatement st = connection.prepareStatement(RECU_COMMANDE_SQL); {
        	   st.setInt(1, identifiant);
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
