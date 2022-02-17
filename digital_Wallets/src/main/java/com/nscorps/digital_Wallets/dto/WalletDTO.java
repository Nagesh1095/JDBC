package com.nscorps.digital_Wallets.dto;

public class WalletDTO {

	private int wallet_ID;
	private String providerName;
	private double availableBalance;
	private int noOfTransaction;

	public int getWallet_ID() {
		return wallet_ID;
	}

	public void setWallet_ID(int wallet_ID) {
		this.wallet_ID = wallet_ID;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public double getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(double availableBalance) {
		this.availableBalance = availableBalance;
	}

	public int getNoOfTransaction() {
		return noOfTransaction;
	}

	public void setNoOfTransaction(int noOfTransaction) {
		this.noOfTransaction = noOfTransaction;
	}

}
