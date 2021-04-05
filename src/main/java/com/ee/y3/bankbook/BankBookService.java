package com.ee.y3.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ee.y3.util.Pager_backup;

@Service
public class BankBookService {
	
	//BankBookDAO에 의존적
	@Autowired
	private BankBookDAO bankBookDAO;

	//List
	public List<BankBookDTO> getList(Pager_backup pager) throws Exception {
		
		int perPage = 10; //한 페이지에 보여줄 글의 갯수
		int perBlock = 5; //한 블럭당 보여줄 숫자의 갯수
		
		//startRow, LastRow
		long startRow = (pager.getCurPage()-1)*perPage+1;
		long LastRow = pager.getCurPage()*perPage;
		
		pager.setStartRow(startRow);
		pager.setLastRow(LastRow);
		
		
		// 1. totalCount
		// 10개씩 나누어 몇 페이지를 만들어야 할 지 계산
		long totalCount=bankBookDAO.getTotalCount(pager);
		
		
		// 2. totalPage 
		//언제까지 찍어야하는지를 가진 변수
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
		if(pager.getCurPage()%perBlock != 0) {
			curBlock++;
		}
		
		// 5. startNum, lastNum
		long startNum = (curBlock-1)*perBlock+1;	
		long lastNum = curBlock*perBlock;
		
		
		// 6. curBlock(현재블록)이 마지막 block일 때(totalBlock) 
		if(curBlock == totalBlock) {
			lastNum = totalPage;
		}
		
		// 7. 이전, 다음 block 존재 여부
		//이전
		if(curBlock !=1) {
			pager.setPre(true);
		}
		
		//다음
		if(curBlock != totalBlock) {
			pager.setNext(true);
		}
		
		
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
