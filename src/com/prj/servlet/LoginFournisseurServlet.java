package com.prj.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.prj.beans.Login;
import com.prj.dao.LoginDao;
import com.prj.dao.LoginFournisseurDao;

public class LoginFournisseurServlet extends HttpServlet {
	 private LoginFournisseurDao loginFournisseurDao;
	    public void init() {
	    	loginFournisseurDao = new LoginFournisseurDao();
	    }
	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    	    throws ServletException, IOException {
	    	String username =request.getParameter("username");
	    	String password =request.getParameter("password");
	    	
	    	//Instanciation du bean
	    	Login loginbean=new Login();
	    	loginbean.setUsername(username);
	    	loginbean.setPassword(password);
	        //Verifier si username et password existe dans la bdd via la fonction validate

	    	 try {
	    		 int statut;
	    		 statut = (loginFournisseurDao.getStatut(loginbean)).getEtat();
	    		 System.out.println(statut);
	             if (loginFournisseurDao.validate(loginbean) && statut==0) {
	                 HttpSession session = request.getSession();
	                  session.setAttribute("username",username);
	                 response.sendRedirect("MenuIntFournisseur.jsp");
	             } else {
	                 HttpSession session = request.getSession();
	                 session.setAttribute("user", username);
	 				String message = "Connexion échouée, mauvaise combinaison identifiant/mot de passe !";
					request.setAttribute("error", message);
					if(statut==1) {
		 				this.getServletContext().getRequestDispatcher("/CompteBanni.jsp")
						.forward(request, response);
		             }
						else if(statut==0) {
							this.getServletContext().getRequestDispatcher("/Incorrect.jsp")
							.forward(request, response);
						}
	 				
	             }
	         } catch (ClassNotFoundException e) {
	             e.printStackTrace();
	         } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	     }
	    	
	   
	    //Verifier si username et password existe dans la bdd via la fonction validate
}
