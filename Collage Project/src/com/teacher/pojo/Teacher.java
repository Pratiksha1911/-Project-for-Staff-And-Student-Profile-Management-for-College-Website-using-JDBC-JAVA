package com.teacher.pojo;

public class Teacher {
 private int roll_no;
 private String name;
 private String email;
 private String contact;
 private String college;
 private String salary;
 
 
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
 public String getEmail() {
  return email;
 }
 public void setEmail(String email) {
  this.email = email;
 }
 public String getContact() {
  return contact;
 }
 public void setContact(String contact) {
  this.contact = contact;
 }
 public String getCollege() {
  return college;
 }
 public void setCollege(String college) {
  this.college =college;
 }
 public String getSalary() {
  return salary;
 }
public void setSalary(String salary) {
  this.salary=salary;
 }

 public String toString() {
  return roll_no+"  "+ name +"   "+email+"  "+contact+"  "+college+" "+salary+"";
 }


}



