package com.prj.servlet;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.prj.dao.*;
import com.prj.beans.*;


public class ClientServlet extends HttpServlet {
	
	private ClientDao clientDao;
	public void init() {
		clientDao = new ClientDao();
	}
	   protected void doPost(HttpServletRequest request, HttpServletResponse response)
			    throws ServletException, IOException{
		 

				        String nom = request.getParameter("nom");
				        String prenom = request.getParameter("prenom");
				        String username = request.getParameter("username");
				        String password = request.getParameter("password");
				        String password2 = request.getParameter("password2");

				        String email = request.getParameter("email");
				        String telephone = request.getParameter("phone");
				        String ville=request.getParameter("ville");

				        Client client =  new Client();
				        client.setEmail(email);
				        client.setNom(nom);
				        client.setPassword(password);
				        client.setPrenom(prenom);
				        client.setTelephone(telephone);
				        client.setVille(ville);
				        client.setUsername(username);
				       

				        try {
				            clientDao.registerClient(client);
				            request.setAttribute("error", "Les deux mot de passes ne sont pas identiques !");
				        } catch (Exception e) {
				            // TODO Auto-generated catch block
				            e.printStackTrace();
				        }

				        response.sendRedirect("Menu.jsp");
				    }
				}