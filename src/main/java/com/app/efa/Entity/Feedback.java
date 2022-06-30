package com.app.efa.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@Builder
public class Feedback {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	// user's feedback
	@Column(nullable = false, unique = false, length = 30)
	private String feedbackContent;
	// feedback date
	@Column(nullable = true, unique = false, length = 30)
	private Date feedbackDate;

	public Feedback()
	{
		feedbackDate = new Date();
	}

}
