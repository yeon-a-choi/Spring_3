package com.ee.y3.account;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

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
	
	public int setInsert(AccountDTO accountDTO) throws Exception{
		
		//1. Random
		//2. Time
		//3. Java API
		
		//return accountDAO.setInsert(accountDTO);
		
		//추상메서드라 new해서 만들 수 X
		//2. Time
		Calendar calendar = Calendar.getInstance();
		long time = calendar.getTimeInMillis();
		System.out.println(time);
		
		String t = time+"";
		t = String.valueOf(time);
		
		String result = t.substring(0, 3)+"-"; //161-
		result = result + t.substring(3, 4)+"-";//161-1-
		result = result + t.substring(4, 8)+"-";
		result = result + t.substring(8);
		
		System.out.println(result);
		
		//SimpleDateFormat
		SimpleDateFormat sd = new SimpleDateFormat("ddyyyyMM-HHmmss-S");
		String r = sd.format(calendar.getTime());
		System.out.println(r);
		
		//3. Java API
		String name = UUID.randomUUID().toString();
		System.out.println(name);
		
		accountDTO.setAccountNumber(r);
		
		return accountDAO.setInsert(accountDTO);
	}
	
}
