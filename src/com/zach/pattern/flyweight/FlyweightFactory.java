package com.zach.pattern.flyweight;

import java.util.HashMap;

/**
 * 享元工厂类作用在于提供一个用于存储享元对象的享元池,当用户需要对象时,首先
 * 从享元池中获取,若不存在,则创建一个新的享元对象返给用户,并保存在享元池中
 * 
 * @author  章生志
 * @date 2018年7月10日
 * @title FlyweightFactory
 */
public class FlyweightFactory {
	
	//定义一个HashMap用于存储享元对象,实现享元池
	private HashMap flyweights = new HashMap<>();
	
	public Flyweight getFlyweight(String key) {
		
		if(flyweights.containsKey(key)){
			return (Flyweight)flyweights.get(key);
		}else {
			Flyweight fw = new ConcreteFlyweight();
			flyweights.put(key, fw);
			return fw;
		}
	}
}
