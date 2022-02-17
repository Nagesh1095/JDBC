package com.nsCorps.jdbc.runner;

import com.nsCorps.jdbc.dao.CricketDAO;
import com.nsCorps.jdbc.dto.CricketDetailsDTO;

public class RunnerClass {
	public static void main(String[] args) {
		CricketDetailsDTO dto = new CricketDetailsDTO();
		dto.setTeamName("India");
		dto.setNoOfPlayers((byte) 15);
		dto.setCaptainName("Rohith Sharma");
		dto.setMatchesPlayed(16);

		CricketDAO dao = new CricketDAO();
		dao.saveCricketDeails();
	}
}
