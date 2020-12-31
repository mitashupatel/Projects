package com.ivote.serviceimpl;

import java.io.File;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ivote.bean.Leader;
import com.ivote.bean.Vote;
import com.ivote.dao.VoteDao;
import com.ivote.dao.VoterDao;
import com.ivote.service.VoteService;
import com.ivote.utils.FTPUtils;

@Service("voteService")
@Transactional
public class VoteServiceImpl implements VoteService {

	@Autowired
	VoteDao voteDao;
	
	private static String UPLOADED_FOLDER1 = "E://tools//apache-tomcat-9.0.11-windows-x64//apache-tomcat-9.0.11//webapps//ivote//resources//images//";
	
	public long saveUpdateVote(Vote vote) {
		Vote vote1 = voteDao.saveUpdateVote(vote);
		return 0;
	}

	public Vote editVote(long id) {
		return voteDao.editVote(id);
	}

	public boolean deleteVote(long id) {
		
		return voteDao.deleteVote(id);
	}

	public List<Vote> getAll() {
		List<Vote> voteList = voteDao.getAll();
		return voteList;
	}

	public List<Vote> getAllMPs(int id) {
		List<Vote> voteList = voteDao.getAllMPs(id);
		for (Vote vote : voteList) {
			String fileName = vote.getLeaderImage();
			File file = new File(UPLOADED_FOLDER1+fileName);
			if(!file.exists())
			{
				FTPUtils.download(fileName, UPLOADED_FOLDER1+fileName);
			}
		}
		for (Vote vote : voteList) {
			String fileName = vote.getPartyImage();
			File file = new File(UPLOADED_FOLDER1+fileName);
			if(!file.exists())
			{
				FTPUtils.download(fileName, UPLOADED_FOLDER1+fileName);
			}
		}
		for (Vote vote : voteList) {
			String fileName = vote.getMpImage();
			File file = new File(UPLOADED_FOLDER1+fileName);
			if(!file.exists())
			{
				FTPUtils.download(fileName, UPLOADED_FOLDER1+fileName);
			}
		}
		return voteList;
	}
	
	
	public List<Vote> getVoteCounter(int id) {
		List<Vote> voteList = voteDao.getVoteCounter(id);
		for (Vote vote : voteList) {
			String fileName = vote.getPartyImage();
			File file = new File(UPLOADED_FOLDER1+fileName);
			if(!file.exists())
			{
				FTPUtils.download(fileName, UPLOADED_FOLDER1+fileName);
			}
		}
		return voteList;
	}
	
}
