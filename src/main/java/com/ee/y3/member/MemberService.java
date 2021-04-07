package com.ee.y3.member;

import java.io.File;
import java.util.Calendar;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
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
	public int memberJoin(MemberDTO memberDTO, MultipartFile avatar, HttpSession session) throws Exception{
		//1. 저장할 폴더 지정 resources/upload/member
		//2. os에서 인식할 수 있는 실제 경로 찾기
		//jsp : application - server : ServletContext
		String path = session.getServletContext().getRealPath("resources/upload/member");
		System.out.println(path);
		
		//3. 실제 경로에 폴더가 없으면 파일 저장시 에러 발생
		File file = new File(path);
		System.out.println(file.exists());
		
		if(!file.exists()) {
			file.mkdirs();
		}
		
		//4. 저장할 파일명 생성
		// a. 시간
		Calendar ca = Calendar.getInstance();
		long time = ca.getTimeInMillis();
		
		String name = avatar.getOriginalFilename();
		
		int result = name.lastIndexOf(".");
		name = name.substring(result);
		
		System.out.println("확장자 : "+name);
		
		name = time+name;
		System.out.println("최종이름 : "+name);
		
		name = time+"_"+avatar.getOriginalFilename();
		System.out.println("최종이름2 : "+name);
		
		
		//	b. UUID
		String fileName = UUID.randomUUID().toString();
		fileName = fileName+"_"+avatar.getOriginalFilename();
		
		System.out.println("UUID : "+fileName);
		
		//5. HDD에 파일 저장
						//parent??
		file = new File(file, name);
		//	1) FileCopyUtils 클래스의 메서드 사용
		FileCopyUtils.copy(avatar.getBytes(), file);
		
		//	2) MultipartFile 클래스의 메서드 사용
		
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
