package com.zach.pattern.command;

public class HelpCommand implements Command{
	
	private HelpHandler helpHandler; //维持一个请求接收者的引用
	
	 public HelpCommand() {
		 helpHandler = new HelpHandler(); 
	}
	 
	@Override
	public void execute() {
		helpHandler.display();
	}
	

}
