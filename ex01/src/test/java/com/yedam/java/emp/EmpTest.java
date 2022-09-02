package com.yedam.java.emp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.java.emp.mapper.EmpMapper;
import com.yedam.java.emp.service.EmpVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/*-context.xml")
public class EmpTest {

	@Autowired
	EmpMapper empMapper;
	
	
	public void empListTest() {
		List<EmpVO> findList = empMapper.getEmpList();
		for (EmpVO findVO:findList) {
			System.out.println(findVO.getLastName());
		}
	}
	
	@Test
	public void empInfoTest() {
		EmpVO info= new EmpVO();
		info.setEmployeeId("149");
		EmpVO findVO = empMapper.getEmp(info);
		assertNotNull(findVO.getEmail());
		//assertEquals(findVO.getLastName(), "King");
	}
	

	public void empInsertTest() {
		EmpVO info = new EmpVO();
		info.setFirstName("¼®±¸");
		info.setLastName("¼Õ");
		info.setEmail("shinyk@naver.com");
		info.setJobId("IT_PROG");
		info.setSalary("100000");
		empMapper.insertEmp(info);
		assertEquals(info.getEmployeeId(), "207");
	}
	
	
	public void empUpdateSalaryTest() {
		int result = empMapper.updateSalary(100);
		assertEquals(result, 1);
	}
	
	
	public void empUpdateInfoTest() {
		
		EmpVO info = new EmpVO();

		info.setLastName("limo");
		info.setEmail("0902@naver.com");
		info.setEmployeeId("207");
		empMapper.updateInfo(info);
		
		int result = empMapper.updateInfo(info);
		assertEquals(result, 1);
	}
	

		
		/*		info.setFirstName("hero");*/

	}

