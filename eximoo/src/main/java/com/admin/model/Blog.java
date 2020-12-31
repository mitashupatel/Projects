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
@Table(name="blog")
public class Blog {
		
		@Id
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		private long blogId;
		
		
		private String blogLanguage;
		
		private String blogContent;
		private String title;
		private String photo1;
		private String photo2;
		private int isActive;
		private int isDeleted;
		private String createdBy;
		private String modifyBy;
		private String createdDate;
		private String modifyDate;
		
		
	
}
