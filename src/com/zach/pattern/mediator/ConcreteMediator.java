package com.zach.pattern.mediator;

import java.util.List;

/**
 * 具体中介者类
 * @author Zach
 *
 */
public class ConcreteMediator extends Mediator {
	
	
	/**
	 * 
	 * 添加组件
	 */
	@Override
	protected boolean addComponent(Component c) {
		
		return super.list.add(c);
	}
	
	/**
	 * 封装同事对象之间的交互
	 */
	@Override
	public void componetChanged(Component c) {
		List<Component> components = super.list;
		

	}

}
