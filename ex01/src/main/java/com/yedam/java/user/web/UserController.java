package com.yedam.java.user.web;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yedam.java.user.service.UserListVO;
import com.yedam.java.user.service.UserVO;

@Controller
public class UserController {

	
	
	@RequestMapping("/users") //�ܼ��� ��θ� �����Ҷ��� ������ ���� �ϸ��
               	// = (value = "/", method=RequestMethod.GET) //@GetMapping�� ������
	
	// 1�� �� VO�� ���·� ������
	/*
	 * public String process(UserVO userVO) { System.out.println(userVO.getName());
	 * System.out.println(userVO.getAge());
	 * 
	 * return ""; }
	 */
	
	
	// 2�� �� �Ű����� ���·� ������, ��ο��� �����ִ� �ʵ���� �̸��� ���ƾ���
	/*
	 * public String process(@RequestParam String name, @RequestParam int age) {
	 * System.out.println(name+", "+age); return ""; }
	 */
	
	// 3�� �� map�� �̿��ϴ� ���
	public String process(@RequestParam Map<String, Object> map) { //String�� Object������ key������ ��
		System.out.println(map.get("name")+","+map.get("age"));	
		return "";
	}
	
	@RequestMapping("/nameList")
	public String nameProcess(@RequestParam List<String> name) {
		for (String temp:name) {
			System.out.println(temp);
		}
		return "";
	}
 	
	@RequestMapping("/inputForm") //�ּ�â�� ĥ ���..
	public String inputForm() {
		return "inputForm";  // return���� �ش��ϴ� �̸��� ��(jsp����) ȣ��
	}
	
	
	//UserListVO ���� ��, ����Ʈ Ÿ������ �޴� ��
	
	@RequestMapping("/userList")
	public String listProcess(UserListVO userListVO) {
		List<UserVO> userList= userListVO.getList();
		for(UserVO vo : userList) {
			System.out.println(vo.getName()+","+vo.getAge());
		}
		return "";
	}  //����Ʈ ���� ��� �������� �� ����������� list[0].
}
