package com.nscorps.onetoone.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.nscorps.onetoone.dto.EngineDTO;

public class EngineDAOImpl implements EngineDAO {
	
	private SessionFactory factory = HibernateUtil.getSessionFactory();
	@Override
	public void saveEngine(EngineDTO engineDTO) {
		Transaction transaction =null;
		
		try {
			Session session = factory.openSession();
			transaction=session.beginTransaction();
			session.save(engineDTO);
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			if (transaction != null)
				transaction.rollback();
		}finally {
			if(factory !=null)
			factory.close();
		}
	}

}
