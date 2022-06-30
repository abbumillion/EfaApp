package com.app.efa.Service;

import com.app.efa.Entity.Admin;
import com.app.efa.Entity.Freelancer;
import com.app.efa.Model.FreelancerModel;

import java.util.List;
import java.util.Optional;

public interface FreelancerService {
    void add_freelancer(FreelancerModel freelancerModel);
    FreelancerModel get_freelancer(long id);
    List<FreelancerModel> all_freelancer();
    void update_freelancer(long id);
    void delete_freelancer(long id);
    void delete_all();
}
