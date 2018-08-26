package com.zach.pattern.builder;

//客户端代码
public class Client {
	
	public static void main(String[] args) {
		
		ActorBuilder ab = new AngelBuilder();
		ActorController ac = new ActorController();
		Actor actor = ac.construct(ab);
		
		String type = actor.getType();
		System.out.println(type+"的外观:");
		System.out.println("性别:"+actor.getSex());
		System.out.println("面容:"+actor.getFace());
		System.out.println("服装:"+actor.getCostume());
		System.out.println("发型:"+actor.getHairstyle());
		
	}
}
