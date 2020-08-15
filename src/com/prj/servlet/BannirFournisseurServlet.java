package com.prj.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prj.dao.BannirFournisseurDao;


public class BannirFournisseurServlet extends HttpServlet {
	private BannirFournisseurDao bannirFournisseurDao;

	public void init() {
		bannirFournisseurDao = new BannirFournisseurDao();
	}
	 protected void doGet(HttpServletRequest request, HttpServletResponse response)
			    throws ServletException, IOException {
		 String username = request.getParameter("username");
		 try {
 		 	bannirFournisseurDao.bannirFournisseur(username);
 		 	request.getRequestDispatcher("/ListeFournisseur").forward(request,response);
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }


	 }
}
