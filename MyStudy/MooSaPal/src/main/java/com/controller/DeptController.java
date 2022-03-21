package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dto.DeptDTO;
import com.service.DeptService;

@Controller
public class DeptController {

	@Autowired
	DeptService service;
	
	
	//1. 목록보기 ==> 모델정보는 알려주고 뷰정보는 안 알려줌(==>뷰정보유추)
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ModelAttribute("listAll")
	public List<DeptDTO> list(){
		List<DeptDTO> list = service.selectAll();
		return list;
	}
	
	//servlet-context.xml에서 mvc로 출력
	
	//2. 부서등록
	@RequestMapping(value = "/addInsert2", method = RequestMethod.POST)
	public String insert(DeptDTO dto) {
		int num = service.insert(dto);
		return "redirect:list";
	}
	
	//3. 자세히 보기
	@RequestMapping(value = "/retrieve", method = RequestMethod.GET)
	public ModelAndView retrieve(@RequestParam int deptno) {
		DeptDTO dto = service.selectByDeptno(deptno);

		ModelAndView mav = new ModelAndView();
		mav.setViewName("retrieve"); // 뷰정보
		mav.addObject("retrieve", dto); // 모델정보
		return mav;
	}
	
	//4. 수정
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(DeptDTO dto) {
		int num = service.update(dto);
		
		return "redirect:list";
	}
	
	//5. 삭제
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(@RequestParam int deptno) {
		int num = service.delete(deptno);
		
		return "redirect:list";
	}
	
	
	
	
}
