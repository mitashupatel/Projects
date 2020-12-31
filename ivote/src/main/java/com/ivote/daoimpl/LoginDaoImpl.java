package com.ivote.daoimpl;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.ivote.bean.Admin;
import com.ivote.dao.LoginDao;

@Repository("loginDao")
public class LoginDaoImpl extends GenericDaoImpl<Admin> implements LoginDao {

	public Admin logincheck(Admin admin) {
		String query = "FROM Admin where email='" + admin.getEmail() + "' and password='" + admin.getPassword()
				+ "'";
		List<Admin> list = super.getByQuery(query);
		if (list.size() == 0) {
			return null;
		}
		return list.get(0);
	}

	public Admin forgotpassword(Admin admin) {

		Criteria criteria = getSession().createCriteria(Admin.class);
		criteria.add(Restrictions.eq("email", admin.getEmail()));
		Admin adminDao = (Admin) criteria.uniqueResult();
		return adminDao;
	}
	public int changePass(String newPassword, long id)
	{
		String query = "update AdminBean set password = '"+newPassword+"' where aid ='"+id+"'";
		int count = super.updateByQuery(query);
		return count;
	}

	public int updatePass(String oldpassword, String newpassword) {
		String query = "FROM AdminBean where password='"+oldpassword+"'";
		return 0;
	}

}
