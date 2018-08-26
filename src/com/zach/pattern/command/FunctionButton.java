package com.zach.pattern.command;
/**
 * 请求调用者
 * @author Zach
 *
 */
public class FunctionButton {
	
	private Command command;
	private String name;
	public FunctionButton(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void onClick(){
		System.out.println("发送点击请求");
		command.execute();
	}
}
