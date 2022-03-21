package com.dao.goods;


import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.goods.CartDTO;
import com.dto.goods.OrderDTO;

@Repository("cartDAO")
public class CartDAO {

	@Autowired
	SqlSession session;
	
	public int cartAdd(CartDTO dto) throws Exception{
		return session.insert("com.config.CartMapper.cartAdd", dto);
	}
	public int cartDelete(int num) throws Exception{
		return session.delete("com.config.CartMapper.cartDelete", num);
	}
	public int cartDelAll(List<String> list) throws Exception{
		return session.delete("com.config.CartMapper.cartDelAll", list);
	}
	public int cartUpdate(HashMap<String, Integer> map) throws Exception{
		return session.update("com.config.CartMapper.cartUpdate", map);
	}
	public List<CartDTO> cartList(String userid) throws Exception{
		return session.selectList("com.config.CartMapper.cartList", userid);
	}
	//orderConfirm
	public CartDTO cartByNum(int num) throws Exception{
		return session.selectOne("com.config.CartMapper.cartByNum", num);
	}
	
	public int orderDone(OrderDTO dto) throws Exception{
		return session.insert("com.config.CartMapper.orderDone", dto);
	}

	public List<CartDTO> orderAllConfirm(List<String> list) throws Exception{
		return session.selectList("com.config.CartMapper.orderAllConfirm", list);
	}
	public int orderAllDone(List<OrderDTO> oList) throws Exception{
		return session.insert("com.config.CartMapper.orderAllDone", oList);
	}
}
