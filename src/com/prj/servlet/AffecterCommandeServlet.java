package com.prj.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.prj.beans.Commande;
import com.prj.beans.Fournisseur;
import com.prj.dao.AffecterCommandeDao;
import com.prj.dao.ConsulterCommandeDao;

public class AffecterCommandeServlet extends HttpServlet {
	private AffecterCommandeDao affecterCommandeDao;
	public void init() {
		affecterCommandeDao = new AffecterCommandeDao();
	}
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
			    throws ServletException, IOException{
		  int id =Integer.parseInt(request.getParameter("id"));
		  String username=(String) request.getParameter("username");
		  try {
		         ArrayList<Commande> List1 = new ArrayList<Commande>();
		         List1=affecterCommandeDao.getCommandeFournisseur(id);
		         request.setAttribute("CommandeFournisseur",List1);
		         request.getRequestDispatcher("/AllCommandeServlet").forward(request,response);
		         
		        } catch (Exception e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		        }
		  
			 String nomEntreprise =request.getParameter("nom");
			 String adresse=request.getParameter("adresse");
			 String ville=request.getParameter("ville");
			 String numero=request.getParameter("numero");
			 String categorie=request.getParameter("categorie");
			 String  nomProduit=request.getParameter("nomp");
			 String quantite=request.getParameter("quantite");
			 String jour=request.getParameter("jour");
			 String description=request.getParameter("description");
	         
	         Commande commandeBean = new Commande();
	         commandeBean.setNom(nomEntreprise);
	         commandeBean.setAdresse(adresse);
	         commandeBean.setVille(ville);
	         commandeBean.setNumero(numero);
	         commandeBean.setCategorie(categorie);
	         commandeBean.setNomProduit(nomProduit);
	         commandeBean.setQuantite(quantite);
	         commandeBean.setDate(jour);
	         commandeBean.setDescription(description);
	         commandeBean.setId(id);
	         commandeBean.setUsername(username);
	         commandeBean.setIdentifiant(id);
	         try {
				affecterCommandeDao.ajouterCommande(commandeBean);

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
	         	
		     
		        
		 }
	 

	 
		
}
