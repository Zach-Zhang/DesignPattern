package com.zach.pattern.composite;

//叶子构件:视频类
public class VideoFile extends AbstractFile {
   
	private String name;
	
	
	public VideoFile(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void add(AbstractFile file) {
		System.out.println("添加视频文件失败");

	}

	@Override
	public void remove(AbstractFile file) {
		System.out.println("删除视频文件失败");

	}

	@Override
	public AbstractFile getChild(int i) {
		System.out.println("获取视频文件失败");
		return null;
	}

	@Override
	public void killVirus() {
		//模拟杀毒
		System.out.println("----对视频文件"+name + "进行杀毒");
	}

}
