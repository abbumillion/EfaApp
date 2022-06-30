package com.app.efa.Controller;

import com.app.efa.ServiceImp.JobServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.efa.Entity.Job;

@RestController
public class JobController {

	@Autowired
	private JobServiceImp jobServiceImp;
//
//	@RequestMapping("/api/addjob")
//	public String addSkill(Job job) {
//		// adding job to database
//		jobServiceImp.add_job(job);
//		return "addjob.jsp";
//	}
//
//	@RequestMapping("/api/getjob")
//	public String getJob(int id) {
//		// getting a single job bean from database
//		return "job.jsp";
//	}
//
//	@RequestMapping("/api/myjobs")
//	public String myJob(int id) {
//		// getting all job posted by a single customer
//		return "myjobs.jsp";
//	}
//
//	@RequestMapping("/api/jobs")
//	public String allJobs() {
//		// getting all jobs
//		// List<Job> jobs = jobService.getAllJobs();
//		// jobs=jobService.getAllJobs();
//		return "jobs.jsp";
//	}
//
//	@RequestMapping("/api/editjob")
//	public String editJob(Job job) {
//		return "editjob.jsp";
//	}
//
//	@RequestMapping("/api/deletejob")
//	public String deleteJob(Job job) {
//		return "deletejob.jsp";
//	}
}
