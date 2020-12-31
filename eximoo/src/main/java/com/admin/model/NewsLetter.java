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
@Table(name="newsletter")
public class NewsLetter {
		@Id
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		private long newsletterId;	
		
		@Column
		private String email;
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
		@Column
		private  int isActive;
		
		
		
		
		
		
}
