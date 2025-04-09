package com.embokx.jobms.service;


import com.embokx.jobms.jobms.entity.Job;
import com.embokx.jobms.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepository jobRepository;

    public Job createJob(Job job) {
        return jobRepository.save(job);
    }

    public List<Job> findAllJobs() {

        return jobRepository.findAll();

    }

    public Job findJobId(Long id) {
        return jobRepository.findById(id).orElse(null);
    }

    public Job updateJob(long id, Job job) {

        Job oldjob = jobRepository.findById(id).orElse(null);
        if (oldjob != null) {
            oldjob.setJob_title(job.getJob_title());
            oldjob.setJob_description(job.getJob_description());
            oldjob.setJob_min_salary(job.getJob_min_salary());
            oldjob.setJob_max_salary(job.getJob_max_salary());
            oldjob.setJob_location(job.getJob_location());
            return jobRepository.save(oldjob);
        }
        return null;
    }

    public Job deletejobById(Long id) {
        Job oldjob = jobRepository.findById(id).orElse(null);
        if (oldjob != null) {
            jobRepository.deleteById(id);
            return oldjob;
        }
        return null;
    }
}
