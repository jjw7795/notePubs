package com.notepubs.web.controller.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.notepubs.web.entity.Category;
import com.notepubs.web.entity.Language;
import com.notepubs.web.entity.MyCategory;
import com.notepubs.web.entity.Note;
import com.notepubs.web.entity.Platform;
import com.notepubs.web.service.NoteService;

@RestController("apiNoteController")
@RequestMapping("/api/note/")
public class NoteController {
	
	@Autowired
	private NoteService service;
	
	@GetMapping("list")
	public Map<String , Object> list(
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
		
		Map<String , Object> map = new HashMap<>();
		map.put("myCategoryList",myCategoryList );
		map.put("categoryList",categoryList );
		map.put("languageList", languageList);
		map.put("platformList",platformList );
		map.put("list", list);
	
		return map;
	}
	

}