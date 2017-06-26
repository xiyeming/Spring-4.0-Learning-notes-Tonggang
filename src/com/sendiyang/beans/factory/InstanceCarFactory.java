package com.sendiyang.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 实例工行方法：实力工厂的方法，既现需要创建工场本身， 在调用工厂的实例方法
 * @author xiyem
 *
 */
public class InstanceCarFactory {

	private Map<String, Car> cars = null;
	
	public InstanceCarFactory(){
		cars = new HashMap<String, Car>();
		cars.put("audi", new Car("audi", 300000));
		cars.put("ford", new Car("ford", 400000));
	}
	
	public Car getCar(String brand){
		return cars.get(brand);
	}
}
