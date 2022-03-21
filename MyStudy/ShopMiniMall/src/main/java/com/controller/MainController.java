package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dto.goods.GoodsDTO;
import com.service.goods.GoodsService;

@Controller
public class MainController {

	@Autowired
	GoodsService goodsService;
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	@ModelAttribute("goodsList")
	public List<GoodsDTO> main() {
		String gCategory = "top";
		List<GoodsDTO> list = null;
		try {
			list = goodsService.goodsList(gCategory);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
}
