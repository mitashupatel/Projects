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
@Table(name="advertisement")
public class Advertisement {
			
		@Id
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		private long advertisementId;
		
		@Column
		private String title;
		
		@Column
		private String adphoto;
		
		@Column
		private String imgalt;
		
		@Column
		private String url;
		
		@Column
		private String date;
		
		@Column
		private int isActive;
		@Column
		private int isDeleted;
		@Column
		private String createdBy;
		@Column
		private String modifyBy;
		@Column
		private String createdDate;
		@Column
		private String modifyDate;
}
