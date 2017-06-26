package com.sendiyang.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 静态工场方法：直接调用末页个类的静态方法就可以返回 Bean 的实例
 */
public class StaticCarFactory {

	private static Map<String, Car> cars = new HashMap<>();
	
	static{
		cars.put("audi", new Car("audi",300000));
		cars.put("audi", new Car("ford",400000));
	}
	
	//静态工场方法，
	public static Car getCar(String name) {
		return cars.get(name);
	}
}
