package com.nscorps.digital_Wallets.runner;

import java.util.ArrayList;
import java.util.List;

import com.nscorps.digital_Wallets.dao.WalletDAOImpls;
import com.nscorps.digital_Wallets.dto.WalletDTO;

public class Runner {

	public static void main(String[] args) {
		
		WalletDTO walletDTO = new WalletDTO();
		walletDTO.setWallet_ID(1);
		walletDTO.setProviderName("N S Pay");
		walletDTO.setAvailableBalance(23000);
		walletDTO.setNoOfTransaction(3);
		
		WalletDTO walletDTO2 = new WalletDTO();
		walletDTO2.setWallet_ID(2);
		walletDTO2.setProviderName("Any Pay");
		walletDTO2.setAvailableBalance(56000);
		walletDTO2.setNoOfTransaction(4);
		
		WalletDTO walletDTO3 = new WalletDTO();
		walletDTO3.setWallet_ID(3);
		walletDTO3.setProviderName("Bit Pay");
		walletDTO3.setAvailableBalance(35620);
		walletDTO3.setNoOfTransaction(5);
		
		List<WalletDTO> walletDTOs = new ArrayList<WalletDTO>();
		walletDTOs.add(walletDTO);
		walletDTOs.add(walletDTO2);
		walletDTOs.add(walletDTO3);
		
		WalletDAOImpls walletDAOImpls = new WalletDAOImpls();
		walletDAOImpls.addWalletInBatch(walletDTOs);
		
	}
}
