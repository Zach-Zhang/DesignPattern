package com.zach.pattern.proxy;
/**
 * 测试类
 * 
 * @author  Zach
 * @date 2018年7月13日
 * @title ProxyTest
 */
public class ProxyTest {
	public static void main(String[] args) {
		BookFacadeProxy proxy = new BookFacadeProxy();
		BookFacade bookProxy = (BookFacade) proxy.bind(new BookFacadeImpl());
		bookProxy.addBook();
		System.out.println("=============================");
		bookProxy.deleteBook();
	}
}
