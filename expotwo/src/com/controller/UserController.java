package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.user;
import com.dao.UserDao;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserDao dao =new UserDao();
		
		String filename="";
		String action=request.getParameter("action");
		
		
		if("list".equalsIgnoreCase(action)) {
			List<user> list=dao.getAll();
			request.setAttribute("listshow", list);
			filename="showlist.jsp";
		}
		else if("add".equalsIgnoreCase(action)){
			String fname=request.getParameter("fname");
			String age=request.getParameter("age");
			
			user bean= new user();
			bean.setFname(fname);
			bean.setAge(age);
			boolean result=dao.addUser(bean);
			filename="welcome.jsp";
		}
		
		
		RequestDispatcher rd=request.getRequestDispatcher(filename);
		rd.forward(request, response);
				
	}

}
