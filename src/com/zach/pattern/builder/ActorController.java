package com.zach.pattern.builder;

//游戏角色创建控制器:指挥者
public class ActorController {
	
	//逐步构建复杂产品对象
	public Actor construct(ActorBuilder ab){
		Actor actor;
		ab.buildType();
		ab.buildSex();
		ab.buildFace();
		ab.buildCostume();
		ab.buildHaitstyle();
		actor = ab.createActor();
		return actor;
	}
}
