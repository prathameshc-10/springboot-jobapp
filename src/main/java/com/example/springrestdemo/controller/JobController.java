package com.example.springrestdemo.controller;

import com.example.springrestdemo.model.JobPost;
import com.example.springrestdemo.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
@CrossOrigin
public class JobController {
    public JobService service;

    @Autowired
    public void setService(JobService service) {
        this.service = service;
    }

    @GetMapping("jobPosts")
    public List<JobPost> getAllJobs(){
        return service.getAllJobs();
    }

    @GetMapping("jobPost/{postId}")
    public JobPost getJob(@PathVariable int postId){
        return service.getJob(postId);
    }

    @PostMapping("jobPost")
    public JobPost addJob(@RequestBody JobPost job){
        service.addJob(job);
        return job;
    }

    @PutMapping("jobPost/{postId}")
    public JobPost updateJob(@PathVariable int postId, @RequestBody JobPost jobPost){
        jobPost.setPostId(postId);
        service.updateJob(jobPost);
        return jobPost;
    }

    @DeleteMapping("jobPost/{postId}")
    public String deleteJob(@PathVariable int postId){
        service.deleteJob(postId);
        return "Deleted";
    }

    @PostMapping("jobPosts/load")
    public String load(){
        service.load();
        return "Success";
    }

}
