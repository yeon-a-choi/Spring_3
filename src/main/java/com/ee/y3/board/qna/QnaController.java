package com.ee.y3.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ee.y3.board.BoardDTO;
import com.ee.y3.util.Pager;

@Controller
@RequestMapping("/qna/**")
public class QnaController {

	@Autowired
	private QnaService qnaService;
	
	//list
	@GetMapping("qnaList")
	public ModelAndView getList(Pager pager) throws Exception{
		
		ModelAndView mv = new ModelAndView();
		List<BoardDTO> ar = qnaService.getList(pager);
		
		mv.addObject("list", ar);
		mv.addObject("board", "qna");
		mv.setViewName("board/boardList");
		mv.addObject("pager", pager);
		
		return mv;
	}
	
	//insert
	@GetMapping("qnaInsert")
	public ModelAndView setInsert(Pager pager) throws Exception{
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("board/boardInsert");
		mv.addObject("board", "qna");
		
		return mv;
	}
	
	@PostMapping("qnaInsert")
	public ModelAndView setInsert(BoardDTO boardDTO) throws Exception{
		int result = qnaService.setInsert(boardDTO);
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("redirect:./qnaList");
		
		return mv;
		
	}
	
	
	//select
	@GetMapping("qnaSelect")
	public ModelAndView getSelect(BoardDTO boardDTO) throws Exception{
		
		ModelAndView mv = new ModelAndView();
		
		boardDTO = qnaService.getSelect(boardDTO);
		
		mv.addObject("board", "qna");
		mv.addObject("dto", boardDTO);
		mv.setViewName("board/boardSelect");
	
		return mv;
	}
	
	
	//reply
	@GetMapping("qnaReply")
	public ModelAndView setReply() throws Exception{
		
		ModelAndView mv = new ModelAndView();
		
		//movelandview는 생명주기가 request와 같음
		
		mv.setViewName("board/boardReply");
		mv.addObject("board", "qna");
		//mv.addObject("dto", boardDTO);
		
		return mv;
		
	}
	
	@PostMapping("qnaReply")
	public ModelAndView setReply(QnaDTO qnaDTO) throws Exception{
		
		ModelAndView mv = new ModelAndView();
		
		int result = qnaService.setReply(qnaDTO);
		
		mv.setViewName("redirect:./qnaList");
		
		return mv;
		
	}
	
	
}
