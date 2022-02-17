package com.nsCorps.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import com.nsCorps.jdbc.dto.CricketDetailsDTO;

public class CricketDAO {

	public boolean saveCricketDeails() {

		CricketDetailsDTO dto = new CricketDetailsDTO();
		// String insertQuery = "Insert the values into Cricket_details("+
		// dto.getNoOfPlayers() + dto.getTeamName() +dto.getCaptainName() +
		// dto.getMatchesPlayed();
		Connection con = null;
		Statement stmt = null;

		try {
			// setp 1 : load and register the driver class.
			Class.forName("com.mysql.cj.jdbc.Driver");
			// setp 2 : create conection to the DataBase
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nscorps", "root", "Update1st");
			// step 3 : create the plateform for exicutng Query
			stmt = con.createStatement();
			// step 4 : exicuting the query
			stmt.execute("INSERT INTO Cricket_details values (15,'RCB','VK',105)");
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}
}
