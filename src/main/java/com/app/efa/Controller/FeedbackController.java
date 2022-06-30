package com.app.efa.Controller;

import com.app.efa.Entity.Feedback;
import com.app.efa.Model.FeedbackModel;
import com.app.efa.ServiceImp.FeedbackServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

@RestController
public class FeedbackController {
    private FeedbackServiceImp feedbackServiceImp;
    @Autowired
    public FeedbackController(FeedbackServiceImp feedbackServiceImp)
    {
        this.feedbackServiceImp = feedbackServiceImp;
    }
    @RequestMapping("/api/add_feedback")
    public String add_feedback(FeedbackModel feedbackModel) {
        System.out.println("add feedback controller");
        System.out.println(feedbackModel.getId());
        System.out.println(feedbackModel.getContent());
        System.out.println(feedbackModel.getDate());
        feedbackServiceImp.add_feedback(feedbackModel);
        return "addskill.jsp";
    }

    @RequestMapping("/api/get_feedback")
    public FeedbackModel get_feedback(long id) {
        return feedbackServiceImp.get_feedback(id);
    }

    @RequestMapping("/api/feedbacks")
    public List<FeedbackModel> feedbacks()
    {
        return  feedbackServiceImp.all_feedback();
    }
    @RequestMapping("/api/delete_feedback")
    public String delete_feedback(long id)
    {
        feedbackServiceImp.delete_feedback(id);
        return "addskill.jsp";
    }
    @RequestMapping("/api/delete_all_feedback")
    public String delete_all_feedback()
    {
        feedbackServiceImp.delete_all();
        return "addskill.jsp";
    }
}
