package com.yedam.java.todo.mapper;

import java.util.List;

import com.yedam.java.todo.service.TodoVO;

public interface TodoMapper {
	
	//1. 게시글 번호 조회
	public int getNum();
	
	//2. 게시글 등록
	public int insertTodo (TodoVO todoVO);
	
	//3. 게시글 전체 조회 (주로 매개변수가 없는 경우가 많음)
	public List <TodoVO> selectAll();
	
	//4. 게시글 삭제
	public int deleteTodo(TodoVO todoVO);
	
	//5. 게시글 업데이트
	public int updateTodo(TodoVO todoVO);

}
