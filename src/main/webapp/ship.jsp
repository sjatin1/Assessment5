<%@page import="courier.pojo.CourierShipmentDetails"%>
<%@page import="courier.dao.CourierDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
th, td {
 padding: 10px;
  text-align: left;
  border-bottom: 1px solid #ddd;
}
.btn{
padding-left:1500px;
}
h1{
padding-top : 30px;
}
th {background-color: DarkTurquoise;}
td:hover {background-color: aqua;}
</style>
<title>Courier Shipment Details</title>
</head>
<body>
<form>
<center>
	<h1 align="center">Courier Shipment Details</h1>
	
	<span class="btn"><button class="btn-primary" onclick="ExportToExcel('xlsx')">DOWNLOAD</button></span><br><br>
	<%      
			String cname = (String) session.getAttribute("name");
			CourierDao c = new CourierDao(); 
			CourierShipmentDetails csd = c.display(cname);
			 out.print("<table id='ship_table' width='100%'");  
		        
		        out.print("<tr><th>Customer Name</th><th>Pickup Area</th><th>Delivery Area</th><th>Shipping Date</th><th>Delivery date</th><th>Tracking No.</th></tr>");  
		       
		         out.print("<tr><td>"+csd.getCust_name()+"</td><td>"+csd.getCourier_pick_area()+"</td><td>"+csd.getCourier_del_area()+"</td><td>"+csd.getDt_ship()+"</td><td>"+csd.getDt_delivery()+"</td><td>"+csd.getTrack_no()+"</td></tr>");    
		        out.print("</table>");  
		          


	%>
	<br><br><span class="back"><a href = "courier_booking.jsp"> Go back </a><br><br></span>
	
	
		
	</center>
	</form>
	<script type="text/javascript" src="https://unpkg.com/xlsx@0.15.1/dist/xlsx.full.min.js"></script>
<script type="text/javascript">
	function ExportToExcel(type, fn, dl) {
	    var elt = document.getElementById('ship_table');
	    var wb = XLSX.utils.table_to_book(elt, { sheet: "sheet1" });
	    return dl ?
	    	XLSX.write(wb, { bookType: type, bookSST: true, type: 'base64' }):
	      	XLSX.writeFile(wb, fn || ('ShipmentDetails.' + (type || 'xlsx')));
	}
</script>

</body>
</html>