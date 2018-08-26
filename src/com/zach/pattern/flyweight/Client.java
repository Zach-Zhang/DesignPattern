package com.zach.pattern.flyweight;
/**
 * 客户端类
 * 
 * @author  Zach
 * @date 2018年7月10日
 * @title Client
 */
public class Client {
	public static void main(String[] args) {
		IgoChessman b1,b2,b3,w1,w2;
		IgoChessmanFactory factory = IgoChessmanFactory.getInstance();
		
		b1 = factory.getIgoChessman("b");
		b2 = factory.getIgoChessman("b");
		b3 = factory.getIgoChessman("b");
		System.out.println("判断两颗黑子是否相同: "+(b1==b2));
		
		w1 = factory.getIgoChessman("w");
		w2 = factory.getIgoChessman("w");
		System.out.println("判断两颗白子是否相同: "+(w1==w2));
		
		//显示棋子
		b1.display();
		b2.display();
		b3.display();
		w1.display();
		w2.display();
	}
}
