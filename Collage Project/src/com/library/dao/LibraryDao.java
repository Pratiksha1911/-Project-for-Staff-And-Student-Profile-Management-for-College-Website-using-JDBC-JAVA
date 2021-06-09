package com.library.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.library.pojo.Library;

public class LibraryDao {

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


	public void AllBooks()
	{
		try{
			String sql="select bname from library ";
			PreparedStatement ps=getConnect().prepareStatement(sql);
			
		
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(1));
			}
			getConnect().close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void BookStatus(String bname)
	{
		try{
			String sql="select Status from library where bname=?";
			PreparedStatement ps=getConnect().prepareStatement(sql);
			ps.setString(1, bname);
		
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(1));
			}
			getConnect().close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void NotIssued()
	{
		try{
			String sql="select bname from library where status='-'";
			PreparedStatement ps=getConnect().prepareStatement(sql);
		
		
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(1));
			}
			getConnect().close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void DueDate()
	{
		try{
			String sql="select sname,duedate from library where duedate<='28-6-21' AND duedate!='-'";
			PreparedStatement ps=getConnect().prepareStatement(sql);
		
		
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2));
			}
			getConnect().close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	}

