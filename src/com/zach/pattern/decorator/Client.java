package com.zach.pattern.decorator;

//客户端
public class Client {
	public static void main(String args[]) {
		Component component = new Window();  //定义具体构件
		Component componentSB = new ScrollBarDecorator(component);//定义装饰后的构件
		//具有滚动条的窗体
		componentSB.display();
		
		//装饰之后的对象继续注入到另一个装饰类中,进行第二次装饰
		Component componentBB = new BlackBorderDecorator(componentSB);
		
		System.out.println("=========================");
		componentBB.display();
	}
}
