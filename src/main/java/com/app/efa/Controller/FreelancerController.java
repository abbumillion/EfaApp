package com.app.efa.Controller;

import com.app.efa.Entity.Freelancer;
import com.app.efa.Model.FreelancerModel;
import com.app.efa.ServiceImp.FreelancerServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

@RestController
public class FreelancerController {
    // freelancer services bean
    private FreelancerServiceImp freelancerServiceImp;
    @Autowired
    public FreelancerController(FreelancerServiceImp freelancerServiceImp)
    {
        this.freelancerServiceImp = freelancerServiceImp;
    }
    //get all freelancerS
    @RequestMapping("/api/get_freelancers")
    public List<FreelancerModel> getAllFreelancers()
    {
        return freelancerServiceImp.all_freelancer();
    }
    //get a single Freelancer by id
    @RequestMapping("/api/get_freelancer")
    public FreelancerModel getFreelancer(long id)
    {
        return freelancerServiceImp.get_freelancer(id);
    }
    //add customer to database
    @RequestMapping("/api/add_customer")
    public String addFreelancer(FreelancerModel freelancerModel)
    {
        //freelancerServiceImp.
        return "freelancer added";
    }
    @RequestMapping("api/edit_job")
    public String allJob()
    {
        return "jobs";
    }
    @RequestMapping("api/job_category")
    public String job_category()
    {
        return "job_category";
    }

}
