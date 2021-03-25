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
	
	@RequestMapping(value="memberUpdate")
	public void memberUpdate() throws Exception {
		
	}
	
	@RequestMapping(value="memberUpdate", method=RequestMethod.POST)
	public String memberUpdate(MemberDTO memberDTO, HttpSession session) throws Exception {
													//httpsession은 내장객체, new 할 수 없음.
		int result = memberService.memberUpdate(memberDTO);	
		System.out.println(result);
		
		//session에 있는 값을 가져오기때문에 수정 후 db에서 한번 더 값을 가져와야함. (덮어쓰기)
		if(result>0) {
			//이름을 member로 하는 이유는 home.jsp에 member로 받아오겠다고 했기때문에
			//이름을 바꾸려면 계속 home.jsp에서도 변경해주어야함.
			//이름을 무엇으로 하던 상관없지만 통일해서 쓰기!
			session.setAttribute("member", memberDTO);
		}
		
		return "redirect:../";
	}
	
}
