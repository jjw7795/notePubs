package com.notepubs.web.controller.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Controller("memberBookController")
@RequestMapping("/member/book/")
public class BookController {
	
	@RequestMapping("list")
	public String list() {
		return "member/book/list";
	}
}
