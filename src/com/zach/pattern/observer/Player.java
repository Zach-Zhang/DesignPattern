package com.zach.pattern.observer;
/**
 * 具体观察者类
 * @author Zach
 *
 */
public class Player implements ObServer {
	
	private String name;
	
	 
	public Player(String name) {
		this.name = name;
	}
	
	

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
	@Override
	public void setName(String name) {
		this.name = name;

	}

	@Override
	public void help() {
		System.out.println("坚持住,"+this.name+"来救你!");
	}
	
	//通知盟友
	@Override
	public void beAttacked(AllyControlCenter acc) {
		System.out.println(this.name +"被攻击");
		acc.notifyObServer(name);

	}

}
