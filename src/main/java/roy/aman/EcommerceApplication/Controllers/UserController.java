package roy.aman.EcommerceApplication.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import roy.aman.EcommerceApplication.Dtos.LoginDto;
import roy.aman.EcommerceApplication.Dtos.UserDto;
import roy.aman.EcommerceApplication.Exceptions.ApiResponse;
import roy.aman.EcommerceApplication.Services.UserServices;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserServices userServices;
	private ApiResponse loginAsUser;
	
	@PostMapping("/")
	public ResponseEntity<UserDto> registerAsUser(@RequestBody UserDto userDto){
		
		UserDto user = this.userServices.registeAsUser(userDto);
		
		return new ResponseEntity<>(user, HttpStatus.CREATED);
	}
	
	
	@PutMapping("/{userId}")
	public ResponseEntity<UserDto> updateUserDetails(@RequestBody UserDto userDto, 
			@PathVariable("userId") Integer UserId){
		
		UserDto user = this.userServices.updateUserDetails(userDto, UserId);
		
		return new ResponseEntity<>(user, HttpStatus.OK);
		
	}
	
	@PostMapping("/{userId}/login")
	public ResponseEntity<ApiResponse> loginAsUser (@RequestBody LoginDto loginDto, @PathVariable Integer userId) {
		
		boolean login = this.userServices.loginAsUser(loginDto, userId);
		
		if(login) {
			return new ResponseEntity<> (new ApiResponse("You have loggedIn successfully", true), HttpStatus.OK);
		}
		
		return new ResponseEntity<>( new ApiResponse("Wrong email or password, Please try again", false), HttpStatus.BAD_REQUEST);
	}
	
	
	@DeleteMapping("/{userId}")
	public ResponseEntity<ApiResponse> deleteAccount(@PathVariable Integer userId){
		
		ApiResponse response = this.userServices.deleteAccount(userId);

		return new ResponseEntity<>(response, HttpStatus.OK);
		
	}
}
