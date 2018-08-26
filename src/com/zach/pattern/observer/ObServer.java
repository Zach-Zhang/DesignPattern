package com.zach.pattern.observer;
/**
 * 抽象观察者类
 * @author Zach
 *
 */
public interface ObServer {
	
	String getName();
	void setName(String name);
	void help();
	void beAttacked(AllyControlCenter acc);
}
