package com.notepubs.web.service;

import java.util.List;	

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notepubs.web.dao.CategoryDao;
import com.notepubs.web.dao.LanguageDao;
import com.notepubs.web.dao.MyCategoryDao;
import com.notepubs.web.dao.NoteDao;
import com.notepubs.web.dao.PlatformDao;
import com.notepubs.web.entity.Category;
import com.notepubs.web.entity.Language;
import com.notepubs.web.entity.MyCategory;
import com.notepubs.web.entity.Note;
import com.notepubs.web.entity.NoteView;
import com.notepubs.web.entity.Platform;


@Service
public class NoteServiceImp implements NoteService {

	@Autowired
	private NoteDao noteDao;
	
	@Autowired
	private MyCategoryDao myCategoryDao;
	
	@Autowired
	private CategoryDao categoryDao;
	
	@Autowired
	private LanguageDao languageDao;

	@Autowired
	private PlatformDao platformDao;
	
	@Override
	public List<Note> getList() {
		
		return noteDao.getList("");
	}
	
	@Override
	public List<Note> getList(String title) {
		
		return noteDao.getList(title);
	}

	@Override
	public int insert(Note note) {
		// TODO Auto-generated method stub
		return noteDao.insert(note);
	}

	@Override
	public int update(Note note) {
		// TODO Auto-generated method stub
		return noteDao.update(note);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return noteDao.delete(id);
	}

	@Override
	public Note get(int id) {
		// TODO Auto-generated method stub
		return noteDao.get(id);
	}
	
	@Override
	public List<MyCategory> getMyCategoryList() {
		// TODO Auto-generated method stub
		return myCategoryDao.getList();
	}

	@Override
	public List<Category> getCategoryList() {
		
		return categoryDao.getList();
	}

	@Override
	public List<Language> getLanguageList() {
		
		return languageDao.getList();
	}

	@Override
	public List<Platform> getPlatformList() {
		// TODO Auto-generated method stub
		return platformDao.getList();
	}

	@Override
	public List<Note> getList(String title, int myCategoryId) {
		// TODO Auto-generated method stub
		return noteDao.getList(title,myCategoryId);
	}

	@Override
	public List<Note> getList(String title, int myCategoryId, int categoryId) {
		// TODO Auto-generated method stub
		return noteDao.getList(title, myCategoryId, categoryId);
	}

	@Override
	public List<Note> getList(String title, int myCategoryId, int categoryId, int languageId) {
		// TODO Auto-generated method stub
		return noteDao.getList(title, myCategoryId, categoryId, languageId);
	}

	@Override
	public List<Note> getList(String title, int myCategoryId, int categoryId, int languageId, int platformId) {
		// TODO Auto-generated method stub
		return noteDao.getList(title, myCategoryId, categoryId, languageId, platformId);
	}

	@Override
	public List<NoteView> getViewList() {
		// TODO Auto-generated method stub
		return noteDao.getViewList();
	}

	@Override
	public int hitUp(int id) {
		Note note = noteDao.get(id);
		note.setHit(note.getHit()+1);
		
		int result = noteDao.update(note);
		
		return result;
		
	}

	@Override
	public List<Note> getHitTopList() {
		
		return noteDao.getHitTopList();
	}

	@Override
	public List<Note> getNewNoteList() {
		// TODO Auto-generated method stub
		return noteDao.getNewNoteList();
	}

	


	

}
