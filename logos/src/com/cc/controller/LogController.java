package com.cc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cc.bean.LogList;
import com.cc.dao.LogDao;

/**
 * Servlet implementation class LogController
 */
public class LogController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  doPost(request, response);
  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LogDao dao = new LogDao();
		
		String action=request.getParameter("action");
		String filename="";
		if("list".equalsIgnoreCase(action)) {
			List<LogList> list=dao.getAll();
			request.setAttribute("lgls", list);
			filename ="loglist.jsp"; 
		}
		else if("add".equalsIgnoreCase(action)) {
			String uname = request.getParameter("uname");
			String address= request.getParameter("address");
			String email = request.getParameter("email");
			String gender = request.getParameter("gender");
			String num = request.getParameter("num");
			String mes= request.getParameter("mes");
			String pass = request.getParameter("pass");
			boolean result = dao.addlog(uname, address, email, gender, num, mes, pass);
			filename = "LogController?action=list";
		}
		
		else if("delete".equalsIgnoreCase(action)) {
			int id = Integer.parseInt(request.getParameter("id"));
			boolean result=dao.delLog(id);
			filename="LogController?action=list";
		}
		else if("edit".equalsIgnoreCase(action)) {
			int id = Integer.parseInt(request.getParameter("id"));
			LogList lgl=dao.getById(id);
			request.setAttribute("upl", lgl);
			filename="login.jsp";
		}
		else if("update".equalsIgnoreCase(action)) {
			int id = Integer.parseInt(request.getParameter("id"));
			String uname=request.getParameter("uname");
			String address=request.getParameter("address");
			String email=request.getParameter("email");
			String gender=request.getParameter("gender");
			String num=request.getParameter("num");
			String mes=request.getParameter("mes");
			String pass=request.getParameter("pass");
			LogList lgl=new LogList();
			lgl.setId(id);
			lgl.setUname(uname);
			lgl.setAddress(address);
			lgl.setEmail(email);
			lgl.setGender(gender);
			lgl.setNum(num);
			lgl.setMes(mes);
			lgl.setPass(pass);
			boolean result=dao.updateLog(lgl);
			filename="LogController?action=list";
		}
		
		RequestDispatcher rd= request.getRequestDispatcher(filename);
		rd.forward(request, response);
	}

}
