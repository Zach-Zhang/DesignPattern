package com.zach.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 战队控制中心类:目标类
 * @author Zach
 *
 */
public abstract class AllyControlCenter {
	protected String allyName;  //战队名称
	protected List<ObServer> players = new ArrayList<ObServer>();
	
	public void setAllyName(String allyName){
		this.allyName = allyName;
	}

	public String getAllyName() {
		return allyName;
	}
	
	public void join(ObServer obs) {
		System.out.println(obs.getName()+"加入"+this.allyName+"战队!");
		players.add(obs);
	}
	
	public void quit(ObServer obs){
		System.out.println(obs.getName()+"退出"+this.allyName+"战队");
		players.remove(obs);
	}
	
	public abstract void notifyObServer(String name);
}
