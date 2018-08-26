package com.zach.pattern.command.repeal;
/**
 * 具体命令类
 * @author Zach
 *
 */
public class AddCommand extends AbstractCommand {
	
	private Adder adder = new Adder(); //维持一个对命令接收者的引用
	private int value;
	
	@Override
	public int execute(int value) {
		this.value = value;
		return adder.add(value);
	}

	@Override
	public int undo() {
		//通过逆向操作实现撤销的效果
		return adder.add(-value);
	}

}
