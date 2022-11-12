package roy.aman.EcommerceApplication.Services;

import roy.aman.EcommerceApplication.Dtos.LoginDto;
import roy.aman.EcommerceApplication.Dtos.UserDto;
import roy.aman.EcommerceApplication.Exceptions.ApiResponse;

public interface AdminServices {

	UserDto registerAsAdmin(UserDto adminDto);
	
	ApiResponse loginAsAdmin(LoginDto loginDto);
	
	
}
