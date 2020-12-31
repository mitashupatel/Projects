package com.ivote.daoimpl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ivote.bean.Admin;
import com.ivote.dao.AdminDao;

@Repository("adminDao")
public class AdminDaoImpl extends GenericDaoImpl<Admin> implements AdminDao {

	public long saveUpdateAdmin(Admin admin) {
		return super.saveUpdateObject(admin).getAdminId();
	}

	public Admin editAdmin(long id) {
		return super.getById(Admin.class, id);
	}

	public boolean deleteAdmin(long id) {
		Admin admin = super.getById(Admin.class, id);
		admin.setIsDeleted(1);
		return super.updateObject(admin).getAdminId() > 0;
	}

	public List<Admin> getAll() {
		return (List<Admin>) super.getByQuery("FROM Admin a WHERE a.isDeleted=0");
	}
}
