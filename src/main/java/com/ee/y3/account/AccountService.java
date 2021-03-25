package com.ee.y3.account;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
	
	//AccountNumber를 여기에서 랜덤으로 중복되지 않게 생성
	
	@Autowired
	private AccountDAO accountDAO;
	
	public List<AccountDTO> getList(AccountDTO accountDTO) throws Exception{
		return accountDAO.getList(accountDTO);
	}
	
}
