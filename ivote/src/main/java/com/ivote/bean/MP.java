package com.ivote.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "mps")
@Getter
@Setter
@AllArgsConstructor
@ToString
@Data
@NoArgsConstructor
public class MP {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long mpId;
	private String firstName;
	private String lastName;
	private String email;
	private String mpImage;
	private long mobileNo;
	private int isActive;
	private int isDeleted;
	private int createdBy;
	private int modifyBy;
	private Date createdDate;
	private Date modifyDate;
}
