package com.yedam.java.emp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yedam.java.emp.service.EmpService;
import com.yedam.java.emp.service.EmpVO;

@Controller
@RequestMapping("/emp")
public class EmpController {

	
	@Autowired
	EmpService empService;
	
	@GetMapping("/allList")  // 컨트롤러에 매핑시키면 메소드보다 위에 맵핑된다 /java/emp/allList
	public String getEmpList(Model model) {
		//특정조건없이 모든 데이터로 가져온다. 가져온 데이터를 view 페이지로 전달
		model.addAttribute("empList", empService.getEmpList());
		return "emp/empList";
	}

	@GetMapping("/getInfo")
	public String getEmpInfo(Model model, EmpVO empVO) {
		model.addAttribute("empInfo", empService.getEmp(empVO));
		return "emp/empInfo";
	}
	//커맨드 객체를 통해 받을거라 empVO만 받아줌
	
	@PostMapping("/updateInfo")
	public String updateEmpInfo(EmpVO empVO) {
		empService.updateEmp(empVO);
		return "redirect:allList";

	}
	
	@GetMapping("/deleteInfo/{employeeId}")
	public String deleteEmpInfo(@PathVariable String employeeId) {
		EmpVO empVO = new EmpVO();
		empVO.setEmployeeId(employeeId);
		empService.deleteEmp(empVO);
		return "redirect:/emp/allList";
		//컨트롤러 리다이렉트 할때, 루트부터 하면 context 다음부터
		//form에서는 context path 무시하고 주소가 붙는다
	}
	
	@GetMapping("/insertForm")
	public String insertEmpForm(EmpVO empVO) {
		return "emp/empInsert";
	}
	
	
	@PostMapping("/insertInfo")
	public String insertEmpInfo(EmpVO empVO) {
		empService.insertEmp(empVO);
		return "redirect:allList";
	}
}
