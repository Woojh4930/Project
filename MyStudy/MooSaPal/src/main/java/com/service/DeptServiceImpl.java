package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.DeptDAO;
import com.dto.DeptDTO;

@Service("deptService")
public class DeptServiceImpl implements DeptService{

	@Autowired
	DeptDAO dao; //null
	@Override
	public List<DeptDTO> selectAll() {
		return dao.selectAll();
	}
	@Override
	public DeptDTO selectByDeptno(int deptno) {
		return dao.selectByDeptno(deptno);
	}
	@Override
	public int insert(DeptDTO dto) {
		return dao.insert(dto);
	}
	@Override
	public int update(DeptDTO dto) {
		return dao.update(dto);
	}
	@Override
	public int delete(int deptno) {
		return dao.delete(deptno);
	}
	
	
	//트랜잭션 실습 메서드
	@Transactional
	@Override
	public void tx() throws Exception {
		int num = dao.insert(new DeptDTO(66, "IT", "서울"));
		int num2 = dao.delete(77);
	}

}
