package com.nscorps.digital_Wallets.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.nscorps.digital_Wallets.constants.JDBCConstants;
import com.nscorps.digital_Wallets.dto.WalletDTO;

public class WalletDAOImpls implements WalletDAO {

	@Override
	public int addWalletInBatch(List<WalletDTO> walletDTOs) {
		Connection connection =null;
		PreparedStatement preparedStatement = null;
		String query = "Insert into digital_wallet values (?, ?, ?, ?)";
		try {
			connection = DriverManager.getConnection(JDBCConstants.URL,JDBCConstants.USERNAME,JDBCConstants.PASSWORD);
			preparedStatement = connection.prepareStatement(query);
			
			for (WalletDTO walletDTO : walletDTOs) {
				preparedStatement.setInt(1, walletDTO.getWallet_ID());
				preparedStatement.setString(2, walletDTO.getProviderName());
				preparedStatement.setDouble(3, walletDTO.getAvailableBalance());
				preparedStatement.setInt(4, walletDTO.getNoOfTransaction());
				preparedStatement.addBatch();
			}
			preparedStatement.executeBatch();
			System.out.println("Wallet Added...................");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(preparedStatement != null && connection != null)
				preparedStatement.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		return 0;
	}

}
