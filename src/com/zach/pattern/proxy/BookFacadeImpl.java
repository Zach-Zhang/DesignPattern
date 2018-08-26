package com.zach.pattern.proxy;
/**
 * 实际业务类
 * 
 * @author  Zach
 * @date 2018年7月13日
 * @title BookFacadeImpl
 */
public class BookFacadeImpl implements BookFacade {

	@Override
	public void addBook() {
		System.out.println("add book logic is running...");

	}

	@Override
	public void deleteBook() {
		System.out.println("delete book logic is running...");
	}

}
