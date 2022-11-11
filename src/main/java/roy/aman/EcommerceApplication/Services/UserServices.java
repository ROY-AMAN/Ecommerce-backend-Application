package roy.aman.EcommerceApplication.Services;

import roy.aman.EcommerceApplication.Dtos.LoginDto;
import roy.aman.EcommerceApplication.Dtos.UserDto;
import roy.aman.EcommerceApplication.Exceptions.ApiResponse;

public interface UserServices {

	UserDto registeAsUser(UserDto userDto);
	
	UserDto updateUserDetails(UserDto userDto, Integer UserId);
	
	ApiResponse loginAsUser (LoginDto loginDto, Integer userId);
	
	ApiResponse deleteAccount(Integer userID);
}
