package com.prj.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.prj.beans.Commande;
import com.prj.dao.CommandeDao;
import com.prj.dao.UpdateDao;

public class UpdateServlet extends HttpServlet {
	private UpdateDao updateDao;

	public void init() {
		updateDao = new UpdateDao();
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
       	  HttpSession sessionID = request.getSession();
       	  	int id = (int) sessionID.getAttribute("identifiant");
            response.sendRedirect("/Prj/commandes");

	            updateDao.updateCommande(id,commandeBean);
	            request.getRequestDispatcher("/commandes").forward(request,response);


	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }

	  
}
       
	    
	 
	 protected void doGet(HttpServletRequest request, HttpServletResponse response)
			    throws ServletException, IOException {
		  int id =Integer.parseInt(request.getParameter("id"));
    	  HttpSession sessionID = request.getSession();
    	  sessionID.setAttribute("identifiant", id);
          request.getRequestDispatcher("/ModifierCommande.jsp").forward(request,response);

	 }
	 
}
      
      
      

 

