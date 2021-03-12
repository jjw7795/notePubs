package com.notepubs.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.notepubs.web.dao.BookDao;
import com.notepubs.web.entity.Book;
@Controller
@RequestMapping("/book/")
public class BookController {
	@Autowired
	private BookDao bookDao;
	
	@RequestMapping("list")
	public String list(Model model) {
		
		List<Book> list = bookDao.getList();
		
		model.addAttribute("list",list);
		
		return "home.book.list";
	}
}
