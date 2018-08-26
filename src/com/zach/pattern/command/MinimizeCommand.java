package com.zach.pattern.command;
/**
 * 具体命令类
 * @author Zach
 *
 */
public class MinimizeCommand implements Command{
	
	private WindowHandler wh; //维持一个请求接收者的引用
	
	 public MinimizeCommand() {
		 wh = new WindowHandler();
	}
	@Override
	public void execute() {
		wh.minimize();
	}
	
	
}
