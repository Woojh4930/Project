package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dto.goods.GoodsDTO;
import com.service.goods.GoodsService;

@Controller
public class GoodsController {

	@Autowired
	GoodsService goodsService;
	
	@RequestMapping(value = "/goodsRetrieve", method = RequestMethod.GET)
	public ModelAndView goodsRetrieve(@RequestParam String gCode) throws Exception {
		
		GoodsDTO dto = goodsService.goodsRetrieve(gCode);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("goodsRetrieve", dto);
		mav.setViewName("goodsRetrieve");
		
		return mav;
	}
	
	
	@ExceptionHandler({Exception.class})
	public String errorPage() {
		return "error/error";
	}
	
}
