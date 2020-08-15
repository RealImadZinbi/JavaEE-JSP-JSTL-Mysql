package com.prj.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prj.beans.Commande;
import com.prj.beans.Fournisseur;
import com.prj.dao.ConsulterCommandeDao;

public class ConsulterCommandeServlet extends HttpServlet {
	 
	private ConsulterCommandeDao consulterCommandeDao;
	public void init() {
		consulterCommandeDao = new ConsulterCommandeDao();
	}
	 protected void doGet(HttpServletRequest request, HttpServletResponse response)
			    throws ServletException, IOException{
		  int id =Integer.parseInt(request.getParameter("id"));
		  try {
		         ArrayList<Commande> List1 = new ArrayList<Commande>();
		         List1=consulterCommandeDao.getDescription(id);
		         request.setAttribute("description",List1);
		         request.getRequestDispatcher("/ConsulterCommande.jsp").forward(request,response);

		        } catch (Exception e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		        }

		 
	                
		 }
		 
	 }

