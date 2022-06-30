package com.app.efa.Model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@AllArgsConstructor
@Builder
public class FreelancerModel extends UserModel {

    //id
    private long Id;
    // one user can apply to many jobs
    private List<JobApplicationModel> jobApplication;
    // one user has many skills
    private List<SkillModel> skillModel;
    //feedback list given by this freelancer
    private List<FeedbackModel> feedbackModel;
    //user rating
    private int rating;

}
