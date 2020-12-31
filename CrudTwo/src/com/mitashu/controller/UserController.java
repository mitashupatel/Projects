package com.mitashu.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mitashu.dao.UserDao;
import com.mitashu.model.User;

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
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserDao userDao=new UserDao(); 
		String action=request.getParameter("action");
		String filename="";
		
		if("list".equalsIgnoreCase(action)) {
			List<User> list=userDao.getAll();
			request.setAttribute("data", list);
			filename="List.jsp";
		}
		else if("add".equalsIgnoreCase(action)) {
			String name=request.getParameter("name");
			String address=request.getParameter("address");
			User user=new User();
			user.setName(name);
			user.setAddress(address);
			boolean result=userDao.addData(user);
			filename="UserController?action=list";
			
		}
		else if("delete".equalsIgnoreCase(action)) {
			int id=Integer.parseInt(request.getParameter("id"));
			boolean result=userDao.delData(id);
			filename="UserController?action=list";
		}
		else if("edit".equalsIgnoreCase(action)) {
			int id=Integer.parseInt(request.getParameter("id"));
			User user= userDao.getById(id);
			request.setAttribute("emp", user);
			filename="Register.jsp";
			
		}
		else if("update".equalsIgnoreCase(action)) {
			int id=Integer.parseInt(request.getParameter("id"));
			String name=request.getParameter("name");
			String address=request.getParameter("address");
			User user=new User();
			user.setId(id);
			user.setName(name);
			user.setAddress(address);
			boolean result=userDao.updateUser(user);
			filename="UserController?action=list";
		}
		RequestDispatcher rd= request.getRequestDispatcher(filename);
		rd.forward(request, response);
	}

}
