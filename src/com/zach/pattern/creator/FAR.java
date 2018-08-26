package com.zach.pattern.creator;

//可行性分析报告
public class FAR implements OfficialDocument {

	@Override
	public OfficialDocument clone() {
		// TODO Auto-generated method stub
		OfficialDocument far = null;
		try {
			far = (OfficialDocument) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return far;
	}

	@Override
	public void display() {
		System.out.println("可行性分析报告");
	}

}
