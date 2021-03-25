package com.ee.y3;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ee.y3.account.AccountDAO;
import com.ee.y3.account.AccountDTO;

public class AccountDAOTest extends MyAbstractTest{

	@Autowired
	private AccountDAO accountDAO;
	
	//@Test
	public void getList() throws Exception{
		
		AccountDTO accountDTO = new AccountDTO();
		
		accountDTO.setId("iu");
		
		List<AccountDTO> ar = accountDAO.getList(accountDTO);
		
		assertNotEquals(0, ar.size());
		
	}
	
	//@Test
	public void setInsert() throws Exception{
		
		AccountDTO accountDTO = new AccountDTO();
		
		accountDTO.setAccountNumber("132-4-98765");
		accountDTO.setId("iu");
		accountDTO.setBookNumber(3);
		
		int result = accountDAO.setInsert(accountDTO);
		
		assertNotNull(result);
		
	}

}
