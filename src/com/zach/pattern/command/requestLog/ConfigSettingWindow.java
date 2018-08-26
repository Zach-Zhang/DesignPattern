package com.zach.pattern.command.requestLog;

import java.util.ArrayList;
import java.util.List;

/**
 * 配置文件设置窗口类:请求发送者
 * @author Zach
 *
 */
public class ConfigSettingWindow {
	//定义一个集合来存储每一次操作时的命令对象
	private List<Command> commands = new ArrayList<>();
	private Command commad;
	
	//注入具体命令对象
	public void setCommad(Command command) {
		this.commad = command;
	}
	
	//执行配置文件的修改命令,同时将命令对象添加到命令集合中
	public void call(String args) {
		commad.execute(args);
		commands.add(commad);
	}
	
	//记录请求日志,生成日志文件,将命令集合写入日志文件中
	public void save() {
		FileUtil.writeCommands(commands);
	}
	
	//从日志文件中提取命令集合,并循环调用每一个命令对象的execute()方法来实现配置文件的重新设置
	public void recover(){
		List<Command> list = FileUtil.readCommands();
		
		for (Command command : list) {
			command.execute();
		}
		
	}
}
