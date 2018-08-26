package com.zach.pattern.command.requestLog;

import java.io.Serializable;
/**
 * 抽象命令类
 * @author Zach
 *
 */
public abstract class Command implements Serializable {
	/**
	 * 
	 */
	protected static final long serialVersionUID = 1L;
	protected String name;
	protected String args;  //命令参数
	protected ConfigOperator configOperator;  //维持对接收者对象的引用
	
	
	public Command(String name) {
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setConfigOperator(ConfigOperator configOperator) {
		this.configOperator = configOperator;
	}
	
	//声明两个抽象的执行方法
	public abstract void execute(String args);
	public abstract void execute();
	
}
