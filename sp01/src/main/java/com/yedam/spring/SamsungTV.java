package com.yedam.spring;

import org.springframework.stereotype.Component;

@Component("tv")
public class SamsungTV implements TV {

	 public void on() {
	      System.out.println("������ �������");
	      
	   }
}
