package com.yedam.java.book.mapper;

import java.util.List;


import com.yedam.java.book.service.BookVO;

public interface BookMapper {
	
	//게시글 번호 조회
	public BookVO getBookNo();
	
	//도서등록
	public int insetBook(BookVO bookVO);

	//도서목록조회
	public List<BookVO> getBookList();
	
	//대여현황조회
	public List<BookVO> getRentalList();
	
}
