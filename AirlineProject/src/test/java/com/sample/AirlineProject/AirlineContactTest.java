package com.sample.AirlineProject;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dao.ContactService;
import com.dao.UserService;
import com.model.Contact;


import junit.framework.Assert;
@SpringBootTest
class AirlineContactTest {

	@Autowired
	ContactService service;
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
				service.delete(1);
//				if(u1!=null) {
//					System.out.println("****Not deleted****");
//					
//				}
				Contact u2=service.find(1);
				Assert.assertNull(u2);
			}
			@Test
			void testFind() {
				Contact contact2=new Contact();
				contact2.setType("Steffi");
				Contact contact3=service.find(contact2.getId());
				Assert.assertNull(contact3);
			}
			@Test
			void testFindAll() {
			Contact profile5=new Contact();
				profile5.setType("Ranjitha");
				profile5.setAddressLine("Laggere");
				profile5.setZipCode(453235);
				profile5.setCity("Belgaum");
				profile5.setState("Karnataka");
				profile5.setCountry("India");
				profile5.setCountry("India");
				profile5.setMobileNo("1277798978");
				service.add(profile5);
				Contact profile6=new Contact();
				profile6.setType("Ranjitha");
				profile6.setZipCode(453235);
				profile6.setCity("Belgaum");
				profile6.setState("Karnataka");
				//profile6.setContact(797572742);
				service.add(profile6);
			List<Contact>contactlist=service.findAll();
			Assert.assertEquals(contactlist.get(1).getType(), "Ranjitha");
			Assert.assertEquals(contactlist.get(1).getAddressLine(), "Goa");

}
}
