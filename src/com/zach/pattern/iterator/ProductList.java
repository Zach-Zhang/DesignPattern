package com.zach.pattern.iterator;

import java.util.List;
/**
 * 具体聚合类
 * @author Zach
 *
 */
public class ProductList extends AbstractObjectList {

	public ProductList(List<Object> list) {
		super(list);
		// TODO Auto-generated constructor stub
	}

	@Override
	public AbstractIterator createrator() {
		// TODO Auto-generated method stub
		return new ProductIterator(this);
	}

}
