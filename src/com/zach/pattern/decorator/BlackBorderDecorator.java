package com.zach.pattern.decorator;

//黑色边框装饰类:具体装饰类
public class BlackBorderDecorator extends ComponentDecorator {

	public BlackBorderDecorator(Component component) {
		super(component);
	}
	
	public void display() {
		this.setScrollBar();
		super.display();
	}

	public void setScrollBar() {
		System.out.println("为构件增加黑色边框!");
	}
	

}
