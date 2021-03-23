package com.ee.y3;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ee.y3.bankbook.BankBookDAO;
import com.ee.y3.bankbook.BankBookDTO;

public class BankBookDAOTest extends MyAbstractTest{
	
	@Autowired
	private BankBookDAO bankBookDAO;
	
	//@Test
	public void setWriteTest() throws Exception{
		
		BankBookDTO bankBookDTO = new BankBookDTO();
		bankBookDTO.setBookName("Test");
		bankBookDTO.setBookRate(0.12);
		bankBookDTO.setBookSale("Y");
		
		int result = bankBookDAO.setWrite(bankBookDTO);
		
		assertEquals(1, result);		
		
	}
	
	//@Test
	public void getSelectTest() throws Exception{
	
		BankBookDTO bankBookDTO = bankBookDAO.getSelect(null);
		
		assertNotNull(bankBookDTO);
		
	}
	
	
	//@Test
	public void getListTest() throws Exception{
		
		List<BankBookDTO> ar = bankBookDAO.getList();
		
		assertNotEquals(0, ar.size());
		
	}
	
	
	//@Test
	public void setDeleteTest() throws Exception{
		
		BankBookDTO bankBookDTO = new BankBookDTO();
		bankBookDTO.setBookNumber(8);
		int result = bankBookDAO.setDelete(bankBookDTO);
		
		assertEquals(1, result);
		
	}

	@Test
	public void setUpdateTest() throws Exception{
		
		BankBookDTO bankBookDTO = new BankBookDTO();
		//원하는 row 선택
		bankBookDTO.setBookNumber(5);
		
		//전체 조회해서 값을 다 넣어주고
		bankBookDTO = bankBookDAO.getSelect(bankBookDTO);
		
		//원하는 자료만 수정
		bankBookDTO.setBookName("주식통장");
		bankBookDTO.setBookSale("Y");
		
		int result = bankBookDAO.setUpdate(bankBookDTO);
		
		assertEquals(1, result);
		
	}
	

}
