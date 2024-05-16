package com.samjo.app.emp.service;

import java.util.List;

public interface DeptService {
	// 로그인한 직원 부서의 부서원들.
	public DeptVO myDeptEmps(String deptId);
	// 로그인한 직원 회사의 모든직원들.
	public List<EmpVO> myCustEmps(String custNo);
}
