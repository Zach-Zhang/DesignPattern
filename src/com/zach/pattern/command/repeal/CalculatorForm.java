package com.zach.pattern.command.repeal;
/**
 * 请求发送者: 计算器界面类
 * @author Zach
 *
 */
public class CalculatorForm {
	private AbstractCommand command;

	public void setCommand(AbstractCommand command) {
		this.command = command;
	}
	
	public void compute(int value) {
		int i = command.execute(value);
		System.out.println("执行运算,结果为: "+i);
	}
	
	
	public void undo(){
		int i = command.undo();
		System.out.println("执行撤销,结果为: "+i);
	}
	
	
}
