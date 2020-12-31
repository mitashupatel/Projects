package com.ivote.serviceimpl;

import java.io.File;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.ivote.bean.Leader;
import com.ivote.bean.Leader;
import com.ivote.dao.LeaderDao;
import com.ivote.dao.LeaderDao;
import com.ivote.service.LeaderService;
import com.ivote.utils.FTPUtils;
import com.ivote.utils.FileUtils;

@Service("leaderService")
@Transactional
public class LeaderServiceImpl implements LeaderService {

	@Autowired
	LeaderDao leaderDao;
	
	private static String UPLOADED_FOLDER1 = "E://tools//apache-tomcat-9.0.11-windows-x64//apache-tomcat-9.0.11//webapps//ivote//resources//images//";
	
	public long saveUpdateLeader(Leader leader, MultipartFile file) {
		String newFileName = FileUtils.getFileName(file.getOriginalFilename());
		leader.setIsActive(1);
		leader.setLeaderImage(newFileName);
		Leader leader1 = leaderDao.saveUpdateLeader(leader);
		if(leader != null)
		{
			FileUtils.uploadImageFile(file, UPLOADED_FOLDER1+newFileName);
			FTPUtils.uploadOnFTP(UPLOADED_FOLDER1+newFileName, newFileName);
		}
		return 0;
	}

	public Leader editLeader(long id) {
		return leaderDao.editLeader(id);
	}

	public boolean deleteLeader(long id) {
		
		return leaderDao.deleteLeader(id);
	}

	public List<Leader> getAll() {
		List<Leader> LeaderList = leaderDao.getAll();
		for (Leader Leader : LeaderList) {
			String fileName = Leader.getLeaderImage();
			File file = new File(UPLOADED_FOLDER1+fileName);
			if(!file.exists())
			{
				FTPUtils.download(fileName, UPLOADED_FOLDER1+fileName);
			}
		}
		return LeaderList;
	}
	
	/*public List<MainMenu> getAllMainMenu() {
		return LeaderDao.getAllMainMenu();
	}*/

}
