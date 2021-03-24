package com.ee.y3.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankBookService {
	
	//BankBookDAO에 의존적
	@Autowired
	private BankBookDAO bankBookDAO;

	//List
	public List<BankBookDTO> getList() throws Exception {
		
		return bankBookDAO.getList();
	}
	
	
	//Select
	public BankBookDTO getSelect(BankBookDTO bankBookDTO) throws Exception {
		
		return bankBookDAO.getSelect(bankBookDTO);
	}
	
	
	//Delete
	public int setDelete(BankBookDTO bankBookDTO) throws Exception {
		return bankBookDAO.setDelete(bankBookDTO);
	}
	
	
	//Update
	public int setUpdate(BankBookDTO bankBookDTO) throws Exception{
		return bankBookDAO.setUpdate(bankBookDTO);
	}
}