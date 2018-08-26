package com.zach.pattern.composite;

//叶子构件:文本类
public class TextFile extends AbstractFile {
   
	private String name;
	
	
	public TextFile(String name) {
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
		System.out.println("添加文件失败");

	}

	@Override
	public void remove(AbstractFile file) {
		System.out.println("删除文件失败");

	}

	@Override
	public AbstractFile getChild(int i) {
		System.out.println("获取文件失败");
		return null;
	}

	@Override
	public void killVirus() {
		//模拟杀毒
		System.out.println("----对文本文件"+name + "进行杀毒");
	}

}
