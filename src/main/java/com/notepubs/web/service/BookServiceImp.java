package com.notepubs.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notepubs.web.dao.BookDao;
import com.notepubs.web.entity.Book;
@Service
public class BookServiceImp implements BookService{

	@Autowired
	private BookDao bookDao;
	
	@Override
	public List<Book> getList(String field, String query) {
		
//		return bookDao.getList(field,query);
		return null;
	}

}
