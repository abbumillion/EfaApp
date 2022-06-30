package com.app.efa.Entity;

import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Freelancer {
	// user's id for primary key
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	// one user can apply to many jobs
	@OneToMany
	private List<JobApplication> jobApplication;
	// one user has many skills
	@OneToMany
	private List<Skill> skill;
	@Embedded
	private User user;
	@OneToMany
	private List<Feedback> feedback;
	// user rating given by other users
	@Column(nullable = true, unique = false, length = 2)
	private int rating;
}
