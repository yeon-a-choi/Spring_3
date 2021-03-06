package com.ee.y3.board.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.ee.y3.board.BoardDTO;
import com.ee.y3.util.Pager;

@Controller
@RequestMapping("/notice/**")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	//insert
	@RequestMapping("noticeInsert")
	public ModelAndView setInsert()throws Exception{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("board/boardInsert");
		mv.addObject("board", "notice");
		return mv;
	}
	
	@RequestMapping(value = "noticeInsert", method = RequestMethod.POST)
	public String setInsert(BoardDTO boardDTO, Model model, MultipartFile [] files)throws Exception{
		
		/*System.out.println("Insert Start");
		for(MultipartFile mf:files) {
			System.out.println(mf.getOriginalFilename());
		}
		System.out.println("Insert Finish");
		*/
		
		int result = noticeService.setInsert(boardDTO, files);
		
		//int result = 0;
		
		String message="등록 실패";
		
		if(result>0) {
			message="등록 성공";
		}
		model.addAttribute("msg", message);
		model.addAttribute("path", "./noticeList");
		
		return "common/commonResult";
	}
	
	//list
	@RequestMapping("noticeList")
	public ModelAndView getList(Pager pager)throws Exception{
		ModelAndView mv = new ModelAndView();
		System.out.println(pager.getCurPage());
		
		List<BoardDTO> ar = noticeService.getList(pager);
		
		//List<NoticeDTO> ar = noticeService.getList(curPage);
		mv.addObject("list", ar);
		mv.setViewName("board/boardList");
		mv.addObject("board", "notice");
		mv.addObject("pager", pager);
		return mv;
	}
	
	//select
	@GetMapping("noticeSelect")
	public ModelAndView getSelect(BoardDTO boardDTO) throws Exception{
		
		ModelAndView mv = new ModelAndView();
		boardDTO = noticeService.getSelect(boardDTO);
		mv.addObject("dto", boardDTO);
		mv.addObject("board", "notice");
		
		mv.setViewName("board/boardSelect");
		
		return mv;
		
	}
	
	//Delete
	@PostMapping(value = "noticeDelete")
	public ModelAndView setDelete(BoardDTO boardDTO) throws Exception{
		
		ModelAndView mv = new ModelAndView();
		
		int result = noticeService.setDelete(boardDTO);
		
		String message="삭제 실패";
		String path = "./noticeList";
		
		if(result > 0) {
			message="삭제 성공";
		}

		mv.addObject("msg", message);
		mv.addObject("path", path);
		
		mv.setViewName("common/commonResult");
		
		return mv;
	}
	
	
	//Update
	@GetMapping("noticeUpdate")
	public ModelAndView setUpdate(BoardDTO boardDTO) throws Exception{
		ModelAndView mv = new ModelAndView();
		
		boardDTO = noticeService.getSelect(boardDTO);
		
		mv.addObject("dto", boardDTO);
		mv.addObject("board", "notice");
		mv.setViewName("board/boardUpdate");
		
		return mv;
	}
	
	@PostMapping("noticeUpdate")
	public ModelAndView setUpdate(BoardDTO boardDTO, ModelAndView mv) throws Exception{
		
		int result = noticeService.setUpdate(boardDTO);		

		//성공하면 리스트로 이동
		if(result > 0) {
			mv.setViewName("redirect:./noticeList");
		} 
		
		//실패하면 alert창, 리스트로 이동
		else {
			
			mv.addObject("msg", "업데이트 실패");
			mv.addObject("path", "./noticeList");
			
			mv.setViewName("common/commonResult");
			
		}
		
		
		return mv;
	}

}
