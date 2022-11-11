package roy.aman.EcommerceApplication.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
public class Feedback {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer feedbackId;
	
	private String feedbacks;
	
	@ManyToOne
	private User user;
	
	@ManyToOne
	private Product product;
		
}
