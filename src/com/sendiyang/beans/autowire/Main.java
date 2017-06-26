package com.sendiyang.beans.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	private static ApplicationContext ctx;

	public static void main(String[] args) {
		
		ctx = new ClassPathXmlApplicationContext("beans-autowire.xml");
		
		Person person = (Person)ctx.getBean("person");
		
		System.out.println(person);
	}
}
