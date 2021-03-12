package com.notepubs.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.notepubs.web.entity.Book;

public interface BookService {
	
	List<Book> getList(String field, String query);
	
}
