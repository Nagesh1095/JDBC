package com.nscorps.creditcard.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "credit_card")
public class CreditCardDTO {

	@Id
	@Column(name = "card_id")
	private int cardID;
	@Column(name = "card_number")
	private long cardNumber;
	@Column(name = "expiry_date")
	private String expiryDate;
	@Column(name = "card_holder_name")
	private String CardHolderName;
	@Column(name = "nfc_enabled")
	private boolean nfcEnabled;

	public int getCardID() {
		return cardID;
	}

	public void setCardID(int cardID) {
		this.cardID = cardID;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getCardHolderName() {
		return CardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		CardHolderName = cardHolderName;
	}

	public boolean isNfcEnabled() {
		return nfcEnabled;
	}

	public void setNfcEnabled(boolean nfcEnabled) {
		this.nfcEnabled = nfcEnabled;
	}
}
