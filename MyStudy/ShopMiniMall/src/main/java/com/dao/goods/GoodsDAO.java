package com.dao.goods;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.goods.GoodsDTO;

@Repository("goodsDAO")
public class GoodsDAO {

	@Autowired
	SqlSession session;
	
	public List<GoodsDTO> goodsList(String gCategory) throws Exception{
		return session.selectList("com.config.GoodsMapper.goodsList", gCategory);
	}
	public GoodsDTO goodsRetrieve(String gCode) throws Exception{
		return session.selectOne("com.config.GoodsMapper.goodsRetrieve", gCode);
	}
	
	
}
