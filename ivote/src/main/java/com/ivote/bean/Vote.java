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
@Table(name = "vote")
@Getter
@Setter
@AllArgsConstructor
@ToString
@Data
@NoArgsConstructor
public class Vote {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long voteId;
	private long voterId;
	private long electionId;
	private long mpId;
	@Transient
	private Date voteDateTime;
	@Transient
	private String mpFirstName;
	
	@Transient
	private String mpLastName;
	
	@Transient
	private String leaderFirstName;
	
	@Transient
	private String leaderLastName;
	
	@Transient
	private String mpImage;
	
	@Transient
	private String leaderImage;
	
	//@Transient
	private long partyId;
	
	@Transient
	private String partyName;
	
	@Transient
	private String partyImage;
	
	@Transient
	private long voteCount;
	
	
}
