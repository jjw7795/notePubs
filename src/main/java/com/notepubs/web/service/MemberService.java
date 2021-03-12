package com.notepubs.web.service;

import java.util.List;

import com.notepubs.web.entity.Member;

public interface MemberService {

	int insert(Member member);
	int update(Member member);
	int delete(Member member);
	
	Member get(int id);
	
	List<Member> getList();
	List<Member> getList(String field);

}
