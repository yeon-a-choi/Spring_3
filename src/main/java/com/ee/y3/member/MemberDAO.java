package com.ee.y3.member;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	
	//sqlSession 값 보내줌 Autowired로 연결
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.ee.y3.member.MemberDAO.";
	
	//file insert
	public int setFileInsert(MemberFileDTO memberFileDTO) throws Exception{
		return sqlSession.insert(NAMESPACE+"setFileInsert", memberFileDTO);
	}
	
	//file login(get photo)
	public MemberFileDTO memberLoginFile(MemberDTO memberDTO) throws Exception{
		return sqlSession.selectOne(NAMESPACE+"memberLoginFile", memberDTO);
	}
	
	
	//Update
	public int memberUpdate(MemberDTO memberDTO) throws Exception {		
		//id를 제외하고 나머지 수정
		return sqlSession.update(NAMESPACE+"memberUpdate", memberDTO);		
	}
	
	
	//Delete
	public int memberDelete(MemberDTO memberDTO) throws Exception{		
		return sqlSession.delete(NAMESPACE+"memberDelete", memberDTO);
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
	
	
//	//memberSelect
//	public MemberDTO memberPage(MemberDTO memberDTO) throws Exception{
//		
//		return sqlSession.selectOne(NAMESPACE+"memberPage", memberDTO);
//	}
	
	public MemberFileDTO getMemberFile(MemberDTO memberDTO) throws Exception{
		return sqlSession.selectOne(NAMESPACE+"getMemberFile", memberDTO);
	}

}
