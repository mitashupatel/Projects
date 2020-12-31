package com.sheth.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sheth.bean.Employee;
import com.sheth.dao.EmployeeDao;

/**
 * Servlet implementation class EmployeeController
 */
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeController() {
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
		/*
		 * String fname = request.getParameter("fname"); String lname =
		 * request.getParameter("lname"); String add = request.getParameter("add");
		 * 
		 * Employee emp= new Employee(); emp.setFname(fname); emp.setLname(lname);
		 * emp.setAdd(add);
		 * 
		 * EmployeeDao dao = new EmployeeDao(); boolean result = dao.addEmployee(emp);
		 */
		EmployeeDao dao = new EmployeeDao();
		String action = request.getParameter("action");
		String filename = "";
		if("list".equalsIgnoreCase(action))
		{
			List<Employee> list = dao.getAll();
			request.setAttribute("emps", list);
			filename = "employeeList.jsp";
		}
		else if("add".equalsIgnoreCase(action))
		{
			String fname = request.getParameter("fname");
			String lname = request.getParameter("lname");
			boolean result = dao.addEmployee(fname, lname);
			filename = "EmployeeController?action=list";
		}
		else if("delete".equalsIgnoreCase(action)) {
			int id = Integer.parseInt(request.getParameter("id"));
			boolean result =dao.delEmployee(id);
			filename= "EmployeeController?action=list";
		}
		else if("edit".equalsIgnoreCase(action))
		{
			int id = Integer.parseInt(request.getParameter("id"));
			Employee emp =dao.getById(id);
			request.setAttribute("emp", emp);
			filename= "registration.jsp";
		}
		else if("update".equalsIgnoreCase(action))
		{
			int id = Integer.parseInt(request.getParameter("id"));
			String fname = request.getParameter("fname");
			String lname = request.getParameter("lname");
			Employee emp = new Employee();
			emp.setId(id);
			emp.setFname(fname);
			emp.setLname(lname);
			boolean result = dao.updateEmployee(emp);
			filename = "EmployeeController?action=list";
		}
		RequestDispatcher rd = request.getRequestDispatcher(filename);
		rd.forward(request, response);
	}

}
 