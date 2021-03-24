package com.ee.y3.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value="memberLogin")
	public void memberLogin(MemberDTO memberDTO) throws Exception{
		
		memberDTO = memberService.memberLogin(memberDTO);
		
	}
	
}
