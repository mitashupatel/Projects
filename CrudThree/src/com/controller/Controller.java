package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Dao;
import com.model.Data;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		String filename="";
		Dao dao=new Dao();
		
		if("list".equalsIgnoreCase(action)) {
			List<Data> list=dao.getAll();
			request.setAttribute("data",list);
			filename="List.jsp";
		}
		else if("add".equalsIgnoreCase(action)) {
			String name=request.getParameter("name");
			String address=request.getParameter("address");
			Data data=new Data();
			data.setName(name);
			data.setAddress(address);
			boolean result=dao.addData(data);
			filename="Controller?action=list";
		}
		else if("delete".equalsIgnoreCase(action)) {
			int id=Integer.parseInt(request.getParameter("id"));
			boolean result=dao.delData(id);
			filename="Controller?action=list";
		}
		else if("edit".equalsIgnoreCase(action)) {
			int id=Integer.parseInt(request.getParameter("id"));
			Data data=dao.getById(id);
			request.setAttribute("data", data);
			filename="Register.jsp";
					
		}
		else if("update".equalsIgnoreCase(action)) {
			int id=Integer.parseInt(request.getParameter("id"));
			String name=request.getParameter("name");
			String address=request.getParameter("address");
			Data data=new Data();
			data.setId(id);
			data.setName(name);
			data.setAddress(address);
			boolean result =dao.updateData(data);
			filename="Controller?action=list";
		}
		RequestDispatcher rd=request.getRequestDispatcher(filename);
		rd.forward(request, response);
	}

}
