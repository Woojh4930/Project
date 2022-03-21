package com.service.cart;



import java.util.HashMap;
import java.util.List;


import com.dto.goods.CartDTO;
import com.dto.goods.OrderDTO;

public interface CartService {

	public int cartAdd(CartDTO dto) throws Exception;
	public int cartDelete(int num) throws Exception;
	public List<CartDTO> cartList(String userid) throws Exception;
	public int cartUpdate(HashMap<String, Integer> map) throws Exception;
	public int cartDelAll(List<String> list) throws Exception;
	public CartDTO cartByNum(int num) throws Exception;
	public void orderDone(OrderDTO dto,String cartNum) throws Exception;
	public List<CartDTO> orderAllConfirm(List<String> list) throws Exception;
	public void orderAllDone(List<OrderDTO> oList, List<String> cList) throws Exception;
}
