package com.library.pojo;

public class Library {


	private String bname;
	private String status;
	private String sname;
	private String issuedate;
	private String duedate;
	
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getIssuedate() {
		return issuedate;
	}
	public void setIssuedate(String issuedate) {
		this.issuedate = issuedate;
	}
	public String getDuedate() {
		return duedate;
	}
	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}
	@Override
	public String toString() {
		return   bname + " " + status + "" + sname + " " + issuedate + " " + duedate ;
	}
	
	



}