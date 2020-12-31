package com.admin.service;

import java.util.List;

import com.admin.model.Language;


public interface LanguageService {
	public long saveLanguage(Language language);
	public List<Language> getLanguage();
	public boolean deleteLanguage(long languageId);
	public Language editLanguage(long languageId);
}
