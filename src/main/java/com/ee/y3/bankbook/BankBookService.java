package com.ee.y3.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ee.y3.util.Pager;

@Service
public class BankBookService {
	
	//BankBookDAO에 의존적
	@Autowired
	private BankBookDAO bankBookDAO;

	//List
	public List<BankBookDTO> getList(Pager pager) throws Exception {
		
		int perPage = 10; //한 페이지에 보여줄 글의 갯수
		int perBlock = 5; //한 블럭당 보여줄 숫자의 갯수
		
		//startRow, LastRow
		long startRow = (pager.getCurPage()-1)*perPage+1;
		System.out.println(startRow);
		long LastRow = pager.getCurPage()*perPage;
		
		pager.setStartRow(startRow);
		pager.setLastRow(LastRow);
		
		
		// 1. totalCount
		long totalCount=bankBookDAO.getTotalCount();
		
		
		// 2. totalPage
		long totalPage = totalCount/perPage;
		if(totalCount%perPage != 0) {
			totalPage++;
		}

		// 3. totalBlock
		long totalBlock = totalPage / perBlock;
		if(totalPage%5 != 0) {
			totalBlock++;
		}
		
		// 4. curBlock
		long curBlock = pager.getCurPage()/perBlock;
		if(pager.getCurPage() % perBlock != 0) {
			curBlock++;
		}
		
		// 5. startNum, lastNum
		long startNum = (curBlock-1)*perBlock+1;	
		long lastNum = curBlock*perBlock;
		
		pager.setStartNum(startNum);
		pager.setLastNum(lastNum);
		

		
		System.out.println("TotalPage :"+ totalPage);
		System.out.println("TotalBlock : "+totalBlock);
		System.out.println("CurBlock : "+curBlock);
		
		
		
		return bankBookDAO.getList(pager);
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
