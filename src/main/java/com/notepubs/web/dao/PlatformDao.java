package com.notepubs.web.dao;

import java.util.List;

import com.notepubs.web.entity.Platform;

public interface PlatformDao {
	
	int insert(Platform platform);
	int update(Platform platform);
	int delete(int id);
	
	int get(int id);
	List<Platform> getList();
	
}
