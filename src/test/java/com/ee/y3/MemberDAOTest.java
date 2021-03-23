package com.ee.y3;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ee.y3.member.MemberDAO;
import com.ee.y3.member.MemberDTO;


public class MemberDAOTest extends MyAbstractTest {

	@Autowired
	private MemberDAO memberDAO;
	
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
	
	public void memberUpdate() throws Exception{
		
		MemberDTO memberDTO = new MemberDTO();
		
		memberDTO.setId("id4");
		
	}
	
}
