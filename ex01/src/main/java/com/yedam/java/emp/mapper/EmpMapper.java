package com.yedam.java.emp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yedam.java.emp.service.EmpVO;
public interface EmpMapper {
	
		//전체조회
	   public List<EmpVO> getEmpList();
	   
	   //단건조회 : 조회조건 - EmpVO
	   public EmpVO getEmp(EmpVO empVO);
	   
	   //등록
	   public int insertEmp(EmpVO empVO);
	   
	   //수정 : 연봉 10%인상
	   //방법 1 : public int updateSalary(int employeeId);
	   
	   //방법 2 : 내가 사용하고자 하는 매개변수를 쓰고자 한다면 @Param("empId") 을 이용해서 맵핑값을 넘겨주면 됨
	   public int updateSalary(@Param("empId") int employeeId);
	   
	   //수정 : 사원정보를 넘겨받아서 이름과 성, 이메일을 수정할 수 있는 메소드
	   public int updateInfo(EmpVO empVO);

	   //삭제 : 
	   public int deleteEmpInfo(int employeeId);
	

	}