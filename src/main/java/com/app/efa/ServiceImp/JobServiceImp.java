package com.app.efa.ServiceImp;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.app.efa.Helpers.EntityToModelConverter;
import com.app.efa.Model.JobModel;
import com.app.efa.Service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.efa.Entity.Job;
import com.app.efa.Repository.JobRepo;

@Service
public class JobServiceImp implements JobService {

	private JobRepo jobRepo;

	@Autowired
	public JobServiceImp(JobRepo jobRepo)
	{
		this.jobRepo = jobRepo;
	}

	@Override
	public void add_job(JobModel jobModel)
	{
		//jobRepo.save(job);
	}

	@Override
	public JobModel get_job(long id)
	{
		//returns a jobModel by fetching a job entity from database and converting in to job model//
		return EntityToModelConverter.JobEntityToJobModel(jobRepo.getReferenceById(id));
	}

	@Override
	public List<JobModel> all_job() {
		List<JobModel> jobModels=new ArrayList<>();
		//

		//
		return null;
	}

	@Override
	public void update_job(long id) {

	}

	@Override
	public void delete_job(long id) {
		jobRepo.deleteById(id);
	}

	@Override
	public void delete_all() {
		jobRepo.deleteAll();
	}
}
