package com.admin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
  
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="language")
public class Language {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long languageId;
	
	@Column
	private String language;
	@Column
	private int isDeleted;
	@Column
	private String addedBy;
	@Column
	private String modifyBy;
	@Column
	private String addedDate;
	@Column
	private String modifyDate;
	
	
}
