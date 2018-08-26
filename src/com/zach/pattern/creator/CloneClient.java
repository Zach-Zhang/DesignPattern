package com.zach.pattern.creator;

public class CloneClient {
	public static void main(String[] args) {
		WeeklyLog previous = new WeeklyLog();
		previous.setName("张无忌");
		previous.setDate("第12周");
		previous.setContent("这周工作很忙,每天加班");
		
		System.out.println("===========周报==============");
		System.out.println("周次:"+previous.getDate());
		System.out.println("姓名:"+previous.getName());
		System.out.println("内容:"+previous.getContent());
		System.out.println("===================================");
		
		WeeklyLog next = previous.clone();
		
		next.setDate("第13周");
		next.setContent("呵呵");
		System.out.println("周次:"+next.getDate());
		System.out.println("姓名:"+next.getName());
		System.out.println("内容:"+next.getContent());
		System.out.println("===================================");
		System.out.println(previous.getDate());
		System.out.println(previous.getContent());
	}
}
