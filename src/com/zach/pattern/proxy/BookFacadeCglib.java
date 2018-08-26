package com.zach.pattern.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
/**
 * 使用cglib代理
 * 
 * @author  Zach
 * @date 2018年7月13日
 * @title BookFacadeCglib
 */
public class BookFacadeCglib implements MethodInterceptor {
	
	private Object target;
	/**
	 * 创建代理对象
	 */
	public Object getInstance(Object target) {
		
		this.target = target;
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(this.target.getClass());
		
		//回调方法
		enhancer.setCallback(this);
		
		//创建代理对象
		return enhancer.create();
	}
	
	/**
	 * 回调方法
	 * obj   代理对象
	 * arg1       委托方法
	 * args  方法参数
	 * proxy 代理方法的MethodProxy对象
	 */
	@Override
	public Object intercept(Object obj, Method arg1, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("事物开始");
		proxy.invokeSuper(obj, args);
		System.out.println("事物结束");
		return null;
	}

}
