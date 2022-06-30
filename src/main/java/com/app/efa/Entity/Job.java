package com.app.efa.Entity;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Job {
	// -----------------------------------------------------//
	// ----------------job bean ---------------------------//
	// -----------------------------------------------------//
	// id
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long jobId;
	// number of vacancy for the job
	@Column(nullable = false, unique = false, length = 10)
	private int vacancy;
	// required experience
	@Column(nullable = false, unique = false, length = 20)
	private String experience;
	// job description
	@Column(nullable = false, unique = false, length = 100)
	private String description;
	// job title
	@Column(nullable = false, unique = false, length = 30)
	private String title;
	// availability required
	@Column(nullable = false, unique = false, length = 20)
	private String type;
	// job category
	@Column(nullable = false, unique = false, length = 20)
	private String category;
	// posted date
	@Column(nullable = false, unique = false, length = 20)
	private Date posted;
	// deadline day
	@Column(nullable = false, unique = false, length = 20)
	private Date endDate;
	// job budget
	@Column(nullable = false, unique = false, length = 20)
	private double budget;
	// is approved
	@Column(nullable = false, unique = false, length = 20)
	private boolean isApproved;
	@OneToMany
	private List<Skill> skill;
	@OneToMany
	private List<JobApplication> jobApplication;
	// ------------------------------------------------------//

}
