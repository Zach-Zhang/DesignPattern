package com.zach.pattern.proxy;
/**
 * 真实搜索类
 * 
 * @author  Zach
 * @date 2018年7月12日
 * @title RealSearcher
 */
public class RealSearcher implements Searcher {

	@Override
	public String doSearch(String userId, String keywork) {
		return "搜索的用户id为"+userId+", 关键词是:"+keywork;
	}
	
	
}
