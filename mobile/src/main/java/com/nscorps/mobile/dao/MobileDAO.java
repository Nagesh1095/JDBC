package com.nscorps.mobile.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.mysql.cj.protocol.Resultset;
import com.nscorps.mobile.dto.Mobile;

public class MobileDAO {

	private static final String JDBC_URL = "jdbc:mysql://localhost/mobile";
//	Property property =new Property(); 
	// Mobile mob = new Mobile();
	Connection con = null;
	Statement stmt = null;

	public boolean saveMobileDetails() {
		try {
//			 setp 1 : load and register the driver class.
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			 setp 2 : create conection to the DataBase
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile", "root", "Update1st");
//			 step 3 : create the plateform for exicutng Query
			stmt = con.createStatement();
//			 step 4 : exicuting the query
			stmt.execute("INSERT INTO mobile_details values ('Vivo','X 70', 12 , 256)");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			try {
				if (stmt != null && con != null)
					stmt.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return false;
	}

	public boolean saveMobileDetails(List<Mobile> mobiles) {
		
		String query = "INSERT INTO mobile_details values (?, ?, ?, ?)";
		Connection con = null;
		PreparedStatement stmt = null;
		try {
//			 setp 1 : load and register the driver class.
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			 setp 2 : create conection to the DataBase
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile", "root", "Update1st");
//			 step 3 : create the plateform for exicutng Query
			stmt = con.prepareStatement(query);
			
			for (int i = 0; i < mobiles.size(); i++) {
				Mobile mobile = mobiles.get(i);
				stmt.setString(1, mobile.getMobile_name());
				stmt.setString(2, mobile.getModel());
				stmt.setByte(3, mobile.getRam_size());
				stmt.setInt(4, mobile.getStorage_capacity());
				stmt.execute();
			}
			System.out.println("Mobiles Added ............");
//			 step 4 : exicuting the query
//			stmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			try {
				if (stmt != null && con != null)
					stmt.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return false;
	}

	public boolean updateSorageByRamsize() {
		try {
			con = DriverManager.getConnection(JDBC_URL, "root", "Update1st");

			con.setAutoCommit(false);

			stmt = con.createStatement();

			stmt.executeUpdate("Update mobile_details set storage_capacity =128 where ram_size = 12");

			con.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		} finally {
			try {
				if (stmt != null && con != null)
					stmt.close();
				con.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

		return false;

	}

	public boolean updateStorageByMobilename() {
		try {
			con = DriverManager.getConnection(JDBC_URL, "root", "Update1st");

			stmt = con.createStatement();

			stmt.executeUpdate("Update mobile_details set storage_capacity =256 where mobile_name = 'Realme'");

			stmt.executeUpdate("Update mobile_details set storage_capacity =230 where mobile_name = 'Vivo'");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null && con != null)
					stmt.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return false;
	}

	public boolean deleteByMobileName() {

		try {
			con = DriverManager.getConnection(JDBC_URL, "root", "Update1st");
			stmt = con.createStatement();
			stmt.execute("delete from mobile_details where mobile_name = 'Vivo' ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {

			try {
				if (stmt != null && con != null)
					stmt.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return false;
	}

	public void getMobileNameByRamandModel() {
		Connection con = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
//		String query = "select model,ram_size from mobile_details where mobile_name = 'Realme'";

		try {
			con = DriverManager.getConnection(JDBC_URL, "root", "Update1st");
//			 stmt = con.createStatement();
//			rs = stmt.executeQuery(query);
			pstmt = con.prepareStatement("select model,ram_size from mobile_details where mobile_name = ?");
			pstmt.setString(1, "Realme");
			rs = pstmt.executeQuery();
			if (rs.next()) {
				System.out.println(rs.getString("model"));
				System.out.println(rs.getString("ram_size"));
			} else {
				System.out.println("Not Found");
			}
			System.out.println();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				if (rs != null && pstmt != null && con != null)
					rs.close();
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
