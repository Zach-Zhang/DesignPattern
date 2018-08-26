package com.zach.pattern.decorator;

//构件装饰类:抽象装饰类
public class ComponentDecorator extends Component {
	private Component component;  //维持抽象构件对象的引用
	
	//注入抽象构件类型的对象
	public ComponentDecorator(Component component){
		this.component = component;
	}
	@Override
	public void display() {
		
		component.display();
	}

}
