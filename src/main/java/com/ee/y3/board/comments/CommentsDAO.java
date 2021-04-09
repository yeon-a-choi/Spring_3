package com.ee.y3.board.comments;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CommentsDAO {
	@Autowired
	private SqlSession sqlSession;
	
	private final String NAMESPACE="com.ee.y3.board.comments.CommentsDAO.";

	public List<CommentsDTO> getList(CommentsDTO commentsDTO)throws Exception{
		return sqlSession.selectList(NAMESPACE+"getList", commentsDTO);
	}
	
	public int setInsert(CommentsDTO commentsDTO) throws Exception{
		return sqlSession.insert(NAMESPACE+"setInsert", NAMESPACE);
	}
}
