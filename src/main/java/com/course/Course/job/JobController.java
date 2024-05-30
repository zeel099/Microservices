package com.course.Course.job;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
@Getter
@Setter
@RestController
public class JobController {

    private JobService jobService;

    @GetMapping("/jobs")
    public List<Job> findAll(){

        return jobService.findAll();
    }

    @PostMapping("/jobs")
    public String createJob(@RequestBody Job job){
        jobService.createJob(job);
        return "successfully added";
    }

    @GetMapping("/getJob/{id}")
    public Job findById(@PathVariable Long id){
        return jobService.findById(id);
    }
}
