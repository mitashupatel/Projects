package com.admin.dao;

import java.util.List;

import com.admin.model.NewsLetter;

public interface NewsLetterDao extends GenericDAO<NewsLetter>{
		
	public long saveNewsLetter(NewsLetter newsletter);
	public List<NewsLetter> getNewsLetter();
	public NewsLetter editNewsLetter(long newsletterId);
	public boolean deleteNewsLetter(long newsletterId);
	public List<NewsLetter> getEmail();

	

	
}
