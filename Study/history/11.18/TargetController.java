package com.mvn.test.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "TargetController", urlPatterns = "/target/*")
public class TargetController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] arrStr = request.getParameterValues("a");
		List<String> lst = new ArrayList<>();
		
		for(int i=0; i<arrStr.length; i++) {
			lst.add(arrStr[i]);
		}
		
		request.setAttribute("lst", lst);
		
		RequestDispatcher rd = request.getRequestDispatcher("/views/target");
		rd.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
