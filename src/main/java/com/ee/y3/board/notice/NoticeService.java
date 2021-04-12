package com.ee.y3.board.notice;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.ee.y3.board.BoardDTO;
import com.ee.y3.board.BoardFileDTO;
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
		
		//글 번호 찾기
		
		long num = noticeDAO.getNum();
		
		boardDTO.setNum(num);
		
		int result = noticeDAO.setInsert(boardDTO);
		

		for(MultipartFile mf:files) {
			
			BoardFileDTO boardFileDTO = new BoardFileDTO();
			String fileName = fileManager.save("notice", mf, session);
			
			boardFileDTO.setNum(num);
			boardFileDTO.setFileName(fileName);
			boardFileDTO.setOrigineName(mf.getOriginalFilename());
			
			noticeDAO.setFileInsert(boardFileDTO);
		}
		
		return result;
	}



	@Override
	public int setUpdate(BoardDTO boardDTO, MultipartFile [] files) throws Exception {
		for(MultipartFile multipartFile:files) {
			BoardFileDTO boardFileDTO = new BoardFileDTO();
			//1. File들을 HDD에 저장
			String fileName= fileManager.save("notice", multipartFile, session);
			boardFileDTO.setFileName(fileName);
			boardFileDTO.setOrigineName(multipartFile.getOriginalFilename());
			boardFileDTO.setNum(boardDTO.getNum());
			//2. DB에 Insert
			noticeDAO.setFileInsert(boardFileDTO);
		}
		
		
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
	
	
	public int setFileDelete(BoardFileDTO boardFileDTO) throws Exception{
		
		//fileName을 console에 print
		//1. 조회
		boardFileDTO = noticeDAO.getFileSelect(boardFileDTO);
		System.out.println(boardFileDTO.getFileName());
		
		//2. table 삭제
		int result = noticeDAO.setFileDelete(boardFileDTO);
		
		//3. HDD 삭제
		if(result > 0) {
			fileManager.delete("notice", boardFileDTO.getFileName(), session);
		}
		return result;
	}

}
