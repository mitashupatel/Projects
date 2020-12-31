package com.sheth.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.sheth.bean.Employee;
import com.sheth.util.DbConnection;

public class EmployeeDao {

	public boolean addEmployee(Employee emp) {

		return false;
	}

	public List<Employee> getAll() {
		Connection conn = DbConnection.getConnection();
		Statement st;
		List<Employee> list = new ArrayList<Employee>();
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from employee");
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt("id"));
				emp.setFname(rs.getString(2));
				emp.setLname(rs.getString("lname"));
				list.add(emp);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	}

	public boolean addEmployee(String fname, String lname) {

		String query = "insert into employee (fname, lname) values (?,?)";
		Connection conn = DbConnection.getConnection();
		boolean result = false;
		try {
			PreparedStatement pr = conn.prepareStatement(query);
			pr.setString(1, fname);
			pr.setString(2, lname);
			int i = pr.executeUpdate();

			if (i > 0) {
				result = true;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	public boolean delEmployee(int id) {
		// String query = "SQL_DELETE_employee";
		String query = "delete from employee where id = ?";
		Connection conn = DbConnection.getConnection();
		boolean result = false;
		try {
			PreparedStatement dl = conn.prepareStatement(query);
			dl.setInt(1, id);
			int i = dl.executeUpdate();

			if (i > 0) {
				result = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public Employee getById(int id) {
		
		Connection conn = DbConnection.getConnection();
		PreparedStatement prSt = null;
		Employee emp = null;
		try {
			prSt = conn.prepareStatement("select * from employee where id = ?");
			prSt.setInt(1, id);
			ResultSet rs = prSt.executeQuery();
			if (rs.first()) {
				emp = new Employee();
				emp.setId(rs.getInt("id"));
				emp.setFname(rs.getString(2));
				emp.setLname(rs.getString("lname"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				prSt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return emp;

	}

	public boolean updateEmployee(Employee emp) {

		String query = "update Employee set fname = ?, lname=? where id =?";
		Connection conn = DbConnection.getConnection();
		boolean result = false;
		try {
			PreparedStatement dl = conn.prepareStatement(query);
			dl.setString(1, emp.getFname());
			dl.setString(2, emp.getLname());
			dl.setInt(3, emp.getId());
			int i = dl.executeUpdate();

			if (i > 0) {
				result = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;

	}

}
