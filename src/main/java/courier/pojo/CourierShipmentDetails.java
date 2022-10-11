package courier.pojo;

public class CourierShipmentDetails {
	private String courier_del_area;
	private String dt_ship;
	private String dt_delivery;
	private String track_no;
	private String cust_name;
	private String courier_pick_area;
	public String getCourier_pick_area() {
		return courier_pick_area;
	}
	public void setCourier_pick_area(String courier_pick_area) {
		this.courier_pick_area = courier_pick_area;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getCourier_del_area() {
		return courier_del_area;
	}
	public void setCourier_del_area(String courier_del_area) {
		this.courier_del_area = courier_del_area;
	}
	public String getDt_ship() {
		return dt_ship;
	}
	public void setDt_ship(String dt_ship) {
		this.dt_ship = dt_ship;
	}
	public String getDt_delivery() {
		return dt_delivery;
	}
	public void setDt_delivery(String dt_delivery) {
		this.dt_delivery = dt_delivery;
	}
	public String getTrack_no() {
		return track_no;
	}
	public void setTrack_no(String track_no) {
		this.track_no = track_no;
	}
	
	

}
