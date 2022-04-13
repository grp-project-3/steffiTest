package com.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Contact;

@Service
public class ContactService {
	@Autowired
	
	ContactDao contactDAOImpl;
	
	public void add(Contact contact)
	{
		contactDAOImpl.addContact(contact);
	}
	public boolean delete(Contact contact)
	{
		return contactDAOImpl.deleteContact(contact);
	}
}
