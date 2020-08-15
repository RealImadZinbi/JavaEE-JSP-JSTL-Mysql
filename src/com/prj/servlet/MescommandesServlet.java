package com.prj.servlet;
import com.prj.dao.*;
import com.prj.beans.*;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MescommandesServlet extends HttpServlet {
	  
	private MescommandesDao mescommandesDao;

    public void init() {
        mescommandesDao = new MescommandesDao();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    	  HttpSession session = request.getSession();
    	  String username =(String) session.getAttribute("username");
    	 
    	  
        try {
         ArrayList<Commande> List1 = new ArrayList<Commande>();
         List1 = mescommandesDao.getCommande(username);
         
         

         request.setAttribute("commandes",List1);

         request.getRequestDispatcher("/Mescommandes.jsp").forward(request,response);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
         

    }
}
