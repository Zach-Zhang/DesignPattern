package com.zach.pattern.flyweight;
/**
 * 
 * 
 * @author  Zach
 * @date 2018年7月10日
 * @title Flyweight
 */
public  class Flyweight {
	
	//内部状态作为成员变量,同一个享元对象其内部状态一致
	private String instrinsicState;

	public Flyweight() {
		// TODO Auto-generated constructor stub
	}

	public Flyweight(String instrinsicState) {
		this.instrinsicState = instrinsicState;
	}
	
	//外部状态在使用时有外部设置,不保存在享元对象中,即使是同一个对象,在每一次调用时可以传入不同的外部状态
	public void operation(String extrinsicState) {
		
	}
}
