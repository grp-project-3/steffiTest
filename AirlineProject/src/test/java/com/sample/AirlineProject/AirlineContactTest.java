package com.sample.AirlineProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dao.UserService;
import com.model.Contact;
import com.model.User;

import junit.framework.Assert;
@SpringBootTest
class AirlineContactTest {

	@Autowired
	UserService service;
			@Test
			void testAdd() {
			Contact contact=new Contact();
				contact.setType("Steffi");
				contact.setAddressLine("Peenya 1 stage");
				contact.setZipCode(453235);
				contact.setCity("Belgaum");
				contact.setState("Karnataka");
				contact.setCountry("India");	
				contact.setMobileNo("1277798978");
				//service.add(contact);
				//Contact contact=service.find(contact.getId());
					//Assert.assertEquals("Steffi", contact.getType());
				
	}
			@Test 
			void testDelete() {
				User c1 = service.find(1);
				service.delete(c1.getId());
//				if(u1!=null) {
//					System.out.println("****Not deleted****");
//					
//				}
				User u2=service.find(3);
				Assert.assertNull(u2);
			}
}
