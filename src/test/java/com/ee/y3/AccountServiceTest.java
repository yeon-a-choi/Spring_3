package com.ee.y3;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ee.y3.account.AccountService;

public class AccountServiceTest extends MyAbstractTest{

	@Autowired
	private AccountService accountService;
	
	@Test
	public void setInsertTest() throws Exception{
		accountService.setInsert(null);
	}

}
