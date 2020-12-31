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
@Table(name="letter")
public class Letter {
			@Id
			@GeneratedValue(strategy= GenerationType.IDENTITY)
			private long letterId;
			
			@Column
			private String mailmessage;
			
			@Column
			private String date;
			
			@Column
			private String sender;
}
