package com.bitm.selenium4thbatch.DTO;

public class FlightFinderDTO {
	
	private String passenger_no;
	private String depart_from;
	private String on_month;
	private String on_date;
	private String arrive_in;
	private String return_month;
	private String return_date;
	private String airline;
	
	
	
	public String getPassenger_no() {
		return passenger_no;
	}
	public void setPassenger_no(String passenger_no) {
		this.passenger_no = passenger_no;
	}
	public String getDepart_from() {
		return depart_from;
	}
	public void setDepart_from(String depart_from) {
		this.depart_from = depart_from;
	}
	public String getOn_month() {
		return on_month;
	}
	public void setOn_month(String on_month) {
		this.on_month = on_month;
	}
	public String getOn_date() {
		return on_date;
	}
	public void setOn_date(String on_date) {
		this.on_date = on_date;
	}
	public String getArrive_in() {
		return arrive_in;
	}
	public void setArrive_in(String arrive_in) {
		this.arrive_in = arrive_in;
	}
	public String getReturn_month() {
		return return_month;
	}
	public void setReturn_month(String return_month) {
		this.return_month = return_month;
	}
	public String getReturn_date() {
		return return_date;
	}
	public void setReturn_date(String return_date) {
		this.return_date = return_date;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	
	
	public String toString(){
		
		return "FlightFinderDTO [passenger_no = "+ passenger_no +", depart_from = "+ depart_from +", on_month = "+ on_month +", "
				+ "on_date = "+ on_date +", arrive_in = "+ arrive_in +", return_month = "+ return_month +", "
						+ "return_date = "+ return_date +", airline = "+ airline +"]";
		
	}
	
	

}
