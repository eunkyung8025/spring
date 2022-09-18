package com.yedam.java.todo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yedam.java.todo.service.TodoService;
import com.yedam.java.todo.service.TodoVO;

@RestController
@CrossOrigin(origins = "*" )
public class TodoRestController {

		@Autowired
		TodoService service;
		
		@GetMapping("/todo")
		public List<TodoVO> selectAll() {
			System.out.println("왜안돼");
			return service.selectAll();
		}
		
		@PostMapping("/todo")
		public int insertTodo(TodoVO todoVO) {
			System.out.println("등록이 되어야함");
			return service.insertTodo(todoVO);
		}
		
		@PutMapping ("/todo")
		public int updateTodo(@RequestBody TodoVO todoVO)  {
			System.out.println("아무거나");
			return service.updateTodo(todoVO);
		}
	
		@DeleteMapping ("/todo")
		public int deleteTodo (@RequestBody TodoVO todoVO) {
			return service.deleteTodo(todoVO);
		}
	
	
}
