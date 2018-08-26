package com.zach.pattern.creator;

import java.io.IOException;

public class DeepCloneClient {
	public static void main(String[] args) {
		
		WeeklyLogdeep preWld,newWld = null;
		preWld = new WeeklyLogdeep();
		Attachment attachment = new Attachment();
		preWld.setAttachment(attachment);
		
		try {
			newWld = preWld.deepClone();
		} catch (ClassNotFoundException | IOException e) {
			
			e.printStackTrace();
		}
		
		//比较周报
		System.out.println("周报是否相同?"+(preWld==newWld));
		//比较附件
		System.out.println("附件是否相同?"+(preWld.getAttachment()==newWld.getAttachment()));
	}
}
