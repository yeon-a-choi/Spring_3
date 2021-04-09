package com.ee.y3;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ee.y3.member.MemberDAO;
import com.ee.y3.member.MemberDTO;
import com.ee.y3.member.MemberFileDTO;


public class MemberDAOTest extends MyAbstractTest {

	@Autowired
	private MemberDAO memberDAO;
	
	@Test
	public void setMemberFileInsertTest() throws Exception{
		MemberFileDTO memberFileDTO = new MemberFileDTO();
		memberFileDTO.setId("iu");
		memberFileDTO.setFileName("f1");
		memberFileDTO.setOrigineName("o1");
		
		int result = memberDAO.setFileInsert(memberFileDTO);
		assertEquals(1, result);
	}
	
	//@Test
	public void memberLogin() throws Exception {
		
		// MemberDTO를 Login에 매개변수로 선언하면 값을 넣어줄 수가 없어서 오류
		// 메서드 안에 선언해야함
		
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("iu");
		memberDTO.setPw("pw1");
		
		memberDTO = memberDAO.memberLogin(memberDTO);
		
		assertNotNull(memberDTO);
		
	}
	
	
	//@Test
	public void memberJoin() throws Exception{
		
		MemberDTO memberDTO = new MemberDTO();
		
		memberDTO.setId("nara");
		memberDTO.setPw("pw7");
		memberDTO.setName("nara");
		memberDTO.setPhone("010-8632-0912");
		memberDTO.setEmail("nara@gmail.com");
		
		int result = memberDAO.memberJoin(memberDTO);
		
		//값이 한 번 들어가면 result가 1, 값이 두 번 들어가면 result가 2
		assertEquals(1, result);
		
	}
	
	//@Test
	public void memberDelete() throws Exception{
		
		MemberDTO memberDTO = new MemberDTO();
		
		memberDTO.setId("id3");
		
		int result = memberDAO.memberDelete(memberDTO);
		
		assertEquals(1, result);
		
	}
	
	//@Test
	public void memberUpdate() throws Exception{
		
		MemberDTO memberDTO = new MemberDTO();
		
		memberDTO.setId("id4");
		
		//값을 모두 받아오는 list가 없으므로 전체 값 변경만 가능
		//memberDTO = memberDAO.memberLogin(memberDTO);
		
		memberDTO.setPw("pw5");
		memberDTO.setName("jin");
		memberDTO.setPhone("01036215732");
		memberDTO.setEmail("jin@naver.com");
		
		int result = memberDAO.memberUpdate(memberDTO);
		
		assertEquals(1, result);
			
	}
	
}
