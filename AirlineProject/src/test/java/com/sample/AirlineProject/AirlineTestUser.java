package com.sample.AirlineProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dao.UserService;
import com.model.User;

import junit.framework.Assert;


@SpringBootTest
class AirlineTestUser {

	@Autowired
	UserService service;
			@Test
			void testAdd() {
				User user=new User();
				user.setUserName("Steffi");
				user.setPassword("Peenya 1 stage");
				user.setFirstName("Pragati");
				user.setLastName("Desai");	
				user.setContact(797582346);
				service.add(user);
				User user1=service.find(user.getId());
					Assert.assertEquals("Steffi", user1.getUserName());
				
				
	}

	/*@Test
	void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	void testFind() {
		fail("Not yet implemented");
	}

	@Test
	void testFindAll() {
		fail("Not yet implemented");
	}*/

}
