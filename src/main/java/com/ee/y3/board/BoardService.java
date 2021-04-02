package com.ee.y3.board;

import java.util.List;

import com.ee.y3.util.Pager;

public interface BoardService {
	
	//List
	public List<BoardDTO> getList(Pager pager) throws Exception;

}
