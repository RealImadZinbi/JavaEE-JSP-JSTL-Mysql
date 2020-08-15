package com.prj.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prj.beans.Commande;
import com.prj.dao.ConsulterCommandeDao;
import com.prj.dao.ConsulterCommandeFournisseurDao;

public class ConsulterCommandeFournisseurServlet extends HttpServlet {
	 
		private ConsulterCommandeFournisseurDao consulterCommandeFournisseurDao;
		public void init() {
			consulterCommandeFournisseurDao = new ConsulterCommandeFournisseurDao();
		}
		 protected void doGet(HttpServletRequest request, HttpServletResponse response)
				    throws ServletException, IOException{
			  int id =Integer.parseInt(request.getParameter("id"));
			  try {
			         ArrayList<Commande> List1 = new ArrayList<Commande>();
			         List1=consulterCommandeFournisseurDao.getDescription(id);
			         request.setAttribute("decription",List1);
			         request.getRequestDispatcher("/ConsulterCommandeFournisseur.jsp").forward(request,response);

			        } catch (Exception e) {
			            // TODO Auto-generated catch block
			            e.printStackTrace();
			        }
		 }
		
}
