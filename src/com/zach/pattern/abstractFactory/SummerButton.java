package com.zach.pattern.abstractFactory;

//Summer按钮类:具体产品
public class SummerButton implements Button{

	@Override
	public void display() {
		System.out.println("显示浅蓝色按钮.");
	}

}
