package com.prj.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prj.dao.BannirClientDao;
import com.prj.dao.DebannirClientDao;

public class DebannirClientServlet extends HttpServlet {
	private DebannirClientDao debannirClientDao;

	public void init() {
		debannirClientDao = new DebannirClientDao();
	}
	 protected void doGet(HttpServletRequest request, HttpServletResponse response)
			    throws ServletException, IOException {
		 String username = request.getParameter("username");
		 try {
 		 	debannirClientDao.DebannirClient(username);
 		 	request.getRequestDispatcher("/ListeClient").forward(request,response);
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }


	 }
}
