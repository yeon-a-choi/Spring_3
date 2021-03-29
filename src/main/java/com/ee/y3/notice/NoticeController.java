package com.ee.y3.notice;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ee.y3.util.Pager;


@Controller
@RequestMapping(value = "/notice/**")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	//List
	@RequestMapping(value="noticeList")
	//@RequestParam(defaultValue="1") 값이 넘어오지않을 때 기본 값
	public ModelAndView getList(Pager pager) throws Exception{
		
		ModelAndView mv = new ModelAndView();
		
		System.out.println(pager.getCurPage());
		List<NoticeDTO> ar = noticeService.getList(pager.getCurPage());
		mv.addObject("list", ar);
		mv.setViewName("notice/noticeList");
		
		return mv;
		
	}
	
	//Select
	@RequestMapping(value="noticeSelect")
	public ModelAndView getSelect(NoticeDTO noticeDTO) throws Exception{
		
		ModelAndView mv = new ModelAndView();
		noticeDTO = noticeService.getSelect(noticeDTO);
		
		noticeDTO.getTitle();
		
		mv.addObject("notice", noticeDTO);
		mv.setViewName("notice/noticeSelect");
		
		return mv;
		
	}
	
	//Update
	//400 잘못된 요청 오류
	@RequestMapping(value="noticeUpdate")
	public void setUpdate(NoticeDTO noticeDTO, Model model) throws Exception{
		
		noticeDTO = noticeService.getSelect(noticeDTO);	
		model.addAttribute("notice", noticeDTO);
	}
	
	@RequestMapping(value="noticeUpdate", method=RequestMethod.POST)
	public String setUpdate(NoticeDTO noticeDTO, HttpSession session) throws Exception{
		
		int result = noticeService.setUpdate(noticeDTO);		
		System.out.println(result);
		
		//session에 있는 값을 가져오기때문에 수정 후 db에서 한번 더 값을 가져와야함. (덮어쓰기)
		if(result>0) {
			session.setAttribute("notice", noticeDTO);
		}
		
		return "redirect:./noticeList";
		
	}
	
	
	//Insert
	@RequestMapping(value="noticeInsert")
	public void setInsert()throws Exception{
		
	}
	
	@RequestMapping(value="noticeInsert", method=RequestMethod.POST)
	public String setInsert(NoticeDTO noticeDTO)throws Exception{
		
		int result = noticeService.setInsert(noticeDTO);
		System.out.println(result);
		
		return "redirect:./noticeList";
	}
	
	
	//Delete
	@RequestMapping(value="noticeDelete")
	public String setDelete(NoticeDTO noticeDTO, HttpSession session) throws Exception{
		
		int result = noticeService.setDelete(noticeDTO);	
		System.out.println(result);
		
		//session에 있는 값을 가져오기때문에 수정 후 db에서 한번 더 값을 가져와야함. (덮어쓰기)
		if(result>0) {
			session.setAttribute("notice", noticeDTO);
		}
		
		return "redirect:./noticeList";
		
	}

}
