package com.zach.pattern.proxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/**
 * 动态代理类
 * 
 * @author  Zach
 * @date 2018年7月13日
 * @title BookFacadeProxy
 */
public class BookFacadeProxy implements InvocationHandler {
	
	private Object target;
	
	public Object bind(Object target){
		this.target = target;
		
		//取得代理对象
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;
		System.out.println("Proxy start...");
		System.out.println("method name: "+method.getName());
		result = method.invoke(target, args);
		System.out.println("Proxy end...");
		return result;
	}

}
