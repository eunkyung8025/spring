package com.yedam.java.book.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class BookVO {
	
	private int bookNo;
	private String bookName;
	private String bookCoverImg;
	@DateTimeFormat(pattern="yyyy/mm/dd")
	private Date bookDate;
	private String bookPrice;
	private String bookPublisher;
	private String bookInfo;
	
	//
	
	private int rentNo;
	//bookNo은 공통 필드
	private int rentPrice;
	@DateTimeFormat(pattern="yyyy/mm/dd")
	private int rentDate;
	private int rentStatus;

}
