package com.ee.y3;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ee.y3.member.MemberDAO;
import com.ee.y3.member.MemberDTO;


public class MemberDAOTest {

	@Autowired
	private MemberDAO memberDAO;
	
	@Test
	public void memberLogin() throws Exception {
		
		MemberDTO memberDTO = new MemberDTO();
		
		List<MemberDTO> ar = memberDAO.memberLogin(memberDTO);
		
		assertNotEquals(0, ar.size());
		
		
	}
	
	
}
