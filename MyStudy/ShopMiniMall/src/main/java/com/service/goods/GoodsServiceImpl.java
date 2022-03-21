package com.service.goods;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.goods.GoodsDAO;
import com.dto.goods.GoodsDTO;

@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {

	@Autowired
	GoodsDAO dao;
	
	@Override
	public List<GoodsDTO> goodsList(String gCategory) throws Exception {
		List<GoodsDTO> list = dao.goodsList(gCategory);
		return list;
	}

	@Override
	public GoodsDTO goodsRetrieve(String gCode) throws Exception {
		GoodsDTO dto = dao.goodsRetrieve(gCode);
		return dto;
	}


}
