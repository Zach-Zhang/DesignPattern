package com.zach.pattern.proxy;
/**
 * 客户端类
 * 
 * @author  Zach
 * @date 2018年7月12日
 * @title Client
 */
public class Client {
	
	public static void main(String[] args) {
		
		try {
			Searcher searcher = (Searcher) Class.forName("com.zach.pattern.proxy.ProxySerarcher").newInstance();
			String doSearch = searcher.doSearch("泷泽萝拉", "雅美蝶");
			System.out.println(doSearch);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
