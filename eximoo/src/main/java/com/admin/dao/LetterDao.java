package com.admin.dao;

import java.util.List;


import com.admin.model.Letter;

public interface LetterDao extends GenericDAO<Letter> {
		 
		public long saveLetter(Letter letter);
		
		
}
