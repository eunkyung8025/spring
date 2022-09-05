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

	
	
	@RequestMapping("/users") //단순히 경로만 지정할때는 좌측과 같이 하면됨
               	// = (value = "/", method=RequestMethod.GET) //@GetMapping과 같아짐
	
	// 1번 → VO의 형태로 받을때
	/*
	 * public String process(UserVO userVO) { System.out.println(userVO.getName());
	 * System.out.println(userVO.getAge());
	 * 
	 * return ""; }
	 */
	
	
	// 2번 → 매개변수 형태로 받을때, 경로에서 보내주는 필드명이 이름과 같아야함
	/*
	 * public String process(@RequestParam String name, @RequestParam int age) {
	 * System.out.println(name+", "+age); return ""; }
	 */
	
	// 3번 → map을 이용하는 방법
	public String process(@RequestParam Map<String, Object> map) { //String과 Object내용이 key값으로 들어감
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
 	
	@RequestMapping("/inputForm") //주소창에 칠 경로..
	public String inputForm() {
		return "inputForm";  // return값에 해당하는 이름의 뷰(jsp파일) 호출
	}
	
	
	//UserListVO 생성 후, 리스트 타입으로 받는 법
	
	@RequestMapping("/userList")
	public String listProcess(UserListVO userListVO) {
		List<UserVO> userList= userListVO.getList();
		for(UserVO vo : userList) {
			System.out.println(vo.getName()+","+vo.getAge());
		}
		return "";
	}  //리스트 값이 어느 값인지를 꼭 지정해줘야함 list[0].
}
