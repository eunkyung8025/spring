package com.yedam.java.board.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class BoardVO {

	//스프링에서 관리하는 bean은 아니라서 컴포넌트는 쓸 필요 없음
	private int bno;
	private String title;
	private String contents;
	private String writer;
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private Date regdate; //최초의 등록일
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private Date updatedate; //가장 최근에 수정한 날짜
	private String image;
	

}
