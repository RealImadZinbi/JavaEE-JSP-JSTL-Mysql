package com.prj.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prj.beans.Fournisseur;
import com.prj.dao.ListeFournisseurDao;

public class ListeFournisseurServlet extends HttpServlet {
	private ListeFournisseurDao listeFournisseurDao;
	public void init() {
		listeFournisseurDao = new ListeFournisseurDao();
	}
	 protected void doGet(HttpServletRequest request, HttpServletResponse response)
			    throws ServletException, IOException {
		 try {
	         ArrayList<Fournisseur> List1 = new ArrayList<Fournisseur>();
			 
			List1 = listeFournisseurDao.getUsernameFournisseur();
			request.setAttribute("usernames", List1);
			ArrayList<Fournisseur> statut = new ArrayList<Fournisseur>();
 		 	statut = listeFournisseurDao.getEtatFournisseur();
 		 	request.setAttribute("statut", statut);
	         request.getRequestDispatcher("ListeFournisseur.jsp").forward(request, response);
	            

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	 }
}
