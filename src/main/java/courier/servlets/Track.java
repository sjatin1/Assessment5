package courier.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import courier.dao.CourierDao;

/**
 * Servlet implementation class Track
 */
@WebServlet("/Track")
public class Track extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String tno = request.getParameter("tno");
		
		if(CourierDao.getCname(tno)!=null) {
			String cname = CourierDao.getCname(tno);
			session.setAttribute("name", cname);
			response.sendRedirect("ship.jsp");
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("track.jsp");
			rd.include(request, response);
			out.println("<center><font color = red> Enter Valid Tracking Number </font> </center>");
		}
	}

}
