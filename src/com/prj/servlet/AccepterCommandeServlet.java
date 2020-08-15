package com.prj.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.prj.beans.Commande;
import com.prj.beans.Stock;
import com.prj.dao.AccepterCommandeDao;

public class AccepterCommandeServlet extends HttpServlet {
	private AccepterCommandeDao accepterCommandeDao;
	public void init() {
		accepterCommandeDao = new AccepterCommandeDao();
	}
	
	 protected void doGet(HttpServletRequest request, HttpServletResponse response)
			    throws ServletException, IOException{
		  int id =Integer.parseInt(request.getParameter("id"));
		  String etat=request.getParameter("etat");
		  String nomProduit=request.getParameter("nomp");
		  int quantite=Integer.parseInt(request.getParameter("quantite"));
		  int identifiant = Integer.parseInt(request.getParameter("identifiant"));
    	  HttpSession session = request.getSession();
    	  	
		  String nomFournisseur=(String) session.getAttribute("username");
		  Stock stock = new Stock();
		  stock.setNomFournisseur(nomFournisseur);
		  stock.setNomProduit(nomProduit);
		  stock.setQuantité(quantite);
		  stock.setIdentifiant(id);
		  
		  try {
			accepterCommandeDao.etatCommande(id, etat);
			accepterCommandeDao.etatCommandeFournisseur(id, etat);
			accepterCommandeDao.AjouterAuStock(stock);
			request.getRequestDispatcher("/MesCommandeFournisseurs").forward(request, response);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	
	
}
