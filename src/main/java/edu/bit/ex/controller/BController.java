package edu.bit.ex.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.bit.ex.service.BoardService;
import edu.bit.ex.vo.BoardVO;

@Controller
public class BController {
	
	@Inject
	BoardService boardService;
	
	@RequestMapping("/list")
	public String list(Model model) throws Exception{
		System.out.println("list()호출");
		model.addAttribute("list", boardService.selectBoardList());
		
		return "list";			
	}
	@RequestMapping("/content_view")
		public String content_view(Model model,HttpServletRequest request) throws Exception {
		System.out.println("content_view()");
		String userno = request.getParameter("userno");
		model.addAttribute("content_view", boardService.selectBoardOne(userno));
		
		return "content_view"; 		
	} 
	@RequestMapping("/write_view")
	public String write_view(Model model,HttpServletRequest request) throws Exception {
		System.out.println("write_view()");
		
		
//		model.addAttribute("write_view",boardService.selectBoardOne(bId));
		
		return "write_view"; 		
	}
	@RequestMapping("/write")
	public String write(BoardVO boardVO ,Model model,HttpServletRequest request) throws Exception {
		System.out.println("write");	
//		model.addAttribute("write_view",boardService.selectBoardOne(bId));
		boardService.insertBoard(boardVO);
		
		return "redirect:list"; 		
	}
	@RequestMapping("/delete")
	public String delete(BoardVO boardVO ,Model model,HttpServletRequest request) throws Exception {
		System.out.println("delete");	
//		model.addAttribute("write_view",boardService.selectBoardOne(bId));
		boardService.deleteBoard(boardVO);
		
		return "redirect:list"; 		
	}
	@RequestMapping("/modify")
	public String modify(BoardVO boardVO,Model model) {
		System.out.println("modify");
		
		boardService.modifyBoard(boardVO);
		
		return "redirect:list";	
	}
	@RequestMapping("/reply_view")
	public String reply_view(Model model,HttpServletRequest request) throws Exception {
		System.out.println("reply_view()");
		
		String bId = request.getParameter("bId");
		model.addAttribute("reply_view", boardService.selectBoardOne(bId));
		
		return "reply_view";
	}
	
	@RequestMapping("/reply")
	public String reply(BoardVO boardVO,Model model,HttpServletRequest request) {
		System.out.println("reply()");
		
				
		boardService.replyUPBoard(boardVO);
		boardService.replyBoard(boardVO);
		
		return "redirect:list";
	}
}
