package roy.aman.EcommerceApplication.Services;

import java.util.List;

import roy.aman.EcommerceApplication.Dtos.ProductDto;
import roy.aman.EcommerceApplication.Exceptions.ApiResponse;

public interface ProductServices {

	ProductDto addProduct (ProductDto product, Integer adminId);
	
	ProductDto viewProductById( Integer productId);
	
	List<ProductDto> searchProductByTitle( String keyWords ); 
	
	ApiResponse deleteProduct( Integer adminId, Integer productId );
	
	
}
