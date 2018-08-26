package com.zach.pattern.command.repeal;
/**
 * 请求接收者: 加法类
 * @author Zach
 *
 */
public class Adder {
	
	private int num = 0;
	
	public int add(int value){
		return num += value;
	}
}
