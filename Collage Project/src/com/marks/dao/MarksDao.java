package com.marks.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.marks.pojo.Marks;

public class MarksDao {

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


	public void addtStudentsMarks(Marks m) {
		try {
			String sql="insert into marks(name,contact,marks) values(?,?,?)";
			PreparedStatement ps=getConnect().prepareStatement(sql);
			ps.setString(1, m.getName());
			ps.setString(2, m.getContact());
			ps.setString(3, m.getMarks());
			ps.execute();
			getConnect().close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	public void updateStudentsMarks(Marks l) {
		try {
			String sql="update marks set name=?,contact=?,marks=? where roll_no=?";
			PreparedStatement ps=getConnect().prepareStatement(sql);
			ps.setString(1, l.getName());
			ps.setString(2, l.getContact());
			ps.setString(3, l.getMarks());
			ps.setInt(4, l.getRollNo());
			ps.execute();
			getConnect().close();
		}catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	public void selectStudentsMarksByRollNo(int roll_no) {
		try {
			String sql="select * from marks where roll_no=?";
			PreparedStatement ps=getConnect().prepareStatement(sql);
			ps.setInt(1, roll_no);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));
			}
			getConnect().close();
		}catch (Exception e) {
			e.printStackTrace();
		}		
	}

	public void deleteStudentsMarks(int roll_no) {
		try {
			String sql="delete  from marks where roll_no=?";
			PreparedStatement ps=getConnect().prepareStatement(sql);
			ps.setInt(1, roll_no);
			ps.execute();
			getConnect().close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}		
	

	public void selectAllStudentsMarks() {
		try {
			String sql="select * from marks";
			PreparedStatement ps=getConnect().prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));
			}
			getConnect().close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
