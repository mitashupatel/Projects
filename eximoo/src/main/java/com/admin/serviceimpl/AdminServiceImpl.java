package com.admin.serviceimpl;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.admin.dao.AdminDao;
import com.admin.model.Admin;

import com.admin.service.AdminService;
import com.admin.utills.FTPUtils;
import com.admin.utills.FileUtils;
import com.admin.utills.Mailer;
import com.admin.utills.PasswordEncode;
import com.admin.utills.RandomString;

@Service("adminService")
@Transactional
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminDao adminDao;
	
	private static String UPLOADED_FOLDER1 = "F://Tools//apache-tomcat-9.0.30-windows-x64//apache-tomcat-9.0.30//webapps//eximoo//resources//images//admin//";
	
	public long saveUpdateAdmin(Admin admin, MultipartFile file) {
		String newFileName = FileUtils.getFileName(file.getOriginalFilename());
		    long adminId = 0;
			admin.setIsActive(1);
			admin.setAdminphoto(newFileName);
			if (admin.getAdminid() == 0) {
				String password = RandomString.getAlphaNumericString(8);
				admin.setPassword(PasswordEncode.passwordEncode(password));
				adminId = adminDao.saveUpdateAdmin(admin);
				if (adminId > 0) {
					Mailer.send("eximoohello@gmail.com", "eximoo123@", admin.getEmail(), "Hello..!!!", password);
				}
			} else {
				adminId = adminDao.saveUpdateAdmin(admin);
			}
			
			if(admin != null)
			{
				FileUtils.uploadImageFile(file, UPLOADED_FOLDER1+newFileName);
				FTPUtils.uploadOnFTP(UPLOADED_FOLDER1+newFileName, newFileName);
			}
			
			return adminId;
		}

	public Admin editAdmin(long adminid) {
		return adminDao.editAdmin(adminid);
	}

	public boolean deleteAdmin(long adminid) {
		return adminDao.deleteAdmin(adminid);
	}

	
	
	public List<Admin> getAll() {
		List<Admin> AdminList = adminDao.getAll();
		/*for (Admin Admin:AdminList) {
			String fileName = Admin.getAdminphoto();
			File file = new File(UPLOADED_FOLDER1+fileName);
			if(!file.exists())
			{
				FTPUtils.download(fileName, UPLOADED_FOLDER1+fileName);
			}
		}*/
		return AdminList;
	}
	
}
