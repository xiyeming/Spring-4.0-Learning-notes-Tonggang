package com.sendiyang.beans.properties;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	
	private static ApplicationContext ctx;

	public static void main(String[] args) throws SQLException {
		ctx = new ClassPathXmlApplicationContext("beans-properties.xml");
		
		DataSource dataSource = (DataSource)ctx.getBean("dataSource");
		System.out.println(dataSource.getConnection());
	}
}
