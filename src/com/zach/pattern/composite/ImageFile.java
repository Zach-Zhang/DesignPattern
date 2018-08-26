package com.zach.pattern.composite;

//图片文件叶子构件类
public class ImageFile extends AbstractFile {
	private String name;
	
	
	public ImageFile(String name) {
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
		System.out.println("添加图像文件出错");

	}

	@Override
	public void remove(AbstractFile file) {
		System.out.println("删除图像文件出错");
	}

	@Override
	public AbstractFile getChild(int i) {
		System.out.println("获取图像文件出错");
		return null;
	}

	@Override
	public void killVirus() {
		//模拟杀毒
		System.out.println("----对图像文件"+name + "进行杀毒");
	}

}
