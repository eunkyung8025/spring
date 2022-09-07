package com.yedam.java.book.mapper;

import java.util.List;


import com.yedam.java.book.service.BookVO;

public interface BookMapper {
	
	//�Խñ� ��ȣ ��ȸ
	public BookVO getBookNo();
	
	//�������
	public int insetBook(BookVO bookVO);

	//���������ȸ
	public List<BookVO> getBookList();
	
	//�뿩��Ȳ��ȸ
	public List<BookVO> getRentalList();
	
}
