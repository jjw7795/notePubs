package com.notepubs.web.dao;

import java.util.List;

import com.notepubs.web.entity.Member;

public interface MemberDao {
	int insert(Member member);
	int update(Member member);
	int delete(Member member);
	
	Member get(int id);
	
	List<Member> getList();
	List<Member> getList(String field);
}
