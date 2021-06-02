package com.org.myapp.freeboard;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoardController {

//	@component -> 필요한 객체 타입
//	@controller -> url요청 들어오는곳에
//	@service -> 게시판기능 서비스를
//	@repository -> db관리
	
//	@asepct -> aop
	
	@Autowired
	BoardService bs;
	
	@RequestMapping(value = "/freeboard", method = RequestMethod.GET)
	public String freeboard(Model model) {
		System.out.println("게시판홈");
//		bs.select();
		return "freeboard/freeboard";
	}
	
//	@RequestMapping(value = "/freeboard/insert")
//	public String freeboardinsert(Model model, HttpServletRequest request) {
//		String name = request.getParameter("name");
//		System.out.println("name = "+name);
////		bs.select();
////		bs.insert();
//		return "freeboard/freeboard";
//	}
	
	@RequestMapping(value = "/freeboard/insert")
	public String freeboardinsert(Model model, @RequestParam String name, Board board) {
		System.out.println("name = "+name);
		System.out.println(board);
		bs.insert(board);
		return "freeboard/freeboard";
	}
	
	@RequestMapping(value = "/freeboard/freeboard_insertform", method = RequestMethod.GET)
	public String freeboardinsertform(Model model) {
		System.out.println("게시판글쓰기");
		return "freeboard/freeboard_insertform";
	}
}
