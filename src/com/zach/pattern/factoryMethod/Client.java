package com.zach.pattern.factoryMethod;

public class Client {
	public static void main(String[] args) {
		//ImageReaderFactory factory = new GifFactory();
		ImageReaderFactory factory = new JpgFactory();
		factory.readImage();
	}
}