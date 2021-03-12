package com.notepubs.web.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/admin/member/")
public class MemberController {
	
	@RequestMapping("list")
	public String list() {
		return "admin.member.list";
	}
	
	
	@RequestMapping("detail")
	public String detail() {
		return "admin.member.detail";
	}

}

