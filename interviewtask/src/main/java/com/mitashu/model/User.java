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

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long userId;
	
	@Column
	private String name;
	@Column
	private String gender;
	@Column
	private String email;
	@Column
	private int mobile;
	@Column
	private String addresline1;
	@Column
	private String addressline2;
	@Column
	private String state;
	@Column
	private String city;
	@Column
	private int zipcode;
	@Column
	private String country;
	@Column
	private int isActive;
	@Column
	private int isDeleted;
	
}
