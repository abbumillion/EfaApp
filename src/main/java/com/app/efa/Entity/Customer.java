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
public class Customer {
	// user's id for primary key
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	//job list posted by the customer
	@OneToMany
	private List<Job> job;
	//user account related data
	@Embedded
	private User user;
	@OneToMany
	private List<Feedback> feedback;
	// user rating given by other users
	@Column(nullable = true, unique = false, length = 2)
	private int rating;
}
