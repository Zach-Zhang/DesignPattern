package com.zach.pattern.creator;

import java.util.Hashtable;

//原型管理器(饿汉式单例实现)
public class PrototypeManage {
	
	//定义一个Hashtable,用于储存原型对象
	private Hashtable<String, Object> ht = new Hashtable<>();
	
	private static PrototypeManage pm = new PrototypeManage();
	
	//为hashtable增加公文对象
	private PrototypeManage(){
		ht.put("far", new FAR());
		ht.put("srs", new SRS());
	}
	
	//增加新的公文对象
	public void addOfficialDocument(String key,OfficialDocument doc){
		ht.put(key, doc);
	}
	
	//通过浅克隆取新的公文对象
	public OfficialDocument getOfficialDocument(String key){
		return ((OfficialDocument)ht.get(key)).clone();
	}
	
	public static PrototypeManage getPrototypeManager(){
		return pm;
	}
	
}
