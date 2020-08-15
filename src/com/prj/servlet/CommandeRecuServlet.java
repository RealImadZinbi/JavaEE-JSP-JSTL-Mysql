package com.prj.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.prj.dao.CommandeRecuDao;

public class CommandeRecuServlet extends HttpServlet {
	private CommandeRecuDao commandeRecuDao;
	public void init() {
		commandeRecuDao = new CommandeRecuDao();
	}
	
	 protected void doGet(HttpServletRequest request, HttpServletResponse response)
			    throws ServletException, IOException{
		  int identifiant =Integer.parseInt(request.getParameter("id"));
		  String etat=request.getParameter("etat");
		  int quantite=Integer.parseInt(request.getParameter("quantite"));
		  String nomProduit = request.getParameter("nomProduit");
		   
		   try {
				commandeRecuDao.RetirerStock(quantite, nomProduit,identifiant);
				commandeRecuDao.recuCommande(identifiant);
				request.getRequestDispatcher("/commandes").forward(request, response);

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
	 }
}
