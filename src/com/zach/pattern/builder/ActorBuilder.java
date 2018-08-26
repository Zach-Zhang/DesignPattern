package com.zach.pattern.builder;
/**
 * 角色建造者
 * @author Zach
 *
 */
public abstract class ActorBuilder {
	
	protected Actor actor = new Actor();
	
	public abstract void buildType();
	public abstract void buildSex();
	public abstract void buildFace();
	public abstract void buildCostume();
	public abstract void buildHaitstyle();
	
	//工厂方法,返回一个完整的游戏角色对象
	public Actor createActor(){
		return actor;
	}
	
	//改进版,省略了Director类ActorController
	/*public  Actor construct() {
		this.buildType();
		this.buildCostume();
		this.buildSex();
		this.buildFace();
		this.buildHaitstyle();
		return actor;
	}*/
	
}
