package roy.aman.EcommerceApplication.Entity;

import java.util.Date;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Integer orderId;
	
	private List<Product> products;
	
	private Integer totalAmount;
	
	@ManyToOne
	private User user;
	
	private String orderAddress;
	
	private Date OrderDate;
	
	private Date dateOfDelivery;
	

}
