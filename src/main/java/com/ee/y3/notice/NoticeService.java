package com.ee.y3.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ee.y3.util.Pager;

@Service
public class NoticeService {
	
	@Autowired
	private NoticeDAO noticeDAO;

	//List
	public List<NoticeDTO> getList(Pager pager) throws Exception{
		//방법 1
		//Pager pager = new Pager();
		//long perPage = 10L;
		
		//아래의 식은 5개나 20개로 보는게 바뀌면 다시 계산식을 바꿔줘야함
		//pager.setStartRow((curPage*perPage)-9);
		
		//pager.setStartRow((curPage-1)*perPage+1);
		//pager.setLastRow(curPage*perPage);
		
		//방법 2
		int perPage = 10; //한 페이지에 보여줄 글의 갯수
		
		//startRow, LastRow
		long startRow = (pager.getCurPage()-1)*perPage+1;
		long LastRow = pager.getCurPage()*perPage;
		
		pager.setStartRow(startRow);
		pager.setLastRow(LastRow);
		
		return noticeDAO.getList(pager);
	}
	
	//Select
	public NoticeDTO getSelect(NoticeDTO noticeDTO) throws Exception{
		
		return noticeDAO.getSelect(noticeDTO);
		
	}
	
	//Update
	public int setUpdate(NoticeDTO noticeDTO)throws Exception{
		
		return noticeDAO.setUpdate(noticeDTO);
		
	}
	
	//Insert
	public int setInsert(NoticeDTO noticeDTO)throws Exception{
		return noticeDAO.setInsert(noticeDTO);
	}
	
	//Delete
	public int setDelete(NoticeDTO noticeDTO)throws Exception{
		return noticeDAO.setDelete(noticeDTO);
	}

}
