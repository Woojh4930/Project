package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.DeptDTO;

@Repository("deptDAO")
public class DeptDAO {

	@Autowired
	SqlSession session; //null
//	SqlSessionTemplate session;
	
	public List<DeptDTO> selectAll() {
		return session.selectList("com.config.DeptMapper.selectAll");
	}

	public DeptDTO selectByDeptno(int deptno) {
		return session.selectOne("com.config.DeptMapper.selectByDeptno",deptno);
	}
	public int insert(DeptDTO dto) {
		return session.insert("com.config.DeptMapper.insert", dto);
	}

	public int update(DeptDTO dto) {
		return session.update("com.config.DeptMapper.update",dto);
	}

	public int delete(int deptno) {
		return session.delete("com.config.DeptMapper.delete",deptno);
	}
}
