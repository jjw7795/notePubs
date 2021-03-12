package com.notepubs.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.notepubs.web.dao.PlatformDao;
import com.notepubs.web.entity.Platform;

public class PlatformServiceImp implements PlatformService{

	@Autowired
	PlatformDao platformDao;
	
	@Override
	public int insert(Platform platform) {
		
		return platformDao.insert(platform);
	}

	@Override
	public int update(Platform platform) {
		
		return platformDao.update(platform);
	}

	@Override
	public int delete(int id) {
		
		return platformDao.delete(id);
	}

	@Override
	public int get(int id) {
		
		return platformDao.get(id);
	}

	@Override
	public List<Platform> getList() {
		
		return platformDao.getList();
		
	}

}
