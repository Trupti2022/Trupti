package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Flight {
	@Id
	@GeneratedValue
	private Integer flid;
	private String arrival;
	private String destinaton;
	private String date;
	public Integer getFlid() {
		return flid;
	}
	public void setFlid(Integer flid) {
		this.flid = flid;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public String getDestinaton() {
		return destinaton;
	}
	public void setDestinaton(String destinaton) {
		this.destinaton = destinaton;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Flight(Integer flid, String arrival, String destinaton, String date) {
		super();
		this.flid = flid;
		this.arrival = arrival;
		this.destinaton = destinaton;
		this.date = date;
	}
	public Flight() {
		super();
	}
	@Override
	public String toString() {
		return "Flight [flid=" + flid + ", arrival=" + arrival + ", destinaton=" + destinaton + ", date=" + date + "]";
	}
	
	
	
	

}
