package com.dao;

import org.springframework.stereotype.Repository;

import com.model.Contact;


@Repository
public interface ContactDao {
	public void addContact(Contact contact);
	public boolean deleteContact(Contact contact);
}
