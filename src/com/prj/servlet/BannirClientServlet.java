package com.prj.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prj.dao.BannirClientDao;

public class BannirClientServlet extends HttpServlet {
	private BannirClientDao bannirClientDao;

	public void init() {
		bannirClientDao = new BannirClientDao();
	}
	 protected void doGet(HttpServletRequest request, HttpServletResponse response)
			    throws ServletException, IOException {
		 String username = request.getParameter("username");
		 try {
 		 	bannirClientDao.bannirClient(username);
 		 	request.getRequestDispatcher("/ListeClient").forward(request,response);
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }


	 }
}

