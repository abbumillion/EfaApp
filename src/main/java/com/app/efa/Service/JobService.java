package com.app.efa.Service;

import com.app.efa.Entity.Customer;
import com.app.efa.Entity.Job;
import com.app.efa.Model.JobModel;

import java.util.List;
import java.util.Optional;

public interface JobService {
    //job services interface
    //containing all job related methods
    void add_job(JobModel jobModel);
    JobModel get_job(long id);
    List<JobModel> all_job();
    void update_job(long id);
    void delete_job(long id);
    void delete_all();

}
