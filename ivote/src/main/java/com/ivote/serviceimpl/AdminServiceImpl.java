package com.ivote.serviceimpl;

import com.ivote.bean.Admin;
import com.ivote.dao.AdminDao;
import com.ivote.service.AdminService;
import com.ivote.utils.Mailer;
import com.ivote.utils.PasswordEncode;
import com.ivote.utils.PasswordEncrypt;
import com.ivote.utils.RandomString;

import java.util.List;
import javax.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

@Service("adminService")
@Transactional
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminDao adminDao;

	public long saveUpdateAdmin(Admin admin) {
		long adminId = 0;
		admin.setIsActive(1);
		if (admin.getAdminId() == 0) {
			String password = RandomString.getAlphaNumericString(8);
			admin.setPassword(PasswordEncode.passwordEncode(password));
			adminId = adminDao.saveUpdateAdmin(admin);
			if (adminId > 0) {
				Mailer.send("healthplus123456@gmail.com", "he@lthplus123", admin.getEmail(), "Hello..!!!", password);
			}
		} else {
			adminId = adminDao.saveUpdateAdmin(admin);
		}
		return adminId;
	}

	public Admin editAdmin(long aid) {
		return adminDao.editAdmin(aid);
	}

	public boolean deleteAdmin(long aid) {
		return adminDao.deleteAdmin(aid);
	}

	public List<Admin> getAll() {

		return adminDao.getAll();
	}

}
