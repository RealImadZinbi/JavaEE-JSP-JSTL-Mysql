package com.prj.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prj.beans.Fournisseur;
import com.prj.dao.FournisseurDao;

public class FournisseurServlet extends HttpServlet {
	private FournisseurDao fournisseurDao;
	public void init() {
		fournisseurDao = new FournisseurDao();
	}
	  protected void doPost(HttpServletRequest request, HttpServletResponse response)
			    throws ServletException, IOException{
		  String username =request.getParameter("username");
		  String email   =request.getParameter("email");
		  String telephone =request.getParameter("telephone");
		  String nomFournisseur =request.getParameter("nom");
		  String ville = request.getParameter("ville");
		  String password=request.getParameter("password");
		  String password2=request.getParameter("password2");
		  
		  Fournisseur fournisseur = new Fournisseur();
		  fournisseur.setEmail(email);
		  fournisseur.setNom(nomFournisseur);
		  fournisseur.setTelephone(telephone);
		  fournisseur.setPassword(password);
		  fournisseur.setVille(ville);
		  fournisseur.setUsername(username);
		  try {
	            fournisseurDao.registerFournisseur(fournisseur);
	            request.setAttribute("errore", "Les deux mot de passes ne sont pas identiques");
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }

	        response.sendRedirect("Menu.jsp");
	    }
	  }

