package com.notepubs.web.controller.member;

import java.util.List;

import org.apache.tiles.autotag.core.runtime.annotation.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default;
import com.notepubs.web.entity.Category;
import com.notepubs.web.entity.Language;
import com.notepubs.web.entity.MyCategory;
import com.notepubs.web.entity.Note;
import com.notepubs.web.entity.Platform;
import com.notepubs.web.service.NoteService;

@Controller("memberNoteController")
@RequestMapping("/member/note/")
public class NoteController {
	
	@Autowired
	private NoteService service;
	
	@GetMapping("list")
	public String list(
			@RequestParam (name="title", defaultValue = "") String title,
			@RequestParam (name="mc", defaultValue = "0") int myCategoryId,
			@RequestParam (name="c",defaultValue = "0")int categoryId,
			@RequestParam (name="lang",defaultValue = "0")int languageId,
			@RequestParam (name="pf",defaultValue = "0")int platformId,
			Model model) {
			
		List<MyCategory> myCategoryList = service.getMyCategoryList();
		List<Category> categoryList = service.getCategoryList();
		List<Language> languageList = service.getLanguageList();
		List<Platform>	platformList = service.getPlatformList();
		
		List<Note> list = service.getList(title,myCategoryId,categoryId,languageId,platformId);
		
		model.addAttribute("myCategoryList", myCategoryList);
		model.addAttribute("categoryList", categoryList);
		model.addAttribute("languageList", languageList);
		model.addAttribute("platformList", platformList);
		model.addAttribute("list", list);
		
		
		
		
		return "member.note.list";
	}
	
	@GetMapping("reg")
	public String reg(Model model) {
				
		return "member.note.reg";
	}
	
	@PostMapping("reg")
	public String reg(Note note) {
				
		return "redirect:list";
	}
	
}
