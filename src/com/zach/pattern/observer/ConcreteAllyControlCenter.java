package com.zach.pattern.observer;
/**
 * 具体目标类
 * @author Zach
 *
 */
public class ConcreteAllyControlCenter extends AllyControlCenter {
	
	public ConcreteAllyControlCenter(String allyName) {
		this.allyName = allyName;
	}
	
	/**
	 * 实现通知方法
	 */
	@Override
	public void notifyObServer(String name) {
		
		System.out.println(this.allyName+"战队紧急通知,盟友"+name+"遭受敌人攻击!");
		for (ObServer obServer : players) {
			if(!obServer.getName().equals(name))
				obServer.help();
		}
	}

}
