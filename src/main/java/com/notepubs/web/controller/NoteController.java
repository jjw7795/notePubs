package com.notepubs.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.notepubs.web.entity.Comment;
import com.notepubs.web.entity.Note;
import com.notepubs.web.entity.NoteView;
import com.notepubs.web.service.NoteService;

@Controller
@RequestMapping("/note/")
public class NoteController {

	@Autowired
	private NoteService service;
	
	@RequestMapping("list")
	public String list(Model model) {
		
		List<NoteView> list = service.getViewList();
//		//List<Note> list = service.getList();
		
		model.addAttribute("list", list);
		
		return "home.note.list";
	}
	
	@RequestMapping("{id}")
	public String detail(@PathVariable("id")int id, Model model) {
		
		int result = service.hitUp(id);
		Note note = service.get(id); //detail
		
		model.addAttribute("n", note);
		
		return "home.note.detail";
	}
	
}
