package com.app.efa.Service;

import com.app.efa.Entity.Admin;
import com.app.efa.Entity.Feedback;
import com.app.efa.Entity.JobApplication;
import com.app.efa.Model.JobApplicationModel;

import java.util.List;
import java.util.Optional;

public interface JobApplicationService {
    void add_job_application(JobApplicationModel jobApplicationModel);
    JobApplicationModel get_job_application(long id);
    List<JobApplicationModel> all_job_application();
    void update_job_application(long id);
    void delete_job_application(long id);
    void delete_all();
}
