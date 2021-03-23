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
	
	
//	//Update
//	public int memberUpdate(MemberDTO memberDTO) throws Exception {
//		
//		//id를 제외하고 나머지 수정
//		
//		return 
//	}
//	
//	
//	//Delete
//	public int memberDelete(MemberDTO memberDTO) throws Exception{
//		
//		
//		return 
//	}
//	
//	//Join
//	public int memberJoin(MemberDTO memberDTO) throws Exception{
//		
//		
//		
//		//4. sql
//		String sql = "insert into MEMBER values(?, ?, ?, ?, ?)";
//		
//		//5. 미리 전송
//		PreparedStatement st = conn.prepareStatement(sql);
//		
//		//6. ? 세팅
//		st.setString(1, memberDTO.getId());
//		st.setString(2, memberDTO.getPw());
//		st.setString(3, memberDTO.getName());
//		st.setString(4, memberDTO.getPhone());
//		st.setString(5, memberDTO.getEmail());
//		
//		//7. 최종 전송
//		int result = st.executeUpdate();
//		
//		//8. 닫기
//		st.close();
//		conn.close();
//		
//		
//		return result;
//		
//	}
			

	
	
	//login
	public MemberDTO memberLogin(MemberDTO memberDTO)throws Exception{
		
		return sqlSession.selectOne(NAMESPACE+"memberLogin", memberDTO);
			
	}

}
