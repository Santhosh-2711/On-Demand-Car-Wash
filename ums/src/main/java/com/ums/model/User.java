package com.ums.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long user_id;
	private String uname;
	private long uphno;
	private String uemail;
	private String uaddress;
	private long user_NIC;
	private int u_age;
	public User() {
		super();
	}
	public User(long user_id, String uname, long uphno, String uemail, String uaddress, long user_NIC, int u_age) {
		super();
		this.user_id = user_id;
		this.uname = uname;
		this.uphno = uphno;
		this.uemail = uemail;
		this.uaddress = uaddress;
		this.user_NIC = user_NIC;
		this.u_age = u_age;
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public long getUphno() {
		return uphno;
	}
	public void setUphno(long uphno) {
		this.uphno = uphno;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getUaddress() {
		return uaddress;
	}
	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}
	public long getUser_NIC() {
		return user_NIC;
	}
	public void setUser_NIC(long user_NIC) {
		this.user_NIC = user_NIC;
	}
	public int getU_age() {
		return u_age;
	}
	public void setU_age(int u_age) {
		this.u_age = u_age;
	}
	
	
	

}
