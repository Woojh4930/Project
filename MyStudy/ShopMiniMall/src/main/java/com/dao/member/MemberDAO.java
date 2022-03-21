package com.dao.member;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.member.MemberDTO;


@Repository("memberDAO")
public class MemberDAO {

	@Autowired
	SqlSession session;
	
	public MemberDTO idDuplicateCheck(String userid) throws Exception{
		return session.selectOne("com.config.MemberMapper.idDuplicateCheck", 
				userid);
	}
	public int memberAdd(MemberDTO dto) throws Exception{
		return session.insert("com.config.MemberMapper.memberAdd", dto);
	}
	public MemberDTO login(HashMap<String, String> map) throws Exception{
		return session.selectOne("com.config.MemberMapper.login", map);
	}
	public MemberDTO mypage(String userid)throws Exception{
		return session.selectOne("com.config.MemberMapper.mypage", userid);
	}
	public int memberUpdate(MemberDTO dto) throws Exception{
		return session.update("com.config.MemberMapper.memberUpdate", dto);
	}
}
