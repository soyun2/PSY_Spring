package com.org.mbat.cls;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ClsController {
	
	@RequestMapping("/aopchk")
	@ResponseBody
	public String sessionchk(HttpServletRequest request) {
		System.out.println("여기에서 aop 실행");
		return "session....check.....";
	}
	
	@RequestMapping("/aopdoa")
	@ResponseBody
	public String doa(HttpServletRequest request) {
		System.out.println("여기에서 aop 실행");
		return "aop/doa";
	}
}
