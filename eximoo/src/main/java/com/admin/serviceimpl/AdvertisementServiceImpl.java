package com.admin.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.admin.dao.AdvertisementDao;
import com.admin.model.Admin;
import com.admin.model.Advertisement;
import com.admin.service.AdvertisementService;
import com.admin.utills.FTPUtils;
import com.admin.utills.FileUtils;


@Service("advertisementService")
@Transactional
public class AdvertisementServiceImpl implements AdvertisementService{
			
		@Autowired
		AdvertisementDao advertisementDao;
		
		private static String UPLOADED_FOLDER1 = "F://Tools//apache-tomcat-9.0.30-windows-x64//apache-tomcat-9.0.30//webapps//eximoo//resources//images//advertisement//";
		
		public long saveUpdateAd(Advertisement advertisement, MultipartFile file) {
			String newFileName = FileUtils.getFileName(file.getOriginalFilename());
			    long advertisementId = 0;
			    advertisement.setIsActive(1);
			    advertisement.setAdphoto(newFileName);
				if (advertisement.getAdvertisementId() == 0) {
					
					advertisementId = advertisementDao.saveUpdateAd(advertisement);
					
				} 
				
				if(advertisement != null)
				{
					FileUtils.uploadImageFile(file, UPLOADED_FOLDER1+newFileName);
					FTPUtils.uploadOnFTP(UPLOADED_FOLDER1+newFileName, newFileName);
				}
				
				return advertisementId;
			}

		public List<Advertisement> getAll() {
			List<Advertisement> AdvertisementList = advertisementDao.getAll();
			/*for (Admin Admin:AdminList) {
				String fileName = Admin.getAdminphoto();
				File file = new File(UPLOADED_FOLDER1+fileName);
				if(!file.exists())
				{
					FTPUtils.download(fileName, UPLOADED_FOLDER1+fileName);
				}
			}*/
			return AdvertisementList;
		}

		public Advertisement editAdvertisement(long advertisementId) {
			return advertisementDao.editAdvertisement(advertisementId);
		}

		public boolean deleteAdvertisement(long advertisementId) {
			return advertisementDao.deleteAdvertisement(advertisementId);
		}



}
