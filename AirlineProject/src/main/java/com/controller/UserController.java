package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.dao.UserService;
import com.model.User;

@RestController
public class UserController {
@Autowired
UserService service;
@GetMapping("/getuser")
public List<User> getAllUser()
{
	return service.findAll();
}
@PostMapping("/addUser")
public ResponseEntity<?> addUser(@RequestBody User user)
{
	service.add(user);
	return ResponseEntity.status(HttpStatus.OK).body("Entity user added successfully");
}
	@PostMapping("/deleteuser/{id}")
public ResponseEntity<?>  deleteItem(@PathVariable int  id)
{
		  User User=service.find(id);
		   if(User==null)
		   {
			    throw new DeleteUserException(id);
		   }
service.delete(id);
return ResponseEntity.ok("Element deleted successfully");
}

		@Autowired
		private UserService userService;
		
		@RequestMapping("/")
		public ModelAndView homepage() {
			ModelAndView model=new ModelAndView();
		
			model.setViewName("userRegistration.jsp");
			return model;
			
		}
		

	/*@RequestMapping("save")
		public ModelAndView saveUser (@RequestParam("UserName") String UserName, (@RequestParam("FirstName") String FirstName, @RequestParam("LastName") String LastName,
	 @RequestParam("Password") String Password, @RequestParam("Contact") String Contact,
				@RequestParam("Dateofbirth") String Dateofbirth) {
			
			User uModel=new User(UserName, FirstName, LastName, Contact);
			String message=userService.saveUser(uModel);
			
		
			ModelAndView model=new ModelAndView();
			model.addObject("message", message);
			model.setViewName("userRegistration.jsp");
			return model;
			
			
		}*/
}