package com.admin.serviceimpl;

import java.util.List;

import javax.mail.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.admin.dao.LetterDao;
import com.admin.dao.NewsLetterDao;
import com.admin.model.Letter;
import com.admin.model.NewsLetter;
import com.admin.service.LetterService;
import com.admin.utills.Mailer;


@Service("letterService")
public class LetterServiceImpl implements LetterService {

	@Autowired
	LetterDao letterDao;

	@Autowired
	NewsLetterDao newsletterDao;

	public long saveUpdateLetter(Letter letter) {
		long letterId = 0;
		List<NewsLetter> emailList = newsletterDao.getEmail();
		String content = letter.getMailmessage();
		
		if (emailList != null) {
			for (Object temp : emailList) {
				String elist = temp.toString();
				Mailer.send("rakishasemja007@gmail.com", "123asqwzx@", elist, "NewsLetter From Eximoo", content);
			}
		}
		letterDao.saveLetter(letter);
		return letterId;
		}
	
}
