package com.nscorps.creditcard.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nscorps.creditcard.dto.CreditCardDTO;

public class CreditCardDAOImpl implements CreditCardDAO {

	@Override
	public void savecard(CreditCardDTO cardDTO) {

//		Step 1
		Configuration cfg = new Configuration();
		cfg.configure();

//		Step 2
		SessionFactory sessionFactory = cfg.buildSessionFactory();

//		Step 3
		Session session = sessionFactory.openSession();

//		Step 4
		Transaction transaction = session.beginTransaction();

//		Step 5
		session.save(cardDTO);
		transaction.commit();

//		Step 6
		session.close();
		System.out.println("Card Added......");
	}

}
