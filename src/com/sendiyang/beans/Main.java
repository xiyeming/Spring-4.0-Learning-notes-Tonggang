package com.sendiyang.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	private static ApplicationContext ctx;

	public static void main(String[] args) {
		
	ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		HelloWorld helloWorld = (HelloWorld)ctx.getBean("helloWorld");
		
		helloWorld.hello();
		
		Car car = (Car)ctx.getBean("car");
		
		Car car2 = (Car)ctx.getBean("car2");
		
		System.out.println(car.toString());
		System.out.println(car2.toString());
		
		Person person = (Person)ctx.getBean("person2");
		
		System.out.println(person.toString());
	}
}
