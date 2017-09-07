package cc.biibi.njl.test;

import java.sql.Connection;

import org.junit.Test;

import cc.biibi.njl.db.*;

public class JdbcUtilsTest {

	@Test
	public void testGetConnection() throws Exception {
		Connection connection = JdbcUtils.getConnection();
		System.out.println(connection);
	}

}
