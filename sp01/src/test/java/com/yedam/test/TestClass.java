package com.yedam.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.junit.Restaurant;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class TestClass {

	@Autowired
	ApplicationContext ctx;
	
	@Autowired
	Restaurant res;
	
	@Test
	public void beanTest() {
		//Restaurant res = ctx.getBean(Restaurant.class);
		// ↑ 이 방식을 바꿔서 적으면, 19-20번 줄 처럼 @Autowired로 써서 사용할 수 도 있음!
		
		res.open();
	}
}
