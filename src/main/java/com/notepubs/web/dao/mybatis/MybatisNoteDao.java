package com.notepubs.web.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.notepubs.web.dao.NoteDao;
import com.notepubs.web.entity.MyCategory;
import com.notepubs.web.entity.Note;
import com.notepubs.web.entity.NoteView;

@Repository
public class MybatisNoteDao implements NoteDao{
	
	private NoteDao mapper;
	
	@Autowired
	public MybatisNoteDao(SqlSession session) {
		mapper = session.getMapper(NoteDao.class);
	}

	@Override
	public List<Note> getList() {
		
		return mapper.getList();
	}
	
	@Override
	public int insert(Note note) {
		
		return mapper.insert(note);
	}

	@Override
	public int update(Note note) {
		
		return mapper.update(note);
	}

	@Override
	public int delete(int id) {
		
		return mapper.delete(id);
	}

	@Override
	public Note get(int id) {
		
		return mapper.get(id);
	}

	@Override
	public List<Note> getList(String title) {
		// TODO Auto-generated method stub
		return mapper.getList(title);
	}

	@Override
	public List<Note> getList(String title, int myCategoryId) {
		// TODO Auto-generated method stub
		return mapper.getList(title,myCategoryId);
	}

	@Override
	public List<Note> getList(String title, int myCategoryId, int categoryId) {
		// TODO Auto-generated method stub
		return mapper.getList(title,myCategoryId, categoryId);
	}

	@Override
	public List<Note> getList(String title, int myCategoryId, int categoryId, int languageId) {
		// TODO Auto-generated method stub
		return mapper.getList(title,myCategoryId, categoryId, languageId);
	}

	@Override
	public List<Note> getList(String title, int myCategoryId, int categoryId, int languageId, int platformId) {
		// TODO Auto-generated method stub
		return mapper.getList(title,myCategoryId, categoryId, languageId, platformId);
	}

	@Override
	public List<NoteView> getViewList() {
		// TODO Auto-generated method stub
		return mapper.getViewList();
	}

	@Override
	public List<Note> getList(int offSet, int size, String orderColumn, boolean pub) {
		// TODO Auto-generated method stub
		return mapper.getList(offSet, size, orderColumn, pub);
	}

	@Override
	public List<Note> getList(String title, int myCategoryId, int categoryId, int languageId, int platformId,
			int offSet, int size, String orderColumn, boolean pub) {
		// TODO Auto-generated method stub
		return mapper.getList(title, myCategoryId, categoryId, languageId, platformId, offSet, size, orderColumn, pub);
	}

	@Override
	public List<Note> getHitTopList() {
		// TODO Auto-generated method stub
		return mapper.getHitTopList();
	}

	@Override
	public List<Note> getNewNoteList() {
		// TODO Auto-generated method stub
		return mapper.getNewNoteList();
	}

	
	
}
