package com.ee.y3.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticeService {
	
	@Autowired
	private NoticeDAO noticeDAO;
	
	//List
	public List<NoticeDTO> getList() throws Exception{
		
		return noticeDAO.getList();
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
