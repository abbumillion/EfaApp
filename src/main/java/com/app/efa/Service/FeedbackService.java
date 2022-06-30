package com.app.efa.Service;

import com.app.efa.Entity.Feedback;
import com.app.efa.Model.FeedbackModel;

import java.util.List;
import java.util.Optional;

public interface FeedbackService {
    void add_feedback(FeedbackModel feedbackModel);
    FeedbackModel get_feedback(long id);
    List<FeedbackModel> all_feedback();
    void delete_feedback(long id);
    void delete_all();
}
