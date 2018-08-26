package com.zach.pattern.proxy;
/**
 * 抽象查询类
 * 
 * @author  Zach
 * @date 2018年7月12日
 * @title Searcher
 */
public interface Searcher {
	
	public String doSearch(String userId,String keywork);
}
