package com.ee.y3.board.notice;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.ee.y3.board.BoardDTO;
import com.ee.y3.board.BoardService;
import com.ee.y3.util.FileManager;
import com.ee.y3.util.Pager;

@Service
public class NoticeService implements BoardService {
	
	@Autowired
	private NoticeDAO noticeDAO;
	
	@Autowired
	private FileManager fileManager;
	
	@Autowired
	private HttpSession session;
	
	
	@Override
	public BoardDTO getSelect(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		int result = noticeDAO.setHitUpdate(boardDTO);
		return noticeDAO.getSelect(boardDTO);
	}



	@Override
	public int setInsert(BoardDTO boardDTO, MultipartFile [] files) throws Exception {
		// TODO Auto-generated method stub
		for(MultipartFile mf:files) {
			fileManager.save("notice", mf, session);
		}
		return 0;//noticeDAO.setInsert(boardDTO);
	}



	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.setUpdate(boardDTO);
	}



	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.setDelete(boardDTO);
	}



	public List<BoardDTO> getList(Pager pager)throws Exception{
		
		//--- startlow, lastlow ----
		pager.makeRow();
		
		//---------------------------------------
		//1. totalCount
		long totalCount=noticeDAO.getTotalCount(pager);
		
		
		//---------- 페이징계산 ---------
		pager.makeNum(totalCount);
		
		System.out.println(totalCount);
	
		return noticeDAO.getList(pager);
	}

}
