package com.nscorps.sports.dao;

import com.nscorps.sports.dto.SportsDTO;

public interface SportsDAO {
	
	  public void saveSportDetails( SportsDTO dto);
	  public SportsDTO getSportsByID(int sportsId);
}
