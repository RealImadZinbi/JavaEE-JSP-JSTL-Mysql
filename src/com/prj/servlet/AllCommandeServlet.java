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
import com.prj.beans.Fournisseur;
import com.prj.dao.AllCommandeDao;
import com.prj.dao.MescommandesDao;
public class AllCommandeServlet extends HttpServlet {
	private AllCommandeDao allCommandeDao;

    public void init() {
        allCommandeDao = new AllCommandeDao();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    	  HttpSession session = request.getSession();
    	  String username =(String) session.getAttribute("username");
    	  
    	  
        try {
         ArrayList<Commande> List1 = new ArrayList<Commande>();
         List1 = allCommandeDao.getCommande();
         
         

         request.setAttribute("allcommandes",List1);

         request.getRequestDispatcher("/AllCommande.jsp").forward(request,response);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
         
      
        
    }
}
