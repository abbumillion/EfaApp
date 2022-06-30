package com.app.efa.Repository;

import com.app.efa.Entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepo extends JpaRepository<Feedback,Long> {
}
