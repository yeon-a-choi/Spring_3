package com.ee.y3;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ee.y3.board.notice.NoticeDAO;
import com.ee.y3.board.notice.NoticeDTO;
import com.ee.y3.util.Pager;


public class NoticeDAOTest extends MyAbstractTest{
	
	@Autowired
	private NoticeDAO noticeDAO;
	
	//list
	//@Test
//	public void getListTest() throws Exception{
//		Pager pager = new Pager();
//		pager.setStratRow(11);
//		pager.setLastRow(20);
//		List<NoticeDTO> ar = noticeDAO.getList(pager);
//		assertNotEquals(0, ar.size());
//
//	}
	
	//select
	//@Test
	public void getSelectTest() throws Exception{		
		
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setNum(3);
		
		noticeDTO = noticeDAO.getSelect(noticeDTO);
		assertNotNull(noticeDTO);
		
	}
	
	//insert
	//@Test
	public void setInsertTest() throws Exception{
		
		int result=0;
		
		for(int i=0; i<120; i++) {
			NoticeDTO noticeDTO = new NoticeDTO();
			
			noticeDTO.setTitle("[안내] 안내사항"+i);
			noticeDTO.setWriter("관리자"+i);
			noticeDTO.setContents("contents"+i);
			
			result = noticeDAO.setInsert(noticeDTO);
			
			if(i%10 == 0) {
				//10번돌고 0.5초쉬기
				Thread.sleep(500);
			}
		}
		
		assertNotNull(result);
		
	}
	
	//update
	//@Test
	public void setUpdateTest() throws Exception{
		
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setNum(4);
		
		noticeDTO = noticeDAO.getSelect(noticeDTO);
		
		System.out.println(noticeDTO.getNum());
		
		noticeDTO.setTitle("[안내] SF9 주호 출연 웹드라마 [밀키드] 방영 일정 안내");
		noticeDTO.setContents("안녕하세요.\r\n"
				+ "FNC Entertainment 입니다.\r\n"
				+ "SF9 주호가 출연하는 웹드라마 ‘밀키드’ 가\r\n"
				+ "11월 16일 첫 방송될 예정입니다.");
		
		System.out.println(noticeDTO.getTitle());
		System.out.println(noticeDTO.getContents());
		
		//해결, DB commit 안하고 돌려서 트랜젝션걸렸던 거였움
		int result = noticeDAO.setUpdate(noticeDTO);
		
		System.out.println(result);
		
		assertNotNull(result);
		
	}
	
	
	//delete
	//@Test
	public void setDelete() throws Exception{
		
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setNum(5);
		
		int result = noticeDAO.setDelete(noticeDTO);
		
		System.out.println(result);
		
		assertNotNull(result);
	}


}
