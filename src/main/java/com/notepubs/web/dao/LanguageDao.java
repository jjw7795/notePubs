package com.notepubs.web.dao;

import java.util.List;

import com.notepubs.web.entity.Language;


public interface LanguageDao {
	int insert(Language language);
	int update(Language language);
	int delete(Language language);
	
	Language get(int id);
	
	List<Language> getList();
	List<Language> getList(String field);
}
