package com.sendiyang.beans.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sendiyang.beans.annotation.controller.UserController;
import com.sendiyang.beans.annotation.repository.UserRepository;
import com.sendiyang.beans.annotation.service.UserService;

public class Main {

	private static ApplicationContext ctx;

	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext("beans-annotation.xml");
		
		/*TestObject to = (TestObject) ctx.getBean("testObject");
		System.out.println(to);*/
		
		UserController userController = (UserController) ctx.getBean("userController");
		System.out.println(userController);
		userController.execute();
		
	/*	UserService userService = (UserService) ctx.getBean("userService");
		System.out.println(userService);
		
		UserRepository userRepository = (UserRepository) ctx.getBean("userRepository");
		System.out.println(userRepository);*/
	}
}
