package com.yedam.java.book.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.book.mapper.BookMapper;
import com.yedam.java.book.service.BookService;
import com.yedam.java.book.service.BookVO;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookMapper mapper;

	
	@Override
	public int getBookNo() {
		BookVO vo = mapper.getBookNo();
		return vo.getBookNo();
	}

	@Override
	public List<BookVO> getBookList() {
		return mapper.getBookList();
	}

	@Override
	public int insetBook(BookVO bookVO) {
		return mapper.insetBook(bookVO);
	}

	@Override
	public List<BookVO> getRentalList() {
		return mapper.getRentalList();
	}

	
	
	
}
