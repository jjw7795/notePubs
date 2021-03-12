package com.notepubs.web.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.notepubs.web.dao.LanguageDao;
import com.notepubs.web.entity.Language;

@Repository
public class MybatisLanguageDao implements LanguageDao {

	private LanguageDao mapper; 	
	@Autowired
	public MybatisLanguageDao(SqlSession session) {
		mapper = session.getMapper(LanguageDao.class);
	}
	
	@Override
	public int insert(Language language) {
		// TODO Auto-generated method stub
		return mapper.insert(language);
	}

	@Override
	public int update(Language language) {

		return mapper.update(language);
	}

	@Override
	public int delete(Language language) {
		// TODO Auto-generated method stub
		return mapper.delete(language);
	}

	@Override
	public Language get(int id) {
		// TODO Auto-generated method stub
		return mapper.get(id);
	}

	@Override
	public List<Language> getList() {
		// TODO Auto-generated method stub
		return mapper.getList();
	}

	@Override
	public List<Language> getList(String field) {
		// TODO Auto-generated method stub
		return mapper.getList(field);
	}


}
