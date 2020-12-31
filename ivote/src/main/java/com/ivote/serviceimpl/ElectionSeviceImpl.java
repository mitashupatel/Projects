package com.ivote.serviceimpl;

import java.io.File;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.ivote.bean.Election;
import com.ivote.dao.ElectionDao;
import com.ivote.service.ElectionService;
import com.ivote.utils.FTPUtils;
import com.ivote.utils.FileUtils;

@Service("electionService")
@Transactional
public class ElectionSeviceImpl implements ElectionService {

	@Autowired
	ElectionDao electionDao;
	
	private static String UPLOADED_FOLDER1 = "E://tools//apache-tomcat-9.0.11-windows-x64//apache-tomcat-9.0.11//webapps//ivote//resources//images//";
	
	public long saveUpdateElection(Election election, MultipartFile[] file) {
		String newFileName = FileUtils.getFileName(file[0].getOriginalFilename());
		election.setIsActive(1);
		election.setElectionImage(newFileName);
		Election election1 = electionDao.saveUpdateElection(election);
		if(election != null)
		{
			FileUtils.uploadImageFile(file[0], UPLOADED_FOLDER1+newFileName);
			FTPUtils.uploadOnFTP(UPLOADED_FOLDER1+newFileName, newFileName);
		}
		return 0;
	}

	public Election editElection(long id) {
		return electionDao.editElection(id);
	}

	public boolean deleteElection(long id) {
		
		return electionDao.deleteElection(id);
	}

	public List<Election> getAll() {
		List<Election> ElectionList = electionDao.getAll();
		for (Election Election : ElectionList) {
			String fileName = Election.getElectionImage();
			File file = new File(UPLOADED_FOLDER1+fileName);
			if(!file.exists())
			{
				FTPUtils.download(fileName, UPLOADED_FOLDER1+fileName);
			}
		}
		return ElectionList;
	}
	
	/*public List<MainMenu> getAllMainMenu() {
		return ElectionDao.getAllMainMenu();
	}*/

}
