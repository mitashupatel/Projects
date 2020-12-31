package com.mitashu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mitashu.model.User;
import com.mitashu.utills.DbConnection;
import com.mysql.cj.protocol.Resultset;

public class UserDao {

	public List<User> getAll() {
		Connection conn=DbConnection.getConnection();
		List<User> list= new ArrayList<>();
		Statement st;
		try {
			st=conn.createStatement();
			ResultSet rs=st.executeQuery("select * from data");
			while(rs.next()) {
				User user=new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setAddress(rs.getString("address"));
				list.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	public boolean addData(User user) {
		Connection conn=DbConnection.getConnection();
		String query="insert into data(name,address) values(?,?)";
		boolean result=false;
		PreparedStatement pr;
		
		try {
			pr=conn.prepareStatement(query);
			pr.setString(1,user.getName());
			pr.setString(2,user.getAddress());
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
		boolean result=false;
		String query="delete from data where id = ? ";
		
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

	public User getById(int id) {
		Connection conn=DbConnection.getConnection();
		PreparedStatement pr;
		User user=null;
		try {
			pr=conn.prepareStatement("select * from data where id = ?");
			pr.setInt(1, id);
			ResultSet rs= pr.executeQuery();
			if(rs.first()) {
				user=new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setAddress(rs.getString("address"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
	}

	public boolean updateUser(User user) {
		Connection conn=DbConnection.getConnection();
		String query="Update data set name=? , address = ? where id =?";
		boolean result=false;
		PreparedStatement pr;
		try {
			pr = conn.prepareStatement(query);
			pr.setString(1,user.getName());
			pr.setString(2, user.getAddress());
			pr.setInt(3,user.getId());
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
