package com.ivote.daoimpl;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.ivote.bean.Voter;
import com.ivote.dao.LoginDao;
import com.ivote.dao.UserLoginDao;
import com.ivote.utils.DbUtility;
import com.ivote.utils.Email;
import com.ivote.utils.RandomString;

@Repository("userLoginDao")
public class UserLoginDaoImpl extends GenericDaoImpl<Voter> implements UserLoginDao {

	public Voter logincheck(Voter voter) {
		String query = "FROM Voter where email='" + voter.getEmail() + "' and niNumber='" + voter.getNiNumber() +"' and password='" + voter.getPassword() +"'";
		List<Voter> list = super.getByQuery(query);
		if (list.size() == 0) {
			voter.setMsg("Wrong UserName or Password");
			return voter;
		}
		//Check vote
		Voter newVoter = list.get(0);
		String query1 = "select voteId, voterId, voteDateTime, electionId, mpId from vote where "
				+ "electionId = (select electionId from elections where isDeleted = 0 order by electionId desc limit 1) and isDeleted = 0 and  voterId ="+newVoter.getVoterId() ;
		List<Voter> list1 = DbUtility.getListData(query1, Voter.class);
		if (list1.size() > 0) {
			voter.setMsg("Alredy voted");
			return voter;
		}
		else{
			int otp =Integer.parseInt(RandomString.getNumericString(6));
			newVoter.setOtp(otp);
			super.updateObject(newVoter);
			//super.updateByQuery("update Voter v set v.otp = "+otp+" where v.voterId="+newVoter.getVoterId());
			Email.send("healthplus123456@gmail.com", "he@lthplus123", newVoter.getEmail(), "Hello,How r u?", String.valueOf(otp));
		}
		return newVoter;
	}

	public Voter forgotpassword(Voter voter) {

		Criteria criteria = getSession().createCriteria(Voter.class);
		criteria.add(Restrictions.eq("email", voter.getEmail()));
		Voter user1 = (Voter) criteria.uniqueResult();
		return user1;
	}
	public int changePass(String newPassword, long id)
	{
		String query = "update Voter set password = '"+newPassword+"' where aid ='"+id+"'";
		int count = super.updateByQuery(query);
		return count;
	}

	public int updatePass(String oldpassword, String newpassword) {
		String query = "FROM AdminBean where password='"+oldpassword+"'";
		return 0;
	}

	public boolean isEmailExist(String email) {
		Criteria criteria = getSession().createCriteria(Voter.class);
		criteria.add(Restrictions.eq("email", email));
		Voter user1 = (Voter) criteria.uniqueResult();
		return (user1 != null);
	}

	public boolean isNiExist(String ni) {
		Criteria criteria = getSession().createCriteria(Voter.class);
		criteria.add(Restrictions.eq("niNumber", ni));
		Voter user1 = (Voter) criteria.uniqueResult();
		return (user1 != null);
	}

	public boolean valOTP(int otp, long id) {

		String query = "FROM Voter where otp="+otp+" and voterId=" + id;
		List<Voter> list = super.getByQuery(query);
		return list.size() > 0;
	}

}
