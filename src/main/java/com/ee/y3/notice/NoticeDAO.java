package com.ee.y3.notice;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ee.y3.bankbook.BankBookDTO;

@Repository
public class NoticeDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.ee.y3.notice.NoticeDAO.";
	
	
	// List
	public List<NoticeDTO> getList() throws Exception{
		return sqlSession.selectList(NAMESPACE+"getList");
	}
	
	//Select
	public NoticeDTO getSelect(NoticeDTO noticeDTO) throws Exception{
		return sqlSession.selectOne(NAMESPACE+"getSelect", noticeDTO);
	}
	
	//Insert
	public int setInsert(NoticeDTO noticeDTO) throws Exception{
		return sqlSession.insert(NAMESPACE+"setInsert", noticeDTO);
	}
	
	//Update
	public int setUpdate(NoticeDTO noticeDTO) throws Exception{
		return sqlSession.update(NAMESPACE+"setUpdate", noticeDTO);
	}
	
	//Delete
	public int setDelete(NoticeDTO noticeDTO) throws Exception{
		return sqlSession.delete(NAMESPACE+"setDelete", noticeDTO);
	}
	
}
