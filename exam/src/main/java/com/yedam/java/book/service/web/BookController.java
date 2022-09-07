package com.yedam.java.book.service.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yedam.java.book.service.BookService;
import com.yedam.java.book.service.BookVO;

@Controller
public class BookController {

	@Autowired
	BookService service;
	
	//등록-입력폼
	@GetMapping("/bookInsert")
	public String insertForm(Model model) {
		model.addAttribute(service.getBookNo());
		return "book/bookInsert";
	}
	//등록-DB insert
	@PostMapping("/bookInsert")
	public String insertBook(BookVO bookVO) {
		service.insetBook(bookVO);
		return "redirect:list";
	}
	
	//전체조회

//	 @GetMapping("/list") 
//	 public String selectBookList(Model model) {
//	 model.addAttribute("bookList", service.getBookList()); 
//	 return "book/bookList"; 
//	 }
		

	@RequestMapping("/bookList")
	public String bookList(Model model, BookVO vo) {
		model.addAttribute("bookList", service.getBookList());
		return "book/bookList";
	}
	
	
	@RequestMapping("/rentalList")
	public String rentalList(Model model, BookVO vo) {
		model.addAttribute("list", service.getRentalList());
		return "book/rentalList";
	}
	
	 
	 
}
