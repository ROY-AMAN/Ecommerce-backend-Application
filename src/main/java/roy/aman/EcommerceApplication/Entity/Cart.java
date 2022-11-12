package roy.aman.EcommerceApplication.Entity;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Integer cartId;
	
	private User cartUser;
	
	@OneToMany
	private List<Product> cartProducts;
	

}
