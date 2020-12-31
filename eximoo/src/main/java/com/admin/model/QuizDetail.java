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
@Table(name="quizdetail")
public class QuizDetail {
 
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int quizId;
	@Column
	private int level;
	@Column
	private int quizLanguageId;
	@Column
	private String title;
	@Column
	private int questionNumber;

	@Column
	private int isDeleted;
	
	@Column
	private String addedBy;
	@Column
	private String modifyBy;
	@Column
	private String addedDate;
	@Column
	private String modifyDate;
}
