package com.admin.model;

import java.util.Date;

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
@Table(name="admin")
public class Admin {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long adminid;
	
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
	private String adminphoto;
	@Column
	private int isActive;
	@Column
	private int isDeleted;
	@Column
	private long createdBy;
	@Column
	private long modifyBy;
	@Column
	private String createdDate;
	@Column
	private String modifyDate;
	
	
	

}
