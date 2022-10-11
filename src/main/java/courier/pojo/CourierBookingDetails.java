package courier.pojo;

public class CourierBookingDetails {
	
	private String customer_name;
	private String mobile;
	private String courier_pick_area;
	private String courier_del_area;
	private double wt_in_gms;
	private double amt;
	
	
	
	public double getAmt() {
		return amt;
	}
	public void setAmt(double amt) {
		this.amt = amt;
	}
	public String getCourier_pick_area() {
		return courier_pick_area;
	}
	public void setCourier_pick_area(String courier_pick_area) {
		this.courier_pick_area = courier_pick_area;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getCourier_del_area() {
		return courier_del_area;
	}
	public void setCourier_del_area(String courier_del_area) {
		this.courier_del_area = courier_del_area;
	}
	public double getWt_in_gms() {
		return wt_in_gms;
	}
	public void setWt_in_gms(double wt_in_gms) {
		this.wt_in_gms = wt_in_gms;
	}
	
	

}
