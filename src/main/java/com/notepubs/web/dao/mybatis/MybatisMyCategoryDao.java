package com.notepubs.web.dao.mybatis;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.notepubs.web.dao.MyCategoryDao;
import com.notepubs.web.entity.MyCategory;
@Repository
public class MybatisMyCategoryDao implements MyCategoryDao{
	
	private MyCategoryDao mapper;
	@Autowired
	public MybatisMyCategoryDao(SqlSession session) {
		mapper = session.getMapper(MyCategoryDao.class);
	}
	
	@Override
	public List<MyCategory> getList(){
		
		return mapper.getList();
	}

}
