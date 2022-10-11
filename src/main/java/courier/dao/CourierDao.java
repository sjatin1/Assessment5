package courier.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import courier.pojo.CourierBookingDetails;
import courier.pojo.CourierShipmentDetails;


public class CourierDao {
	public static int saveUser(CourierBookingDetails cbd){
		String sql1=null;
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Calendar c = Calendar.getInstance();
		c.setTime(new Date()); // Using today's date
		c.add(Calendar.DATE, 2);
		Date date = new Date();  
		String dt_shipped = formatter.format(date);
		String dt_delivery = formatter.format(c.getTime());
		double x = Math.random();
		
		String str = String.valueOf(x);
		
		String str1 = "1308";
		
		String track_no = str1+str.substring(2,11);
		try {
		sql1 = "insert into CourierBooking values('" + cbd.getCustomer_name() + "','"  + cbd.getMobile() + "','" + cbd.getCourier_del_area() + "','" + cbd.getWt_in_gms() + "','" + cbd.getCourier_pick_area() + "','" + cbd.getAmt()+ "')";
		Statement st = (Statement) Util.getStatement();
		String sql2 = "insert into CourierShipmentDetails values('" + cbd.getCourier_del_area() + "', '" + dt_shipped + "', '" +dt_delivery +"', '" + track_no+"', '"+cbd.getCustomer_name()+"', '"+cbd.getCourier_pick_area()+"'  )";
		st.executeUpdate(sql2);
		
		return st.executeUpdate(sql1);
		}
		catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	public CourierShipmentDetails display(String cname) {
		CourierShipmentDetails csd = null;
		try {
			String sql = "select * from CourierShipmentDetails where cust_name = '"+cname+"'";
            ResultSet rs = Util.getStatement().executeQuery(sql);
            csd = new CourierShipmentDetails();
            while (rs.next()){
            	csd.setCust_name(rs.getString(5));
            	csd.setCourier_del_area(rs.getString(1));
            	csd.setDt_ship(rs.getString(2));
            	csd.setDt_delivery(rs.getString(3));
            	csd.setTrack_no(rs.getString(4));
            	csd.setCourier_pick_area(rs.getString(6));
            }
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return csd;
		
	}
	
	public static String getCname(String tno) {
		try {
			String sql = "select * from CourierShipmentDetails where track_no = '"+tno+"'";
            ResultSet rs = Util.getStatement().executeQuery(sql);
            rs.next();
            return rs.getString(5);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
