package roy.aman.EcommerceApplication.Entity;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Integer categoyId;
	
	private String name;
	
	private String details;
	
	@OneToMany
	private List<Product> products;

}
