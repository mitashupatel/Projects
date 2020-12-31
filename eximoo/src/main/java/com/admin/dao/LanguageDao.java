package com.admin.dao;

import java.util.List;


import com.admin.model.Language;

public interface LanguageDao extends GenericDAO<Language> {
	public long saveLanguage(Language language);
	public List<Language> getLanguage();
	public Language editLanguage(long languageId);
	public boolean deleteLanguage(long languageId);
	
}
