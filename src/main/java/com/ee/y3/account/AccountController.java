package com.ee.y3.account;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ee.y3.member.MemberDTO;

@Controller
@RequestMapping(value="/account/**")
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	
	//List
	@RequestMapping(value="accountList")
	public void accountList(HttpSession session, Model model) throws Exception{
		
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("member");
		AccountDTO accountDTO = new AccountDTO();
		
		accountDTO.setId(memberDTO.getId());
		
		List<AccountDTO> ar = accountService.getList(accountDTO);
		
		//jsp에 값을 보낼때 model || modelandview사용해서 값 담아서 보냄
		model.addAttribute("list", ar);
		
	}
	
	@RequestMapping(value="accountMake")
	public String accountMake(AccountDTO accountDTO, HttpSession session) throws Exception{
		
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("member");
		accountDTO.setId(memberDTO.getId());
		
		int result = accountService.setInsert(accountDTO);
		
		return "redirect:./accountList";
		
	}


}
