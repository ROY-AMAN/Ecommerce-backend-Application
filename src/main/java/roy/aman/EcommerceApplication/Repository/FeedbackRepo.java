package roy.aman.EcommerceApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import roy.aman.EcommerceApplication.Entity.Feedback;


public interface FeedbackRepo extends JpaRepository<Feedback, Integer>{

}
