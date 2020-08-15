package com.prj.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.prj.beans.Commande;
import com.prj.dao.CommandeDao;
import com.prj.dao.MescommandesDao;

public class CommandeServlet extends HttpServlet {
	private CommandeDao commandeDao;

	public void init() {
		commandeDao = new CommandeDao();
	}
	
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
			    throws ServletException, IOException{
		 
		 String nomEntreprise =request.getParameter("nom");
		 String adresse=request.getParameter("adresse");
		 String ville=request.getParameter("ville");
		 String numero=request.getParameter("numero");
		 String categorie=request.getParameter("categorie");
		 String  nomProduit=request.getParameter("nomp");
		 String quantite=request.getParameter("quantite");
		 String jour=request.getParameter("jour");
		 String description=request.getParameter("description");
         HttpSession session = request.getSession();
         String username = (String) session.getAttribute("username");
         
         Commande commandeBean = new Commande();
         commandeBean.setNom(nomEntreprise);
         commandeBean.setAdresse(adresse);
         commandeBean.setVille(ville);
         commandeBean.setNumero(numero);
         commandeBean.setCategorie(categorie);
         commandeBean.setNomProduit(nomProduit);
         commandeBean.setQuantite(quantite);
         commandeBean.setDate(jour);
         commandeBean.setUsername(username);
         commandeBean.setDescription(description);
		 
         try {
        		ArrayList<Commande> commande = new ArrayList<Commande>();

	            commandeDao.ajouterCommande(commandeBean);
	            
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }

	        response.sendRedirect("MenuIntClient.jsp");
	    }
	}
         
         
         

