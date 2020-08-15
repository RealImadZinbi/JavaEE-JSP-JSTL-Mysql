package com.prj.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prj.beans.Client;
import com.prj.dao.ListeClientDao;

public class ListeClientServlet extends HttpServlet {
	private ListeClientDao listeClientDao;
	public void init() {
		listeClientDao = new ListeClientDao();
	}
	 protected void doGet(HttpServletRequest request, HttpServletResponse response)
			    throws ServletException, IOException {
		 try {
	         ArrayList<Client> List1 = new ArrayList<Client>();
			 
			List1 = listeClientDao.getUsernameClient();
			request.setAttribute("usernames", List1);
			ArrayList<Client> statut = new ArrayList<Client>();
 		 	statut = listeClientDao.getEtatClient();
 		 	request.setAttribute("statut", statut);
	         request.getRequestDispatcher("ListeClient.jsp").forward(request, response);
	            

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	 }
	   
}
