package com.prj.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.prj.beans.Login;
import com.prj.dao.LoginAdministrateurDao;
public class LoginAdministrateurServlet extends HttpServlet {
	 private LoginAdministrateurDao loginAdministrateurDao;
	    public void init() {
	    	loginAdministrateurDao = new LoginAdministrateurDao();
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
	             if (loginAdministrateurDao.validate(loginbean)) {
	                 HttpSession session = request.getSession();
	                  session.setAttribute("username",username);
	                 response.sendRedirect("EspaceAdministrateur.jsp");
	             } else {
	                 HttpSession session = request.getSession();
	                 session.setAttribute("user", username);
	 				String message = "Connexion échouée, mauvaise combinaison identifiant/mot de passe !";
					request.setAttribute("error", message);

	 				this.getServletContext().getRequestDispatcher("/LoginClient.jsp")
					.forward(request, response);
	             }
	         } catch (ClassNotFoundException e) {
	             e.printStackTrace();
	         }
	      }
	    	
	   
}
