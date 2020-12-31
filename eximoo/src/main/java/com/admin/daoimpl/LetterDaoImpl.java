package com.admin.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.admin.dao.LetterDao;
import com.admin.model.Admin;
import com.admin.model.Letter;


@Repository("letterDao")
public class LetterDaoImpl extends GenericDaoImpl<Letter> implements LetterDao{
		
protected static SessionFactory sessionFactory;
	
	public long saveLetter(Letter letter) {
		return super.saveUpdateObject(letter).getLetterId();
	}
	
	
	
}
