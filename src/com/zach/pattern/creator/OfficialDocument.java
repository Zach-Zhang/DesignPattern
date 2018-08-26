package com.zach.pattern.creator;
//抽象公文接口
public interface OfficialDocument extends Cloneable {
	
	public OfficialDocument clone();
	public void display();
}
