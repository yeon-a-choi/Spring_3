package com.ee.y3.member;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.ee.y3.util.FileManager;

@Service
public class MemberService {
	
	@Autowired
	private MemberDAO memberDAO;
	
	@Autowired
	private FileManager fileManager;

	
	//Login
	public MemberDTO memberLogin(MemberDTO memberDTO) throws Exception{
		return memberDAO.memberLogin(memberDTO);
	}
	
	//Join
	public int memberJoin(MemberDTO memberDTO, MultipartFile avatar, HttpSession session) throws Exception{
		
		String fileName = fileManager.save("member", avatar, session);
		
		MemberFileDTO memberFileDTO = new MemberFileDTO();
		
		memberFileDTO.setId(memberDTO.getId());
		memberFileDTO.setOrigineName(avatar.getOriginalFilename());
		memberFileDTO.setFileName(fileName);
		
		//순서도 중요! member테이블에서 먼저 참조해서 넣어야함!
		int result = memberDAO.memberJoin(memberDTO);
		result = memberDAO.setFileInsert(memberFileDTO);
		
		
		return result;
		
		
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
