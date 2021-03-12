package com.notepubs.web.dao;

import java.util.List;

import com.notepubs.web.entity.Comment;
import com.notepubs.web.entity.MyCategory;
import com.notepubs.web.entity.Note;
import com.notepubs.web.entity.NoteView;

public interface NoteDao {
	
	int insert(Note note);
	int update(Note note);
	int delete(int id);
	
	Note get(int id);
	List<Note> getList();
	List<Note> getList(String title);
	List<Note> getList(String title, int myCategoryId);
	List<Note> getList(String title, int myCategoryId, int categoryId);
	List<Note> getList(String title, int myCategoryId, int categoryId, int languageId);
	List<Note> getList(String title, int myCategoryId, int categoryId, int languageId, int platformId);
	List<Note> getList(String title, int myCategoryId, int categoryId, int languageId, int platformId,int offSet, int size, String orderColumn, boolean pub);
	List<Note> getList(int offSet, int size, String orderColumn, boolean pub);
	List<NoteView> getViewList();
	List<Note> getHitTopList();
	List<Note> getNewNoteList();
}
