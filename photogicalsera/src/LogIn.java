

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LogIn
 */
public class LogIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogIn() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname= request.getParameter("uname");
		String add= request.getParameter("add");
		String email= request.getParameter("email");
		String gender= request.getParameter("gender");
		String number= request.getParameter("number");
		String mes= request.getParameter("mes");
		String pass= request.getParameter("pass");
		String filename="";
		if("mitashu".equals(uname)&&("123".equals(pass)))
		{
			filename="welcome.jsp";
			request.setAttribute("msg-", " Welcome To the PHOTOGICALSERA.");
			request.setAttribute("uname", uname);
			request.setAttribute("add", add);
			request.setAttribute("email", email);
			request.setAttribute("gender", gender);
			request.setAttribute("number", number);
			request.setAttribute("mes", mes);
			request.setAttribute("pass", pass);
		}
		
		else {
			filename="error.jsp";
		}
		

		RequestDispatcher rd = request.getRequestDispatcher(filename);
		rd.forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
