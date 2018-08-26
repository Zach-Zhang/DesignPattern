package com.zach.pattern.command.requestLog;

import java.io.Serializable;
/**
 * 配置文件操作类,请求接收者
 * @author Zach
 *
 */
public class ConfigOperator implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void insert(String args) {
		System.out.println("增加新的节点: "+args);
	}
	
	public void modify(String args) {
		System.out.println("修改节点: "+args);
	} 
	
	
}
