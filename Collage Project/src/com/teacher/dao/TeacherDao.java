package com.teacher.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.teacher.pojo.Teacher;

public class TeacherDao {

	public Connection getConnect() {
		String user="root";
		String passw="";
		String url="jdbc:mysql://localhost:3306/projectjava";

		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,user,passw)	;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}


	public void addTeacher(Teacher s) {
		try {
			String sql="insert into teacher(name,email,contact,college,Salary) values(?,?,?,?,?)";
			PreparedStatement ps=getConnect().prepareStatement(sql);
			ps.setString(1, s.getName());
			ps.setString(2, s.getEmail());
			ps.setString(3, s.getContact());
			ps.setString(4, s.getCollege());
			ps.setString(5, s.getSalary());
			ps.execute();
			getConnect().close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	public void updateTeacher(Teacher s) {
		try {
			String sql="update  teacher set name=?,email=?,contact=?,college=?,salary=? where roll_no=?";
			PreparedStatement ps=getConnect().prepareStatement(sql);
			ps.setString(1, s.getName());
			ps.setString(2, s.getEmail());
			ps.setString(3, s.getContact());
			ps.setString(4, s.getCollege());
			ps.setString(5, s.getSalary());
			ps.setInt(6, s.getRollNo());
			ps.execute();
			getConnect().close();
		}catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	public void selectTeacherByRollNo(int roll_no) {
		try {
			String sql="select * from Teacher where roll_no=?";
			PreparedStatement ps=getConnect().prepareStatement(sql);
			ps.setInt(1, roll_no);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getString(6));
			}
			getConnect().close();
		}catch (Exception e) {
			e.printStackTrace();
		}		
	}

	public void deleteTeacher(int roll_no) {
		try {
			String sql="delete  from Teacher where roll_no=?";
			PreparedStatement ps=getConnect().prepareStatement(sql);
			ps.setInt(1, roll_no);
			ps.execute();
			getConnect().close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}		
	

	public void selectAllTeacher() {
		try {
			String sql="select * from Teacher";
			PreparedStatement ps=getConnect().prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getString(6));
			}
			getConnect().close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void selectAllTeacherByCollege(String college){
		  try {
		   String sql="select * from Teacher where college like '%"+college+"%'";
		   PreparedStatement ps=getConnect().prepareStatement(sql);
		   ResultSet rs=ps.executeQuery();
		   while(rs.next()) {
		    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getString(6));
		   }
		   getConnect().close();
		  }catch (Exception e) {
		   e.printStackTrace();
		  }
		 }		

}
