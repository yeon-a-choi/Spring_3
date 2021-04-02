package com.ee.y3.board.qna;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ee.y3.board.BoardDAO;
import com.ee.y3.board.BoardDTO;
import com.ee.y3.util.Pager;

@Repository
public class QnaDAO implements BoardDAO{
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.ee.y3.board.qna.QnaDAO.";
	
	@Override
	public List<BoardDTO> getList(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(NAMESPACE+"getList");
	}
	

}
