package com.prj.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.prj.dao.DeleteDao;
import com.prj.dao.UpdateDao;

public class DeleteServlet extends HttpServlet {
	private DeleteDao deleteDao;

	public void init() {
		deleteDao = new DeleteDao();
	}
	 protected void doGet(HttpServletRequest request, HttpServletResponse response)
			    throws ServletException, IOException {
		  int id =Integer.parseInt(request.getParameter("id"));
 	 try {
      	  	deleteDao.deleteCommande(id);
	         request.getRequestDispatcher("/commandes").forward(request,response);

	            
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }


	 }
	 
}
