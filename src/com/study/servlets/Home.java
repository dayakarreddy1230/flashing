package com.study.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.study.classess.MyClass;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		MyClass m = new MyClass();
		String k = request.getParameter("KIA");
		String r = request.getParameter("RANGE_ROVER");
		String b = request.getParameter("BMW");
		String a = request.getParameter("AUDI");
		String j = request.getParameter("JAGUAR");
		if("KIA1".equals(k))
		{ 
			m.KIA();
		}
		else if("RANGE_ROVER1".equals(r)) {
			m.RANGER_ROVER();
		}
		else if("BMW1".equals(b)) {
			m.BMW();
		}
		else if("AUDI1".equals(a)) {
			m.AUDI();
		}
		else if("JAGUAR1".equals(j)) {
			m.JAGUAR();
		}
		request.getRequestDispatcher("TEST.html").forward(request, response);
	}

}
