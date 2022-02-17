package com.nscorps.sports.runner;

import com.nscorps.sports.dao.SportsDAO;
import com.nscorps.sports.dao.SportsDAOImpl;
import com.nscorps.sports.dto.SportsDTO;

public class SportsRunner {
	
	public static void main(String[] args) {
		
		SportsDTO sportsDTO = new SportsDTO();
		sportsDTO.setId(1);
		sportsDTO.setType("Out Door");
		sportsDTO.setName("Kabbadi");
		sportsDTO.setNoOfPlayers(7);
		sportsDTO.setCountryOfOrigin("India");
		
		SportsDTO sportsDTO1 = new SportsDTO();
		sportsDTO1.setId(2);
		sportsDTO1.setType("In Door");
		sportsDTO1.setName("Chess");
		sportsDTO1.setNoOfPlayers(2);
		sportsDTO1.setCountryOfOrigin("India");
		
		SportsDAO dao = new SportsDAOImpl();
//		dao.saveSportDetails(sportsDTO);
//		dao.saveSportDetails(sportsDTO1);
		

		SportsDTO sportsByID = dao.getSportsByID(1);
		String countryOfOrigin = sportsDTO.getCountryOfOrigin();
		System.out.println(countryOfOrigin);
		System.out.println(sportsDTO.getName());
		System.out.println(sportsByID);
	}
}
