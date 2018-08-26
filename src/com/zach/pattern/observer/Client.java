package com.zach.pattern.observer;

/**
 * 客户端
 * @author Zach
 *
 */
public class Client {
	public static void main(String[] args) {
		AllyControlCenter acc = new ConcreteAllyControlCenter("金庸群侠!");
		
		//定义4个观察者
		ObServer player1 = new Player("杨过");
		acc.join(player1);
		ObServer player2 = new Player("令狐冲");
		acc.join(player2);
		ObServer player3 = new Player("张无忌");
		acc.join(player3);
		ObServer player4 = new Player("段誉");
		acc.join(player4);
		//某成员遭受攻击
		player1.beAttacked(acc);
	}
}
