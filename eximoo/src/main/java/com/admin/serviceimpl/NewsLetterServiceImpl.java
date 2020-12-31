package com.admin.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.dao.NewsLetterDao;
import com.admin.model.NewsLetter;
import com.admin.service.NewsLetterService;


@Service("newsletterService")
public class NewsLetterServiceImpl implements NewsLetterService {
		
		@Autowired
		NewsLetterDao newsletterDao;
		
		
		public List<NewsLetter> getNewsLetter() {
			return newsletterDao.getNewsLetter();
		}
		public List<NewsLetter> getEmail(){
			return newsletterDao.getEmail();
		}

		public long saveNewsLetter(NewsLetter newsletter) {
			long newsletterId = 0;
			newsletterDao.saveNewsLetter(newsletter);

			return newsletterId;
			
		}

		public boolean deleteNewsLetter(long newsletterId) {
			return newsletterDao.deleteNewsLetter(newsletterId);
			
		}

		public NewsLetter editNewsLetter(long newsletterId) {
			return newsletterDao.editNewsLetter(newsletterId);
		}

		
		
		
		
}
