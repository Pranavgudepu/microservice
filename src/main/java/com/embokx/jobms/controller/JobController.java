package com.embokx.jobms.controller;

import com.embokx.jobms.jobms.entity.Job;
import com.embokx.jobms.repository.JobRepository;
import com.embokx.jobms.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("job")
public class JobController {

    @Autowired
    private JobRepository jobRepository;
    @Autowired
    private JobService jobService;

    @PostMapping("/addjob")
    public Job addjob(@RequestBody Job job) {
        return jobService.createJob(job);
    }

    @GetMapping("/getalljobs")
    public List<Job> getalljobs() {
        return jobService.findAllJobs();
    }

    @GetMapping("/getjob/{id}")
    public Job getJob(@PathVariable long id) {
        return jobService.findJobId(id);
    }

    @PutMapping("/updatejob/{id}")
    public ResponseEntity<Job> updatejob(@PathVariable long id, @RequestBody Job job) {
        return ResponseEntity.ok(jobService.updateJob(id, job));
    }

    @DeleteMapping("/deletejob/{id}")
    public ResponseEntity<Job> deletejob(@PathVariable long id) {
        return ResponseEntity.ok(jobService.deletejobById(id));

    }

}