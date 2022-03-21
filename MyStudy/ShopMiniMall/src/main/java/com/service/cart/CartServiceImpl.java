package com.service.cart;


import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.goods.CartDAO;
import com.dto.goods.CartDTO;
import com.dto.goods.OrderDTO;


@Service("cartService")
public class CartServiceImpl implements CartService {
	
	@Autowired
	CartDAO dao;

	@Override
	public int cartAdd(CartDTO dto) throws Exception {
		int num = dao.cartAdd(dto);
		return num;
	}

	@Override
	public int cartDelete(int num) throws Exception {
		int n = dao.cartDelete(num);
		return n;
	}

	@Override
	public List<CartDTO> cartList(String userid) throws Exception {

		List<CartDTO> dto = dao.cartList(userid);
		return dto;
	}

	@Override
	public int cartUpdate(HashMap<String, Integer> map) throws Exception {

		int num = dao.cartUpdate(map);
		
		return num;
	}

	@Override
	public int cartDelAll(List<String> list) throws Exception {

		int num = dao.cartDelAll(list);
		return num;
	}

	@Override
	public CartDTO cartByNum(int num) throws Exception {

		CartDTO dto = dao.cartByNum(num);
		return dto;
	}

	@Transactional
	@Override
	public void orderDone(OrderDTO dto, String cartNum) throws Exception {
		int num = dao.orderDone(dto);
		int num2 = dao.cartDelete(Integer.parseInt(cartNum));
	}

	
	
	@Override
	public List<CartDTO> orderAllConfirm(List<String> list) throws Exception {
		
		List<CartDTO> oList = dao.orderAllConfirm(list);
		return oList;
	}

	
	@Transactional
	@Override
	public void orderAllDone(List<OrderDTO> oList, List<String> cList) throws Exception {
		int num = dao.orderAllDone(oList);
		int num2 = dao.cartDelAll(cList);
	
	}


}
