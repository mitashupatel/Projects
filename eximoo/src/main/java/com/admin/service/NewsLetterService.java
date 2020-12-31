package com.admin.service;

import java.util.List;

import com.admin.model.Letter;
import com.admin.model.NewsLetter;



public interface NewsLetterService {
		
	public long saveNewsLetter(NewsLetter newsletter);
	public List<NewsLetter> getNewsLetter();
	public boolean deleteNewsLetter(long newsletterId);
	public NewsLetter editNewsLetter(long newsletterId);
	public List<NewsLetter> getEmail();
	
}
