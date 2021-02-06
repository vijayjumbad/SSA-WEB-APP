package com.ashokit.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SSAUser {
	/*@Id
	@GeneratedValue
	private Integer SsaId;*/
	@Id
	private Integer SsnNo;
	private String fname;
	private String lname;
	private Date dob;
	private String state;
	
	public Integer getSsnNo() {
		return SsnNo;
	}
	public void setSsnNo(Integer ssnNo) {
		SsnNo = ssnNo;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "SSAUser [SsnNo=" + SsnNo + ", fname=" + fname + ", lname=" + lname + ", dob=" + dob
				+ ", state=" + state + "]";
	}
	
	
}
