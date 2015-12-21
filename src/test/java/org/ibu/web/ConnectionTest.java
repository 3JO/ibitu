package org.ibu.web;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class ConnectionTest {
	
	private static final String DRIVER = "org.mariadb.jdbc.Driver";
	private static final String URL = "jdbc:mariadb://14.32.66.127:3308/ibitu";
	private static final String USER = "user33";
	private static final String PW = "user33";
	
	@Test
	public void testCon()throws Exception{
		Class.forName(DRIVER);
		
		try(Connection con = DriverManager.getConnection(URL,USER,PW)){
			System.out.println(con);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
