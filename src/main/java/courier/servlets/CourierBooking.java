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
import courier.pojo.CourierBookingDetails;

/**
 * Servlet implementation class CourierBooking
 */
@WebServlet("/CourierBooking")
public class CourierBooking extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String cname = request.getParameter("cname");
		String phone = request.getParameter("mobile");
		String wt = request.getParameter("wt");
		String pick_area = request.getParameter("fromaddr");
		String del_area = request.getParameter("toaddr");
		
		
		double pack_wt = Double.parseDouble(wt);
		double dist = 0;
		double payment = 0;
		CourierBookingDetails cbd = new CourierBookingDetails();
		cbd.setCustomer_name(cname);
		cbd.setMobile(phone);
		cbd.setWt_in_gms(pack_wt);
		cbd.setCourier_del_area(del_area);
		cbd.setCourier_pick_area(pick_area);
		
		session.setAttribute("name", cname);
		if((pick_area.equals("nimhans") && del_area.equals("koramangala")) || (pick_area.equals("koramangala") && del_area.equals("nimhans")) ) {
			dist = 3;
			payment = dist + (pack_wt*0.05);
			cbd.setAmt(payment*10);
			CourierDao.saveUser(cbd);
			RequestDispatcher rd = request.getRequestDispatcher("courier_booking.jsp");
			rd.include(request, response);
			out.println("<center><font color = green>Total Distance : " +dist+" km. Total Payable Amount : " + cbd.getAmt() + "</font></center>");
			out.println("<center><br><br> Check Your Shipment details <a href = 'ship.jsp'>here</a> </center>  ");
		}
		
		else if((pick_area.equals("nimhans") && del_area.equals("silkboard")) || (pick_area.equals("silkboard") && del_area.equals("nimhans")) ) {
			dist = 7;
			payment = dist + (pack_wt*0.05);
			cbd.setAmt(payment*10);
			CourierDao.saveUser(cbd);
			RequestDispatcher rd = request.getRequestDispatcher("courier_booking.jsp");
			rd.include(request, response);
			out.println("<center><font color = green>Total Distance : " +dist+" km. Total Payable Amount : " + cbd.getAmt() + "</font></center>");
			out.println("<center><br><br> Check Your Shipment details <a href = 'ship.jsp'>here</a> </center>  ");
		}
		else if((pick_area.equals("nimhans") && del_area.equals("hsrlayout")) || (pick_area.equals("hsrlayout") && del_area.equals("nimhans")) ) {
			dist = 9;
			payment = dist + (pack_wt*0.05);
			cbd.setAmt(payment*10);
			CourierDao.saveUser(cbd);
			RequestDispatcher rd = request.getRequestDispatcher("courier_booking.jsp");
			rd.include(request, response);
			out.println("<center><font color = green>Total Distance : " +dist+" km. Total Payable Amount : " + cbd.getAmt() + "</font></center>");
		}
		else if((pick_area.equals("nimhans") && del_area.equals("ec")) || (pick_area.equals("ec") && del_area.equals("nimhans")) ) {
			dist = 15;
			payment = dist + (pack_wt*0.05);
			cbd.setAmt(payment*10);
			CourierDao.saveUser(cbd);
			RequestDispatcher rd = request.getRequestDispatcher("courier_booking.jsp");
			rd.include(request, response);
			out.println("<center><font color = green>Total Distance : " +dist+" km. Total Payable Amount : " + cbd.getAmt() + "</font></center>");
			out.println("<center><br><br> Check Your Shipment details <a href = 'ship.jsp'>here</a> </center>  ");
		}
		else if((pick_area.equals("nimhans") && del_area.equals("attibele")) || (pick_area.equals("attibele") && del_area.equals("nimhans")) ) {
			dist = 20;
			payment = dist + (pack_wt*0.05);
			cbd.setAmt(payment*10);
			CourierDao.saveUser(cbd);
			RequestDispatcher rd = request.getRequestDispatcher("courier_booking.jsp");
			rd.include(request, response);
			out.println("<center><font color = green>Total Distance : " +dist+" km. Total Payable Amount : " + cbd.getAmt() + "</font></center>");
			out.println("<center><br><br> Check Your Shipment details <a href = 'ship.jsp'>here</a> </center>  ");
		}
		else if((pick_area.equals("koramangala") && del_area.equals("silkboard")) || (pick_area.equals("silkboard") && del_area.equals("koramangala")) ) {
			dist = 4;
			payment = dist + (pack_wt*0.05);
			cbd.setAmt(payment*10);
			CourierDao.saveUser(cbd);
			RequestDispatcher rd = request.getRequestDispatcher("courier_booking.jsp");
			rd.include(request, response);
			out.println("<center><font color = green>Total Distance : " +dist+" km. Total Payable Amount : " + cbd.getAmt() + "</font></center>");
			out.println("<center><br><br> Check Your Shipment details <a href = 'ship.jsp'>here</a> </center>  ");
		}
		else if((pick_area.equals("koramangala") && del_area.equals("hsrlayout")) || (pick_area.equals("hsrlayout") && del_area.equals("koramangala")) ) {
			dist = 6;
			payment = dist + (pack_wt*0.05);
			cbd.setAmt(payment*10);
			CourierDao.saveUser(cbd);
			RequestDispatcher rd = request.getRequestDispatcher("courier_booking.jsp");
			rd.include(request, response);
			out.println("<center><font color = green>Total Distance : " +dist+" km. Total Payable Amount : " + cbd.getAmt() + "</font></center>");
			out.println("<center><br><br> Check Your Shipment details <a href = 'ship.jsp'>here</a> </center>  ");
		}
		else if((pick_area.equals("koramangala") && del_area.equals("ec")) || (pick_area.equals("ec") && del_area.equals("koramangala")) ) {
			dist = 15;
			payment = dist + (pack_wt*0.05);
			cbd.setAmt(payment*10);
			CourierDao.saveUser(cbd);
			RequestDispatcher rd = request.getRequestDispatcher("courier_booking.jsp");
			rd.include(request, response);
			out.println("<center><font color = green>Total Distance : " +dist+" km. Total Payable Amount : " + cbd.getAmt() + "</font></center>");
			out.println("<center><br><br> Check Your Shipment details <a href = 'ship.jsp'>here</a> </center>  ");
		}
		else if((pick_area.equals("koramangala") && del_area.equals("attibele")) || (pick_area.equals("attibele") && del_area.equals("koramangala")) ) {
			dist = 17;
			payment = dist + (pack_wt*0.05);
			cbd.setAmt(payment*10);
			CourierDao.saveUser(cbd);
			RequestDispatcher rd = request.getRequestDispatcher("courier_booking.jsp");
			rd.include(request, response);
			out.println("<center><font color = green>Total Distance : " +dist+" km. Total Payable Amount : " + cbd.getAmt() + "</font></center>");
			out.println("<center><br><br> Check Your Shipment details <a href = 'ship.jsp'>here</a> </center>  ");
		}
		
		else if((pick_area.equals("silkboard") && del_area.equals("hsrlayout")) || (pick_area.equals("hsrlayout") && del_area.equals("silkboard")) ){
			dist = 2;
			payment = dist + (pack_wt*0.05);
			cbd.setAmt(payment*10);
			CourierDao.saveUser(cbd);
			RequestDispatcher rd = request.getRequestDispatcher("courier_booking.jsp");
			rd.include(request, response);
			out.println("<center><font color = green>Total Distance : " +dist+" km. Total Payable Amount : " + cbd.getAmt() + "</font></center>");
			out.println("<center><br><br> Check Your Shipment details <a href = 'ship.jsp'>here</a> </center>  ");
		}
		else if((pick_area.equals("silkboard") && del_area.equals("electroniccity")) || (pick_area.equals("electroniccity") && del_area.equals("silkboard")) ){
			dist = 2;
			payment = dist + (pack_wt*0.05);
			cbd.setAmt(payment*10);
			CourierDao.saveUser(cbd);
			RequestDispatcher rd = request.getRequestDispatcher("courier_booking.jsp");
			rd.include(request, response);
			out.println("<center><font color = green>Total Distance : " +dist+" km. Total Payable Amount : " + cbd.getAmt() + "</font></center>");
			out.println("<center><br><br> Check Your Shipment details <a href = 'ship.jsp'>here</a> </center>  ");
		}
		else if((pick_area.equals("silkboard") && del_area.equals("attibele")) || (pick_area.equals("attibele") && del_area.equals("silkboard")) ){
			dist = 2;
			payment = dist + (pack_wt*0.05);
			cbd.setAmt(payment*10);
			CourierDao.saveUser(cbd);
			RequestDispatcher rd = request.getRequestDispatcher("courier_booking.jsp");
			rd.include(request, response);
			out.println("<center><font color = green>Total Distance : " +dist+" km. Total Payable Amount : " + cbd.getAmt() + "</font></center>");
			out.println("<center><br><br> Check Your Shipment details <a href = 'ship.jsp'>here</a> </center>  ");
		}
		
		else if((pick_area.equals("hsrlayout") && del_area.equals("electroniccity")) || (pick_area.equals("electroniccity") && del_area.equals("hsrlayout")) ) {
			dist = 6;
			payment = dist + (pack_wt*0.05);
			cbd.setAmt(payment*10);
			CourierDao.saveUser(cbd);
			RequestDispatcher rd = request.getRequestDispatcher("courier_booking.jsp");
			rd.include(request, response);
			out.println("<center><font color = green>Total Distance : " +dist+" km. Total Payable Amount : " + cbd.getAmt() + "</font></center>");
			out.println("<center><br><br> Check Your Shipment details <a href = 'ship.jsp'>here</a> </center>  ");
		}
		else if((pick_area.equals("hsrlayout") && del_area.equals("attibele")) || (pick_area.equals("attibele") && del_area.equals("hsrlayout")) ) {
			dist = 6;
			payment = dist + (pack_wt*0.05);
			cbd.setAmt(payment*10);
			CourierDao.saveUser(cbd);
			RequestDispatcher rd = request.getRequestDispatcher("courier_booking.jsp");
			rd.include(request, response);
			out.println("<center><font color = green>Total Distance : " +dist+" km. Total Payable Amount : " + cbd.getAmt() + "</font></center>");
			out.println("<center><br><br> Check Your Shipment details <a href = 'ship.jsp'>here</a> </center>  ");
		}
	
		else if((pick_area.equals("electroniccity") && del_area.equals("attibele")) || (pick_area.equals("attibele") && del_area.equals("electroniccity")) ) {
			dist = 5;
			payment = dist + (pack_wt*0.05);
			cbd.setAmt(payment*10);
			CourierDao.saveUser(cbd);
			RequestDispatcher rd = request.getRequestDispatcher("courier_booking.jsp");
			rd.include(request, response);
			out.println("<center><font color = green>Total Distance : " +dist+" km. Total Payable Amount : " + cbd.getAmt() + "</font></center>");
			out.println("<center> <br><br>Check Your Shipment details <a href = 'ship.jsp'>here</a> </center>  ");
		}
		else {
			dist = 7;
			cbd.setAmt(150);
			RequestDispatcher rd = request.getRequestDispatcher("courier_booking.jsp");
			rd.include(request, response);
			out.println("<center><font color = red>Both pick_area and del_area can't be same </font></center>");
			
		}

	}

}
