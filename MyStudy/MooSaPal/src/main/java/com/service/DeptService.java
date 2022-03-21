package com.service;

import java.util.List;

import com.dto.DeptDTO;

public interface DeptService {

	public List<DeptDTO> selectAll();
	public DeptDTO selectByDeptno(int deptno);
	public int insert(DeptDTO dto);
	public int update(DeptDTO dto);
	public int delete(int deptno);

	
	//트랜잭션 실습 메서드
	public void tx() throws Exception;
}
