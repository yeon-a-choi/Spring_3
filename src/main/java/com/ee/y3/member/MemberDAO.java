package com.ee.y3.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.ee.y3.member.MemberDAO.";
	
	
	//Update
	public int memberUpdate(MemberDTO memberDTO) throws Exception {
		
		//id를 제외하고 나머지 수정
		return sqlSession.update(NAMESPACE+"memberUpdate", memberDTO);
		
	}
	
	
	//Delete
	public int memberDelete(MemberDTO memberDTO) throws Exception{
		
		int result = sqlSession.delete(NAMESPACE+"memberDelete", memberDTO);
		
		return result;
	}
	
	//Join
	public int memberJoin(MemberDTO memberDTO) throws Exception{
		
		int result = sqlSession.insert(NAMESPACE+"memberJoin", memberDTO);
		
		return result;
		
	}
	
	
	//login
	public MemberDTO memberLogin(MemberDTO memberDTO)throws Exception{
		
		return sqlSession.selectOne(NAMESPACE+"memberLogin", memberDTO);
			
	}

}