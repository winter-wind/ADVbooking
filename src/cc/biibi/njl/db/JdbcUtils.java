package cc.biibi.njl.db;

import java.sql.Connection;
import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JdbcUtils {

	
	/*
	 *释放Connection 连接 
	 * */
	public static void releaseConnection(Connection connection){
		try{
			if(connection !=null){
				connection.close();
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	//C3P0类
	private static DataSource dataSource =null;
	//因为数据源只能被创建一次，所以只能放在静态代码块里面
	static{
		dataSource = new ComboPooledDataSource("njlpro");
	}
	
	
	/*
	 * 返回数据的 一个Connection对象
	 * */
	public static Connection getConnection() throws Exception{
		return dataSource.getConnection();
	}
	
	
	
}

