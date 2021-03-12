package com.notepubs.web.controller.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("memberHomeController")
@RequestMapping("/admin/")
public class HomeController {
	
	@GetMapping("index")
	public String index() {
		
		return "admin.index";
	}

}
