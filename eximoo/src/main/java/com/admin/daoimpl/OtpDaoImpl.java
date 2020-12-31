package com.admin.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.admin.dao.OtpDao;
import com.admin.model.Otp;
import com.admin.model.User;

@Repository("otpDao")
public class OtpDaoImpl extends GenericDaoImpl<Otp> implements OtpDao  {

protected static SessionFactory sessionFactory;
	public Otp varifyOtp(Otp otp) {
		String query = "FROM Otp where otpId='" + otp.getOtpId() + "' and otp='" + otp.getOtp()
		+ "'";
		List<Otp> list = super.getByQuery(query);
		if (list.size() == 0) {
		return null;
        }
		return list.get(0);
		}
	public long addOtp(Otp otp) {

		return super.saveUpdateObject(otp).getOtpId();
	}

}
