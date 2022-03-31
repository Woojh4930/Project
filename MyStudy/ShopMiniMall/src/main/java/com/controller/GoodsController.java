package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dto.goods.CartDTO;
import com.dto.goods.GoodsDTO;
import com.dto.member.MemberDTO;
import com.service.cart.CartService;
import com.service.goods.GoodsService;

@Controller
public class GoodsController {

	@Autowired
	GoodsService goodsService;
	
	@Autowired
	CartService cartService;
	
	@RequestMapping(value = "/goodsRetrieve", method = RequestMethod.GET)
	public ModelAndView goodsRetrieve(@RequestParam String gCode) throws Exception {
		
		GoodsDTO dto = goodsService.goodsRetrieve(gCode);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("goodsRetrieve", dto);
		mav.setViewName("goodsRetrieve");
		
		return mav;
	}
	@GetMapping(path = "/goodsList")
	public ModelAndView goodsList(@RequestParam String gCategory) throws Exception {
		
		List<GoodsDTO> list = goodsService.goodsList(gCategory);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("goodsList", list);
		mav.setViewName("main");
		
		return mav;
	}
	
	@GetMapping("/goodsCartList")
	public String goodsCartList(HttpSession session, Model m) throws Exception {
		MemberDTO dto = (MemberDTO) session.getAttribute("login");
		String userid = dto.getUserid();
		List<CartDTO> list = cartService.cartList(userid);
		
		m.addAttribute("cartList", list);
		return "cartList";
		
	}
	
	@GetMapping("/goodsCartAdd")
	public String goodsCartAdd(HttpSession session, CartDTO cDTO, Model m) throws Exception {
		MemberDTO dto = (MemberDTO) session.getAttribute("login");
		String userid = dto.getUserid();
		cDTO.setUserid(userid);
		cartService.cartAdd(cDTO);
		return "/goods/cartAddSuccess";
	}
	
	@GetMapping("/goodsCartDel")
	public String goodsCartDel(@RequestParam int num) throws Exception {
		
		cartService.cartDelete(num);
		return "redirect:goodsCartList";
	}
	
	
	
	
	@ExceptionHandler({Exception.class})
	public String errorPage() {
		return "error/error";
	}
	
}
