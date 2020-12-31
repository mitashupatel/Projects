package com.admin.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.dao.LanguageDao;
import com.admin.model.Language;
import com.admin.service.LanguageService;


@Service("languageService")
public class LanguageServiceImpl implements LanguageService {
    
	@Autowired
	LanguageDao languageDao;
	

	public List<Language> getLanguage() {
		return languageDao.getLanguage();
	}

	public long saveLanguage(Language language) {
		long laguageId = 0;
		languageDao.saveLanguage(language);

		return laguageId;
		
	}

	public boolean deleteLanguage(long languageId) {
		return languageDao.deleteLanguage(languageId);
		
	}

	public Language editLanguage(long languageId) {
		return languageDao.editLanguage(languageId);
	}

	

	}


