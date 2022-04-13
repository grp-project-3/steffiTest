package com.sample.AirlineProject;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dao.UserService;
import com.model.User;

import junit.framework.Assert;

@SpringBootTest
class AirlineProjectApplicationTests {

	@Test
	void contextLoads() {
	}
	@Autowired
	UserService service;
			@Test
			void testAdd() {
				User user=new User();
				user.setType("Steffi");
				user.setAddressLine("Peenya 1 stage");
				user.setZipCode(453235);
				user.setCity("Belgaum");
				user.setState("Karnataka");
				user.setCountry("India");	
				user.setMobileNo(797582346);
				service.add(user);
				User user1=service.find(user.getId());
					Assert.assertEquals("Steffi", user1.getType());
				
	}
			@Test
			void testFind() {
				User user2=new User();
				user2.setState("Banglore");
				User user3=service.find(user2.getId());
				Assert.assertNull(user3);
			}
			@Test
			void testFindAll() {
				User profile5=new User();
				profile5.setType("Ranjitha");
				profile5.setAddressLine("Laggere");
				profile5.setZipCode(24);
				profile5.setCity("Bangalore");
				profile5.setState("Goa")	;
				profile5.setCountry("India");
				profile5.setMobileNo(797572742);
				service.add(profile5);
				User profile6=new User();
				profile6.setType("Steffi");
				profile6.setAddressLine("Belgavi");
				profile6.setZipCode(25);
				profile6.setCity("Belgaum");
				profile6.setState("Karnataka")	;
				profile6.setCountry("India");
				profile6.setMobileNo(797572742);
				service.add(profile6);
			List<User>userlist=service.findAll();
			Assert.assertEquals(userlist.get(1).getType(), "Ranjitha");
			Assert.assertEquals(userlist.get(1).getState(), "Goa");

}
			@Test
			void testUpdate() {
				User uc=new User();
				uc.setType("Lakshmi");
				uc.setAddressLine("Lakshmi@gmail.com");
				uc.setZipCode(45315);
				uc.setCity("Pune");
				uc.setState("Karnataka");
				uc.setCountry("India");
				uc.setMobileNo(797572742);
				service.add(uc);
				
				service.update(uc);
				Assert.assertEquals(true, service.update(uc));
						
				}
			@Test 
			void testDelete() {
				User u1 = service.find(3);
				service.delete(u1.getId());
//				if(u1!=null) {
//					System.out.println("****Not deleted****");
//					
//				}
				User u2=service.find(3);
				Assert.assertNull(u2);
			}
			
			
			
			
			
			
			
}