package com.notepubs.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notepubs.web.dao.MemberDao;
import com.notepubs.web.entity.Member;
@Service
public class MemberServiceImp implements MemberService{
	
	@Autowired
	private MemberDao memberDao;

	@Override
	public List<Member> getList(String field) {
		
		return memberDao.getList(field);
	}
	
	@Override
	public List<Member> getList() {
		// TODO Auto-generated method stub
		return memberDao.getList();
	}

	@Override
	public int insert(Member member) {
		// TODO Auto-generated method stub
		return memberDao.insert(member);
	}

	@Override
	public int update(Member member) {
		// TODO Auto-generated method stub
		return memberDao.update(member);
	}

	@Override
	public int delete(Member member) {
		// TODO Auto-generated method stub
		return memberDao.update(member);
	}

	@Override
	public Member get(int id) {
		// TODO Auto-generated method stub
		return memberDao.get(id);
	}
	

}
