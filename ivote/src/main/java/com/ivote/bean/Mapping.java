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
@Table(name = "mapping")
@Getter
@Setter
@AllArgsConstructor
@ToString
@Data
@NoArgsConstructor
public class Mapping {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long mappingId;
	private long mpId;
	private long nationId;
	private long regionId;
	private long constituencyId;
	private long electionId;
	private long partyId;
	private int isActive;
	private int isDeleted;
	private int createdBy;
	private int modifyBy;
	private Date createdDate;
	private Date modifyDate;
	@Transient
	private String partyName;
	@Transient
	private String electionName;
	@Transient
	private String leaderFirstName;
	@Transient
	private String leaderLastName;
	@Transient
	private String mpFirstName;
	@Transient
	private String mpLastName;
	@Transient
	private String regionName;
	@Transient
	private String nationName;
	@Transient
	private String constituencyName;
}
