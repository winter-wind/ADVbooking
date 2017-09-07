/*
 * 数据库的增删改查
 * */

package cc.biibi.njl.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.Connection;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import cc.biibi.njl.db.JdbcUtils;

public class DAO<T> {

	//需要DBUtils的jar包
	private QueryRunner queryRunner = new QueryRunner();//QueryRunner中提供对sql语句操作的API
	
	private Class<T> clazz;
	
	public DAO() {
			
		//所有类型的公共高级接口(Type)
		Type superClass = getClass().getGenericSuperclass();//获得带有泛型的父类
						  //运行时类       
		
		if(superClass instanceof ParameterizedType){//instanceof:前一个是后一个的实列
			
			//获得超类的泛型参数的实际类型
			ParameterizedType parameterizedType = (ParameterizedType)superClass;
				
			Type [] typeArgs = parameterizedType.getActualTypeArguments();
												 //返回表示此类型实际类型参数的 Type 对象的数组
			
			if(typeArgs != null && typeArgs.length > 0){
				if(typeArgs[0] instanceof Class){
					clazz = (Class<T>) typeArgs[0];
						
				}
			}
		}
	}
	
	//返回T对应的List
	public List<T> getForList(String sql,Object ...args){
		
		Connection connection = null;
		try{
			connection  = JdbcUtils.getConnection();
			return queryRunner.query(connection, sql,new BeanListHandler<>(clazz),args);
														
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			JdbcUtils.releaseConnection(connection);
		}
		
		return null;
	}
	
	//增删改
	public void update(String sql,Object ... args){
		
		Connection connection = null;
		
		try{
			connection = JdbcUtils.getConnection();
			queryRunner.update(connection, sql, args);//数据库 INSERT DELETE UPDATE 操作
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			JdbcUtils.releaseConnection(connection);//数据库关闭
		}
	}
}
