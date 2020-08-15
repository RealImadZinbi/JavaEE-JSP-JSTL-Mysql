package com.prj.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.prj.beans.Stock;
import com.prj.dao.AccepterCommandeDao;

public class RefuserCommandeServlet extends HttpServlet {
	private AccepterCommandeDao accepterCommandeDao;
	public void init() {
		accepterCommandeDao = new AccepterCommandeDao();
	}
	
	 protected void doGet(HttpServletRequest request, HttpServletResponse response)
			    throws ServletException, IOException{
		  int id =Integer.parseInt(request.getParameter("id"));
		  String etat=request.getParameter("etat");
		 
		  int identifiant = Integer.parseInt(request.getParameter("identifiant"));

		
		  
		  try {
			  accepterCommandeDao.etatCommande(id, etat);
				accepterCommandeDao.etatCommandeFournisseur(id, etat);
			request.getRequestDispatcher("/MesCommandeFournisseurs").forward(request, response);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
}
