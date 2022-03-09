package com.nscorps.onetoone.runner;

import com.nscorps.onetoone.dao.EngineDAO;
import com.nscorps.onetoone.dao.EngineDAOImpl;
import com.nscorps.onetoone.dao.VehicleDAOImpl;
import com.nscorps.onetoone.dto.EngineDTO;
import com.nscorps.onetoone.dto.VehicleDTO;

public class RunnerClass {
	
	public static void main(String[] args) {
		
		VehicleDTO vehicleDTO = new VehicleDTO();
		vehicleDTO.setCompany("NS Motors");
		vehicleDTO.setModel("Cheeeetha");
		vehicleDTO.setPrice(170000);
		
		EngineDTO engineDTO = new EngineDTO();
		engineDTO.setCapacity(400.6);
		engineDTO.setNoOfCylinders(4);
		engineDTO.setNoOfStrokes(4);
		
		
		engineDTO.setVehicle(vehicleDTO);
		
		System.out.println(engineDTO);
		
//		EngineDAO dao =new EngineDAOImpl();
//		dao.saveEngine(engineDTO);
		
		VehicleDAOImpl vehicleDAOImpl = new VehicleDAOImpl();
		System.out.println(vehicleDAOImpl.getVehicleById(2));
		
	}

}
