package com.app.efa.Entity;

import javax.persistence.Embedded;
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
@NoArgsConstructor
@Builder
public class Admin {
	//user's id for primary key
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long Id;
	private int level;
	@Embedded
	private User user;

}
