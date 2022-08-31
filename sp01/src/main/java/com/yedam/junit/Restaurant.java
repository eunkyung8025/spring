package com.yedam.junit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
// @Component -> 해당 클래스를 Bean객체로 등록시킴
public class Restaurant {
	
	@Autowired
	Chef chef;
	
	public void open() {
		chef.cooking();
	}
}
