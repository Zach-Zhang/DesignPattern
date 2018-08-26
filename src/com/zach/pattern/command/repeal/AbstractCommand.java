package com.zach.pattern.command.repeal;
/**
 * 抽象命令类
 * @author Zach
 *
 */
public abstract class AbstractCommand {
	
	public abstract int execute(int value);
	
	public abstract int undo();
}
