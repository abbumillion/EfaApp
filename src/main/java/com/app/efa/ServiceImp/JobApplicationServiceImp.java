package com.app.efa.ServiceImp;

import java.util.List;
import java.util.Optional;

import com.app.efa.Model.JobApplicationModel;
import com.app.efa.Service.JobApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.efa.Entity.JobApplication;
import com.app.efa.Repository.JobApplicationRepo;
@Service
public  class JobApplicationServiceImp implements JobApplicationService {

	private JobApplicationRepo jobApplicationRepo;
	@Autowired
	public JobApplicationServiceImp(JobApplicationRepo jobApplicationRepo)
	{
		this.jobApplicationRepo = jobApplicationRepo;
	}

	@Override
	public void add_job_application(JobApplicationModel jobApplicationModel) {
		//jobApplicationRepo.save(jobApplicationModel);
	}

	@Override
	public JobApplicationModel get_job_application(long id) {
		return null;
	}

	@Override
	public List<JobApplicationModel> all_job_application() {
		return null;
	}

	@Override
	public void update_job_application(long id)
	{

	}

	@Override
	public void delete_job_application(long id) {
		jobApplicationRepo.deleteById(id);
	}

	@Override
	public void delete_all() {
		jobApplicationRepo.deleteAll();
	}
}
