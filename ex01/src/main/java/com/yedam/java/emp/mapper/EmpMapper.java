package com.yedam.java.emp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yedam.java.emp.service.EmpVO;
public interface EmpMapper {
	
		//��ü��ȸ
	   public List<EmpVO> getEmpList();
	   
	   //�ܰ���ȸ : ��ȸ���� - EmpVO
	   public EmpVO getEmp(EmpVO empVO);
	   
	   //���
	   public int insertEmp(EmpVO empVO);
	   
	   //���� : ���� 10%�λ�
	   //��� 1 : public int updateSalary(int employeeId);
	   
	   //��� 2 : ���� ����ϰ��� �ϴ� �Ű������� ������ �Ѵٸ� @Param("empId") �� �̿��ؼ� ���ΰ��� �Ѱ��ָ� ��
	   public int updateSalary(@Param("empId") int employeeId);
	   
	   //���� : ��������� �Ѱܹ޾Ƽ� �̸��� ��, �̸����� ������ �� �ִ� �޼ҵ�
	   public int updateInfo(EmpVO empVO);


	}