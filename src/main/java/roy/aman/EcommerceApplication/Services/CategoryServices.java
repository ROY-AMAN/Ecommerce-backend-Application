package roy.aman.EcommerceApplication.Services;

import roy.aman.EcommerceApplication.Dtos.CategoryDto;
import roy.aman.EcommerceApplication.Exceptions.ApiResponse;

public interface CategoryServices {
	
	CategoryDto addCategory(CategoryDto category, Integer adminId);

	ApiResponse deleteCategory(Integer categoryId, Integer adminId);

	CategoryDto updateCategory(CategoryDto category,Integer categoryId, Integer adminId);

}
