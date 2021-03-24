package com.ee.y3.bankbook;


import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BankBookDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String  NAMESPACE = "com.ee.y3.bankbook.BankBookDAO."; 

	public int setWrite(BankBookDTO bankBookDTO)throws Exception{
		
		
		int result = sqlSession.insert(NAMESPACE+"setWrite", bankBookDTO);
		
		
		return result;

	}


	public BankBookDTO getSelect(BankBookDTO bankBookDTO)throws Exception{
		
		//Long num = 1L; // test값
		
		//값이 없으면 자동으로 null값으로 들어감
		bankBookDTO = sqlSession.selectOne(NAMESPACE+"getSelect", bankBookDTO);
		return bankBookDTO;

	}	


	//getList
	//bankbook table의 모든 데이트 조회 후 리턴
	public List<BankBookDTO> getList()throws Exception{
		
		return sqlSession.selectList(NAMESPACE+"getList");

	}
	
	
	public int setDelete(BankBookDTO bankBookDTO) throws Exception{
		
		return sqlSession.delete(NAMESPACE+"setDelete", bankBookDTO);
	}
	
	
	public int setUpdate(BankBookDTO bankBookDTO) throws Exception{
		
		return sqlSession.update(NAMESPACE+"setUpdate", bankBookDTO);
	}
	
}