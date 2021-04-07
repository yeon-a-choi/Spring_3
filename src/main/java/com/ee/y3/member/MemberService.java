package com.ee.y3.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class MemberService {
	
	@Autowired
	private MemberDAO memberDAO;

	//Login
	public MemberDTO memberLogin(MemberDTO memberDTO) throws Exception{
		return memberDAO.memberLogin(memberDTO);
	}
	
	//Join
	public int memberJoin(MemberDTO memberDTO, MultipartFile avatar) throws Exception{
		//1. 저장할 폴더 지정
		
		//return memberDAO.memberJoin(memberDTO);
		return 0;
		
	}
	
//	//Select page
//	public MemberDTO memberPage(MemberDTO memberDTO) throws Exception {	
//		return memberDAO.memberPage(memberDTO);
//	}
	
	
	//Delete
	public int memberDelete(MemberDTO memberDTO) throws Exception{		
		return memberDAO.memberDelete(memberDTO);
	}
	
	//Update
	public int memberUpdate(MemberDTO memberDTO) throws Exception{
		return memberDAO.memberUpdate(memberDTO);
	}
	
}
