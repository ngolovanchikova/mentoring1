package com.epam.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import calculate.web.app.Calculate;


/**
 * Servlet implementation class CalculateServlet
 */
public class CalculateServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculateServlet() {
	super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request,
	    HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();

	out.println("<html>");
	out.println("<head>");
	out.println("<title>Hola</title>");
	out.println("</head>");
	out.println("<body bgcolor=\"white\">");
	out.println("<table border='1' width='70%' height='50%' align='center'>");
	for (int i = 1; i <= 9; i++) {
	    if (i == 1) {
		out.println("<tr bgcolor=\"yellow\">");
		for (int j = 1; j <= 9; j++) {
		    out.println("<td>");
		    out.println(Calculate.getResult(i, j));
		    out.println("</td>");
		}
		out.println("</tr>");
	    } else {
		out.println("<tr>");
		for (int j = 1; j <= 9; j++) {
		    if (j == 1) {
			out.println("<td bgcolor=\"yellow\">");
			out.println(Calculate.getResult(i, j));
			out.println("</td>");
		    } else if (i==j) {
			out.println("<td bgcolor=\"silver\">");
			out.println(Calculate.getResult(i, j));
			out.println("</td>");
		    } else {
			out.println("<td>");
			out.println(Calculate.getResult(i, j));
			out.println("</td>");
		    }
		}
		out.println("</tr>");
	    }
	}
	out.println("</table>");
	out.println("</body>");
	out.println("</html>");
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request,
	    HttpServletResponse response) throws ServletException, IOException {
    }

}
