package com.zach.pattern.factoryMethod;

public class JpgReader implements ImageReader {

	@Override
	public void readImage() {
		System.out.println("读取JPG图片");

	}

}
