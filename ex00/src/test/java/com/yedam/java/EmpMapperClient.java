package com.yedam.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.java.emp.mapper.EmpMapper;
import com.yedam.java.service.EmpVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")

// RunWith가 안되면 add library > Junit해주고ㅡ version은 4로 맞춰줌
// 괄호안 내용이 안들어가면 Maven Update
public class EmpMapperClient {

	@Autowired
	ApplicationContext ctx;

	@Autowired
	EmpMapper empMapper;

	@Test
	public void getEmp() {

		EmpVO vo = new EmpVO();
		vo.setEmployeeId("100");
		EmpVO findVO = empMapper.getEmp(vo);
		System.out.println(findVO.getLastName());
		assertEquals(findVO.getLastName(), "King");
	}

}
