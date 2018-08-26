package com.zach.pattern.proxy;
/**
 * 代理类
 * 
 * @author  Zach
 * @date 2018年7月12日
 * @title Proxy
 */
public class Proxy implements Subject {
	
	private RealSubject realSubject = new RealSubject();  //维持一个对真实对象的引用
	
	public void preRequest() {
		
	}
	@Override
	public void request() {
		preRequest();
		realSubject.request();
		postRequest();

	}
	
	public void postRequest(){
	}
}
