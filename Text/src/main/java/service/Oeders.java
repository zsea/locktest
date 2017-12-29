package service;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.GoodsInterface;
import dao.Request;
import dao.UserInterface;
import entity.GoodsInfo;
import entity.Userinfo;

@Service
public class Oeders implements orders{
	@Autowired
	GoodsInterface goodsInterface;
	@Autowired
	UserInterface userInterface;
	
	@Override
	public String orderss(String itemid, String uid, String num) {
		boolean zj=false;
		String yx="";
		Request Userrequest=new Request();
		Userrequest.addData("id", uid);
		Userinfo User = userInterface.queryUser(Userrequest.getDataAll());
		if(User==null){
			yx="�û�������";
		}
		Request Goodsrequest=new Request();
		Goodsrequest.addData("id", itemid);
		GoodsInfo Goods = goodsInterface.queryGoods(Goodsrequest.getDataAll());
		if(Goods==null){
			yx="��Ʒ������";
		}else if(Goods.getQuantity()>Integer.parseInt(num)){
			if((Goods.getPrice()*Integer.parseInt(num))<User.getMoney()){
				zj=true;
			}else{
				yx="����";
			}
			
		}else{
			yx="��治��";
		}
		
		
	
		String str="{\"success\":"+zj+",\"msg\":\""+yx+"\",\"time\":"+System.currentTimeMillis()+"}";
		return str;
		
	}

}
