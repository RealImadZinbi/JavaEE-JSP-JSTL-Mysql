package com.prj.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.prj.beans.Commande;
import com.prj.beans.Stock;

public class MonStockDao {
	 public ArrayList<Stock> getStock() throws ClassNotFoundException {
		 	
		 String SELECT_STOCK_SQL = "SELECT * FROM Stock"; 

	        ArrayList <Stock> list = new ArrayList <Stock> ();
	        

			Class.forName("com.mysql.cj.jdbc.Driver");

	       try { Connection connection = DriverManager
		            .getConnection("jdbc:mysql://localhost:3306/prj?useUnicode=true&useJDBCComplian	tTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
	           PreparedStatement st = connection.prepareStatement(SELECT_STOCK_SQL); {
	           System.out.println(st);
	           ResultSet rs = st.executeQuery();

	           while (rs.next())
	           {
	        	   Stock stock = new Stock();
	        	  stock.setNomFournisseur(rs.getString("nomFournisseur"));
	        	  stock.setQuantité(rs.getInt("quantite"));
	        	  stock.setNomProduit(rs.getString("nomProduit"));
	        	   list.add(stock);
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
