package com.ivote.serviceimpl;

import com.ivote.bean.Party;
import com.ivote.bean.Party;
import com.ivote.dao.PartyDao;
import com.ivote.service.PartyService;
import com.ivote.utils.FTPUtils;
import com.ivote.utils.FileUtils;

import java.io.File;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

@Service("partyService")
@Transactional
public class PartyServiceImpl implements PartyService {

	@Autowired
	PartyDao partyDao;

	private static String UPLOADED_FOLDER1 = "E://tools//apache-tomcat-9.0.11-windows-x64//apache-tomcat-9.0.11//webapps//ivote//resources//images//";
	
	public long saveUpdateParty(Party party, MultipartFile file) {
		String newFileName = FileUtils.getFileName(file.getOriginalFilename());
		party.setIsActive(1);
		party.setPartyImage(newFileName);
		Party party1 = partyDao.saveUpdateParty(party);
		if(party != null)
		{
			FileUtils.uploadImageFile(file, UPLOADED_FOLDER1+newFileName);
			FTPUtils.uploadOnFTP(UPLOADED_FOLDER1+newFileName, newFileName);
		}
		return 0;
	}

	public Party editParty(long id) {
		return partyDao.editParty(id);
	}

	public boolean deleteParty(long id) {
		
		return partyDao.deleteParty(id);
	}

	public List<Party> getAllWithLeader() {
		List<Party> PartyList = partyDao.getAllWithLeader();
		for (Party Party : PartyList) {
			String fileName = Party.getPartyImage();
			File file = new File(UPLOADED_FOLDER1+fileName);
			if(!file.exists())
			{
				FTPUtils.download(fileName, UPLOADED_FOLDER1+fileName);
			}
		}
		for (Party Party : PartyList) {
			String fileName = Party.getLeaderImage();
			File file = new File(UPLOADED_FOLDER1+fileName);
			if(!file.exists())
			{
				FTPUtils.download(fileName, UPLOADED_FOLDER1+fileName);
			}
		}
		return PartyList;
	}
	
	public List<Party> getAll() {
		List<Party> PartyList = partyDao.getAll();
		for (Party Party : PartyList) {
			String fileName = Party.getPartyImage();
			File file = new File(UPLOADED_FOLDER1+fileName);
			if(!file.exists())
			{
				FTPUtils.download(fileName, UPLOADED_FOLDER1+fileName);
			}
		}
		return PartyList;
	}
	
	/*public List<MainMenu> getAllMainMenu() {
		return PartyDao.getAllMainMenu();
	}*/
}
