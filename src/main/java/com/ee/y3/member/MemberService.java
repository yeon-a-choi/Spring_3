package com.ee.y3.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	
	@Autowired
	private MemberDAO memberDAO;

	//Login
	public MemberDTO memberLogin(MemberDTO memberDTO) throws Exception{
		
		return memberDAO.memberLogin(memberDTO);
		
		
	}
	
}
