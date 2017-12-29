package dao;

import java.util.Map;

import entity.GoodsInfo;


public interface GoodsInterface {
	/**
	 * ��ѯ��Ʒ��Ϣ
	 * ����һ��Goods ID
	 * ����һ��Goodsinfo ʵ��
	 * @param GoodsID
	 * @return
	 */
	GoodsInfo queryGoods(Map<String,Object> map);
	
	/**
	 * �޸�Goodsinfo������
	 * �������
	 * @param userid
	 * @return
	 */
	boolean updateGoods(Map<String,Object> map);
}
