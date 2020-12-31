package com.admin.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

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
	private long userid;
	
	@Column
	private String name;
	
	@Column
	private String email;
	@Column
	private String password;
	@Column
	private String phone;
	@Column
	private String address;
	@Column
	private String birthdate;
	@Column
	private String userphoto;
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
	@Column
	private int newsletter;
	@Column
	private int terms;
	@Column
	private String userOtp;
	
	@Transient
	private String npassword;
}
