package com.app.efa.TestRepo;

import com.app.efa.Model.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestRepo {
    //
    public List<AdminModel> adminModels = new ArrayList<>();
    public List<CustomerModel> customerModels = new ArrayList<>();
    public List<FreelancerModel> freelancerModels = new ArrayList<>();
    public List<JobModel> jobModels = new ArrayList<>();
    public List<FeedbackModel> feedbackModels = new ArrayList<>();
    //
//    public List<Admin> admins = new ArrayList<>();
//    public List<Admin> admins = new ArrayList<>();
//    public List<Admin> admins = new ArrayList<>();
    //
    {

        for (int i = 0; i < 200; i++) {
            AdminModel adminModel = AdminModel.builder()
                    .level(i)
                    .build();
            adminModel.setId(Math.round(Math.random()*100));
            adminModel.setCity("Ziway");
            adminModel.setState("Oromia");
            adminModel.setCountry("Ethiopia");
            adminModel.setDateOfBirth(new Date());
            adminModel.setEmail("Sharbemillion599@gmail.com");
            adminModel.setFirstName("Million");
            adminModel.setLastName("Sharbe");
            adminModel.setPhoneNumber("0923683988");
            adminModel.setGender('M');
            adminModel.setPassword("12345"+i);
            adminModel.setProfilePicture("c://users//thinkpad//pictures//image.png");
            adminModels.add(adminModel);
        }

    }

    public List<AdminModel> getAdminModels() {
        return adminModels;
    }

    public List<CustomerModel> getCustomerModels() {
        return customerModels;
    }

    public List<FreelancerModel> getFreelancerModels() {
        return freelancerModels;
    }

    public List<JobModel> getJobModels() {
        return jobModels;
    }

    public List<FeedbackModel> getFeedbackModels() {
        return feedbackModels;
    }
}
