package com.service.member;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.member.MemberDAO;
import com.dto.member.MemberDTO;

@Service("memberService")
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDAO dao;
	
	@Override
	public MemberDTO idDuplicateCheck(String userid) throws Exception {
		MemberDTO dto = dao.idDuplicateCheck(userid);
		return dto;
	}

	@Override
	public int memberAdd(MemberDTO dto) throws Exception {
		int num = dao.memberAdd(dto);
		return num;
	}

	@Override
	public MemberDTO login(HashMap<String, String> map) throws Exception {
		MemberDTO dto = dao.login(map);
		return dto;
	}

	@Override
	public MemberDTO mypage(String userid) throws Exception {

		MemberDTO dto = dao.mypage(userid);
		return dto;
	}

	@Override
	public int memberUpdate(MemberDTO dto) throws Exception {

		int num = dao.memberUpdate(dto);
		return num;
	}

}
