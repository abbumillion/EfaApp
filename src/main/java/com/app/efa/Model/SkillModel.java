package com.app.efa.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SkillModel {
//-------SKILL BEAN------------//
	//skill id
	private long Id;
	// skill name or title like developer,designer
	private String skillName;

	// skill description
	private String skillDescription;

	// skill category like technology,art,medical
	private String skillCategory;

//	// foreign relationship
//	private UserModel userModel;
////-----------------------------//

}
