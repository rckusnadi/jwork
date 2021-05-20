package ricky.jwork.controller;

import org.springframework.web.bind.annotation.*;
import ricky.jwork.*;

import java.util.ArrayList;

@RequestMapping("/job")
@RestController
public class JobController {
    @RequestMapping("")
    public ArrayList<Job> getAllJob() {
        return DatabaseJob.getJobDatabase();
    }
    @RequestMapping("/{id}")
    public Job getJobById(@PathVariable int id) {
        Job job = null;
        try {
            job = DatabaseJob.getJobById(id);
        } catch (JobNotFoundException e) {
            e.getMessage();
            return null;
        }
        return job;
    }

    @RequestMapping("/recruiter/recruiterId")
    public ArrayList<Job> getJobByRecruiter(@PathVariable int recruiterId) {
        ArrayList<Job> job = null;
        job = DatabaseJob.getJobByRecruiter(recruiterId);

        return job;
    }

    @RequestMapping("/category/category")
    public ArrayList<Job> getJobByCategory(@PathVariable jobCategory category) {
        ArrayList<Job> job = null;
        job = DatabaseJob.getJobByCategory(category);
        return job;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Job addJob(@RequestParam(value="name") String name,
                      @RequestParam(value="fee") int fee,
                      @RequestParam(value="category") jobCategory category,
                      @RequestParam(value="recruiterId") int recruiterId)
    {
        Job job = null;
        try {
            job = new Job(DatabaseJobseeker.getLastId()+1, name, DatabaseRecruiter.getRecruiterById(recruiterId), fee, category);
        } catch (RecruiterNotFoundException e) {
            e.getMessage();
        }

        Boolean status = DatabaseJob.addJob(job);
        if(status == true){
            return job;
        } else {
            return null;
        }
    }

}
