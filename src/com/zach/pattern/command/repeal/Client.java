package com.zach.pattern.command.repeal;
/**
 * 客户端类
 * @author Zach
 *
 */
public class Client {
	public static void main(String[] args) {
		
		CalculatorForm cf = new CalculatorForm();
		AbstractCommand ac = new AddCommand();
		
		cf.setCommand(ac);
		cf.compute(2);
		cf.compute(20);
		cf.undo();
		cf.undo();
	}
	
}
