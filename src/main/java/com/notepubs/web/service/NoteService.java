package com.notepubs.web.service;

import java.util.List;

import com.notepubs.web.entity.Category;
import com.notepubs.web.entity.Language;
import com.notepubs.web.entity.MyCategory;
import com.notepubs.web.entity.Note;
import com.notepubs.web.entity.NoteView;
import com.notepubs.web.entity.Platform;

public interface NoteService {
	
	int insert(Note note);
	int update(Note note);
	int delete(int id);
	
	Note get(int id);
	int hitUp(int id);
	
	List<Note> getList();
	List<MyCategory> getMyCategoryList();
	List<Category> getCategoryList();
	List<Language> getLanguageList();
	List<Note> getList(String title);
	List<Platform> getPlatformList();
	List<Note> getList(String title, int myCategoryId);
	List<Note> getList(String title, int myCategoryId, int categoryId);
	List<Note> getList(String title, int myCategoryId, int categoryId, int languageId);
	List<Note> getList(String title, int myCategoryId, int categoryId, int languageId, int platformId);
	List<NoteView> getViewList();
	
	List<Note> getHitTopList();
	List<Note> getNewNoteList();
	
	
}

