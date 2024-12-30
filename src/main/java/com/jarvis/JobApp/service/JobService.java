package com.jarvis.JobApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jarvis.JobApp.model.JobPost;
import com.jarvis.JobApp.repo.JobRepo;

@Service
public class JobService {

	@Autowired
	private JobRepo repo;
	public void addJob(JobPost jobPost) {
		repo.addJob(jobPost);
	}
	
	public List<JobPost> getAllJobs(){
		return repo.getAllJobs();
	}

}
