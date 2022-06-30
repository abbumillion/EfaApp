package com.app.efa.ServiceImp;

import com.app.efa.Entity.Feedback;
import com.app.efa.Model.FeedbackModel;
import com.app.efa.Repository.FeedbackRepo;
import com.app.efa.Service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FeedbackServiceImp implements FeedbackService {
    private FeedbackRepo feedbackRepo;
    @Autowired
    public FeedbackServiceImp(FeedbackRepo feedbackRepo)
    {
        this.feedbackRepo = feedbackRepo;
    }

    @Override
    public void add_feedback(FeedbackModel feedback) {
       // feedbackRepo.save(feedback);
    }

    @Override
    public FeedbackModel get_feedback(long id)
    {
        return null;
    }

    @Override
    public List<FeedbackModel> all_feedback() {
        return null;
    }

    @Override
    public void delete_feedback(long id) {
        feedbackRepo.deleteById(id);
    }

    @Override
    public void delete_all() {
        feedbackRepo.deleteAll();
    }
}
