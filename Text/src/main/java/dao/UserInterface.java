package dao;

import java.util.Map;

import entity.Userinfo;
/**
 * �û�ҵ��
 * @author ���
 *
 */
public interface UserInterface {
	/**
	 * ��ѯ�û�
	 * ����һ��user ID
	 * ����һ��userinfo ʵ��
	 * @param userid
	 * @return
	 */
	Userinfo queryUser(Map<String,Object> map);
	/**
	 * �޸�userinfo������
	 * �������
	 * @param userid
	 * @return
	 */
	boolean updateUser(Map<String,Object> map);
}
