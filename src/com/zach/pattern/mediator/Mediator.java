package com.zach.pattern.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象中介者类
 * @author Zach
 *
 */
public abstract class Mediator {
	protected List<Component> list = new ArrayList<>();
	public abstract void componetChanged(Component c);
	
	protected abstract boolean addComponent(Component c);
}
