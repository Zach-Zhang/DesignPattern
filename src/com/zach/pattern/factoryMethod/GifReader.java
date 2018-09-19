package com.zach.pattern.factoryMethod;

public class GifReader implements ImageReader {

	@Override
	public void readImage() {
		System.out.println("读取GIF图片");

	}

}
