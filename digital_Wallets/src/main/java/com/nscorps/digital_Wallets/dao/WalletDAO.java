package com.nscorps.digital_Wallets.dao;

import java.util.List;

import com.nscorps.digital_Wallets.dto.WalletDTO;

public interface WalletDAO {

	int addWalletInBatch(List<WalletDTO> walletDTOs);
}
