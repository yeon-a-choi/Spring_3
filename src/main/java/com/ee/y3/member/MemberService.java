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
	
	//Join
	public int memberJoin(MemberDTO memberDTO) throws Exception{
		System.out.println(memberDTO.getId());
		
		return memberDAO.memberJoin(memberDTO);
		
	}
	
//	//Select page
//	public MemberDTO memberPage(MemberDTO memberDTO) throws Exception {	
//		return memberDAO.memberPage(memberDTO);
//	}
	
	
	//Delete
	public int memberDelete(MemberDTO memberDTO) throws Exception{		
		return memberDAO.memberDelete(memberDTO);
	}
	
}
