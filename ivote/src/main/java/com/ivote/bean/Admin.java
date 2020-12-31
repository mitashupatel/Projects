package com.ivote.bean;

import java.util.Date;

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
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "admin")
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long adminId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private long mobileNo;
	private int isActive;
	private int isDeleted;
	private int createdBy;
	private int modifyBy;
	private Date createdDate;
	private Date modifyDate;
	@Transient
	private String npassword;
	@Transient
	private String cpassword;
	
}
