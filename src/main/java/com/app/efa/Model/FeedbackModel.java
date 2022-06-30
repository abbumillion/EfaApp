package com.app.efa.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FeedbackModel {
	//feedback id
	private long id;
	//feedback content
	private String content;
	// feedback date
	private Date date;
}
