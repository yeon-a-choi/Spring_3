package com.ee.y3.board;

import java.util.List;

import com.ee.y3.util.Pager;

public interface BoardDAO {
	//상수, 추상메서드
	//접근 지정자는 무조건 public abstract 생략가능
	
	
	//list
	public List<BoardDTO> getList(Pager pager) throws Exception;
}
