package com.mitashu.model;

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
import lombok.ToString;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table
public class Admin {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String fname;
	@Column
	private String lname;
	@Column
	private int isDeleted;
	@Column
	private String company;
	@Column
	private String email;
	@Column
	private String number;
	@Column
	private String meal;
	@Column
	private String mode;
	
	@Column
	private String ddno;
	
	@Column
	private String bank;
	@Column
	private String pay;
}
