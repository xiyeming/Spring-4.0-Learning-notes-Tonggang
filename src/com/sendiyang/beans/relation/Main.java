package com.sendiyang.beans.relation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sendiyang.beans.autowire.Address;
import com.sendiyang.beans.autowire.Person;

public class Main {
	
	private static ApplicationContext ctx;

	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext("beans-relation.xml");
		
		Address address = (Address)ctx.getBean("address3");
		System.out.println(address);
		
		Address address2 = (Address)ctx.getBean("address2");
		System.out.println(address2);
		
		Person person = ctx.getBean(Person.class);
		System.out.println(person);
	}
}
