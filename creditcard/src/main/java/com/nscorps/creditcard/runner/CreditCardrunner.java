package com.nscorps.creditcard.runner;

import com.nscorps.creditcard.dao.CreditCardDAO;
import com.nscorps.creditcard.dao.CreditCardDAOImpl;
import com.nscorps.creditcard.dto.CreditCardDTO;

public class CreditCardrunner {

	public static void main(String[] args) {
		
		CreditCardDTO creditCardDTO = new CreditCardDTO();
		creditCardDTO.setCardID(1);
		creditCardDTO.setCardNumber(2531456685l);
		creditCardDTO.setExpiryDate("10/10/2022");
		creditCardDTO.setCardHolderName("Anaamadeya");
		creditCardDTO.setNfcEnabled(true);
		
		CreditCardDTO creditCardDTO2 =new CreditCardDTO();
		creditCardDTO2.setCardID(2);
		creditCardDTO2.setCardNumber(36524885156l);
		creditCardDTO2.setExpiryDate("12/5/2023");
		creditCardDTO2.setCardHolderName("Yaveno Obba");
		creditCardDTO2.setNfcEnabled(false);
		
		CreditCardDTO creditCardDTO3 =new CreditCardDTO();
		creditCardDTO3.setCardID(3);
		creditCardDTO3.setCardNumber(1254885156l);
		creditCardDTO3.setExpiryDate("23/8/2023");
		creditCardDTO3.setCardHolderName("Nang Gottilla");
		creditCardDTO3.setNfcEnabled(true);
		
		CreditCardDTO creditCardDTO4 =new CreditCardDTO();
		creditCardDTO4.setCardID(4);
		creditCardDTO4.setCardNumber(1255285156l);
		creditCardDTO4.setExpiryDate("01/12/2027");
		creditCardDTO4.setCardHolderName("Namgyake");
		creditCardDTO4.setNfcEnabled(false);
		
		CreditCardDAO cardDAO = new CreditCardDAOImpl();
		cardDAO.savecard(creditCardDTO);
		cardDAO.savecard(creditCardDTO2);
		cardDAO.savecard(creditCardDTO3);
		cardDAO.savecard(creditCardDTO4);
	}

}
