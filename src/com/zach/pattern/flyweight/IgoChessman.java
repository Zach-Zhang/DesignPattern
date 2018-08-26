package com.zach.pattern.flyweight;
/**
 * 围棋棋子类:抽象享元类
 * 
 * @author  Zach
 * @date 2018年7月10日
 * @title IgoChessman
 */
public abstract class IgoChessman {
	
	public abstract String getColor();
	
	public void display() {
		System.out.println("棋子颜色: "+this.getColor());
	}
	
}
