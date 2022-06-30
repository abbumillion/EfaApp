package com.app.efa.Controller;

import com.app.efa.Entity.Job;
import com.app.efa.Entity.JobApplication;
import com.app.efa.Model.JobApplicationModel;
import com.app.efa.ServiceImp.JobApplicationServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobApplicationController {

    private JobApplicationServiceImp jobApplicationServiceImp;

    @Autowired
    public JobApplicationController(JobApplicationServiceImp jobApplicationServiceImp)
    {
        this.jobApplicationServiceImp = jobApplicationServiceImp;
    }

    @RequestMapping("/api/addjob")
    public String addJobApplication(JobApplicationModel jobApplicationModel)
    {
        // adding job to database
        jobApplicationServiceImp.add_job_application(jobApplicationModel);
        return "addjobapplication";
    }

    @RequestMapping("/api/getjobapplication")
    public String getJobApplication(long id)
    {
        // getting a single job bean from database
        jobApplicationServiceImp.get_job_application(id);
        return "job.jsp";
    }

    @RequestMapping("/api/myjobs")
    public String myJob(int id)
    {
        // getting all job posted by a single customer
        return "myjobs.jsp";
    }

    @RequestMapping("/api/jobs")
    public String allJobs()
    {
        jobApplicationServiceImp.all_job_application();
        return "jobs.jsp";
    }

    @RequestMapping("/api/editjob")
    public String editJob(JobApplication jobApplication)
    {
        //jobApplicationServiceImp.update_job_application(jobApplication);
        return "editjob.jsp";
    }

    @RequestMapping("/api/deletejob")
    public String deleteJobApplication(JobApplication jobApplication)
    {
        return "deletejob.jsp";
    }

}
