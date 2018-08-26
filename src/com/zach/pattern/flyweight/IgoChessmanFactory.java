package com.zach.pattern.flyweight;

import java.util.HashMap;

/**
 * 围棋棋子工厂类:享元工厂类,使用单例模式进行设计
 * 
 * @author  Zach
 * @date 2018年7月10日
 * @title IgoChessmanFactory
 */
public class IgoChessmanFactory {
	
	private static IgoChessmanFactory instance = new IgoChessmanFactory();
	private static HashMap ht;
	
	private IgoChessmanFactory(){
		ht = new HashMap<>();
		IgoChessman black,white;
		black = new BlackIgoChessman();
		ht.put("b", black);
		white = new WhiteIgoChessman();
		ht.put("w", white);
	}
	
	//返回享元工厂类唯一实例
	public static IgoChessmanFactory getInstance(){
		return instance;
	}
	
	//通过key来获取存储在HashMap中的享元对象
	public static IgoChessman getIgoChessman(String color){
		return (IgoChessman) ht.get(color);
	}
}
