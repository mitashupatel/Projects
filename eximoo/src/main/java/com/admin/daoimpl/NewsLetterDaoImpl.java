package com.admin.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.admin.dao.NewsLetterDao;

import com.admin.model.NewsLetter;

@Repository("newsletterDao")
public class NewsLetterDaoImpl extends GenericDaoImpl<NewsLetter> implements NewsLetterDao{
	
	protected static SessionFactory sessionFactory;
	
	public long saveNewsLetter(NewsLetter newsletter) {
		return super.saveUpdateObject(newsletter).getNewsletterId();
	}
	
	
	
	public NewsLetter editNewsLetter(long newsletterId) {
		return super.getById(NewsLetter.class, newsletterId);
	}

	public boolean deleteNewsLetter(long newsletterId) {
		NewsLetter newsletter= super.getById(NewsLetter.class, newsletterId);
		newsletter.setIsDeleted(1);
		return super.updateObject(newsletter).getNewsletterId()> 0;
	}
	
	
	
	public List<NewsLetter> getNewsLetter() {
		return (List<NewsLetter>) super.getByQuery("FROM NewsLetter a WHERE isDeleted=0");
	}


	public List<NewsLetter> getEmail(){
		return (List<NewsLetter>) super.getByQuery("SELECT email FROM NewsLetter  a WHERE isDeleted=0");
	}
	

}
