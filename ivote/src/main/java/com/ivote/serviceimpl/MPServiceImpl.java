package com.ivote.serviceimpl;

import java.io.File;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import com.ivote.bean.MP;
import com.ivote.dao.MPDao;
import com.ivote.service.MPService;
import com.ivote.utils.FTPUtils;
import com.ivote.utils.FileUtils;

@Service("mpService")
@Transactional
public class MPServiceImpl implements MPService {

	@Autowired
	MPDao mpDao;
	
	private static String UPLOADED_FOLDER1 = "E://tools//apache-tomcat-9.0.11-windows-x64//apache-tomcat-9.0.11//webapps//ivote//resources//images//";
	
	public long saveUpdateMP(MP mp, MultipartFile file) {
		String newFileName = FileUtils.getFileName(file.getOriginalFilename());
		mp.setIsActive(1);
		mp.setMpImage(newFileName);
		MP mp1 = mpDao.saveUpdateMP(mp);
		if(mp != null)
		{
			FileUtils.uploadImageFile(file, UPLOADED_FOLDER1+newFileName);
			FTPUtils.uploadOnFTP(UPLOADED_FOLDER1+newFileName, newFileName);
		}
		return 0;
	}

	public MP editMP(long id) {
		return mpDao.editMP(id);
	}

	public boolean deleteMP(long id) {
		
		return mpDao.deleteMP(id);
	}

	public List<MP> getAll() {
		List<MP> mpList = mpDao.getAll();
		for (MP mp : mpList) {
			String fileName = mp.getMpImage();
			File file = new File(UPLOADED_FOLDER1+fileName);
			if(!file.exists())
			{
				FTPUtils.download(fileName, UPLOADED_FOLDER1+fileName);
			}
		}
		return mpList;
	}

}
