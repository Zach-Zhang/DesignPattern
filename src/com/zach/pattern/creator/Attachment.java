package com.zach.pattern.creator;

import java.io.Serializable;

public class Attachment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name; //附件名

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public void download(){
		System.out.println("下载附件,文件名为"+name);
		
	}
}
