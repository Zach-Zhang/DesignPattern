package com.zach.pattern.composite;

import java.util.ArrayList;

//文件夹类:容器构件
public class Folder extends AbstractFile{
	
	private ArrayList<AbstractFile> fileList = new ArrayList<>();
	private String name;
	
	
	public Folder(String name) {
		this.name = name;
	}

	public ArrayList<AbstractFile> getFileList() {
		return fileList;
	}

	public void setFileList(ArrayList<AbstractFile> fileList) {
		this.fileList = fileList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void add(AbstractFile file) {
		fileList.add(file);
		
	}

	@Override
	public void remove(AbstractFile file) {
		fileList.remove(file);
		
	}

	@Override
	public AbstractFile getChild(int i) {
		// TODO Auto-generated method stub
		return fileList.get(i);
	}

	@Override
	public void killVirus() {
		System.out.println("****对文件夹"+name+"进行杀毒");  //模拟杀毒
		
		//递归调用成员构件的killVirus()方法
		for (AbstractFile abstractFile : fileList) {
			abstractFile.killVirus();
		}
	}

}
