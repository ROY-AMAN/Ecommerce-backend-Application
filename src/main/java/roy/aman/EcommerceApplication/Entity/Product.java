package roy.aman.EcommerceApplication.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Integer productId;
	
	private String name;
	
	private String details;
	
	@ManyToOne
	private Category category;
}
