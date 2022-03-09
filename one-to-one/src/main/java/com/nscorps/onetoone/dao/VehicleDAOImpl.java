package com.nscorps.onetoone.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.nscorps.onetoone.dto.VehicleDTO;

public class VehicleDAOImpl {
	
	private SessionFactory factory = HibernateUtil.getSessionFactory();
	
	public VehicleDTO getVehicleById(int primeryKey) {
		Session session = null;
		try {
			session = factory.openSession();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		VehicleDTO vehicleDTO = session.get(VehicleDTO.class, primeryKey);
		return  vehicleDTO;
	}
		
}
