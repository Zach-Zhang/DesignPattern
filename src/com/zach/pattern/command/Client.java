package com.zach.pattern.command;

public class Client {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		FBSettingWindow fbs = new FBSettingWindow("功能键设置");
		
		FunctionButton fb1 = new FunctionButton("功能键1");
		FunctionButton fb2 = new FunctionButton("功能键2");
		
		//可通过配置文件配置具体命令类,通过反射读取;这里不展示;
		Command command1 = (Command) Class.forName("com.zach.pattern.command.HelpCommand").newInstance();
		Command command2 = (Command) Class.forName("com.zach.pattern.command.MinimizeCommand").newInstance();
		
		//将命令注入功能键
		fb1.setCommand(command1);
		fb2.setCommand(command2);
		
		fbs.addFunctionButton(fb1);
		fbs.addFunctionButton(fb2);
		fbs.display();
		
		//调用功能键的业务方法
		fb1.onClick();
		fb2.onClick();
		
	}
}
