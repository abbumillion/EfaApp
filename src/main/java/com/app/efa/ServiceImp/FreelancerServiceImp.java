package com.app.efa.ServiceImp;
import com.app.efa.Model.FreelancerModel;
import com.app.efa.Repository.FreelancerRepo;
import com.app.efa.Service.FreelancerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class FreelancerServiceImp implements FreelancerService {
    private FreelancerRepo freelancerRepo;
    @Autowired
    public FreelancerServiceImp(FreelancerRepo freelancerRepo)
    {
        this.freelancerRepo = freelancerRepo;
    }
    @Override
    public void add_freelancer(FreelancerModel freelancerModel) {
       // freelancerRepo.save(freelancer);
    }
    @Override
    public FreelancerModel get_freelancer(long id) {
        return null;
    }
    @Override
    public List<FreelancerModel> all_freelancer() {
        return null;
    }
    @Override
    public void update_freelancer(long id) {

    }
    @Override
    public void delete_freelancer(long id) {
        freelancerRepo.deleteById(id);
    }
    @Override
    public void delete_all() {
        freelancerRepo.deleteAll();
    }
}
