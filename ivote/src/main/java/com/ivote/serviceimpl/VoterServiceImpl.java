package com.ivote.serviceimpl;

import java.io.File;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ivote.bean.Voter;
import com.ivote.dao.VoteDao;
import com.ivote.dao.VoterDao;
import com.ivote.service.VoteService;
import com.ivote.service.VoterService;
import com.ivote.utils.Mailer;
import com.ivote.utils.PasswordEncode;
import com.ivote.utils.RandomString;

@Service("voterService")
@Transactional
public class VoterServiceImpl implements VoterService {

	@Autowired
	VoterDao voterDao;
	
	public long saveUpdateVoter(Voter voter) {
		long voterId = 0;
		voter.setIsActive(1);
		if (voter.getVoterId() == 0) {
			String password = RandomString.getAlphaNumericString(8);
			voter.setPassword(PasswordEncode.passwordEncode(password));
			Voter vote1  = voterDao.saveUpdateVoter(voter);
			if (vote1.getVoterId() > 0) {
				Mailer.send("healthplus123456@gmail.com", "he@lthplus123", voter.getEmail(), "Hello..!!!", password);
			}
		} else {
			Voter vote1 = voterDao.saveUpdateVoter(voter);
		}
		return 0;
	}

	public Voter editVoter(long id) {
		return voterDao.editVoter(id);
	}

	public boolean deleteVoter(long id) {
		
		return voterDao.deleteVoter(id);
	}

	public List<Voter> getAll() {
		List<Voter> voterList = voterDao.getAll();
		return voterList;
	}

}
