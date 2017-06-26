package com.sendiyang.beans.spel;

public class Person {
	
	private String name;
	private Car car;

	//引用address bean 的city 属性
	private String city;
	
	//根据car 的 price 确定 info： car 的 price >= 300000：金领、
	//否则为：白领
	private String info;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", car=" + car + ", city=" + city + ", info=" + info + "]";
	}
	
}
