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
@Table(name="contact")
public class Contact {

		@Id
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		private long contactId;
		
		@Column
		private String name;
		
		@Column
		private String email;
		@Column
		private String message;
		
		@Column
		private int isActive;
		@Column
		private int isDeleted;
		@Column
		private String addingdate;
		
		
}
