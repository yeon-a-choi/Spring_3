package com.ee.y3.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/bankbook/**")
public class BankBookController {

	//BankBookService에 의존적
	@Autowired
	private BankBookService bankBookService;
	
	@RequestMapping(value = "bankbookList")
	public void getList(Model model) throws Exception {
		
		List<BankBookDTO> ar = bankBookService.getList();
		model.addAttribute("list", ar);
		
	}
	
	@RequestMapping(value = "bankbookSelect")
	public ModelAndView getSelect(BankBookDTO bankBookDTO) throws Exception {
		
		ModelAndView mv = new ModelAndView();
		bankBookDTO = bankBookService.getSelect(bankBookDTO);
		
		mv.addObject("dto",bankBookDTO);
		mv.setViewName("bankbook/bankbookSelect");
		
		return mv;
		
	}
	
	@RequestMapping(value = "bankbookDelete")
	public String setDelete(BankBookDTO bankBookDTO) throws Exception {
		
		int result = bankBookService.setDelete(bankBookDTO);
		
		System.out.println(result);
		
		//삭제하면 ListPage로 가기위해서 return을 list 주소로
		return "redirect:./bankbookList";
			
	}
	
}
