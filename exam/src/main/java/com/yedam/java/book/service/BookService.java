package com.yedam.java.book.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface BookService {

	//게시글 번호 가져오기
	public int getBookNo();
	
	//전체조회
	public List<BookVO> getBookList();
	
	//등록
	public int insetBook(BookVO bookVO);

	//대여현황조회
	public List<BookVO> getRentalList();
	
}
