package com.sendiyang.beans.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("postProcessAfterInitialization..." + arg0 + ", " + arg1);
		Car car = new Car();
		car.setBrand("Ford");
		return car;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("postProcessBeforeInitialization..." + arg0 + ", " + arg1);
		
		if("car".equals(arg1)){
			//...
		}
		return arg0;
	}

}
