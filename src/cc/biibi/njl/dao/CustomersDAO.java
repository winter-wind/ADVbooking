/*
 * 这是一个dao接口
 * */

package cc.biibi.njl.dao;

import java.util.List;

import cc.biibi.njl.setget.Customers;

public interface CustomersDAO {

	//预约数据写入数据库
	public void save(Customers customers);
	
	//通过微信号或手机号查找数据库所有数据
	public List<Customers> getAll(String wechat,String mobile);
	
	//通过微信号或手机号更新数据库所有数据
	public List<Customers> setAll(String wechat,String mobile);
	
	//通过微信号或手机号删除数据库所有数据
	public void del(String wechat,String mobile);
	
	//通过手机号查归属地,并发送短信
	public boolean IsMobile(String mobile);

}
