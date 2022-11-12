package roy.aman.EcommerceApplication.Services;

import java.util.List;

import roy.aman.EcommerceApplication.Dtos.ProductDto;
import roy.aman.EcommerceApplication.Exceptions.ApiResponse;

public interface CartServices {

	ApiResponse addProductToCart( Integer UserId, Integer productId);
	
	ApiResponse deleteProductFromCart( Integer UserId, Integer productId);

	List<ProductDto>getAllCartProducts(Integer userId);
	
}
