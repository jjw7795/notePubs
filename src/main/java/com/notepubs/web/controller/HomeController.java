package com.notepubs.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.notepubs.web.entity.Note;
import com.notepubs.web.service.NoteService;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	private NoteService service; 
	
	@RequestMapping("index")
	public String index(Model model) {
		
		List<Note> list = service.getHitTopList();
		List<Note> newNoteList = service.getNewNoteList();
		model.addAttribute("list", list);
		model.addAttribute("newNoteList", newNoteList);
		return "home.index";
	}
}
