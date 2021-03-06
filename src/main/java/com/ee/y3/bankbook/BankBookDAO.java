package com.ee.y3.bankbook;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ee.y3.util.Pager_backup;

@Repository
public class BankBookDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String  NAMESPACE = "com.ee.y3.bankbook.BankBookDAO."; 
	
	//count
	public Long getTotalCount(Pager_backup pager)throws Exception{
		return sqlSession.selectOne(NAMESPACE+"getTotalCount", pager);
	}
	
	//insert
	public int setWrite(BankBookDTO bankBookDTO)throws Exception{
		
		int result = sqlSession.insert(NAMESPACE+"setWrite", bankBookDTO);
			
		return result;

	}

	//select
	public BankBookDTO getSelect(BankBookDTO bankBookDTO)throws Exception{
		
		//Long num = 1L; // test값
		
		//값이 없으면 자동으로 null값으로 들어감
		bankBookDTO = sqlSession.selectOne(NAMESPACE+"getSelect", bankBookDTO);
		return bankBookDTO;
	}	


	//getList
	//bankbook table의 모든 데이트 조회 후 리턴
	public List<BankBookDTO> getList(Pager_backup pager)throws Exception{
		
		System.out.println("kind : "+pager.getKind());
		System.out.println("search : "+pager.getSearch());

		return sqlSession.selectList(NAMESPACE+"getList", pager);
	}
	
	
	public int setDelete(BankBookDTO bankBookDTO) throws Exception{
		
		return sqlSession.delete(NAMESPACE+"setDelete", bankBookDTO);
	}
	
	
	public int setUpdate(BankBookDTO bankBookDTO) throws Exception{
		
		return sqlSession.update(NAMESPACE+"setUpdate", bankBookDTO);
	}
	
}