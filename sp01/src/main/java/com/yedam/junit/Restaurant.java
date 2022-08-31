package com.yedam.junit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
// @Component -> �ش� Ŭ������ Bean��ü�� ��Ͻ�Ŵ
public class Restaurant {
	
	@Autowired
	Chef chef;
	
	public void open() {
		chef.cooking();
	}
}
