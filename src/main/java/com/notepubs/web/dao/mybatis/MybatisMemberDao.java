package com.notepubs.web.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.notepubs.web.dao.MemberDao;
import com.notepubs.web.entity.Member;

@Repository
public class MybatisMemberDao implements MemberDao{
	
	private MemberDao mapper;
	
	@Autowired
	public MybatisMemberDao(SqlSession session) {
		mapper = session.getMapper(MemberDao.class);
	}

	@Override
	public List<Member> getList() {
		
		return mapper.getList();
	}
	
	@Override
	public List<Member> getList(String field) {
		
		return mapper.getList(field);
	}

	@Override
	public int insert(Member member) {
		
		return mapper.insert(member);
	}

	@Override
	public int update(Member member) {
		
		return mapper.update(member);
	}

	@Override
	public int delete(Member member) {
		
		return mapper.delete(member);
	}

	@Override
	public Member get(int id) {
		
		return mapper.get(id);
	}

	
	

	
}
