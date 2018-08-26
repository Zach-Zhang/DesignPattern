package com.zach.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象聚合类
 * @author Zach
 *
 */
public abstract class AbstractObjectList {
	protected List<Object> list = new ArrayList<>();

	public AbstractObjectList(List<Object> list) {
		super();
		this.list = list;
	}
	
	public  void addObject(Object obj) {
		this.list.add(obj);
	}
	
	public  void removeObject(Object obj) {
		this.list.remove(obj);
	}
	
	public  List<Object> getObjects() {
		return this.list;
	}
	
	//声明抽象迭代器对象的工厂方法
	public abstract AbstractIterator createrator();
	
}
