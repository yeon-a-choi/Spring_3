package com.ee.y3.member;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/member/**")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	//logout
	@RequestMapping("memberLogout")
	public String memberLogout(HttpSession session) throws Exception{
		//session의 유지시간을 0으로
		session.invalidate();
		
		return "redirect:../";
	}
	

	//login
	@RequestMapping("memberLogin")
	public void memberLogin() throws Exception{
		//return타입이 뭐든간에 ModelAndView가 리턴
	}
	
	@RequestMapping(value = "memberLogin", method=RequestMethod.POST)
	public String memberLogin(MemberDTO memberDTO, HttpSession session) throws Exception{
		
		memberDTO = memberService.memberLogin(memberDTO);
		System.out.println(memberDTO);
		
		session.setAttribute("member", memberDTO);
		
		return "redirect:../";
		
	}
	
	
	//join
	@RequestMapping("memberJoin")
	public void memberJoin() throws Exception{

	}
	
	
	@RequestMapping(value = "memberJoin", method=RequestMethod.POST)
	public String memberJoin(MemberDTO memberDTO) throws Exception{
		
		int result = memberService.memberJoin(memberDTO);
		System.out.println(result);
		
		return "redirect:../";
	}
	
	
	//memberPage
	//@RequestMapping("memberPage")
	@RequestMapping(value = "memberPage")
	public void memberPage() throws Exception{
		
	}
	
	
	//memberDelete
	@RequestMapping(value = "memberDelete")
	public String memberDelete(HttpSession session) throws Exception{
		
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("member");
		int result = memberService.memberDelete(memberDTO);
		
		System.out.println(result);
		//정보를 삭제했으니 로그아웃시켜야함, session에는 값이 아직 남아있음.
		session.invalidate();
		
		return "redirect:../";
	}

	
	//memberUpdate
	
	//값을 받는부분, 보내는 부분 나눠야함. 안그러면 Update해도 수정전 값 그대로남음
	@RequestMapping(value="memberUpdate")
	public void memberUpdate(MemberDTO memberDTO, HttpSession session) throws Exception {
		//session에 memberDTO의 값이 있음.
		//넘어올땐 Object타입이 되므로 형변환 시켜줘야함.
		memberDTO = (MemberDTO)session.getAttribute("member");
	}
	
	@RequestMapping(value="memberUpdate", method=RequestMethod.POST)
	public String memberUpdate(MemberDTO memberDTO) throws Exception {

		int result = memberService.memberUpdate(memberDTO);	
		System.out.println(result);
		
		return "redirect:../";
	}
	
}
