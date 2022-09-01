package com.yedam.java.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yedam.java.emp.mapper.EmpMapper;
import com.yedam.java.service.EmpVO;

@Controller
public class EmpController {
	
	@Autowired
	EmpMapper empMapper;
	
	@GetMapping("/emp")
	public String emp(Model model, EmpVO empVO) {
		EmpVO fincVO = empMapper.getEmp(empVO);
		model.addAttribute("emp", fincVO);
		return "emp";
		
	}
	
	//원래쓰던방식
//	public String method(HttpRequest res, HttpResponse resp)

}
