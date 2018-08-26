package com.zach.pattern.proxy;
/**
 * 日志记录类
 * 
 * @author  Zach
 * @date 2018年7月12日
 * @title Logger
 */
public class Logger {
	
	public void log(String userId) {
		
		System.out.println("用户id为:"+userId+", 完成了一次查询");
	}
}
