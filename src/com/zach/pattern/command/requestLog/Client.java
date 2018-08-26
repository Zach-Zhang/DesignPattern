package com.zach.pattern.command.requestLog;
/**
 * 客户端
 * @author Zach
 *
 */
public class Client {
	public static void main(String[] args) {
		ConfigSettingWindow csw = new ConfigSettingWindow();
		ConfigOperator co = new ConfigOperator();
		Command command = null;
		
		command = new InsertCommand("增加");
		command.setConfigOperator(co);
		csw.setCommad(command);
		csw.call("网站首页");
		
		command = new ModifyCommand("增加");
		command.setConfigOperator(co);
		csw.setCommad(command);
		csw.call("端口号");
		
		command = new InsertCommand("修改");
		command.setConfigOperator(co);
		csw.setCommad(command);
		csw.call("网站首页");
		
		command = new InsertCommand("修改");
		command.setConfigOperator(co);
		csw.setCommad(command);
		csw.call("端口号");
		
		System.out.println("================================");
		System.out.println("保存配置");
		csw.save();
		
		System.out.println("================================");
		System.out.println("恢复配置");
		csw.recover();
	}
}
