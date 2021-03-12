package com.notepubs.web.service;

import java.util.List;

import com.notepubs.web.entity.Platform;

public interface PlatformService {

	int insert(Platform platform);
	int update(Platform platform);
	int delete(int id);
	
	int get(int id);
	List<Platform> getList();
	
}
