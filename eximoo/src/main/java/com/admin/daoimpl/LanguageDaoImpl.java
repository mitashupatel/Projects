package com.admin.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.admin.dao.LanguageDao;
import com.admin.model.Admin;
import com.admin.model.Language;

 

@Repository("languageDao")
public class LanguageDaoImpl extends GenericDaoImpl<Language> implements LanguageDao{
	protected static SessionFactory sessionFactory;
	
	public long saveLanguage(Language language) {
		return super.saveUpdateObject(language).getLanguageId();
	}
	
	
	
	public Language editLanguage(long languageId) {
		return super.getById(Language.class, languageId);
	}

	public boolean deleteLanguage(long languageId) {
		Language language= super.getById(Language.class, languageId);
		language.setIsDeleted(1);
		return super.updateObject(language).getLanguageId()> 0;
	}
	
	
	
	public List<Language> getLanguage() {
		return (List<Language>) super.getByQuery("FROM Language a WHERE isDeleted=0");
	}
	
	

	

	
	
}
