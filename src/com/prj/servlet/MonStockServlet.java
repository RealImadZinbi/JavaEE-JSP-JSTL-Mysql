package com.prj.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prj.beans.Commande;
import com.prj.beans.Stock;
import com.prj.dao.MonStockDao;

public class MonStockServlet extends HttpServlet {
	private MonStockDao monStockDao;
	
	public void init() {
		monStockDao = new MonStockDao();
	}
	 protected void doGet(HttpServletRequest request, HttpServletResponse response)
			    throws ServletException, IOException {
		 try {
	         ArrayList<Stock> List1 = new ArrayList<Stock>();
	         List1 = monStockDao.getStock();
	         
	         

	         request.setAttribute("stock",List1);

	         request.getRequestDispatcher("/MonStock.jsp").forward(request,response);
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	         

	    }
		 
	 }

