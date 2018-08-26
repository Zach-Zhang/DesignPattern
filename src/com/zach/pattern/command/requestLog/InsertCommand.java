package com.zach.pattern.command.requestLog;

//增加命令类:具体命令
public class InsertCommand extends Command {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsertCommand(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(String args) {
		this.args = args;
		configOperator.insert(args);
		
	}

	@Override
	public void execute() {
		configOperator.insert(this.args);
	}


}
