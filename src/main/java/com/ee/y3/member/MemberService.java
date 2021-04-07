package com.ee.y3.member;

import java.io.File;
import java.util.Calendar;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
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
		
		fileManager.save("member", avatar, session);
		
		return 0;
		//return memberDAO.memberJoin(memberDTO);
		
		
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
