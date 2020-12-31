package com.cc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.cc.bean.LogList;
import com.cc.utill.LogDbConn;
import com.cc.utill.SessionUtils;

public class LogDao {

	public boolean addLog() {
		return false;

	}

	public List<LogList> getAll() {

		Session session = SessionUtils.getSession();
		Transaction t = session.beginTransaction();
		List<LogList> list = new ArrayList<LogList>();
		try {

			list = session.createQuery("FROM LogList").list();

			t.commit();
		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}

	public boolean addlog(LogList bean) {

		Session session = SessionUtils.getSession();
		Transaction t = session.beginTransaction();
		boolean result = false;
		try {

			session.save(bean);

			t.commit();
		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return true;

	}

	public boolean delLog(int id) {

		Session session = SessionUtils.getSession();
		Transaction t = session.beginTransaction();
		boolean result = false;
		try {
			LogList log = session.get(LogList.class, id);
			session.delete(log);

			t.commit();
		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return true;

	}

	public LogList getById(int id) {

		Session session = SessionUtils.getSession();
		Transaction t = session.beginTransaction();
		LogList log = null;
		try {
			log = session.get(LogList.class, id);
			t.commit();
		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return log;
	}

	public boolean updateLog(LogList lgl) {

		Session session = SessionUtils.getSession();
		Transaction t = session.beginTransaction();
		boolean result = false;
		try {

			session.update(lgl);

			t.commit();
		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return true;
	}

}
