package com.dao;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.Contact;

@Component
public class ContactDAOImpl implements ContactDao {
	
		@Autowired
		SessionFactory sessionFactory;

		@Override
		public void addContact(Contact contact) {
			// TODO Auto-generated method stub
			Session session=sessionFactory.openSession();
			session.getTransaction().begin();
			session.save(contact);
			session.flush();
			session.getTransaction().commit();
			session.close();
		}
		
		@Override
		public boolean deleteContact(Contact contact) {
			// TODO Auto-generated method stub
			Session session=sessionFactory.openSession();
			session.getTransaction().begin();
			session.delete(contact);
			session.flush();
			session.getTransaction().commit();
			session.close();
			return true;
		}

		


}

