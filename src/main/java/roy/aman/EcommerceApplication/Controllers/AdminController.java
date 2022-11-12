package roy.aman.EcommerceApplication.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import roy.aman.EcommerceApplication.Dtos.LoginDto;
import roy.aman.EcommerceApplication.Dtos.UserDto;
import roy.aman.EcommerceApplication.Exceptions.ApiResponse;
import roy.aman.EcommerceApplication.Services.AdminServices;

@RestController
@RequestMapping("/api/admin")
public class AdminController {


	@Autowired
	private AdminServices adminService;
	
	@PostMapping("/")
	public ResponseEntity<UserDto> registerAsAdmin(@RequestBody UserDto adminDto){
		
		UserDto newAdmin = this.adminService.registerAsAdmin(adminDto);
		
		return new ResponseEntity<>(newAdmin, HttpStatus.CREATED);
	}
	
//	ApiResponse loginAsAdmin(LoginDto loginDto);
	
}
