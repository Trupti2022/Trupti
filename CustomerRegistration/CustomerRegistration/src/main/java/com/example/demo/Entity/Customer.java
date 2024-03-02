package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Customer {
	@Id
	@GeneratedValue
	private Integer cid;
	private String cname;
	private String phno;
	private String age;
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", phno=" + phno + ", age=" + age + "]";
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public Customer(Integer cid, String cname, String phno, String age) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.phno = phno;
		this.age = age;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
