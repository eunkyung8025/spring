package com.yedam.java.book.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface BookService {

	//�Խñ� ��ȣ ��������
	public int getBookNo();
	
	//��ü��ȸ
	public List<BookVO> getBookList();
	
	//���
	public int insetBook(BookVO bookVO);

	//�뿩��Ȳ��ȸ
	public List<BookVO> getRentalList();
	
}
