package roy.aman.EcommerceApplication.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import roy.aman.EcommerceApplication.Dtos.PaymentMethod;

@Data
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Integer paymentId;
	
	private PaymentMethod paymentType;
	
	private Integer amount;
	
	private Order order;
	
}
