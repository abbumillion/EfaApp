package com.app.efa.Helpers;

import com.app.efa.Entity.*;
import com.app.efa.Model.*;

import java.util.ArrayList;
import java.util.List;

public class EntityToModelConverter {
    public static List<String> setUserAccountInformation(User user )
    {
        List<String> accountInformation = new ArrayList<>();
        accountInformation.add(user.getFirstName());
        accountInformation.add(user.getLastName());
        accountInformation.add(user.getEmail());
        accountInformation.add(user.getPhoneNumber());
//        accountInformation.add(user.getLastName());
//        accountInformation.add(user.getEmail());
//        accountInformation.add(user.getPhoneNumber());
        return accountInformation;
    }
    public  static AdminModel AdminEntityToAdminModel(Admin admin)
    {
        Address address = AddressConverter(admin.getUser());
        AdminModel adminModel = new AdminModel();
        //getting all data from entity in to model//
        ///////////////////////////////////////////////////////////////////////
        //-------------------------------------------------------------------//
        adminModel.setLevel(admin.getLevel());
        adminModel.setFirstName(admin.getUser().getFirstName());
        adminModel.setLastName(admin.getUser().getLastName());
        adminModel.setEmail(admin.getUser().getEmail());
        adminModel.setPassword(admin.getUser().getPassword());
        adminModel.setProfilePicture(admin.getUser().getProfilePicture());
        adminModel.setPhoneNumber(admin.getUser().getPhoneNumber());
        adminModel.setRegistrationDate(admin.getUser().getRegistrationDate());
        //
        adminModel.setCity(address.getCity());
        adminModel.setState(address.getState());
        adminModel.setCountry(address.getCountry());
        //---------------------------------------------------------------------//
        /////////////////////////////////////////////////////////////////////////
        return adminModel;
    }
    public static CustomerModel CustomerEntityToCustomerModel(Customer customer)
    {
        List<JobModel> jobModels = new ArrayList<>();

        customer.getJob().forEach(e->
        {
            jobModels.add(JobEntityToJobModel(e));
        });
        CustomerModel customerModel=CustomerModel.builder()
                .jobModel(jobModels)
                .customerId(customer.getId())
                .build();

        //getting all data from entity in to model//
        ///////////////////////////////////////////////////////////////////////
        //-------------------------------------------------------------------//
        customerModel.setFirstName(customer.getUser().getFirstName());
        customerModel.setLastName(customer.getUser().getLastName());
        customerModel.setEmail(customer.getUser().getEmail());
        customerModel.setPassword(customer.getUser().getPassword());
        customerModel.setProfilePicture(customer.getUser().getProfilePicture());
        customerModel.setPhoneNumber(customer.getUser().getPhoneNumber());
        customerModel.setRegistrationDate(customer.getUser().getRegistrationDate());
        //---------------------------------------------------------------------//
        /////////////////////////////////////////////////////////////////////////
        return customerModel;
    }
    public static Address AddressConverter(User user)
    {
        Address address = Address.builder()
                .city(user.getUserAddress().getCity())
                .state(user.getUserAddress().getState())
                .country(user.getUserAddress().getCountry())
                .build();
        return address;
    }
    public static JobModel JobEntityToJobModel(Job job)
    {
        List<JobApplicationModel> jobApplicationModels = new ArrayList<>();
        job.getJobApplication().forEach(e->
        {
            jobApplicationModels.add(JobApplicationEntityToJobApplicationModel(e));
        });
        JobModel jobModel =
                JobModel.builder()
                        .type(job.getType())
                        .endDate(job.getEndDate())
                        .isApproved(job.isApproved())
                        .jobApplications(jobApplicationModels)
                .build();
        return jobModel;
    }
    public static JobApplicationModel JobApplicationEntityToJobApplicationModel(JobApplication jobApplication)
    {
        JobApplicationModel jobApplicationModel =
                JobApplicationModel.builder()
                        .accepted(jobApplication.getAccepted())
                        .applicationDate(jobApplication.getApplicationDate())
                        .jobModel(EntityToModelConverter.JobEntityToJobModel(jobApplication.getJob()))
                      //  .freelancerModel()
                        .build();
        return jobApplicationModel;
    }
    public static SkillModel SkillEntityToSkillModel(Skill skill)
    {
//       return SkillModel.builder()
//                        .Id(skill.getId())
//                        .skillCategory(skill.getSkillCategory())
//                        .skillDescription(skill.getSkillDescription())
//                        .skillName(skill.getSkillName())
//                        .build();
        return null;
    }
}
