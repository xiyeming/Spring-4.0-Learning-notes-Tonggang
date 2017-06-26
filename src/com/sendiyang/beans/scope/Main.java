package com.sendiyang.beans.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sendiyang.beans.autowire.Car;


public class Main {
	
	private static ApplicationContext ctx;

	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext("beans-scope.xml");
		
		Car car = (Car)ctx.getBean("car");
		Car car2 = (Car)ctx.getBean("car");
		System.out.println(car == car2);
	}
}
