package com.ee.y3.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankBookService {
	
	@Autowired
	private BankBookDAO bankBookDAO;
	
	public BankBookDTO getSelect(BankBookDTO bankBookDTO)throws Exception{
		return bankBookDAO.getSelect(bankBookDTO);
	}
	
	public List<BankBookDTO> getList()throws Exception{
		return bankBookDAO.getList();
	}

}