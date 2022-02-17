package com.nscorps.sports.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nscorps.sports.dto.SportsDTO;

public class SportsDAOImpl implements SportsDAO {

	@Override
	public void saveSportDetails(SportsDTO dto) {
		Session session = null;
		Transaction transaction = null;
		try {
			Configuration cfg = new Configuration();
			cfg.configure();
			SessionFactory factory = cfg.buildSessionFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();
			session.save(dto);
			transaction.commit();

		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}
		System.out.println("Sport Adddeedddddddd");

	}

	@Override
	public SportsDTO getSportsByID(int sportsId) {
		Session session =null;
		SportsDTO dto = null;
		
		try {
			Configuration cfg =new Configuration();
			cfg.configure();
			SessionFactory factory = cfg.buildSessionFactory();
			session=factory.openSession();
			dto=session.get(SportsDTO.class, sportsId);
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(session != null)
				session.close();
		}
		
		return dto;
	}
	

}
