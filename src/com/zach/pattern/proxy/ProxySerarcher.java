package com.zach.pattern.proxy;

import com.zach.pattern.proxy.AccessValidator;
import com.zach.pattern.proxy.Logger;
import com.zach.pattern.proxy.RealSearcher;
import com.zach.pattern.proxy.Searcher;

/**
 * 搜索代理类
 * 
 * @author Zach
 * @date 2018年7月12日
 * @title ProxySerarcher
 */
public class ProxySerarcher implements Searcher {

	private RealSearcher realSearcher = new RealSearcher();

	private AccessValidator av = new AccessValidator();

	private Logger logger = new Logger();

	@Override
	public String doSearch(String userId, String keywork) {
		String result = null;
		if (av.validate(userId)) {
			System.out.println("验证通过");
			 result = realSearcher.doSearch(userId, keywork);
			
		} else {
			System.out.println("验证失败");
			result = "未查询到结果";
		}
		logger.log(userId);
		return result;
	}

}
