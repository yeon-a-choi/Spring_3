package com.ee.y3.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/account/**")
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	
	//List
	@RequestMapping(value="accountList")
	public void accountList() throws Exception{
	}
	
	@RequestMapping(value="accountList")
	public void accountList(Model model) throws Exception{
		
		List<AccountDTO> ar = accountService.getList();
		model.addAttribute("list", ar);
		
	}


}
