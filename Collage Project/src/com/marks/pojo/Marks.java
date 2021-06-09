package com.marks.pojo;

public class Marks {

	 private int roll_no;
	 private String name;
	 private String contact;
	 private String marks;
	 private String gread;
	 
	 public int getRollNo() {
	  return roll_no;
	 }
	 public void setRollNo(int roll_no) {
	  this.roll_no = roll_no;
	 }
	 public String getName() {
	  return name;
	 }
	 public void setName(String name) {
	  this.name = name;
	 }
	 public String getContact() {
	  return contact;
	 }
	 public void setContact(String contact) {
	  this.contact = contact;
	 }
	 public String getMarks() {
	  return marks;
	 }
	 public void setMarks(String marks) {
	  this.marks = marks;
	 }
	 public String getGread() {
	  return gread;
	  }
	 public void setGread(String gread) {
	  this.gread = gread;
	 }
	public String toString() {
	  return roll_no+"  "+ name +"   "+contact+"  "+marks+"  "+gread+  "";
	 }

}
