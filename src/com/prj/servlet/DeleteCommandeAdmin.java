package com.prj.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prj.dao.DeleteDao;

public class DeleteCommandeAdmin extends HttpServlet {
	private DeleteDao deleteDao;

	public void init() {
		deleteDao = new DeleteDao();
	}
	 protected void doGet(HttpServletRequest request, HttpServletResponse response)
			    throws ServletException, IOException {
		  int id =Integer.parseInt(request.getParameter("id"));
 	 try {
      	  	deleteDao.deleteCommande(id);
	         request.getRequestDispatcher("AllCommandeServlet").forward(request,response);

	            
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }


	 }
}
