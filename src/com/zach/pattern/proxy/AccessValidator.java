package com.zach.pattern.proxy;

import java.util.Arrays;
import java.util.List;

/**
 * 验证类
 * 
 * @author  Zach
 * @date 2018年7月12日
 * @title AccessValidator
 */
public class AccessValidator {
	
	private static final List<String> list = (List<String>) Arrays.asList("吉泽明步","波多野结衣","泷泽萝拉");
	public boolean validate(String userId){
		
		System.out.println("开始验证用户的id为"+userId+"是否为合法用户");
		
		return list.contains(userId) ? true : false;
	}
}
