package com.prj.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.prj.beans.Commande;
import com.prj.dao.MescommandesDao;
import com.prj.dao.MesCommandeFournisseursDao;
public class MesCommandeFournisseursServlet extends HttpServlet {
	private MesCommandeFournisseursDao mescommandeFournisseursDao;

    public void init() {
        mescommandeFournisseursDao = new MesCommandeFournisseursDao();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    	  HttpSession session = request.getSession();
    	  String username =(String) session.getAttribute("username");
    	  
    	  
        try {
         ArrayList<Commande> List1 = new ArrayList<Commande>();
         List1 = mescommandeFournisseursDao.getCommande(username);
         
         

         request.setAttribute("commandesFournisseur",List1);

         request.getRequestDispatcher("/MescommandesFournisseur.jsp").forward(request,response);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
         

    }
	
	
}
