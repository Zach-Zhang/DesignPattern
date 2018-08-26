package com.zach.pattern.command.requestLog;

//修改命令类:具体命令
public class ModifyCommand extends Command {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ModifyCommand(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(String args) {
		this.args = args;
		configOperator.modify(args);
		
	}

	@Override
	public void execute() {
		configOperator.modify(this.args);
	}


}
