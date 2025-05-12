package com.washermanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity

public class Washer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long washer_id;
	private String wname;
	private long wphno;
	private String wemail;
	private String waddress;
	private long washer_NIC;
	private int salary;
	private int w_age;
	
	

	public Washer() {
		super();
	}
	
	public Washer(long washer_id, String wname, long wphno, String wemail, String waddress, long washer_NIC, int salary,
			int w_age) {
		super();
		this.washer_id = washer_id;
		this.wname = wname;
		this.wphno = wphno;
		this.wemail = wemail;
		this.waddress = waddress;
		this.washer_NIC = washer_NIC;
		this.salary = salary;
		this.w_age = w_age;
	}

	public long getWasher_id() {
		return washer_id;
	}

	public void setWasher_id(long washer_id) {
		this.washer_id = washer_id;
	}

	public String getWname() {
		return wname;
	}

	public void setWname(String wname) {
		this.wname = wname;
	}

	public long getWphno() {
		return wphno;
	}

	public void setWphno(long wphno) {
		this.wphno = wphno;
	}

	public String getWemail() {
		return wemail;
	}

	public void setWemail(String wemail) {
		this.wemail = wemail;
	}

	public String getWaddress() {
		return waddress;
	}

	public void setWaddress(String waddress) {
		this.waddress = waddress;
	}

	public long getWasher_NIC() {
		return washer_NIC;
	}

	public void setWasher_NIC(long washer_NIC) {
		this.washer_NIC = washer_NIC;
	}

	public int getSalary() {
		return salary;
	}

	

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getW_age() {
		return w_age;
	}

	public void setW_age(int w_age) {
		this.w_age = w_age;
	}
	
	
	

}
