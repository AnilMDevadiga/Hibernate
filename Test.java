package com.anil.test;

import com.anil.dao.AccountDAO;
import com.anil.dto.AccountDTO;

public class Test 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		AccountDTO accountDTO = new AccountDTO();
		accountDTO.setId(206L);
		accountDTO.setMobileNumber(441236L);
		accountDTO.setAccountHodlerName("Doni");
		accountDTO.setAccountNumber("IND103");
		accountDTO.setAddress("India");
		accountDTO.setBalance(8322.5D);
		
		AccountDAO dao = new AccountDAO();
		dao.saveAccountDetails(accountDTO);
	}
}
