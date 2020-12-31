package com.cc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cc.bean.LogList;
import com.cc.utill.LogDbConn;

public class LogDao {

	public boolean addLog() {
		return false;
		
	}
	
	public List<LogList> getAll(){
		Connection conn=LogDbConn.getConnection();
		Statement st;
		List<LogList> list=new ArrayList<LogList>();
		try {
			st= conn.createStatement();
			ResultSet rs= st.executeQuery("select * from logbase");
			while(rs.next()) {
				LogList lgl= new LogList();
				lgl.setId(rs.getInt("id"));
				lgl.setUname(rs.getString("uname"));
				lgl.setAddress(rs.getString("address"));
				lgl.setEmail(rs.getString("email"));
				lgl.setGender(rs.getString("gender"));
				lgl.setNum(rs.getString("num"));
				lgl.setMes(rs.getString("mes"));
				lgl.setPass(rs.getString("pass"));
				list.add(lgl);
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		}
	public boolean addlog(String  uname, String address,String email,String gender,String num,String mes,String pass) {
			
		String query ="insert into logbase (uname,address,email,gender,num,mes,pass) values(?,?,?,?,?,?,?)";
		Connection conn=LogDbConn.getConnection();
		boolean result=false;
		PreparedStatement pr;
		try {
			pr = conn.prepareStatement(query);
			pr.setString(1, uname);
			pr.setString(2, address);
			pr.setString(3, email);
			pr.setString(4, gender);
			pr.setString(5, num);
			pr.setString(6, mes);
			pr.setString(7, pass);
			int i=pr.executeUpdate();

			if(i>0) {
				result=true;
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return result;
		
	}

	public boolean delLog(int id) {
			String query="delete from logbase where id = ?";
			Connection conn=LogDbConn.getConnection();
			boolean result=false;
			PreparedStatement dl;
			try {
				dl = conn.prepareStatement(query);
				dl.setInt(1,id);
				int i=dl.executeUpdate();
				if(i>0) {
					result=true;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		return false;
	}

	public LogList getById(int id) {
		Connection conn= LogDbConn.getConnection();
		PreparedStatement prpt=null;
		LogList lgl=null;
		
		try {
			prpt=conn.prepareStatement("select * from logbase where id = ?");
			prpt.setInt(1,id);
			ResultSet rs=prpt.executeQuery();
			if(rs.first()) {
					lgl = new LogList();
					lgl.setId(rs.getInt("id"));
					lgl.setUname(rs.getString("uname"));
					lgl.setAddress(rs.getString("address"));
					lgl.setEmail(rs.getString("email"));
					lgl.setGender(rs.getString("gender"));
					lgl.setNum(rs.getString("num"));
					lgl.setMes(rs.getString("mes"));
					lgl.setPass(rs.getString("pass"));
					}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				prpt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		return lgl;}
		
	public boolean updateLog(LogList lgl) {
		String query="update logbase set uname= ?, address=?, email=?, gender=?,num=?, mes=?, pass=? where id=?";
		Connection conn=LogDbConn.getConnection();
		boolean result=false;
		
		try {
			PreparedStatement pl = conn.prepareStatement(query);
			pl.setString(1, lgl.getUname());
			pl.setString(2, lgl.getAddress());
			pl.setString(3, lgl.getEmail());
			pl.setString(4, lgl.getGender());
			pl.setString(5, lgl.getNum());
			pl.setString(6, lgl.getMes());
			pl.setString(7, lgl.getPass());
			pl.setInt(8, lgl.getId() );
			int i=pl.executeUpdate();
			if(i>0) {
				result=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	}
	

