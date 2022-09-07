package com.yedam.java.board.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class BoardVO {

	//���������� �����ϴ� bean�� �ƴ϶� ������Ʈ�� �� �ʿ� ����
	private int bno;
	private String title;
	private String contents;
	private String writer;
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private Date regdate; //������ �����
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private Date updatedate; //���� �ֱٿ� ������ ��¥
	private String image;
	
	
	//
	
	
	

}
