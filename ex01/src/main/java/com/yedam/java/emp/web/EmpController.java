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
	
	@GetMapping("/allList")  // ��Ʈ�ѷ��� ���ν�Ű�� �޼ҵ庸�� ���� ���εȴ� /java/emp/allList
	public String getEmpList(Model model) {
		//Ư�����Ǿ��� ��� �����ͷ� �����´�. ������ �����͸� view �������� ����
		model.addAttribute("empList", empService.getEmpList());
		return "emp/empList";
	}

	@GetMapping("/getInfo")
	public String getEmpInfo(Model model, EmpVO empVO) {
		model.addAttribute("empInfo", empService.getEmp(empVO));
		return "emp/empInfo";
	}
	//Ŀ�ǵ� ��ü�� ���� �����Ŷ� empVO�� �޾���
	
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
		//��Ʈ�ѷ� �����̷�Ʈ �Ҷ�, ��Ʈ���� �ϸ� context ��������
		//form������ context path �����ϰ� �ּҰ� �ٴ´�
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
