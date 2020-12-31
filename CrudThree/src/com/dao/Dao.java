package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.db.DbConnection;

import com.model.Data;



public class Dao {

	public List<Data> getAll() {
		Connection conn=DbConnection.getConnection();
		List<Data> list=new ArrayList<>();
		Statement st;
		try {
			st=conn.createStatement();
			ResultSet rs=st.executeQuery("select *from data");
			while(rs.next()) {
				Data data=new Data();
				data.setId(rs.getInt("id"));
				data.setName(rs.getString("name"));
				data.setAddress(rs.getString("address"));
				list.add(data);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	public boolean addData(Data data) {
		Connection conn=DbConnection.getConnection();
		String query="insert into data(name,address) values(?,?)";
		boolean result=false;
		PreparedStatement pr;
		try {
			pr=conn.prepareStatement(query);
			pr.setString(1,data.getName());
			pr.setString(2,data.getAddress());
			int i=pr.executeUpdate();
			if(i>0) {
				result=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	public boolean delData(int id) {
		Connection conn=DbConnection.getConnection();
		String query="delete from data where id=?";
		boolean result=false;
		PreparedStatement pr;
		try {
			pr = conn.prepareStatement(query);
			pr.setInt(1,id);
			int i=pr.executeUpdate();
			if(i>0) {
				result=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	public Data getById(int id) {
		Connection conn=DbConnection.getConnection();
		String query="select *from data where id=?";
		Data data=null;
		PreparedStatement pr=null;
		try {
			pr=conn.prepareStatement(query);
			pr.setInt(1, id);
			ResultSet rs=pr.executeQuery();
			while(rs.next()) {
				data=new Data();
				data.setId(rs.getInt("id"));
				data.setName(rs.getString("name"));
				data.setAddress(rs.getString("address"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				pr.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return data;
	}

	public boolean updateData(Data data) {
		Connection conn=DbConnection.getConnection();
		String query="update data set name = ? , address = ? where id = ? ";
		boolean result=false;
		PreparedStatement pr;
		try {
			pr = conn.prepareStatement(query);
			pr.setString(1, data.getName());
			pr.setString(2,data.getAddress());
			pr.setInt(3,data.getId());
			int i=pr.executeUpdate();
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
