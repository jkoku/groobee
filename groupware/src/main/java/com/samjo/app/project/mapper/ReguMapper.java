package com.samjo.app.project.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.samjo.app.common.service.SearchVO;
import com.samjo.app.emp.service.EmpVO;
import com.samjo.app.project.service.ProjectVO;
import com.samjo.app.project.service.TaskEmpsVO;

public interface ReguMapper {
	
	// 상시업무 상위등록(regu_stad)
	public int insertRegu(ProjectVO regu);
	
	// 상시업무 하위등록(task_common)
	public int insertReguTaskEmp(ProjectVO regu);
	
	// 기존 상시업무 목록
	public List<ProjectVO> selectReguAll(@Param("cno") String custNo);
	
	// 단건조회
	public ProjectVO selectRegu(@Param("cno") String custNo, @Param("tno") Integer taskNo);
	
	// 담당업무 완료
	public void reguTaskEmpOk(TaskEmpsVO taskEmpsVO);
	
	// 상시업무(상위) 전체조회.
	public List<ProjectVO> selectReguStadAll(@Param("emp") EmpVO empVO, @Param("sch") SearchVO search);
	public int countRegus(@Param("emp") EmpVO empVO, @Param("sch") SearchVO search);
	// 상시업무(상위) 단건조회.
	public ProjectVO selectReguStad(@Param("emp") EmpVO empVO, @Param("rid") String reguId);
	
	// 상시업무(하위) 전체조회.
	public List<ProjectVO> selectReguTaskAll(@Param("cno") String custNo, @Param("sch") SearchVO search);
	public int countReguTasks(@Param("cno") String custNo, @Param("sch") SearchVO search);
	
	//
	
}
