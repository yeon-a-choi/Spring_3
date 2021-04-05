package com.ee.y3.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ee.y3.board.BoardDTO;
import com.ee.y3.board.BoardService;
import com.ee.y3.util.Pager;

@Service
public class QnaService implements BoardService {
	
	@Autowired
	private QnaDAO qnaDAO;
	
	public int setReply(QnaDTO qnaDTO) throws Exception{
		//부모글의 ref, step depth 조회
		BoardDTO boardDTO = qnaDAO.getSelect(qnaDTO);
		QnaDTO parent = (QnaDTO)boardDTO;
		System.out.println(parent.getRef());
		System.out.println(parent.getStep());
		System.out.println(parent.getDepth());
		
		qnaDTO.setRef(parent.getRef());
		qnaDTO.setStep(parent.getStep()+1);
		qnaDTO.setDepth(parent.getDepth()+1);
		
		int result = qnaDAO.setReplyUpdate(parent);
		result = qnaDAO.setReply(qnaDTO);
		
		return result;
	}

	@Override
	public List<BoardDTO> getList(Pager pager) throws Exception {
		
		//--startlow, lastlow
		pager.makeRow();
		
		//1. totalCount
		long totalCount = qnaDAO.getTotalCount(pager);
		
		pager.makeNum(totalCount);
		
		return qnaDAO.getList(pager);
	}

	@Override
	public BoardDTO getSelect(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		int result = qnaDAO.setHitUpdate(boardDTO);
		return qnaDAO.getSelect(boardDTO);
	}

	@Override
	public int setInsert(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return qnaDAO.setInsert(boardDTO);
	}

	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
}
