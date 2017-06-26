package com.sendiyang.beans.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	private static ApplicationContext ctx;

	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Person person = (Person)ctx.getBean("person3");
		
		System.out.println(person);
		
		NewPerson newPerson = (NewPerson) ctx.getBean("newPerson");
		
		System.out.println(newPerson);
		
		DataSource dataSource = ctx.getBean(DataSource.class);
		
		System.out.println(dataSource.getProperties());
		
		Person person2 = (Person)ctx.getBean("person4");
		
		System.out.println(person2);
		
		Person person3 = (Person)ctx.getBean("person5");
		
		System.out.println(person3);
	}
}
