package com.ee.y3;

import static org.junit.Assert.*;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ConnectionTest extends MyAbstractTest{
		
		@Autowired
		private DataSource dataSource;
		
		@Autowired
		private SqlSession sqlSession;
		
		@Test
		public void connectionTest() throws Exception{
			
			//assertNotNull(dataSource.getConnection());
			assertNotNull(sqlSession);
			
			
		}
		
		
		
		


}
