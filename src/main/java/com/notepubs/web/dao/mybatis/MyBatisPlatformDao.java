package com.notepubs.web.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.notepubs.web.dao.PlatformDao;
import com.notepubs.web.entity.Platform;
@Repository
public class MyBatisPlatformDao implements PlatformDao{

	private PlatformDao mapper;
	
	@Autowired
	public MyBatisPlatformDao(SqlSession session) {
		mapper = session.getMapper(PlatformDao.class);
	}
	
	@Override
	public int insert(Platform platform) {
	
		return mapper.insert(platform);
	}

	@Override
	public int update(Platform platform) {
		
		return mapper.update(platform);
	}

	@Override
	public int delete(int id) {
		
		return mapper.delete(id);
	}

	@Override
	public List<Platform> getList() {
		
		return mapper.getList();
	}

	@Override
	public int get(int id) {
		
		return mapper.get(id);
	}
	
}
